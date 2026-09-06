/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datospersona;

import java.util.Scanner;

/**
 *
 * @author marti
 */
public class DatosPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner Scan = new Scanner(System.in);
        Datos Estudiantes = new Datos();

        String nombres = "fg";
        int edades = 0;
        double estaturas = 0;
        double pesos = 0;
        char generos = 'c';

        for (int i = 0; i < 2; i++) {
            System.out.println("ingrese el nombre: ");
            nombres = Scan.nextLine();
            Estudiantes.Setnombres(nombres, i);
            
            System.out.println("----------------------------");

            System.out.println("ingrese la edad: ");
            edades = Scan.nextInt();
            Estudiantes.setedades(edades, i);
            
            System.out.println("----------------------------");

            System.out.println("ingrese la estatura: ");
            estaturas = Scan.nextDouble();
            Estudiantes.setestaturas(estaturas, i
            );
            
            System.out.println("----------------------------");

            System.out.println("ingrese el peso: ");
            pesos = Scan.nextDouble();
            Estudiantes.setpesos(pesos, i);
            
            System.out.println("----------------------------");

            Scan.nextLine();

            System.out.println("ingrese el genero: ");
            generos = Scan.nextLine().charAt(0);
            Estudiantes.setgeneros(generos, i);
            
            System.out.println("----------------------------");

        }

        Estudiantes.ImpresionDatos();

    }//fin main

}//fin class
