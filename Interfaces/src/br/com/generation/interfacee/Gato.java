package br.com.generation.interfacee;

public class Gato implements Animal {

	@Override
	public void somAnimal() {
		System.out.println("miau");
		
	}

	@Override
	public void dormir() {
		System.out.println("O gato está dormindo");
		
	}

}
