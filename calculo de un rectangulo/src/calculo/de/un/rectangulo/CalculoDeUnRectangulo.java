/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculo.de.un.rectangulo;

import java.util.Scanner;

/**
 *
 * @author marti
 */
public class CalculoDeUnRectangulo {

    /**
     * 1. Cálculo con dos variables Escribir un programa que solicite al usuario la base y la altura de un
          rectángulo. Utilice estas dos variables para calcular el área del rectángulo (Base X Altura) y el
          perímetro (suma de todos sus lados). Imprimir ambos resultados en pantalla
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //crear el objeto Scanner para leer los datos del usuario
        Scanner teclado = new Scanner(System.in);
        
        //variables declaradas
        double base =0;
        double altura =0;
        double perimetro =0;
        double area =0;
        
        //solicitud del la base de un rectangulo
        System.out.println("Ingrese la base del rectangulo:");
        base = teclado.nextDouble();
        
        //solicitud de la altura de un rectangulo
        System.out.println("Ingrese la altura del rectangulo:");
        altura =teclado.nextDouble();
        
        // calculo para el area de un rectangulo
        area =base*altura;
        
        //salto de 2 lineas
        System.out.println("");
        
        //resultado del area encontrada
        System.out.println("el resultado del area es:" + area);
        
        //salto de 2 lineas
        System.out.println("");
        
        //formula para el perimetro de un rectangulo
        perimetro =base*2+altura*2;
        
        //resultado del perimetro de un rectangulo
        System.out.println("el perimetro del rectangulo es:" + perimetro);
                
        }//fin main
    
}//fin class

