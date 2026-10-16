/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio27;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Tema3Ejercicio27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1,n2,respuesta,operacion;//introduzco variables
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce el primer numero");
        n1=entrada.nextInt();
        System.out.println("Introduce el segundo numero");
        n2=entrada.nextInt();//pido los numeros al usuario
        
        do{
            System.out.println("1.- Sumar los números.\n" +" 2.- Restar los números.\n" +" 3.- Multiplicar los números.\n" +" 4.- Dividir los números.\n" +" 5.- Salir del programa.");
            respuesta=entrada.nextInt();//Mostramos el menu
            if(respuesta==1){
                operacion=n1+n2;
                System.out.println(operacion);
            }if(respuesta==2){
                operacion=n1-n2;
                System.out.println(operacion);
            }if(respuesta==3){
                operacion=n1*n2;
                System.out.println(operacion);
            }if(respuesta==4){//Programamos un camino para cada respuesta
                try{
            operacion=n1/n2;
            }
            catch(ArithmeticException e) {
            System.out.println("ERROR "+e.getMessage());//cazamos un posible error
            operacion=0;
            }
            System.out.println(operacion);
            }
        }while (respuesta!=5);//el bucle del menu termina cuando la respuesta sea 5
               
    }
    
}
