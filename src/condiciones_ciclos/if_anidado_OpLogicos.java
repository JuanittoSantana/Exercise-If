/*
 * Programa que pida un numero y nos muestre la cantidad de digitos que contiene
 */
package condiciones_ciclos;

import java.util.Scanner;

public class if_anidado_OpLogicos {

    public static void main(String[] args) {

        int numero;
        
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Introduce una cantidad para mostrar los digitos que contiene");
        numero = kb.nextInt();
        
        if(numero >= 0 & numero <= 9){
            System.out.println("La cantidad contiene 1 digito");
        } else {
            if (numero >= 10 & numero <= 99){
                System.out.println("La cantidad contiene 2 digitos");
            } else {
            if (numero >= 100 & numero <= 999){
                System.out.println("La cantidad contiene 3 digitos");
        } else {
                if (numero >= 1000 & numero <= 9999){
                System.out.println("La cantidad contiene 4 digitos");
        } else {
                    System.out.println("Solo se acepta hasta 9999");
      
    }
    }
    }
    }
      }
    }
 

