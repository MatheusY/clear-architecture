package br.com.alura.escola.gamificacao.dominio.selo;

import java.util.List;

import br.com.alura.escola.academico.dominio.aluno.Cpf;

public interface RepositorioDeSelo {

	void gravar(Selo selo);
	
	List<Selo> listaSelosAluno(Cpf cpfDoAluno);
}
