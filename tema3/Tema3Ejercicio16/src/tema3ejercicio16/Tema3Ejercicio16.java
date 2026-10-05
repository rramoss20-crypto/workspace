/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio16;

/**
 *
 * @author alumno
 */
public class Tema3Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x;
        int n;//Introduzco variables
        
        n=0;
        x=20;// Les asigno un valor
        while (x<101){// El bucle se iniciará cuando x sea menor que 101
            x++;//Sumo 1 al valor de la x
            if (x%2 != 0) {//Si es impar lo imprimo y sumo uno al total de impares
                System.out.println(x);
                n++;
            }
        }System.out.println("La cantidad de numeros impares impresos han sido:"+n);
    }
    
}
