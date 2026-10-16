/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio24;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Tema3Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1;//Introduzco las variables
        Scanner entrada = new Scanner(System.in);
        int n=0;
        do{//Inicio un bucle
            System.out.println("Introduce un numero");//Pido el numero
            n1=entrada.nextInt();
            if (n1<0){
                System.out.println("Error , el numero no es valido");
            }
            
        }while (n1<0);//El bucle se repite mientras n1<0
        for (int i = 0; i <= n1 ; i+=3){//Hago un bucle avanzando de 3 en 3
        System.out.println(i);
        n++;
    }System.out.println("Hay "+ --n +" multiplos de 3");//Imprimo el numero de multiplos de 3 que hay
    
    }
}
