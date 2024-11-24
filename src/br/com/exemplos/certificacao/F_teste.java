package br.com.exemplos.certificacao;

public class F_teste extends teste {

//sobrescrever
	public void fazer1(){
		System.out.println("Fazer O que?");
	}

	
	
	public String apelido(String ap) {
	
		ap ="Apelido de quem???";
				
		return ap;
	}

	public void derrubaCopo() {
			
		System.out.println("Foi o Marcelo oyamada quem derrubou de novo???");
	}

	public void orion() {
		try{
		int [] i = {5,6,10};
		int [] h;
		for(int x=0; x < 3; x++ ){		
			h=new int[3];
			h[x] = i[x] ;	
		System.out.println(h[x]);	
		}
		}catch(Exception e){
			e.printStackTrace();
		}
	
	}
	
	

	public void Solege() {
		// TODO Auto-generated method stub
		
	}

	public int number() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void fabiano() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Fabiano3() {
		// TODO Auto-generated method stub
		
	}

}
