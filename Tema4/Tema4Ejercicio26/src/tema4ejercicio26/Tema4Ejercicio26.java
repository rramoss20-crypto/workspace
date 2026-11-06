/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ejercicio26;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Tema4Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int num;
        num=pedirNum();//Llamo al método para pedir un número
        boolean primo;//Creo la constante de tipo boolean 
        primo=esPrimo(num);//Le asigo true o false en cuestión de lo que me devuelva el método
        if (primo){//Si primo es true el número introducido es primo .
            System.out.println("El numero "+num+" es primo.");
        }else{
            System.out.println("El numero "+num+" no es primo");
        }
    }
    public static boolean esPrimo (int num){//Método para comprobar si es primo
        boolean primo=true;
        int i=2;
        while(i<num&&primo){//Hago un bucle con for que comprueba todos los restos desde 2 hasta el numero anterior al del usuario
            if(num%i==0){
                primo=false;
            }else{
                i++;
            }
        }
        return primo;
    }
    public static int pedirNum(){//Método para pedir número
        int dato;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduzca un numero");
        dato=entrada.nextInt();
        return dato;    
    }
}
