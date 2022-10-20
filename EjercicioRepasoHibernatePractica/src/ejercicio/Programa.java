package ejercicio;

import java.util.Scanner;

public class Programa {

	final static Scanner entrada = new Scanner(System.in);
	
	public static void menu_principal()	{
		System.out.println("1.- Mostrar");
		System.out.println("\ta- Tabla Citas");
		System.out.println("\tb- Tabla Medicos");
		System.out.println("\tc- Tabla Pacientes");
		System.out.println("2.- Anhadir");
		System.out.println("\ta- Tabla Citas");
		System.out.println("\tb- Tabla Medicos");
		System.out.println("\tc- Tabla Pacientes");
		System.out.println("3.- Modificar");
		System.out.println("\ta- Tabla Citas");
		System.out.println("\tb- Tabla Medicos");
		System.out.println("\tc- Tabla Pacientes");
		
		System.out.println("4.- Salir");
	}
	
	public static void main(String[] args) {
		
		BBDD.iniciar_sesion();
		
		boolean fin = false;
		while(!fin)	{
			menu_principal();
			switch(entrada.next().toLowerCase())	{
			// Mostrar
			case "1a":
				BBDD.mostrar_citas();
				break;
			case "1b":
				BBDD.mostrar_medicos();
				break;
			case "1c":
				BBDD.mostrar_pacientes();
				break;
				
				
			// Anhadir
			case "2a":
				break;
			case "2b":
				break;
			case "2c":
				break;
				
				
			// Modificar
			case "3a":
				break;
			case "3b":
				break;
			case "3c":
				break;
				
			// Salir
			case "4":
				fin = true;
				break;
			default:
				
			}
		}
		BBDD.cerrar_sesion();
	}

}
