/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio18;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Tema3Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contraseña=123;
        int respuesta,n = 0;//Introduzco las variables
        
        Scanner entrada = new Scanner(System.in);
        
        do{
            System.out.println("Introduce la contraseña:");
            respuesta=entrada.nextInt();// Pido la contraseña
            
            if (contraseña != respuesta){
                System.out.println("La contraseña es incorrecta");// Si es incorrecta se suma uno al numero de fallos
                n++;
            }else {
                System.out.println("La contraseña es correcta");
            }
        } while ( n<3 && contraseña!=respuesta);// El bucle se repite mientras n<3 o contraseña=respuesta
    
        if (n==3){
       
        System.out.println("Contraseña incorrecta, has llegado al numero maximo de fallos");
    }
    
}
    
}
