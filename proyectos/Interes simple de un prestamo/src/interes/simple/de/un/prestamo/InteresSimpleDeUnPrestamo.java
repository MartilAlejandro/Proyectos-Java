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
        
        //ingreso de datos
        Scanner teclado = new Scanner(System.in);
        
        //variables para los calculos
        int capital =0;
        int Tasa =0;
        int tiempo =0;
        int interes =0;
        
        //ingreso del capital inicial
        System.out.println("Ingrese el capital inicial:");
        capital =teclado.nextInt();
        
        //ingreso de la tasa de interes
        System.out.println("Ingrese la tasa de interes:");
        Tasa =teclado.nextInt();
        
        //ingreso de los años a pagar
        System.out.println("Tiempo a pagar en anos:");
        tiempo =teclado.nextInt();
        
        //salto de linea
        System.out.println("");
        
        //formula del interes simple
        interes = capital*Tasa*tiempo/100;
        
        //resultado del interes generado
        System.out.println("El interes generado es:" + interes);
        
        
    }//fin main
    
}//fin class
