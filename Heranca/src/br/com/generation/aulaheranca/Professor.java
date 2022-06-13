package br.com.generation.aulaheranca;

public class Professor extends Funcionario {
	
	public String getDisciplina() {
		return disciplina;
	}

	//getter e setter
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	private String disciplina;

}
