package br.com.alura.escola.academico.aplicacao.aluno.matricular;

import br.com.alura.escola.academico.dominio.aluno.Aluno;
import br.com.alura.escola.academico.dominio.aluno.Email;
import br.com.alura.escola.shared.dominio.Cpf;

public class MatricularAlunoDto {

	private String nomeALuno;
	private String cpfAluno;
	private String emailAluno;

	public MatricularAlunoDto(String nomeALuno, String cpfAluno, String emailAluno) {
		this.nomeALuno = nomeALuno;
		this.cpfAluno = cpfAluno;
		this.emailAluno = emailAluno;
	}
	
	public Aluno criarAluno() {
		return new Aluno(new Cpf(cpfAluno), nomeALuno, new Email(emailAluno));
	}

	public String getNomeALuno() {
		return nomeALuno;
	}

	public String getCpfAluno() {
		return cpfAluno;
	}

	public String getEmailAluno() {
		return emailAluno;
	}

	public void setNomeALuno(String nomeALuno) {
		this.nomeALuno = nomeALuno;
	}

	public void setCpfAluno(String cpfAluno) {
		this.cpfAluno = cpfAluno;
	}

	public void setEmailAluno(String emailAluno) {
		this.emailAluno = emailAluno;
	}
	
	
}
