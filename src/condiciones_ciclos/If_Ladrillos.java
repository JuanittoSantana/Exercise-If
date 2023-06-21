/*
Se desaea saber cuantos ladrillos se necesitan para construir una pared rectangular,  
sabiendo que por cada metro cuadrado se necesitan 50 ladrillos y el costo por pegar 
el ladrillo es de $80.00

Mostrar cuanto se pagara al albañil por dicha pared, pero si la cantidad del costo a pagar
excede de los 3000 el patron estará obligado a pagar a imss de un 10% al trabajador(mostrar cuanto será de imss)
*/
package condiciones_ciclos;

import java.util.Scanner;

public class If_Ladrillos {

    public static void main(String[] args) {
        
        double base;
        double altura;
        double metro2;
        double ladrillopegado;
        double numeroLadrillo;
        double cantidadPagar;
        double imss;
   
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Ingresar metros de la base:");
        base = kb.nextDouble();
        System.out.println("Ingresar metros de la altura:");
        altura = kb.nextDouble();
        System.out.println("Costo por ladrillo: ");
        metro2 = base*altura;
        cantidadPagar = metro2*80;
        numeroLadrillo = metro2*50;
        System.out.println("Cantidad a pagar por la pared: "+cantidadPagar);
        System.out.println("Numero de ladrillos necesitados: "+numeroLadrillo);
        System.out.println("Metros cuadrados de la pared: "+metro2);
     
        if(cantidadPagar > 3000){
            System.out.println("Excedió de $3,000");
            System.out.println("El Patrón pagará un imss del 10% al Trabajador");
            imss = cantidadPagar*0.10;

            System.out.println("Costo de Imss al trabajador: "+imss);
            
            } else {
            System.out.println("No excedió de los $3,000");
            System.out.println("No se requiere el imss");
        }
        
        
    }
    
}
