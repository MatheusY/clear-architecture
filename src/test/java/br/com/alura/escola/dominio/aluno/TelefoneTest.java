package br.com.alura.escola.dominio.aluno;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class TelefoneTest {

	@Test
	void naoDeveriaCriarCpfsInvalidos() {
		assertThrows(IllegalArgumentException.class, () -> new Telefone(null, null));
		assertThrows(IllegalArgumentException.class, () -> new Telefone("", null));
		assertThrows(IllegalArgumentException.class, () -> new Telefone(null, ""));
		assertThrows(IllegalArgumentException.class, () -> new Telefone("1", "9876543210"));
		assertThrows(IllegalArgumentException.class, () -> new Telefone("1", "987654321"));
		assertThrows(IllegalArgumentException.class, () -> new Telefone("111", "987654321"));
		assertThrows(IllegalArgumentException.class, () -> new Telefone("1", "987654321"));
		assertThrows(IllegalArgumentException.class, () -> new Telefone("1", "987654"));
	}

	@Test
	void cpfValido() {
		Telefone telefone1 = new Telefone("11", "987654321");
		Telefone telefone2 = new Telefone("11", "98765432");
		assertNotNull(telefone1);
		assertNotNull(telefone2);
	}
}
