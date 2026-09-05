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

        Datos Alejandro = new Datos("Alejandro", 33, 1.64, 'M', 210);
        Datos David = new Datos("David", 19, 1.60, 'M', 140);
        Datos Suazo = new Datos("Suazo", 25, 1.73, 'M', 170);

        Alejandro.ImpresionDatos();
        David.ImpresionDatos();
        Suazo.ImpresionDatos();

        String nombres = "fg";
        int edades = 0;
        double estaturas = 0;
        double pesos = 0;
        char generos = 'c';

        for (int i = 0; i < 5; i++) {

            nombres = Scan.nextLine();
            Estudiantes.setnombres(nombres, i);

            edades = Scan.nextInt();
            Estudiantes.setedades(edades, i);

            estaturas = Scan.nextDouble();
            Estudiantes.setestaturas(estaturas, i
            );

            pesos = Scan.nextDouble();
            Estudiantes.setpesos(pesos, i
            );
            
            generos = Scan.nextLine().charAt(0);
            Estudiantes.setgeneros(generos, i
            );

        }

    }//fin main

}//fin class
