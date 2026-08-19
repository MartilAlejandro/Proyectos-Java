/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sensores.de.temperatura;

import java.util.Scanner;

/**
 *
 * @author marti
 */
public class SensoresDeTemperatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
     Scanner teclado = new Scanner(System.in);
   
    //variables de datos
    double ingresot = 0;
    double talta = 0;
    double tbaja = 0;
    double sumat = 0;
    double promediot =0;
    double diferencia =0;
   
    //variable centinela
   
    int lvalidas =0;
   
    System.out.println("Analisis de Sensores de Temperatura ");
   
    System.out.println("ingrese -999 para salir");
   
    while(true){
       
       
        System.out.print("Ingresar la temperatura: ");
        ingresot = teclado.nextDouble();
       
       
        if(ingresot == -999){
           
            break;
        }//fin if
       
        if(ingresot < -273.15){
           
        System.out.println("la temperatura ingresada no puede ser menor a 273.15 C ");
           
        }
       
        else{
           
            sumat += ingresot;
            lvalidas ++;
           
           
               if(lvalidas == 1) {
                    talta = ingresot;
                    tbaja = ingresot;
                } else {
                   
                    talta = Math.max(talta, ingresot);
                    tbaja = Math.min(tbaja, ingresot);
        }
        }
    }
       
   
        System.out.println("\n========================================");
        System.out.println("RESULTADOS FINALES");
        System.out.println("========================================");
       
        if(lvalidas > 0){
           
            promediot = sumat / lvalidas;
            diferencia = talta - tbaja;
           
           
            System.out.println("temperaturas validas registradas :" + lvalidas);
            System.out.printf("Temperatura mas alta leida: %.2f C\n", talta);
            System.out.printf("Temperatura mas baja leida: %.2f C\n", tbaja);
            System.out.printf("Promedio de temperaturas: %.2f C\n", promediot);
            System.out.printf("Diferencia termica (Max - Min): %.2f C\n", diferencia);
        } else {
            System.out.println("No se ingreso ninguna temperatura valida para calcular.");
           
        }
   
   
   
}//fin main
    }//fin class
