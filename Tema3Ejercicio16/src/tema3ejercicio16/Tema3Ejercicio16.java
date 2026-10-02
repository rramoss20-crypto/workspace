/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio16;

/**
 *
 * @author alumno
 */
public class Tema3Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x;
        int n;
        
        n=0;
        x=20;
        while (x<100){
            x++;
            if (x%2 != 0) {
                System.out.println(x);
                n++;
            }
        }System.out.println("La cantidad de numeros impares impresos han sido:"+n);
    }
    
}
