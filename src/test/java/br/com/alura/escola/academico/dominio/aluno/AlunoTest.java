package br.com.alura.escola.academico.dominio.aluno;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.alura.escola.shared.dominio.Cpf;

class AlunoTest {
	
	Aluno aluno;
	
	@BeforeEach
	void criaAluno() {
		aluno = new Aluno(new Cpf("42634043864"), "Matheus Yudi", new Email("matheus.matsubara12@gmail.com"));
	}

	@Test
	void testAdicionUmTelefone() {
		aluno.adicionarTelefone("11", "99999999");
		List<Telefone> telefones = aluno.getTelefones();
		assertEquals(1, telefones.size());
		assertEquals("11", telefones.get(0).getDdd());
		assertEquals("99999999", telefones.get(0).getNumero());
	}
	
	@Test
	void testAdicionDoisTelefones() {
		aluno.adicionarTelefone("11", "99999999");
		aluno.adicionarTelefone("12", "88888888");
		List<Telefone> telefones = aluno.getTelefones();
		assertEquals(2, telefones.size());
		assertTrue(telefones.stream().anyMatch(t -> "11".equals(t.getDdd())));
		assertTrue(telefones.stream().anyMatch(t -> "99999999".equals(t.getNumero())));
		assertTrue(telefones.stream().anyMatch(t -> "12".equals(t.getDdd())));
		assertTrue(telefones.stream().anyMatch(t -> "88888888".equals(t.getNumero())));
	}
	
	@Test
	void testAdicionTresTelefones() {
		aluno.adicionarTelefone("11", "99999999");
		aluno.adicionarTelefone("12", "88888888");
		assertThrows(IllegalArgumentException.class, () -> aluno.adicionarTelefone("13", "77777777"));
	}

}
