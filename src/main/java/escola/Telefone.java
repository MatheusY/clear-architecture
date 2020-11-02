package escola;

import java.util.Objects;

public class Telefone {

	private String ddd;
	private String numero;
	
	public Telefone(String ddd, String numero) {
		if(Objects.isNull(ddd) || Objects.isNull(numero) || ddd.length() != 2 || numero.length() < 8 || numero.length() > 9) {
			throw new IllegalArgumentException("Telefone inválido");
		}
		this.ddd = ddd;
		this.numero = numero;
	}

	public String getDdd() {
		return ddd;
	}

	public String getNumero() {
		return numero;
	}
}
