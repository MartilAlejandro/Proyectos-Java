/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuenta.de.restaurante;

import java.util.Scanner;

/**
 * objetivos 
 * 1. conocer los diferentes tipos de ciclo repeticion
 * 2. analizar los componentes de todo ciclo de repeticion
 * 3. construir un algoritmo con un ciclo de repeticion
 *
 * @author marti
 */
public class CuentaDeRestaurante {

    /**
     * desarrollar un algoritmo que simule la cuenta de un restaurante
     * que se tiene que pagar entre un grupo de amigos (7) dividido
     * en partes iguales
     */ 
     /*
        ciclos de repeticion 
        1. While
        2. Do - While
        3. For
        4.Forach
    
     componentes de ciclos de repeticion
         1. variable de control -> valor de inicio
         2. condicion           -> limite de repeticion
         todo ciclo de repeticion se ejecuta y repite 
         siempre y cuando la condicion se mantenga VERDADERA
         3. modificador de la variable control
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        
        double promediopago = 0;
        int gastoindividual = 0;
        
        int numpersona = 1;// variable de control
        int gastoacumulado =0;
        
        //condicion -> variable de control limite
        while(numpersona<=7){
        // instrucciones a repetir 
        
           System.out.printf("persona %d). Cuanto comiste?  ", numpersona);
           gastoindividual = teclado.nextInt();
        
           gastoacumulado += gastoindividual;//suma de gastos
           System.out.printf("P: %d\tgasto ind: %d\tgasto acum: %d" ,
                   numpersona,
                   gastoindividual,
                   gastoacumulado);
           System.out.println("");
        //modificador 
        //opcion 1
        
        //numpersona += 1; //numpersona = numpersona + 1;
        
        //opcion 2
        numpersona++; // Incremento Unitario POST Incremento
        }//fin while
        
        //promediopago = gastoacumulado/7;//hardcoding
        numpersona--;
        System.out.printf("Total personas %d", numpersona);
        promediopago = gastoacumulado / numpersona;
        
        System.out.printf("\ngasto promedio x persona: %.2f", promediopago);
        
        
      }//fin main
    
}//fin class
