/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio14;

/**
 *
 * @author alumno
 */
public class Tema3Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x;
        x=0;//Introduzco la variable "x"
        
        while (x<201){//Mientras x<201 se le aumentará en 1 el valor 
            x++;
            if (x%2 == 0)//Se imprimirá si es par , asi conseguiremos 100 números pares
                System.out.println(x);
        }
    }
    
}
