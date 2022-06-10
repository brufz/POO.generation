package br.com.generation.encapsulamento;

public class TestaVeiculo {

	public static void main(String[] args) {
		
		Veiculo carro = new Veiculo();
		
		carro.setCor("Preto");
		carro.setAno(2000);
		carro.setMarca("Ford");
		carro.setModelo("Focus");
		
		System.out.println("Carro: " + carro.getMarca() + " " + carro.getModelo());
		

	}

}
