/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ejercicio20;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema4Ejercicio20 {
    public static String solucion1="Madrid";//Inicio las respuestas como constantes
    public static String solucion2="Colón";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nota=0;
        String respuesta1=preguntaCapital();//Llamo al método con la primera pregunta
        boolean comprobar1=comprobar1(respuesta1);//Compruebo la respuesta
        if (comprobar1){//Si es correcta sumo 5 puntos a la nota
            nota=nota + 5;            
        }
        String respuesta2=preguntaAmerica();//Llamo al método para la segunda pregunta
        boolean comprobar2=comprobar2(respuesta2);//Compruebo la respuesta
        if (comprobar2){//Si es correcta le sumo 5 puntos
            nota=nota + 5;          
        }
        System.out.println("Tu nota es un "+nota);//Le digo su nota al usuario
    }
    public static String preguntaCapital(){//Método para la primera pregunta
        Scanner entrada=new Scanner(System.in);
        System.out.println("¿Cual es la capital de España? ");
        String respuesta = entrada.nextLine();
        
        return respuesta;
    }
    public static boolean comprobar1(String respuesta){//Compruebo su respuesta y si es correcta devuelvo un true
        boolean comprobacion=false;       
        if (respuesta.equals (solucion1)){
            comprobacion= true;
            System.out.println("Respuesta correcta");
        }else{
            System.out.println("Respuesta incorrecta");
        }
        return comprobacion;
    }
    public static String preguntaAmerica(){//Método para la segunda pregunta
        Scanner entrada=new Scanner(System.in);
        System.out.println("¿Quien descubrio America? ");
        String respuesta = entrada.nextLine();
        
        return respuesta;
    }
    public static boolean comprobar2(String respuesta){//Compruebo su respuesta y si es correcta devuelvo un true
        boolean comprobacion=false;       
        if (respuesta.equals (solucion2)){
            comprobacion= true; 
            System.out.println("Respuesta correcta");
        }else{
            System.out.println("Respuesta incorrecta");
        }
        return comprobacion;
    }
    
}
