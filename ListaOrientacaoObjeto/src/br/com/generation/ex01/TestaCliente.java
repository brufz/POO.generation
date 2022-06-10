package br.com.generation.ex01;

public class TestaCliente {

	public static void main(String[] args) {
		Cliente c1 = new Cliente();
		
		c1.setNome("Pedro Paulo");
		c1.setRg(551990008);
		c1.setEmail("pedropaulo123@gmail.com");
		c1.setIdade(22);
		c1.setCompra(false);
		
		
		
		System.out.println("Nome: " + c1.getNome());
		System.out.println("RG: " + c1.getRg());
		System.out.println("E-mail: " + c1.getEmail());
		System.out.println("==================");
		c1.comprar();

	}

}
