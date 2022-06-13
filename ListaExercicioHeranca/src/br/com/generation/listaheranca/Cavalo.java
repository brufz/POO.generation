package br.com.generation.listaheranca;

public class Cavalo extends Animal {

	private String velocidade;

	public void correr (float velocidade) {
		System.out.println(this.getNome() + "está correndo a " + this.velocidade + "km/h" );
	}
	
	//getter e setter
	
	public String getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(String velocidade) {
		this.velocidade = velocidade;
	}
}
