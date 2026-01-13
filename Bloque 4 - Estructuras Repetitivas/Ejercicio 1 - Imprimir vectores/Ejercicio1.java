/*
    Ejercicio 1:
    Leer 5 números, guardarlos en un arreglo y mostrarlos
    en el mismo orden introducido
*/

import java.util.Scanner;

class Ejercicio1{
    public static void main(String[] args){
        Scanner _num = new Scanner(System.in);
        int num[] = new int[5];

        try{
            System.out.print("Ingreso de datos!\n");
            for(int i = 1; i < 5; i++){
                System.out.print("Digite el numero " + (i+1) + ": ");
                num[i] = _num.nextInt();
            }

            System.out.print("\nMostrando datos!\n");
            for(int k:num){     //For each o For mejorado
                System.out.print(k + "\n");
            }   
        }
        catch(Exception e){
            System.out.print("\nHa ocurrido un error!");
        }
        
        
    }
}