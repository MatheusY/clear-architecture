package br.com.alura.escola.infra.aluno;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.AlunoNaoEncontrado;
import br.com.alura.escola.dominio.aluno.Cpf;
import br.com.alura.escola.dominio.aluno.RepositorioDeAlunos;

public class RepositorioDeAlunosEmMemoria implements RepositorioDeAlunos {

	List<Aluno> matriculados = new ArrayList<>();

	@Override
	public void matricular(Aluno aluno) {
		matriculados.add(aluno);
	}

	@Override
	public Aluno buscarPorCpf(Cpf cpf) {
		return matriculados.stream().filter(aluno -> aluno.getCpf().equals(cpf.getNumero())).findFirst()
				.orElseThrow(() -> new AlunoNaoEncontrado(cpf));
	}

	@Override
	public List<Aluno> buscarTodosAlunosMatriculados() {
		return matriculados;
	}

}
