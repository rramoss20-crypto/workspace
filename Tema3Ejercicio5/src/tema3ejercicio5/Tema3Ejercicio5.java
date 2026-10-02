/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio5;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema3Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1;
        
        System.out.println("Escribe un numero: ");//Pido un numero al usuario
        Scanner entrada = new Scanner(System.in);
        num1 = entrada.nextInt();
       
        if (num1%2 == 0){// Compruebo si es par o no e imprimo un resultado u otro
            System.out.println("El numero es par.");
        }else {
            System.out.println("El numero es impar. ");
        }
    
    }
    
}
    
    

