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
        int respuesta,n;
        
        Scanner entrada = new Scanner(System.in);
        
        do{
            System.out.println("Introduce la contraseña:");
            respuesta=entrada.nextInt();
            
            if (contraseña != respuesta){
                System.out.println("La contraseña es incorrecta");
                n++;
            }else {
                System.out.println("La contraseña es correcta");
            }
        }while(contraseña==respuesta |& n==3);
        
    }
    
}
