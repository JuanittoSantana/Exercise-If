package condiciones_ciclos;

import java.util.Scanner;

public class if_anidado_1 {

    public static void main(String[] args) {
       
        int numero;
        // Instancia de la clase Scanner
        // Lo que esta entre parentesis se llama metodos
        // Activa de forma binaria el teclado para asignar valores con el uso del teclado
        // Se llama new porque manda a llamar la clase Scanner
        // Sinonimo de parentesis son Parametros
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Teclea un numero entre 1 y 3");
        numero = teclado.nextInt();
        
        if (numero == 1) {
            System.out.println("UNO");
        } if (numero == 2) {
            System.out.println("DOS");
        } if (numero == 3)
            System.out.println("TRES");
       
    }
}

