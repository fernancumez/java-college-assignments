
/*
	Operadores de incremento y decremento

	++x   Prefijo
	x++   Sufijo
	--x   Prefijo
	x--   Sufijo
*/

class Incremento{
    public static void main(String[] args){
        int x, y;

        //Operadores de incremento
        x = 5;		//++x incrementa el valor de x
        y = ++x;	// y antes de utilizarlo
        System.out.println(y);

        x = 5;		//x++ utiliza el valor de x 
        y = x++;	// y lugo lo incrementa
        System.out.println(y);

        /*
            Operadores de decremento:
            
            Trabaja de la misma frma que el operador incremneto
            pero en lugar de icrementar el vaor, lo reduce en uno.
        */

        x = 5;
        y = --x;
        System.out.println(y);

        x = 5;
        y = x--;
        System.out.println(y);

        int result = 0;
        for(int i = 0; i < 5; i++){
            if(i == 3){
                result += 10;
            }
            else{
                result += i;
            }
        }

        System.out.print(result);
    }
}