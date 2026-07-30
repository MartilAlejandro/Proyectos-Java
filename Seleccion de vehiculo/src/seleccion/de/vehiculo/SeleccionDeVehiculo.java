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
 *             i.   >   -> mayor
 *             ii.  <   -> menor
 *             iii. >=  -> mayor o igual
 *             iv.  <=  -> menor o igual
 *             v.   ==  -> igual (son dos signos iguales juntos)
 *             vi.  !=  -> distinto

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
        char respuestoTipo ='@';
        String respuestaCadena = "John Doe";
        
        
         System.out.println("Me dijeron que eres duenio de un vehiculo "
                +   "\"Verde\"");
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
        
            entrada.nextLine();//Limpiar el Buffer
            System.out.println("tu vehiculo es Diesel verde? (x = si, y = no");
            respuestoTipo = entrada.nextLine().charAt(0);
            /*
            System.out.printf("\nRespuesta Dada: %c",respuestoTipo);
        
            System.out.println("\nTu vehiculo es Diesel Verde? (x = si, y = no)");
            respuestoTipo = entrada.nextLine().charAt(1);
            System.out.printf("Respuesta Dada: %c",respuestoTipo);
        
            System.out.println("\nTu vehiculo es Diesel Verde? (x = si, y = no)");
            respuestoTipo = entrada.nextLine().charAt(2);
            System.out.printf("Respuesta Dada: %c",respuestoTipo);
            */
        
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
        
            System.out.println("Tu carro es energeticamente eficiente?");
            respuestaCadena = entrada.nextLine();
            
              /*
         System.out.printf("Respuesta Ingresada: %s",respuestaCadena);
        
        System.out.println("\nSeguro que es asi?");
        respuestaCadena = entrada.nextLine().toUpperCase();
        System.out.printf("Respuesta Ingresada: %s",respuestaCadena);
        
        System.out.println("\n100% Seguro?");
        respuestaCadena = entrada.next().toLowerCase();
        System.out.printf("Respuesta Ingresada: %s",respuestaCadena);
        */
               if(respuestaCadena.equals("si") ){
            System.out.println("Excelente");
            System.out.println("Amigable con el ambiente");
        }
        else{
            System.out.println("Uyy....busca que se puede hacer");
        }
        
        
          
        
    }//fin de main
    
}//fin de class
