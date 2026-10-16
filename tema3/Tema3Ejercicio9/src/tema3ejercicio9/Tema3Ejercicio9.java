/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio9;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Tema3Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Por favor, introduzca el primer numero: ");
        int n1 = entrada.nextInt();
        
        System.out.print("Ahora, introduzca un segundo numero: ");
        int n2 = entrada.nextInt();
        
        System.out.print("Introduzca el tercer numero: ");
        int n3 = entrada.nextInt();
        
        System.out.print("Por último, introduzca un cuarto numero: ");
        int n4 = entrada.nextInt();
        
        // Variable temporal para hacer los intercambios
        int aux;
        
        // Algoritmo de ordenación simple (burbuja manual)
        if (n1 > n2) { aux = n1; n1 = n2; n2 = aux; }
        if (n2 > n3) { aux = n2; n2 = n3; n3 = aux; }
        if (n3 > n4) { aux = n3; n3 = n4; n4 = aux; }
        
        // Volvemos a comprobar desde el principio por si los números pequeños estaban al final
        if (n1 > n2) { aux = n1; n1 = n2; n2 = aux; }
        if (n2 > n3) { aux = n2; n2 = n3; n3 = aux; }
        if (n1 > n2) { aux = n1; n1 = n2; n2 = aux; }

        // Mostrar el resultado con el formato exacto solicitado
        System.out.println("El orden de los números introducidos es el " + n1 + " - " + n2 + " - " + n3 + " - " + n4);
        
        
    }
    }
    

