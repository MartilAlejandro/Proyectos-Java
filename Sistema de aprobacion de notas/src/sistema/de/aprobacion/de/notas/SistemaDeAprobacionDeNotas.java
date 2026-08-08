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
    
       Scanner teclado = new Scanner(System.in);


    String nombreestudiante = "estudiante";
    double examen1 = 0;
    double examen2 = 0;
    double promedio =0;

    System.out.print("escriba el nombre del estudiante: ");
    nombreestudiante = teclado.nextLine();


    System.out.println();

    System.out.print("Nota del primer examen: ");
    examen1 = teclado.nextDouble();

    System.out.println();

    System.out.print("Nota del segundo examen: ");
    examen2 = teclado.nextDouble();

    System.out.println();

    promedio = (examen1 + examen2)/2.0;

    System.out.printf("Promedio de %s es: %.0f%%",nombreestudiante,promedio);

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
