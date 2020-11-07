package br.com.alura.escola.academico.infra.aluno;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.escola.academico.dominio.aluno.Aluno;
import br.com.alura.escola.academico.dominio.aluno.AlunoNaoEncontrado;
import br.com.alura.escola.academico.dominio.aluno.RepositorioDeAlunos;
import br.com.alura.escola.shared.dominio.Cpf;

public class RepositorioDeAlunosEmMemoria implements RepositorioDeAlunos {

	List<Aluno> matriculados = new ArrayList<>();

	@Override
	public void matricular(Aluno aluno) {
		matriculados.add(aluno);
	}

	@Override
	public Aluno buscarPorCpf(Cpf cpf) {
		return matriculados.stream().filter(aluno -> aluno.getCpf().toString().equals(cpf.toString())).findFirst()
				.orElseThrow(() -> new AlunoNaoEncontrado(cpf));
	}

	@Override
	public List<Aluno> buscarTodosAlunosMatriculados() {
		return matriculados;
	}

}
