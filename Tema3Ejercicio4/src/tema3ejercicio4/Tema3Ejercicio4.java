/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio4;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Tema3Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1,num2,num3;
        
        System.out.println("Escribe el primer numero");
        Scanner entrada = new Scanner(System.in);// Pido los numeros al usuario
        num1 = entrada.nextInt();
        System.out.println("Escribe el segundo numero");
        num2 = entrada.nextInt();
        System.out.println("Escribe el tercer numero");
        num3 = entrada.nextInt();
        
        if (num1<num2 && num1<num3){
            System.out.println("El numero menor es el "+ num1);// Si el num1 < num2 y a su vez num1<num3 , el num1 es el mayor
        }else if (num2<num3 && num2<num1){
            System.out.println("El numero menor es el "+ num2);// Si el num2 < num3 y a su vez num2<num1 , el num2 es el mayor
        }else 
            System.out.println("El numero menor es el "+ num3);// Si ninguna de las opciones es correcta , num3 es el mayor
    }
    
}
    
    

