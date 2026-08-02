/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interes.simple.de.un.prestamo;

import java.util.Scanner;

/**
 *
 * @author marti
 */
public class InteresSimpleDeUnPrestamo {

    /**
     * 3. Interés simple Escriba un programa que calcule el interés simple de un préstamo. El sistema
          debe solicitar el capital inicial, la tasa de interés anual (en formato de número entero) y el tiempo
          en años. Aplique la fórmula (Capital * Tasa * Tiempo) / 100 y muestre el interés generado.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        
        int capital =0;
        int Tasa =0;
        int tiempo =0;
        int interes =0;
        
        System.out.println("Ingrese el capital inicial:");
        capital =teclado.nextInt();
        
        System.out.println("Ingrese la tasa de interes:");
        Tasa =teclado.nextInt();
        
        System.out.println("Tiempo a pagar en anos:");
        tiempo =teclado.nextInt();
        
        System.out.println("");
        
        interes = capital*Tasa*tiempo/100;
        
        System.out.println("El interes generado es:" + interes);
        
        
    }//fin main
    
}//fin class
