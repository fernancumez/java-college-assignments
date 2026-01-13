
import java.util.Scanner;

public class Developer {
	public static Scanner cant;
	public static Scanner empl;
	public static Scanner bus;
	
	public static void main(String[] args) {
		cant = new Scanner(System.in);
		empl = new Scanner(System.in);
		bus = new Scanner(System.in);
		
		int i,cantidad, buscar;
		int[] empleados = new int[10];
		
		System.out.print("INGRESE EL NUMERO DE EMPLEADOS: ");
		cantidad = cant.nextInt();
		
		for(i=1;i<=cantidad;i++) {
			System.out.print("INGRESE EL SUELDO DEL EMPLEADO "+i+": ");
			empleados[i] = empl.nextInt();
		}
		
		System.out.print("\n");
		for(i=1;i<=cantidad;i++) {
			System.out.println("EMPLEADO: "+i+": "+empleados[i]);
		}
		
		System.out.print("\nINGRESE LA POSICION: ");
		buscar = bus.nextInt();
		System.out.print("EMPLEADO "+buscar+": "+empleados[buscar]);
		
	}

}
