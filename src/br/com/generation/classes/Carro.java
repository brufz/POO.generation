package br.com.generation.classes;

public class Carro {
	String cor;
	String modelo;
	int ano;
	int velocidade;
	
	void acelerar(int aceleracao) throws InterruptedException {
		for (int i = velocidade; i <= aceleracao; i += 10) {
			System.out.println(i);
			Thread.sleep(500);
			velocidade = i;
		}
	}
	
	void freiar(int reduzir) throws InterruptedException {
		for (int i = velocidade; i >= reduzir; i -=10) {
			System.out.println(i);
			Thread.sleep(500);
			velocidade = i;
		}
		
	}
}
