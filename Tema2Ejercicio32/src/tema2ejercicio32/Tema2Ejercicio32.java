/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema2ejercicio32;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Tema2Ejercicio32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dinero;
        System.out.println("Introduce la cantidad de dinero:");
        dinero = entrada.nextInt();//Pido la cantidad de dinero
        
        int billeteCincuenta;// introduzco las variables según cada billete o moneda y voy dividiendo cada valor entre el resto
        billeteCincuenta = dinero/50;
        int resto = dinero%50;
        int billeteveinte = resto/20;
        resto = resto%20;
        int billetediez = resto/10;
        resto = resto%10;
        int billetecinco = resto/5;
        resto = resto%5;
        int monedados = resto/2;
        resto = resto%2;
        int monedauno = resto/1;
        
        System.out.println("130 euros hacen un total de: "+billeteCincuenta+ " billetes de 50 euros , "+ billeteveinte + " billetes de 20€, "+ billetediez+" billetes de\n" +
"10 euros, "+billetecinco + " billetes de 5 € ,"+ monedados + " monedas de 2 € y "+ monedauno +" monedas de 1 €");//Expreso el resultado
    }
    
}
