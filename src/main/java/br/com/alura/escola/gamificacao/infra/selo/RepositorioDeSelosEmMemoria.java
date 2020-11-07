package br.com.alura.escola.gamificacao.infra.selo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.alura.escola.academico.dominio.aluno.Cpf;
import br.com.alura.escola.gamificacao.dominio.selo.RepositorioDeSelo;
import br.com.alura.escola.gamificacao.dominio.selo.Selo;

public class RepositorioDeSelosEmMemoria implements RepositorioDeSelo{

	private List<Selo> selos = new ArrayList<>();
	
	@Override
	public void gravar(Selo selo) {
		selos.add(selo);
	}

	@Override
	public List<Selo> listaSelosAluno(Cpf cpfDoAluno) {
		return selos.stream().filter(s -> s.getCpfDoAluno().equals(cpfDoAluno)).collect(Collectors.toList());
	}

}
