import java.util.Scanner;

public class PersonaApp {

	public static final int MAX_PERSONES = 5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Persona[] llista = new Persona[MAX_PERSONES];
		int numPersones = 0;
		String nom;
		int dia = 0;
		int mes = 0;
		int any = 0;
		int numDni = 0;
		int opcio = 0;
		do {
			mostrarMenu();
			opcio = teclado.nextInt();

			if (opcio == 1) {
				System.out.print("Introdueix el nom de la persona: ");
				teclado.nextLine();
				nom = teclado.nextLine();
				
				// Validacio de data
				do {
					System.out.print("Introdueix el dia de naixement: ");
					dia = teclado.nextInt();
					System.out.print("Introdueix el mes de naixement: ");
					mes = teclado.nextInt();
					System.out.print("Introdueix l\'any de naixement: ");
					any = teclado.nextInt();
					
					if (!Data.dataCorrecta(dia, mes, any)) {
						System.out.println("Error! Data incorrecta");
					}
				}while(!Data.dataCorrecta(dia, mes, any));
				
				System.out.print("Introdueix el numero del dni (sense la lletra): ");
				numDni = teclado.nextInt();

				if (numPersones < MAX_PERSONES) {
					llista[numPersones] = new Persona(nom, dia, mes, any, numDni);
					numPersones++;
				}else {
					System.out.println("Error! Ja no hi caben més persones");
				}
			}else if(opcio == 2) {
				System.out.println("\n*** LLISTAT DE PERSONES ***");
				mostrarPersones(llista, numPersones);
			}
			else {
				System.out.println("\nFI DEL PROGRAMA");
			}

		}while(opcio != 3);
	}

	public static void mostrarMenu() {
		System.out.println("\n**** MENU ****");
		System.out.println("1. Crear persona");
		System.out.println("2. Mostrar totes les persones");
		System.out.println("3. Sortir");
	}

	public static void mostrarPersones(Persona[] llista, int numPersones) {
		for (int i = 0; i < numPersones; i++) {
			System.out.println(llista[i]);
		}
	}

}
