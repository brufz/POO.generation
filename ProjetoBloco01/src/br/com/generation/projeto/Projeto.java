package br.com.generation.projeto;

import java.util.Scanner;

public class Projeto {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Mulher m1 = new Mulher();
		int opcao1, opcao2;
		
		System.out.println("Digite o nome da mulher para iniciar o jogo interativo");
		m1.setNome(leitor.next());
		
		System.out.println(m1.getNome() + "acordou para ir ao trabalho.");
		System.out.println("Escolha a op��o a seguir: ");
		System.out.println("1 - Acordou na hora");
		System.out.println("2 - Acordou atrasada");
		opcao1 = leitor.nextInt();
		if (opcao1 == 1) {
			System.out.println(m1.getNome() + " dirige at� o trabalho. No estacionamento acidentalmente encosta no carro de um "
					+ "funcion�rio que estava chegando");
			System.out.println("Escolha a op��o a seguir");
			System.out.println("1 - Os dois desceram do carro e se acertaram sobre o problema acontecido. " + m1.getNome() + " deu"
					+ "seu n�mero e se prontificou a chamar o seguro. O outro funcion�rio a tranquilizou: 'acidentes acontecem'");
			System.out.println("2 - O funcion�rio sai do carro bravo, ofendendo" + m1.getNome() + ". Soltou palavras como \'tinha que ser mulher para n�o saber dirigir'."
					+ m1.getNome() + " sentiu medo por trabalhar no mesmo local que este homem, tamb�m se sentiu frustrada "
							+ "por ter cometido esse deslize.");
			opcao2 = leitor.nextInt();
		switch (opcao2) {
		case 1: 
			
			break;
		case 2:
			
			break;
		default:
			
			break;
		}
		} else if (opcao1 == 2) {
			System.out.println(m1.getNome() + " ficou preocupada em se atrasar para o trabalho, ent�o, colocou rapidamente um"
					+ "shorts e uma blusa que encontrou e resolveu se trocar no trabalho.");
		} else {
			System.out.println("Op��o inv�lida");
		}
	

	}

}
