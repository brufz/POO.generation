package br.com.generation.listaheranca;

public class Ex01 {

	public static void main(String[] args) throws InterruptedException {
		Cachorro c1 = new Cachorro();
		Cavalo ca1 = new Cavalo();
		Preguica zzz = new Preguica();

		c1.setNome("Lulu");
		c1.emitirSom("auau");
		c1.setVelocidade(10.5f);
		
		c1.correr();

		System.out.println("================");

		ca1.setNome("Thor");
		ca1.emitirSom("hiin in in hinir");
		ca1.setVelocidade(15.0f);
		
		ca1.correr();

		System.out.println("===============");

		zzz.setNome("Preguicinha");
		zzz.emitirSom("ahhhhhhhh");
		
		zzz.subirArvore(20.0f);

	}

}
