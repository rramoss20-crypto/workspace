/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio26;

/**
 *
 * @author alumno
 */
public class Tema3Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int suma=0;//introduzco la variable de suma
        for (int i = 111; i <= 222 ; i+=2){//Hago un bucle que recorre todos los numeros impares del 111 al 222
            suma=i+suma;//Añado el numero a la suma total
        }
        System.out.println(suma);//Imprimo la suma
    }
    
}
