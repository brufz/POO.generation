package br.com.generation.interfacee;

public class TestaInterfaceAnimal {

	public static void main(String[] args) {
		Cachorro ca = new Cachorro();
		Gato ga = new Gato();
		
		ca.somAnimal();
		ca.dormir();
		
		ga.somAnimal();
		ga.dormir();

	}

}
