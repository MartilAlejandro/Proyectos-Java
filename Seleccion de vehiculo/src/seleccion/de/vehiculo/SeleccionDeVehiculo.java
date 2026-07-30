/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package seleccion.de.vehiculo;

import java.util.Scanner;

/**
 *
 * @author marti
 * objetivos
 * estructura de seleccion
 * 1. estructura o formato
 *     a. palabras claves
 *     b. bloques
 *     c. condiciones
 * 2. tipos de seleccion
 *     a.simple
 *     b.double
 * 3.condiciones 
 *     a.tipo de condiciones 
 *     b.tipos de comparacion
 */
public class SeleccionDeVehiculo {

    /**
     * @param args the command line arguments
     * desarrollar un algoritmo que me permita escoger los siguientes elementos
     * de un vehiculo:
     * a. Si el tamaño del tanque de coombustible agarra mas de 30 litros(dato numerico)
     * b.el tipo de combustible si es o no Diesel (dato tipo caracter)
     * c.si energeticamente eficiente y ecologico (dato cadena)
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int cantidadLitros =0;
        char respuestoTipo ='x';
        
        
        
        System.out.println("Me dijeron que eres dueño de un vehiculo\"verde\"");
            System.out.println("tienes que echarle biodiesel");
            System.out.printf("cuantos litros de agarra?");
            cantidadLitros = entrada.nextInt();
        
        if(cantidadLitros >=30){
            //condicion VERDADERO
            System.out.println("es un vehiculo con");
            System.out.println("grandes capacidades");
            System.out.println("seguro la factura alta!!!");
            }
            System.out.println("");
        
            entrada.next();
            System.out.println("tu vehiculo es Diesel verde? (x = si, y = no");
            respuestoTipo = entrada.nextLine().charAt(0);
        
        if(respuestoTipo =='x'){
            //condicion verdadera
            System.out.println("si es diesel verde !!");
            System.out.println("diesel combinado con ethanol");
            System.out.println("se saca del maiz");
         }
        else
        {
            //condicion falsa
            System.out.println("uyyy... eres anticlimatico");
            System.out.println("calentamiento global");
                }
            System.out.println("");
        
        
          
        
    }//fin de main
    
}//fin de class
