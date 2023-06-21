/*
 * Que muestre si un candidato es aceptado en el equipo femenil de basket ball, sabiendo que
 * los requisitos son tener menos de 17 años y pesa menos de 50 o más Kg y que en el grupo
 * hay hombres y mujeres
 */
package condiciones_ciclos;

import java.util.Scanner;

public class if_CandidatoEquipo {

    public static void main(String[] args) {
       
        int Edad;
        double Peso;
        int Genero;
        
        /* Genero es una variable de tipo String la cual no se puede validad con == 
         * si no con el equals()
         * Puedes usar;  String genero;
         * usando el metodo de genero.equals
         * if("f".equials(genero)
         * o
         * if(genero.equals("f")
         */
        
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Candidatas para ingresar a equipo de Basket Ball Femenil");
        System.out.println("---------------------------------------------------------");
        System.out.println("Edad de la persona: ");
        Edad = kb.nextInt();
        System.out.println("Peso en Kg de la persona: ");
        Peso = kb.nextDouble();
        System.out.println("Ingresar 1 si eres hombre. Ingrese 0 si eres mujer");
        System.out.println("Genero de la persona");
        Genero = kb.nextInt();
        
        if(Edad < 17 & Peso >= 50 & Genero == 0){
            System.out.println("Candidata Aceptado");
        }else{ 
            System.out.println("Candidato no aceptado");
        
        }
    
    
        
        
        
    }
}
