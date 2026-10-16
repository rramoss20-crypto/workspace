/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema03ejercicio21;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Tema03Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1,n2,resultado;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce el dividendo:");
        n1=entrada.nextInt();
        System.out.println("Introduce el divisor:");
        n2=entrada.nextInt();
        
        try{
        resultado=n1/n2;
        }
        catch(ArithmeticException e) {
            System.out.println("ERROR "+e.getMessage());
            resultado=0;
        }
        System.out.println("El resultado es "+resultado);
    } 
}
