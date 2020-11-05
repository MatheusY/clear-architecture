package br.com.alura.escola.aplicacao.aluno.matricular;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.Cpf;
import br.com.alura.escola.dominio.aluno.RepositorioDeAlunos;
import br.com.alura.escola.infra.aluno.RepositorioDeAlunosEmMemoria;

class MatricularAlunoTest {

	@Test
	void alunoDeveriaSerPersistido() {
		RepositorioDeAlunos repositorio = new RepositorioDeAlunosEmMemoria();
		
		MatricularAluno useCase = new MatricularAluno(repositorio);
		
		MatricularAlunoDto dados = new MatricularAlunoDto("Fulano", "42634043864", "matheus.matsubara12@gmail.com");
		
		useCase.executa(dados);
		
		Aluno encontrado = repositorio.buscarPorCpf(new Cpf(dados.getCpfAluno()));
		
		assertEquals(dados.getCpfAluno(), encontrado.getCpf());
		assertEquals(dados.getEmailAluno(), encontrado.getEmail());
		assertEquals(dados.getNomeALuno(), encontrado.getNome());
		
	}

}
