package br.com.generation.classes;

public class TestaCarro {

	public static void main(String[] args) throws InterruptedException {
		Carro carro1 = new Carro();

		carro1.velocidade = 0;

		carro1.acelerar(100);

		System.out.println("=======FREANDO=======");

		carro1.freiar(30);
	}
}
