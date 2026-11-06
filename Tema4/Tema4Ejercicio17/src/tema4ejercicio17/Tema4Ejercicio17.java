/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ejercicio17;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Tema4Ejercicio17 {
    public static final int letraPrograma = (int) (Math.floor(Math.random() * (122 - 97 + 1))+97);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int letraUsuario;
        do{//Iniciio un bucle que contiene el juego
        letraUsuario =pedirLetra();//Llamo al metodo para que pida una letra
        boolean comprobar=comprobar(letraUsuario);//Compruebo si es la letra que ha elegido el programa
        if (comprobar){//Se avisa al usuario en caso de que acierte la letra
            System.out.println("Has acertado la letra");
        }
        }while(letraUsuario !=letraPrograma);//Una vez se adivine la letra se corta el bucle

    }
    public static int pedirLetra(){//Metodo para pedir letra y pasarlo a numero
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce una letra del abecedario: ");
        char letra=entrada.nextLine().charAt(0);
        int asciiLetra=(int) letra;
        return asciiLetra;
    }
    public static boolean comprobar(int num){//Metodo para comprobar si es la letra , si esta por delante o por detras en el abecedasrio
        boolean comprobacion=false;       
        if (num ==letraPrograma){
            comprobacion= true;                
        }else if (num>letraPrograma){
            System.out.println("La letra esta antes en el abecedario");
        }else {
            System.out.println("La letra esta despues en el abecedario");
        }
        
        return comprobacion;
    }

}
            

