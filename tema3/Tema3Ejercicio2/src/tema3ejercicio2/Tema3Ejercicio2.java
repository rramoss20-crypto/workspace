/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio2;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Tema3Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1,num2,resultado;
        
        System.out.println("Escribe el primer numero: ");
        Scanner entrada = new Scanner(System.in);// Pido un numero al usuario
        num1 = entrada.nextInt();
        
        System.out.println("Escribe el segundo numero: ");//Pido otro número
        num2 = entrada.nextInt();
        
        if (num1>10){//Hago la condicional
            resultado = num1*num2;//Si el primer número es mayor de diez se multiplica
            System.out.println("La operacion es una multiplicacion y el resultado es " + resultado);
        }else {resultado = num1+num2;//Si es menor de diez se suman
        System.out.println("La operacion es una suma y el resultado es " + resultado);
        
        }
        }
    }
    

