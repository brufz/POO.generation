package br.com.generation.ex01;

public class Cliente {
	private String nome;
	private String email;
	private int idade;
	private int rg;
	private boolean compra;
	
	//metodos
	public void comprar() {
		if (compra == true) {
			System.out.println("Cliente vai comprar na loja");
		} else {
			System.out.println("Dando apenas uma olhadinha");
		}
	}
	

	public void fazerAniversario() {
		this.idade = this.idade + 1;
		System.out.println("Parabéns, " + this.nome);
	}
	
	//getter e setter
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public long getRg() {
		return rg;
	}
	public void setRg(int rg) {
		this.rg = rg;
	}
	
	public boolean getCompra() {
		return compra;
	}

	public void setCompra(boolean compra) {
		this.compra = compra;
	}

	
	
	

}
