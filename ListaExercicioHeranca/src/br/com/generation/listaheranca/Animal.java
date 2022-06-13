package br.com.generation.listaheranca;

public class Animal {
	private String nome;
	private int idade;
	
	//método
	public void emitirSom(String som) {
		System.out.println(this.nome + ": " + som);
	}
	
	//getter e setter

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}


	

}
