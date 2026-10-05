/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio13;

/**
 *
 * @author alumno
 */
public class Tema3Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int x;
        x=11;// Introduzco la variable "x"
        
        while (x<133){//Mientras x sea menor que 133 se le va sumando uno y si es par se imprime
            x++;
            if (x%2 == 0)
                System.out.println(x);
        }
        
    }
    
}
