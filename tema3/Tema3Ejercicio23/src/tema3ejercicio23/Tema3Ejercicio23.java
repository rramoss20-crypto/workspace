/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio23;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Tema3Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1;
        Scanner entrada = new Scanner(System.in);
        do{
            System.out.println("Introduce un numero");
            n1=entrada.nextInt();
            if (n1<1){
                System.out.println("Error , el numero no es valido");
            }
            
        }while (n1<1);
    for (int i = 1; i <= n1 ; i++){
        System.out.println(i);
    }
    }
    
}
