package br.com.generation.aulaheranca;

import java.util.Scanner;

public class TestaPessoa {

	public static void main(String[] args) {
		// Construtor abre um espaço em memória para criação do objeto
		Scanner leitor = new Scanner(System.in);
		Aluno aluno1 = new Aluno();

		aluno1.setNome(leitor.next());
		aluno1.setEndereco("Rua das Flores, 122 - SP");
		aluno1.setSemestre("6° semestre");
		aluno1.setCurso("Geografia");

		System.out.println("Nome do aluno: " + aluno1.getNome());

		Professor prof1 = new Professor(); // construtor

		prof1.setNome("João da Silva");
		prof1.setIdade(32);
		prof1.setEndereco("Rua das Pedras, 159 - SP");

		prof1.setSalario(3923.92);
		prof1.setDisciplina("Geografia");

		System.out.println(prof1.getNome());
		System.out.println(prof1.getIdade());
		System.out.println(prof1.getEndereco());
		System.out.println(prof1.getSalario());
		System.out.println(prof1.getDisciplina());

	}

}
