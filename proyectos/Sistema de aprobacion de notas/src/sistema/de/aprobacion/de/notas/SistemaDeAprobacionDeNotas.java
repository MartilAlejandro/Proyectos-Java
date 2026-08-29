/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistema.de.aprobacion.de.notas;

import java.util.Scanner;

/**
 *
 * @author marti
 */
public class SistemaDeAprobacionDeNotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    //entrada de datos 
    Scanner teclado = new Scanner(System.in);


    //variables declaradas
    String nombreestudiante = "estudiante";
    double examen1 = 0;
    double examen2 = 0;
    double promedio =0;

    //titulo de el programa
    System.out.print("\nSISTEMA DE APROACION DE NOTAS \n");
    
    //ingreso del nombre del estudiante
    System.out.print("\nEscriba el nombre del estudiante: ");
    nombreestudiante = teclado.nextLine();


    //salto de linea
    System.out.println();
    
    //ingreso de la nota primer examen
    System.out.print("Nota del primer examen: ");
    examen1 = teclado.nextDouble();

    //salto de linea
    System.out.println();
    
    // ingreso de la nota segundo examen
    System.out.print("Nota del segundo examen: ");
    examen2 = teclado.nextDouble();

    //salto de linea
    System.out.println();

    //calculo del promedio
    promedio = (examen1 + examen2)/2.0;

    //salida para que el sistema muestre el nombre del estudiante mas el promedio obtenido
    System.out.printf("Promedio de %s es: %.0f%%",nombreestudiante,promedio);

    //condicion para ver si el estudiante esta aprobado o reprobado
    if (promedio>=65){

      System.out.println();

      System.out.println("Aprobado" );

    }//fin if
    else{

      System.out.println();

      System.out.println("Reprobado" );

    }//fin else

    }//fin main

}//fin class
