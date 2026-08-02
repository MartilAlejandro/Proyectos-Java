/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculo.de.un.circulo;

import java.util.Scanner;






/**
 * 2. Uso de la librería Math Desarrolle un programa que pida al usuario el radio de un círculo.
      Utilizando la constante Math.PI y la función Math.pow() de la librería matemática de Java, calcule
      el área y circunferencia de dicho círculo y muestre el resultado al usuario.
 *
 * @author marti
 */
public class CalculoDeUnCirculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     // entrada de dato por el usuario   
     Scanner teclado = new Scanner (System.in); 
     
     //declaracion de variable
       double radio =0;
       double area =0;
       double circunferencia =0;
       
       //ingreso de el radio de el circulo
        System.out.println("Ingrese el radio del circulo:");
        radio = teclado.nextDouble();
        
        //calculo del area del circulo
        area = Math.PI * Math.pow(radio,2);
        
        // salto de espacio
        System.out.println("");
        
        //resultado final del area de un circulo
        System.out.println("El area del circulo es:"+ area);
        
        //salto de espacio
        System.out.println("");
        
        //calculo de la circunferencia de un circulo
        circunferencia = 2*Math.PI*radio;
        
        //resultado final de la circunferencia de un circulo
        System.out.println("La circunferencia del circulo es:" + circunferencia);
        
        
    }//fin main
    
}//fin class
