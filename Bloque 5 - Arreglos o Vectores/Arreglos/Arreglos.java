
import java.util.Scanner;

public class Arreglos {
	public static Scanner cant;
	public static Scanner num;
	
	public static void main(String[] args) {
		cant = new Scanner(System.in);
		num = new Scanner(System.in);
		
		int cantidad,mayor = 0,suma = 0, cont = 0, menor = 100;
		int[] numero = new int[100];
		
		System.out.print("INGRESE EL NUMERO DE DIGITOS: ");
		cantidad = cant.nextInt();
		
		for(int i=0;i<cantidad;i++) {
			System.out.print("NUMERO "+(i+1)+": ");
			numero[i] = num.nextInt();
			if(numero[i]>mayor) {
				mayor = numero[i];
			}
			if(numero[i]<menor){
				menor = numero[i];
			}
			suma += numero[i];
			cont++;
		}
		System.out.println("\nEL NUMERO MAYOR ES: "+mayor);
		System.out.println("EL NUMERO MENOR ES: "+menor);
		System.out.println("LA SUMA DE LOS NUMEROS INGRESADOS ES: "+suma);
		System.out.println(cont+" DIGITOS INGRESADOS");
	}

}
