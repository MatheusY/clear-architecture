package br.com.alura.escola.academico.aplicacao.aluno.matricular;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.com.alura.escola.academico.dominio.aluno.Aluno;
import br.com.alura.escola.academico.dominio.aluno.LogDeAlunoMatriculado;
import br.com.alura.escola.academico.dominio.aluno.RepositorioDeAlunos;
import br.com.alura.escola.academico.infra.aluno.RepositorioDeAlunosEmMemoria;
import br.com.alura.escola.shared.dominio.Cpf;
import br.com.alura.escola.shared.dominio.evento.PublicadorDeEventos;

class MatricularAlunoTest {

	@Test
	void alunoDeveriaSerPersistido() {
		RepositorioDeAlunos repositorio = new RepositorioDeAlunosEmMemoria();
		PublicadorDeEventos publicador = new PublicadorDeEventos();
		MatricularAluno useCase = new MatricularAluno(repositorio, publicador);
		
		MatricularAlunoDto dados = new MatricularAlunoDto("Fulano", "42634043864", "matheus.matsubara12@gmail.com");
		
		useCase.executa(dados);
		
		Aluno encontrado = repositorio.buscarPorCpf(new Cpf(dados.getCpfAluno()));
		
		assertEquals(dados.getCpfAluno(), encontrado.getCpf().toString());
		assertEquals(dados.getEmailAluno(), encontrado.getEmail());
		assertEquals(dados.getNomeALuno(), encontrado.getNome());
		
	}

}
