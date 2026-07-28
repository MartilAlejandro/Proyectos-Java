/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversiones;

import java.util.Scanner;


/**
 *
 * @author marti
 */
public class Conversiones {

    /**
     * @param args the command line arguments
     *objetivos 
     * 1. orden secuencial de las instrucciones
     * 2. capturar datos desde teclado
     * 3. operaciones aritmeticas
     * 
     * desarrollar un algoritmo que me permita convertir los siguientes
     * elementos:
     * 1. pulgadas a centimetros
     * 2. kilometros a millas
     * 3. grados farenheit a grados celsius 
     */
    
    
 public static void main(String[] args) {
 // TODO code application logic here
 Scanner teclado = new Scanner(System.in);
 // Declarar variables
 int pulgadas = 0;
 double resultadocm = 0;
        
 double kilometros = 0;
 double millas = 0;
        
        
 pulgadas =10; //Los datos van de derecha a izquierda-> =
 resultadocm = pulgadas * 2.54;
 System.out.printf("\n %d pulgadas es igual a %.2f cm",pulgadas,resultadocm);
        
 pulgadas = 35;
 resultadocm = pulgadas * 2.54;
 System.out.printf("\n%.2f cm es igual a %d pulgadas",resultadocm,pulgadas);
     
     
 System.out.println("");
 System.out.println("cuanto  kilometros hay de TGU - SPS?");
 kilometros = teclado.nextDouble();
 millas = kilometros/1.6;
 System.out.printf("\n %.2f km es igual a %.2f millas",kilometros,millas);
     
 double farenheit = 0;
 double celsius = 0;
     
 System.out.printf("\n ingrese temperatura en farenheit");
 farenheit = teclado.nextDouble();
 celsius = (farenheit-32) * 5/9;
        
 System.out.printf("resultado temp c: %.3f",celsius);
        
}// fin de mein
    
}// fin de class conversiones
