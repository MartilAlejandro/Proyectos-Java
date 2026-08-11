/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ciclo.repeticion.pkgfor;

import java.util.Scanner;

/**
 *objetivos 
 * 
 * 1.Implementar ciclos de repeticion FOR
 * 2. Uso de CONSTANTES
 * 
 * @author marti
 */
public class CicloRepeticionFor {

    /**
     * se quiere contabilizar la cantidad
     * de minutas que se entregan a los niños 
     * y niñas en una fiesta. con ellos sacar
     * el porcentaje de cuantos fueron niños 
     * y niñas
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner (System.in);
     
     /*
       1.Variable de control -> valor inicial
       2.condicion ->Limite
       3.modificador ->Incremento / Decremento
     */
     
     
     for (int i = 0 ; i<10 ; i++){
         System.out.printf("valor: %d\n",i);
     }//fin del ciclo for
     
        System.out.println("");
        System.out.println("2do ciclo for");
        
       for (int i = 2 ; i<10 ; i+=2){
         System.out.printf("valor: %d\n",i);
     }//fin del ciclo for 
       
       //declaracion de variables
       final int TOTAL = 10;
       int numvarones = 0;
       int nummujeres =0;
       char seleccion = 'a';
       double porcentaje = 0;
       
       for (int i = 0 ; i < TOTAL ; i++){
         System.out.printf("valor: %d\n",i+1);
     
        System.out.printf("%d quien viene por minuta\n",i+1);
        System.out.println("v: varon / m : mujer");
        System.out.print("Respuesta: ");
        seleccion = teclado.next().toUpperCase().charAt(0);
        
        
        
        switch(seleccion){
            case'V':
                
                System.out.println("varon comiento minuta");
                numvarones++;
                break;
        
            case'M':
            
            System.out.println("mujer comiento minuta");
                nummujeres++;
                break;
                
            default:
            System.out.println("seleccion no valida");
            break;
             }//fin de switch
       
       }//fin del ciclo for 
       
        System.out.println("porcentaje de varones");
        porcentaje = (double)numvarones / TOTAL;
        System.out.printf("porcentaje: %.2f%%\n",porcentaje);
        
         System.out.println("porcentaje de mujeres");
        porcentaje = (double)nummujeres / TOTAL;
        System.out.printf("porcentaje: %.2f%%\n" ,porcentaje);
    }//fin main
    
}//fin class
