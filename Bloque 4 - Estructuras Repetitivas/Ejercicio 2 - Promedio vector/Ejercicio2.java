/*
    Ejercicio 3:
    Leer 5 númeors por teclado, almacenarlos en un arreglo
    y a continuacion realizar la suma de los numeros pares,
    las suma de los impares y contar el numero de ceros.
*/

import java.util.Scanner;
class Ejercicio2{
    public static void main(String[] args){
        Scanner _num = new Scanner(System.in);

        int num[] = new int[5];
        int cont = 0, par = 0, impar = 0;
        int _par = 0, _impar = 0;

        for(int i = 0; i < 5; i++){
            System.out.print("Digite el numero" + (i+1) + ": ");
            num[i] = _num.nextInt();

            if(num[i] == 0){
                cont++;
            }
            else{
                if(num[i] % 2 == 0){
                    _par += num[i];
                    par++;
                }
                else{
                    _impar += num[i];
                    impar++;
                }
            } 
        }

        for(int i:num){
            System.out.print(i + "\n");
        }
        System.out.print("\n" + cont + " Veces se ingreso cero");
        System.out.print("\nSe ingresaron " + par + " numeros pares, cuya suma es: " + _par);
        System.out.print("\nSe ingresaron " + impar + " numeros impares, cuya suma es: " + _impar);
    }
}