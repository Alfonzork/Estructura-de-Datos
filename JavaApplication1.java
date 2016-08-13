/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.*;
/**
 *
 * @author CETECOM
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner s=new Scanner(System.in);
        
        int [] arreglo = new int[50] ;
        
        int d = 5;
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i]=i+1;
        }  
        
        for (int i = 0; i < arreglo.length; i++) {
            if(arreglo[i]%6 == 0){                    
            System.out.println("El valor de la casilla " + i+ " es: " +arreglo[i]);
            }
        }
        
        
        
        /**int [] arreglo = {10,20,30};
        
        int d = 0;
        d = arreglo[0];
        arreglo[0] = arreglo[2];
        arreglo[2] = d;
        
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("El valor de la casilla " + i+ " es: " +arreglo[i]);
        }*/
        
        /**
         * String [] arreglo = new String[5];
        
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese un numero para la celda: " + i+ " : ");
            arreglo[i] = s.nextLine();
        }
        System.out.println("Ingrese cantidad a mostrar");
        int mostrar= s.nextInt();

        for (int i = 0; i < mostrar; i++) {
            System.out.println("El valor de la casilla " + i+ " es: " +arreglo[i]);
        }*/
    }
    
}
