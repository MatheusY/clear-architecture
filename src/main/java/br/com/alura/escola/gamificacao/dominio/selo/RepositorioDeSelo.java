package br.com.alura.escola.gamificacao.dominio.selo;

import java.util.List;

import br.com.alura.escola.shared.dominio.Cpf;

public interface RepositorioDeSelo {

	void gravar(Selo selo);
	
	List<Selo> listaSelosAluno(Cpf cpfDoAluno);
}
