package br.com.generation.ex2;

public class Aviao {
	private String marca;
	private String modelo;
	private int ano;
	private String piloto;
	private boolean permitidoDecolagem;
	private int numeroMaxPassageiro;
	private int nPassag;
	
	//metodos
	public void decolar() {
		if (permitidoDecolagem == true) {
			System.out.println("Preparando para decolar");
		} else {
			System.out.println("Aguarde autorização para decolagem");
		}
	}
	
	public void entrarPassageiros(int nPassag) {
		if (nPassag < numeroMaxPassageiro) {
			System.out.println("Entrada de " + nPassag + " passageiro(s) permitida");
		} else {
			System.out.println("Avião em lotação máxima, não é possível entrar mais passageiros");
		}
	}
	
	//getter e setter
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getPiloto() {
		return piloto;
	}
	public void setPiloto(String piloto) {
		this.piloto = piloto;
	}
	public boolean getPermitidoDecolagem() {
		return permitidoDecolagem;
	}
	public void setPermitidoDecolagem(boolean permitidoDecolagem) {
		this.permitidoDecolagem = permitidoDecolagem;
	}
	

	public int getNumeroMaxPassageiro() {
		return numeroMaxPassageiro;
	}

	public void setNumeroMaxPassageiro(int numeroMaxPassageiro) {
		this.numeroMaxPassageiro = numeroMaxPassageiro;
	}
	
	public int getnPassag() {
		return nPassag;
	}

	public void setnPassag(int nPassag) {
		this.nPassag = nPassag;
	}
	

	
}
