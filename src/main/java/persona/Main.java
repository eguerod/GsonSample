package persona;

import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

	public static void main(String[] args) {
		boolean error = false;
		Persona p = new Persona();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Introduzca el nombre: ");
		try {
			p.Nombre = scanner.nextLine();
			} catch (java.util.InputMismatchException e) {
				System.out.println("El formato de los apellidos no es válido");
				error = true;
			}
		
		System.out.print("Introduzca los apellidos: ");
		try {
			p.Apellidos = scanner.nextLine();
			} catch (java.util.InputMismatchException e) {
				System.out.println("El formato de los apellidos no es válido");
				error = true;
			}
		
		System.out.print("Introduzca la edad: ");
		try {
		p.Edad = scanner.nextInt();
		} catch (java.util.InputMismatchException e) {
			System.out.println("El formato de la edad no es válido");
			error = true;
		}
		
		if(!error) {
		System.out.println();
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(p);
		System.out.println(json);
		}
		
		scanner.close();
	}

}
