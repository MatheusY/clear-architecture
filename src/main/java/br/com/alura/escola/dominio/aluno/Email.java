package br.com.alura.escola.dominio.aluno;

import java.util.Objects;

public class Email {

	private String endereco;

	public Email(String endereco) {
		if(Objects.isNull(endereco) || !endereco.matches("^(.+)@(.+)$")) {
			throw new IllegalArgumentException("E-mail inválido");
		}
		this.endereco = endereco;
	}

	public String getEndereco() {
		return endereco;
	}
	
}
