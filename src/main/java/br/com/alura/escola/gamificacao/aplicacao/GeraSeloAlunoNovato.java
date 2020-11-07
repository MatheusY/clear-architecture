package br.com.alura.escola.gamificacao.aplicacao;

import br.com.alura.escola.gamificacao.dominio.selo.RepositorioDeSelo;
import br.com.alura.escola.gamificacao.dominio.selo.Selo;
import br.com.alura.escola.shared.dominio.Cpf;
import br.com.alura.escola.shared.dominio.evento.Evento;
import br.com.alura.escola.shared.dominio.evento.Ouvinte;
import br.com.alura.escola.shared.dominio.evento.TipoDeEvento;

public class GeraSeloAlunoNovato extends Ouvinte {
	
	private final RepositorioDeSelo repositorioDeSelos;
	
	public GeraSeloAlunoNovato(RepositorioDeSelo repositorioDeSelos) {
		this.repositorioDeSelos = repositorioDeSelos;
	}

	@Override
	protected void reageAo(Evento evento) {
		Cpf cpfDoAluno = (Cpf) evento.informacoes().get("cpf");
		Selo novato = new Selo(cpfDoAluno, "Novato");
		repositorioDeSelos.gravar(novato);
		
	}

	@Override
	protected boolean deveProcessar(Evento evento) {
		return evento.tipo().equals(TipoDeEvento.ALUNO_MATRICULADO);
	}

}
