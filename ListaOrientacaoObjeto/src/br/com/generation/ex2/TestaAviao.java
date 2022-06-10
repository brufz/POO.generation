package br.com.generation.ex2;

public class TestaAviao {

	public static void main(String[] args) {
		Aviao av1 = new Aviao ();
		
		av1.setMarca("Azul");
		av1.setModelo("Boing 335");
		av1.setPiloto("Alberto Silva");
		av1.setNumeroMaxPassageiro(160);
		av1.setPermitidoDecolagem(true);
		
		av1.entrarPassageiros(62);
		
		System.out.println("=============PERMISSÃO PARA DECOLAGEM==============");
		System.out.println("O avião " + av1.getMarca() + " " + av1.getModelo() + " "
				+ "condizido pelo piloto " + av1.getPiloto() + " aguarda permissão para decolagem.");
		System.out.println("Decolagem permitida? " + av1.getPermitidoDecolagem());
		System.out.println("===================================================");
		av1.decolar();
		

	}

}
