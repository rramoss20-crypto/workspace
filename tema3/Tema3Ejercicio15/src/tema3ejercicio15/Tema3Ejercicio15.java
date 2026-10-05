/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio15;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Tema3Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int factor;
        int factorvariable;
        factorvariable=0;//Introduzco variables
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe un número");//Pido un número al usuario
        factor=entrada.nextInt();
        
        do{// Multiplico el numero por todos los números del 0 al 10
            System.out.println(factor+"*"+factorvariable+"="+(factor*factorvariable));
            factorvariable++;
        }while (factorvariable<11);
        
    }
    
}
