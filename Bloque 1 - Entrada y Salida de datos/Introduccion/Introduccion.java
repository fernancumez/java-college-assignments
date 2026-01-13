
import java.util.Scanner;

public class Introduccion {

	private static Scanner digito;
	private static Scanner palabras;
	private static Scanner puntos;
	private static Scanner abecedario;

	public static void main(String[] args) {
		digito = new Scanner(System.in);
		abecedario = new Scanner(System.in);
		palabras = new Scanner(System.in);
		puntos = new Scanner(System.in);
		
		int numero;
		char letra;
		String cadena;
		float decimal;
		
		System.out.print("DIGITE UN NUMERO: ");
		numero = digito.nextInt();
		System.out.println("EL NUMERO INGRESADO ES: : "+numero);
		
		System.out.print("DIGITE UNA LETRA: ");
		letra = abecedario.next().charAt(0);
		System.out.println("LA LETRA INGRESADA ES: "+letra);
		
		System.out.print("DIGITE UNA CADENA: ");
		cadena = palabras.nextLine();
		System.out.println("LA CADENA INGRESADA ES: "+cadena);
		
		System.out.print("DIGITE UN NUMERO DECIMAL: ");
		decimal = puntos.nextFloat();
		System.out.println("EL NUMERO DECIMAL INGRESADO ES: "+decimal);
		
		
	}

}
