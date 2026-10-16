/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio22;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Tema3Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double n1,n2,resultado = 0;//Introduzco las variables
        Scanner entrada = new Scanner(System.in);
        
        
        try{
            System.out.println("Introduce el primer numero");//Pido los números dentro del try
            n1=entrada.nextDouble();
            System.out.println("Introduce el segundo numero");
            n2=entrada.nextDouble();
            resultado=n1+n2;//Hago la suma
        }
        catch(InputMismatchException e) {//Capturo el error del usuario si introduce una letra
            System.out.println("Has introducido una letra");//Le aviso al usuario del error
            
        }
        System.out.println(resultado);
    }
    
}
