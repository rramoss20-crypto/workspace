/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ejercicio14;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema4Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            boolean comprobacion;
        int num;
        do{//Hago un bucle mientras la respuesta no sea válida
            num=pedirNum();
            comprobacion=comprobar(num);
        }while(comprobacion==false);
        imprimir(num);//Llamo al método que imprime los números en pantalla.
    }
    public static int pedirNum(){//Método para pedir un número
        int dato;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduzca un numero");
        dato=entrada.nextInt();
        return dato;    
    }
    public static boolean comprobar(int num){//Método para comprobar si el número es válido
        boolean comprobacion=false;       
        if (num <=0){//Si el número es menor o igual que cero , devolvemos la comprobación en false , ya que no es válido
            comprobacion= false; 
            System.out.println("El numero no es valido");
        }else{
            comprobacion=true;
        }
        return comprobacion;
    }
    public static void imprimir(int num){//Método que va imprimiendo los múltiplos de 3
        int n=0;
        for (int i = 0; i <= num ; i+=3){//Hago un bucle avanzando de 3 en 3
        System.out.println(i);
        n++;
        }System.out.println("Hay "+ --n +" multiplos de 3");//Imprimo el numero de multiplos de 3 que hay
    }
}
    

