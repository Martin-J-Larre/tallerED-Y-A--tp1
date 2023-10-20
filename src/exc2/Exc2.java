/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exc2;

import java.util.Scanner;

/**
 *
 * @author martin
 */
public class Exc2 {

    public static void main(String[] args) {
        
        int[] conteos = new int[26]; 

        Scanner teclado = new Scanner(System.in); 
        
        int index = 26;

    

        //Leer palabra del usuario

        System.out.print("Ingrese una palabra (por favor, sólo letras): "); 

        String palabra = teclado.nextLine(); 

    

        //Convierte a mayusc. 

        palabra = palabra.toUpperCase(); 

    

        //Cuenta la frecuencia de cada letra...

        for (int i=0; i < palabra.length(); i++) {
            
            //####### 1er intento
            
           try {
               if(palabra.charAt(i) - 'A' <= index && palabra.charAt(i) - 'A' >= 0) {
                   conteos[palabra.charAt(i)-'A']++; 
               }  else {
                   throw new ArrayIndexOutOfBoundsException(palabra.charAt(i) + " No es una letra o es un espacio vacio");
               } 
           } catch(IndexOutOfBoundsException e) {
              System.out.println(e);
           }

        }

        


        //imprimir frecuencias...

        System.out.println(); 

        for (int i=0; i < conteos.length; i++) 

            if (conteos [i] != 0) 

            System.out.println((char)(i +'A') + ": " + conteos[i]);

    }
    
}
