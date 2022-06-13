package br.com.generation.listaheranca;

public class Ex01 {

	public static void main(String[] args) {
		Cachorro lulu = new Cachorro();
		Cavalo thor = new Cavalo();
		Preguica zzz = new Preguica();

		lulu.setNome("Lulu");
		lulu.emitirSom("auau");

		System.out.println("================");

		thor.setNome("Thor");
		thor.emitirSom("hiin in in hinir");

		System.out.println("===============");

		zzz.setNome("Preguicinha");
		zzz.emitirSom("ahhhhhhhh");

	}

}
