
public class Main {

	public static void main(String[] args) {
		// Variables del main
		
		Rellotge rellotge = new Rellotge();
		System.out.println(rellotge);
		
		rellotge.sumarSegon();
		System.out.println(rellotge);
		
		rellotge.sumarSegons(300);
		System.out.println(rellotge);
		
		rellotge.modificarHora(23, 59, 59);
		System.out.println(rellotge);
		
		rellotge.sumarSegon();
		System.out.println(rellotge);
		
		rellotge.sumarSegons(3599);
		System.out.println(rellotge);
		
		rellotge.sumarSegon();
		System.out.println(rellotge);
		
		rellotge = new Rellotge(30,30,30);
		System.out.println(rellotge);
		
		rellotge.sumarSegons(30);
		System.out.println(rellotge);
		
		System.out.println("----- PASO DE PARAMETROS ----");
		int numero = 10;
		Rellotge rellotgeNou = new Rellotge();

		sumarCincAEnter(numero);
		
		System.out.println(numero);
		
		sumarCincSegons(rellotgeNou);
		System.out.println(rellotgeNou);
	}
	
	// Paso de parametro por valor
	public static void sumarCincAEnter(int numero) {
		numero = numero + 5;
	}
	
	// Paso de parametro por ?
	public static void sumarCincSegons(Rellotge rellotge) {
		
		rellotge.sumarSegons(5);
	}

}
