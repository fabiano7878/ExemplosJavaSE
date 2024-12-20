package br.com.exemplos.application;


import java.time.LocalDate;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import java.util.stream.Collectors;

import br.com.exemplos.dto.CadastradosDTO;
import br.com.exemplos.dto.CadastradosResponseDTO;
import br.com.exemplos.dto.DocumentoDTO;
import br.com.exemplos.dto.PessoaDTO;
import br.com.exemplos.indicador.TipoDocumentoIndicador;
import br.com.exemplos.model.cadastro.Cadastro;
import br.com.exemplos.model.cadastro.Documento;
import br.com.exemplos.model.cadastro.Pessoa;

public class CadastradosMain {

	private final static String TIMEZONE_PT_BR= "America/Sao_Paulo";

	public static void main(String []args){
		List<Cadastro> cadastradosRecord = getCadatrados();
		System.out.println("Lista com a ordem de inserção:");
		cadastradosRecord.forEach(System.out::println);

		CadastradosResponseDTO cadastradosResponseDTO = new CadastradosResponseDTO();

		List<CadastradosDTO> responseDTO = cadastradosRecord.stream()
				.collect(Collectors.groupingBy(
						Cadastro::dataCadastro, 
						Collectors.flatMapping(c -> c.pessoas().stream(), Collectors.toList()))) // Unir as listas de pessoas
				.entrySet().stream()
				.map(entry -> {
					Date dataCadastro = entry.getKey();
					List<PessoaDTO> pessoasDTO = entry.getValue().stream()
							.map(CadastradosMain::convertToPessoaDTO)
							.collect(Collectors.toList());
					CadastradosDTO cadastradosDTO = new CadastradosDTO();
					cadastradosDTO.setDataDoCadastro(dataCadastro);
					cadastradosDTO.setCadastrados(pessoasDTO);
					return cadastradosDTO;
				})
				.sorted(Comparator.comparing(CadastradosDTO::getDataDoCadastro))
				.collect(Collectors.toList());

		cadastradosResponseDTO.setCadastrados(responseDTO);

		System.out.println("Lista após Agrupamento:");
		responseDTO.forEach(System.out::println);

	}

	private static PessoaDTO convertToPessoaDTO(Pessoa pessoa) {
		List<DocumentoDTO> documentosDTO = pessoa.documento().stream()
				.map(CadastradosMain::convertToDocumentoDTO)
				.collect(Collectors.toList());
		PessoaDTO pessoaDTO = new PessoaDTO();   
		pessoaDTO.setId(pessoa.id());
		pessoaDTO.setNomeCompleto(pessoa.nome());
		pessoaDTO.setIdade(pessoa.idade());
		pessoaDTO.setNascimento(pessoa.dtNascimento());
		pessoaDTO.setDocumento(documentosDTO);
		return pessoaDTO;
	}

	private static DocumentoDTO convertToDocumentoDTO(Documento documento) {
		DocumentoDTO documentoDTO = new DocumentoDTO();
		documentoDTO.setId(documento.id());
		documentoDTO.setNomeCompleto(documento.nome());
		documentoDTO.setNumero(documento.numero());
		documentoDTO.setTipoDocumentoIndicador(documento.tipoDocumentoIndicador());
		return documentoDTO;

	}

	private static List<Cadastro> getCadatrados() {
		List <Pessoa> pessoas = getPessoas();

		//Cadastrados em Janeiro
		Date deJaneiro = getDatas(1,Calendar.JANUARY,2024,0,0,0,0,TIMEZONE_PT_BR);
		Cadastro cadastroA = new Cadastro(deJaneiro, Arrays.asList(pessoas.get(0), pessoas.get(1)));

		//Fevereiro
		Date deFevereiro = getDatas(28,Calendar.FEBRUARY,2024,0,0,0,0,TIMEZONE_PT_BR);
		Cadastro cadastroB = new Cadastro(deFevereiro, Arrays.asList(pessoas.get(2), pessoas.get(5)));

		//Agosto
		Date deAgosto = getDatas(8,Calendar.AUGUST,2024,11,0,0,0,TIMEZONE_PT_BR);
		Cadastro cadastroC = new Cadastro(deAgosto, Arrays.asList(pessoas.get(3), pessoas.get(6)));

		Cadastro cadastroD = new Cadastro(deJaneiro, Arrays.asList(pessoas.get(4)));

		return Arrays.asList(cadastroA, cadastroB, cadastroC, cadastroD);		
	}

	private static Date getDatas(int dia, int mes, int ano, int hora, int minuto, int segundo, int milisegundos, String timezone) {
		Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone(timezone));
		calendar.set(Calendar.YEAR, ano);
		calendar.set(Calendar.MONTH, mes); // Janeiro é representado por 0
		calendar.set(Calendar.DAY_OF_MONTH, dia);
		calendar.set(Calendar.HOUR_OF_DAY, hora); // Hora 00:00
		calendar.set(Calendar.MINUTE, minuto);
		calendar.set(Calendar.SECOND, segundo);
		calendar.set(Calendar.MILLISECOND, milisegundos);
		return calendar.getTime();
	}

	private static List<Pessoa> getPessoas() {		
		Pessoa fabiano = new Pessoa(1L, "Fabiano dos Santos Silva", 46, LocalDate.of(1978,12,10), 
				Arrays.asList(new Documento(1L, "RG", "257707955", TipoDocumentoIndicador.PF), new Documento(2L, "CPF", "26650220876",
						TipoDocumentoIndicador.PF))); 

		Pessoa thaiany = new Pessoa(2L, "Thaiany Aranha Lelis", 36, LocalDate.of(1986,12,10), 
				Arrays.asList(new Documento(1L, "RG", "444379484", TipoDocumentoIndicador.PF), new Documento(2L, "CPF", "35589122848",
						TipoDocumentoIndicador.PF)));

		Pessoa ari = new Pessoa(3L, "Ari Assis Silva", 45, LocalDate.of(1980,8,2), 
				Arrays.asList(new Documento(1L, "RG", "444379484", TipoDocumentoIndicador.PF), new Documento(2L, "CPF", "21653827858",
						TipoDocumentoIndicador.PF)));

		Pessoa liberata = new Pessoa(4L, "Liberata dos Santos Silva", 74, LocalDate.of(1950,10,14), 
				Arrays.asList(new Documento(1L, "RG", "211152894", TipoDocumentoIndicador.PF), new Documento(2L, "CPF", "79131093868",
						TipoDocumentoIndicador.PF)));

		Pessoa julia = new Pessoa(5L, "Júlia Lelis Silva", 2, LocalDate.of(2022,05,27), 
				Arrays.asList(new Documento(1L, "RG", "644534190", TipoDocumentoIndicador.PF), new Documento(2L, "CPF", "60296312843",
						TipoDocumentoIndicador.PF)));

		Pessoa theo = new Pessoa(6L, "Theo Lelis Gomes", 7, LocalDate.of(2017,12,27), 
				Arrays.asList(new Documento(1L, "RG", "633834798", TipoDocumentoIndicador.PF), new Documento(2L, "CPF", "52190128862",
						TipoDocumentoIndicador.PF)));

		Pessoa clara = new Pessoa(7L, "Clara Lelis Justino", 15, LocalDate.of(2009, 1,26), 
				Arrays.asList(new Documento(1L, "RG", "633834397", TipoDocumentoIndicador.PF), new Documento(2L, "CPF", "52901540864",
						TipoDocumentoIndicador.PF)));

		return Arrays.asList(fabiano, thaiany, ari, liberata, julia, theo, clara);
	}
}
