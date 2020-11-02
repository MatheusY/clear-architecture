import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import escola.Cpf;

class CpfTest {

	@Test
	void naoDeveriaCriarCpfsInvalidos() {
		assertThrows(IllegalArgumentException.class, () -> new Cpf(null));
		assertThrows(IllegalArgumentException.class, () -> new Cpf(""));
		assertThrows(IllegalArgumentException.class, () -> new Cpf("80893089394"));
		assertThrows(IllegalArgumentException.class, () -> new Cpf("809.000.000-64"));
	}

	@Test
	void cpfValido() {
		Cpf cpfl = new Cpf("42634043864");
		assertNotNull(cpfl);
	}
}
