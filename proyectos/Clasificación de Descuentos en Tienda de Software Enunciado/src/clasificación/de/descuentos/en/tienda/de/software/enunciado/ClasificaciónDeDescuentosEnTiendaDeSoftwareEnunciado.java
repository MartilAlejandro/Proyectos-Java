/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasificación.de.descuentos.en.tienda.de.software.enunciado;

import java.util.Scanner;

/**
 *
 * @author marti
 */
public class ClasificaciónDeDescuentosEnTiendaDeSoftwareEnunciado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    // Inicialización del lector de datos por consola
    Scanner teclado = new Scanner(System.in);


    // Declaración de variables
    int edad = 0;
    char membresia = '@';
    double precioa = 0;
    double descuento =0;

    // Impresión del título del programa en la consola
    System.out.println("Clasificacion de Descuentos en Tienda de Software Enunciado");

    //salto de linea
    System.out.println();
    System.out.println();

    // Limpieza del búfer
    System.out.print("Escriba la edad del cliente: ");
    edad = teclado.nextInt();

    //salto de linea
    System.out.println();
    teclado.nextLine();

    // Lectura del estado de la membresía
    System.out.print("El cliente cuenta con la membresia premium(S/N): ");
    membresia = teclado.nextLine().toUpperCase().charAt(0);

    //salto de linea
    System.out.println();

    // Lectura del precio original del artículo
    System.out.print("Escriba el precio del Articulo: ");
    precioa = teclado.nextDouble();


    // Evaluación de las condiciones para aplicar los descuentos correspondientes
  if(edad >= 18){

  if(edad >65 || membresia =='S'){

  descuento = precioa * 0.20;
  }

  else{

    descuento = precioa * 0.10;
 
  }

  }
  else{

  if(membresia=='S' && edad > 12){
     
      descuento = precioa * 0.15;

    }

  else{

        descuento = 0.0;
      }
   
   }

  // Despliegue de los resultados finales
   System.out.println("\n Informacion de la compra es");
   System.out.println("\n ---------------------------");
   System.out.printf("\n El descuento aplicado es: %.2f lps\n", descuento);
   System.out.printf("\n Precio de venta original es: %.2f lps\n",precioa);
   System.out.printf("\n El nuevo total a pagar es : %.2f lps\n", precioa-descuento);
   System.out.println("\n !Gracias por su compra!...");
   

}//fin main

}//fin class

    

