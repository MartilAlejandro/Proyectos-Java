/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package donacion.de.sangre;

import java.util.Scanner;



/**
 *   * Desarrollar un algoritmo que permita determinar si
     * el usuario puede donar sangre o no, basandose en su edad (18 - 65)
     * y peso (Mas de 110 lbs). 
     * Si se llega a cumplir los criterios antes expuestos, solo
     * se podra donar sangre si ha comido.
     * 
     * Otro elemento que se tiene que considerar para poder donar sangre
     * es tener el nivel de hierro/hemoglobina en la sangre en los 
     * niveles adecuados.
     * Para los hombres tiene que ser mas de 14 y las mujeres mas de 12
 * @author marti
 */
public class DonacionDeSangre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
     Scanner teclado = new Scanner (System.in);   

     int edad =0;
     int peso =0;
     boolean desayuno = true;
     char comio='s';
     int niveles =0;
     String genero = "g";
     
     
        System.out.println("Ingrese la edad:");
        edad = teclado.nextInt();
        
        System.out.println("Ingrese el peso:");
        peso = teclado.nextInt();
        
      if (edad>=18 && edad<=65 && peso>=110){
          
          teclado.nextLine();
        
        
          System.out.println("ya comio");
          comio = teclado.nextLine().charAt(0);
          
          if (comio == 's' || comio == 's'){
              System.out.println("si se puede donar");
          }
          else{
              System.out.println("necesita comer");
          }//fin if
    }
      else{ 
              System.out.println("no se puede donar");
          
      }//fin if
      
      
        System.out.println("cuales son sus niveles de hierro");
        niveles = teclado.nextInt();
        
        
        
        System.out.println("eres hombre o mujer");
        genero = teclado.nextLine().toUpperCase();
        
        
        if ((niveles >=14 && genero.equals("masculino"))||
           (niveles >=12 && genero.equals("femenino"))){
            
        
        System.out.println("si se puede donar sangre");
    }
        else{
        System.out.println("no se puede donar sangre");
      }
        
    }//fin main
    
    
}//fin class
