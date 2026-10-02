/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio17;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Tema3Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        double x,raiz;
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("Introduce un numero:");
            x=entrada.nextInt();
            if (x>0){
                raiz= Math.sqrt(x);
                System.out.println("La raiz de "+x+" es "+raiz);
            }else{ 
                System.out.println("El numero introducido no es valido"); 
            }  
    }while (x<1);   
}
}
