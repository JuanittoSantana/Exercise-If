/*
 * Se desea saber cual es el area de un cuadrado a partir de la medida de su lado (A = L*L) 
 * y en caso de que sea mayor de 50 que muestre el mensaje "Fuera de presupuesto", y de lo 
 * contrario mostrar el mensaje "Empezar la obra"
 * 
 */
package condiciones_ciclos;

import java.util.Scanner;

public class if_area {

    public static void main(String[] args) {
        
        double Cuadrado;
        double Area;
      
        System.out.println("Introducir Lado en Metro");
        Scanner kb = new Scanner(System.in);
        Cuadrado = kb.nextDouble();
        
        Area = Cuadrado*Cuadrado;
        System.out.println("Tamaño del Area: "+Area+"Metros cuadrados");
        if(Area >= 50){
            System.out.println("Fuera de presupuesto");
        } else { 
            System.out.println("Empezar la obra");
        }
        
   
    }
}
