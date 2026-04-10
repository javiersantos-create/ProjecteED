import java.text.DecimalFormat;

public class Nif {

	// Atributs de la classe Nif
	private int numero;
	private char lletra;
	
	public Nif(int numero) {
		setNumero(numero);
		setLletra(calcularLletra());
	}
	
	private char calcularLletra() {
		char[] lletresDni = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		return lletresDni[this.numero % 23];
	}

	public int getNumero() {
		return numero;
	}

	public char getLletra() {
		return lletra;
	}
	
	private void setNumero(int numero) {
		if (numero > 0 && numero < 99999999) {
			this.numero = numero;
		}else {
			this.numero = 0;
		}
	}
	
	private void setLletra(char lletra) {
		this.lletra = lletra;
	}
	
	@Override
	public String toString() {
		DecimalFormat format8Digits = new DecimalFormat("00000000");
		return format8Digits.format(this.numero) + "-" + this.lletra;
	}
}
