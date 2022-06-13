package br.com.generation.interfacee;

public class Cachorro implements Animal {

	@Override
	public void somAnimal() {
		System.out.println("au au");
		
	}

	@Override
	public void dormir() {
		System.out.println("Cachorro está dormindo");
		
	}

}
