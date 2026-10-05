/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio6;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Tema3Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1;
        
        System.out.println("Escribe tu nota: ");//Pido un numero al usuario
        Scanner entrada = new Scanner(System.in);
        num1 = entrada.nextInt();
        
        if (num1 <0 || num1>10){
            System.out.println("La nota que ha introducido no es válida");
        }else if (num1<5){
            System.out.println("Ha suspendido");
        }else if (num1<7){
            System.out.println("Ha sacado un bien");
        }else if (num1<9){
            System.out.println("Ha sacado un notable");
        } else {
            System.out.println("Has sacado un sobresaliente");
        }
    }
    
}
