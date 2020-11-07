package br.com.alura.escola.academico.dominio.aluno;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	private Cpf  cpf;
	
	private String nome;
	
	private Email email;
	
	private String senha;
	
	private List<Telefone> telefones = new ArrayList<>();
	
	public Aluno(Cpf cpf, String nome, Email email) {
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
	}
	
	public void adicionarTelefone(String ddd, String numero) {
		if(telefones.size() == 2) {
			throw new IllegalArgumentException("Número máximo de telfones atingido");
		}
		telefones.add(new Telefone(ddd, numero));
	}

	public Cpf getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email.getEndereco();
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}
	
}
