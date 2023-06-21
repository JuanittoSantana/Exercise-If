/*
 * ¿Cuanto se pagara por la compra de una cantidad de portafolios de acuerdo a su precio, 
 * sabiendo que se hara un descuento del 20% si es cliente frecuente y la compra es
 * mayor de 1000$, de lo contrario si no es cliente frecuente y su compra es mayor de 
 * 1000$ solo se le hara un descuento de 10% y se le cargara el 15% de IVA?
 */
package condiciones_ciclos;

import java.util.Scanner;

public class if_Pagare {

    public static void main(String[] args) {
       
        int portafolios;
        double precio;
        double subtotal;
        int frecuencia;
        double total;
        double descuento;
        double IVA;
        double IVAtotal;
  
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Ingresar cantidad de Portafolios a adquirir: ");
        portafolios = kb.nextInt();
        System.out.println("Precio por portafolio: ");
        precio = kb.nextDouble();
        System.out.println("¿Es usted Cliente frecuente? 0 - Si | 1 - No");
        frecuencia = kb.nextInt();
        
        subtotal = portafolios*precio;
        System.out.println("Cantidad a pagar: "+subtotal);
        
        if(subtotal > 1000 & frecuencia == 0){
            System.out.println("Recibe Descuento de 20%");
            descuento = subtotal*0.20;
            total = subtotal+descuento;
            IVA = descuento*0.15;
            IVAtotal = total+IVA;
            System.out.println("Costo por portafolios: "+subtotal);
            System.out.println("Descuento de 20%: "+descuento);
            System.out.println("Costo con Descuento: "+total); 
            System.out.println("IVA: "+IVA);
            System.out.println("Costo con IVA: "+IVAtotal);
        } else {
            System.out.println("No recibe descuento");
            System.out.println("Costo por portafolios: "+subtotal);
        } if(subtotal > 1000 & frecuencia ==1){
                System.out.println("Recibe Descuento de 10%");
                descuento = subtotal*0.10;
                total = subtotal+descuento;
                IVA = descuento*0.15;
                IVAtotal = total+IVA;
                System.out.println("Costo por portafolios: "+subtotal);
                System.out.println("Descuento de 10%: "+descuento);
                System.out.println("Costo con Descuento: "+total);
                System.out.println("IVA: "+IVA);
                System.out.println("Costo con IVA: "+IVAtotal);
        }
                
        
        
        
        
        
        
    }
}

