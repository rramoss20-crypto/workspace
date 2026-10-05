/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio12;

/**
 *
 * @author alumno
 */
public class Tema3Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x;
        x = 11;//Introduzco la variable "x"
        do {
            x++;//Le sumo 1 a la x y si es par lo imprimo
            if (0 == x % 2){
                System.out.println(x);
            }
            
        }while(x<133);// El bucle acaba cuando x = 133
            
        
    }
    
}
