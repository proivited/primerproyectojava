package primerProyecto;

import java.util.Scanner;

public class PrimerProyecto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre;
		Scanner leerNombre = new Scanner(System.in);
		
		System.out.print("Introduce tu nombre:");
		nombre = leerNombre.next();
		
		System.out.println("Tu nombre es:" + nombre);

	}
		
}
