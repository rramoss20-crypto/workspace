/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio1;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Tema3ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num ;// Introduzco la variable
        
        System.out.println("Introduzca un numero");
        Scanner entrada = new Scanner(System.in);// Pido un numero al usuario
        num = entrada.nextInt();
        
        if (num > 0) {//Hago la condicional
            System.out.println("Tu numero es positivo");// Si es mayor que 0 es positivo 
        }else{ System.out.println("Tu munero es negativo");//Si es menor que 0 es negativo
        }
    
         
        
            
        }
        
    }
    

