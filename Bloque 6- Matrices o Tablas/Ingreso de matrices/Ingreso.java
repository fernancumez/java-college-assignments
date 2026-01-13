
//Ingreso de matrices

import java.util.Scanner;

class Ingreso{
    public static void main(String[] args){
        Scanner _matriz = new Scanner(System.in);    
        Scanner _fila = new Scanner(System.in);
        Scanner _columna = new Scanner(System.in);    

        int matriz[][] = new int[2][3];
        int fila, columna;

        try{
            System.out.print("Ingreso de datos!\n");
            for(int i = 0; i < 2; i++){
                for(int j = 0; j < 3; j++){
                    System.out.print("[" + i + "][" + j + "]: ");
                    matriz[i][j] = _matriz.nextInt();
                }
                System.out.print("\n");
            }

            System.out.print("salida de datos!\n");
            for(int i = 0; i < 2; i++){
                for(int j = 0; j < 3; j++){
                    System.out.print(matriz[i][j]);
                }
                System.out.print("\n");
            }

            System.out.print("\nBusqueda de datos!");
            System.out.print("\nDigite el numero de fila: ");
            fila = _fila.nextInt();
            System.out.print("Digite el numero de columna: ");
            columna = _columna.nextInt();

            System.out.print("[" + fila + "][" + columna + "]: " + matriz[fila - 1][columna - 1]);
        }
        catch(Exception e){
            System.out.print("Ha ocurrido un error!");
        }
        
    }
}