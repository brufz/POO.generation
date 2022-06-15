package br.com.generation.excollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TestaEstoque {

	public static void main(String[] args) {
		ArrayList<Estoque> listaEstoque = new ArrayList<>();

		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite quantos produtor deseja cadastrar no estoque");
		int numeroProdutos = leitor.nextInt();
		String produto = "";

		for (int i = 0; i < numeroProdutos; i++) {
			System.out.println("Nome do produto: ");
			produto = leitor.next();
			leitor.nextLine();

			System.out.println("Digite a quantidade em estoque");
			int quantidade = leitor.nextInt();

			listaEstoque.add(new Estoque(produto, quantidade));

		}

		// remover
		System.out.println("Digite o index do item que deseja remover");
		int index = leitor.nextInt();
		listaEstoque.remove(index);

		// atualizar
		System.out.println("Digite o index do item que deseja atualizar");
		int index2 = leitor.nextInt();
		listaEstoque.set(0, new Estoque("Novo Produto", 200));

		// mostrar lista
		System.out.println(listaEstoque);

	}

}
