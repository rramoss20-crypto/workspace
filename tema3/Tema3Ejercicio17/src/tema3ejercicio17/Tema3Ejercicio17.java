/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio17;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Tema3Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        double x,raiz;//Introduzco las variables
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("Introduce un numero:");//Pido un número
            x=entrada.nextInt();
            if (x>0){//Si el número es positivo hacemos raíz cuadrada
                raiz= Math.sqrt(x);
                System.out.println("La raiz de "+x+" es "+raiz);
            }else{ //Si el número es negativo , se lo indicamos al usuario y le pedimos otro
                System.out.println("El numero introducido no es valido, introduzca otro:"); 
            }  
    }while (x<1);   
}
}
