package hiworld;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hi {
	public static void main(String[] args) throws IOException {

		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		String nombre;
		System.out.println("Ingrese su nombre: ");
		nombre = lectura.readLine();
		
		System.out.println ("Hola "+nombre);
	}
}
