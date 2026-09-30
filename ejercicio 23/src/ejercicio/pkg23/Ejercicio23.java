/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg23;
import java.util.Scanner;
/**
 *
 * @author Roberto Ramos Sánchez
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int precio , cantidad,resultado;// Introduzco las variables
        
        System.out.println("Escribe el precio del producto:");//Pido el precio
        Scanner entrada = new Scanner(System.in);
        precio = entrada.nextInt();
        
        System.out.println("¿Cuántos quieres?");// Pregunto la cantidad
        cantidad = entrada.nextInt();
        resultado = cantidad * precio;//Calculo el precio final
        
        System.out.println("El precio total de su compra es de "+ resultado +"€");
    }
    
}
