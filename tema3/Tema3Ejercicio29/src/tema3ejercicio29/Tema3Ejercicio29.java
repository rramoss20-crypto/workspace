/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio29;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Tema3Ejercicio29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int aleatorio =(int) Math.floor(Math.random()*100);//Genero el numero
        Scanner entrada = new Scanner(System.in);
        int num=-1;//Introduzco la variable
        
           do{
               try{
                    System.out.println("Escribe un numero: ");// creo un bucle que te va indicando si el aleatorio es mayor o menor
                    num=entrada.nextInt(); 
                    if (num<aleatorio){
                    System.out.println("El numero es mayor");
                    }else if (num>aleatorio){
                    System.out.println("El numero es menor");
                    }
                    }catch(InputMismatchException e) {
                    System.out.println("Has introducido una letra");
                    }   
            }while (num!=aleatorio);//el bucle termina cuando el numero y el aleatorio sean iguales
           System.out.println("Has acertado");
           
    }
    
}
