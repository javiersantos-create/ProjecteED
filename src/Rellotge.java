import java.text.DecimalFormat;

/**
 * Definició de la classe Rellotge
 */
public class Rellotge {

	// Atributs de la classe Rellotge
	private int segons;
	private int minuts;
	private int hores;
	
	// Constructors de la classe Rellotge
	/**
	 * Constructor sense paràmetres
	 */
	public Rellotge() {
		this.hores = 0;
		this.minuts = 0;
		this.segons = 0;
	}
	
	/**
	 * Constructor amb paràmetres
	 * @param hores
	 * @param minuts
	 * @param segons
	 */
	public Rellotge(int hores, int minuts, int segons) {
		setHores(hores);
		setMinuts(minuts);
		setSegons(segons);
	}
	
	/**
	 * Mètode sumarSegon -> suma un segon al rellotge
	 */
	public void sumarSegon() {
		segons++;
		if (segons > 59) {
			segons = 0;
			minuts++;
			if (minuts > 59) {
				minuts = 0;
				hores++;
				if (hores > 23) {
					hores = 0;
				}
			}
		}
	}
	
	/**
	 * Mètode sumarSegons
	 * @param segons
	 */
	public void sumarSegons(int segons) {
		for (int i = 0; i < segons; i++) {
			sumarSegon();
		}
	}
	
	/**
	 * Mètode modificarHora
	 * @param hores
	 * @param minuts
	 * @param segons
	 * @return
	 */
	public boolean modificarHora(int hores, int minuts, int segons) {
		boolean horaCorrecta = true;
		
		if ((hores < 0 || hores > 23) || (minuts < 0 || minuts > 59) || (segons < 0 || segons > 59)) {
			horaCorrecta = false;
		}else {			
			setSegons(segons);
			setMinuts(minuts);
			setHores(hores);
		}
		
		return horaCorrecta;
	}
	
	@Override
	public String toString() {
		DecimalFormat decimalFormat = new DecimalFormat("00");
		return decimalFormat.format(hores) + ":" + decimalFormat.format(minuts) + ":" + decimalFormat.format(segons); 
	}

	public int getSegons() {
		return segons;
	}

	public void setSegons(int segons) {
		if (segons >= 0 && segons <= 59) {
			this.segons = segons;
		}
	}

	public int getMinuts() {
		return minuts;
	}

	public void setMinuts(int minuts) {
		if (minuts >= 0 && minuts <= 59) {
			this.minuts = minuts;
		}
	}

	public int getHores() {
		return hores;
	}

	public void setHores(int hores) {
		if (hores >= 0 && hores <= 23) {
			this.hores = hores;
		}
	}
	
	
}
