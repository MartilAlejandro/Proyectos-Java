/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversor.de.unidades.fisicas;

import java.util.Scanner;

/**
 *
 * @author marti
 */
public class ConversorDeUnidadesFisicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     Scanner teclado = new Scanner(System.in);
   
    double metro= 0;
    double pies= 0;
    double kilogramo= 0;
    double libra= 0;
    double centimetros= 0;
    double pulgadas= 0;
    int seleccion =0;
   
   do{
    System.out.println("Conversor de Unidades Fisicas");
   
    System.out.println("Que tipo de medida quiere convertir");
   
    System.out.println("------------------------------------");
   
    System.out.println("1) Metros a Pies");
    System.out.println("2) Kilogramos a Libras");
    System.out.println("3) Centimetros a Pulgadas");
    System.out.println("4) Salir");
   
    System.out.print("Ingrese la opcion que desea: ");
    seleccion = teclado.nextInt();
   
   
     
        switch(seleccion){
           
            case 1:
           
            do{
                System.out.print("Ingrese los metros :");
            metro = teclado.nextDouble();
           
            if(metro < 0){
            
            
            System.out.println("Error vuelva ingresar el dato:");
            }
           
               
            }while(metro<0);
           
               
            pies = metro * 3.28084;
               
            System.out.println("Resultado: " +pies);
               
            break;
           
               
            case 2:
           
            do{
                System.out.print("Ingrese los Kilogramos :");
            kilogramo = teclado.nextDouble();
           
            if(kilogramo < 0){
           
            System.out.print("Error vuelva ingresar el dato:");
            }
           
            }while(kilogramo < 0);
               
            libra = kilogramo * 2.20462;
               
            System.out.println("Resultado: " +libra);
               
            break;
           
               
            case 3:
           
            do{
               
             System.out.print("Ingrese los centimetros :");
             centimetros = teclado.nextDouble();
           
            if(centimetros < 0){
           
            System.out.print("Error vuelva ingresar el dato:");
            }
           
            }while(centimetros < 0);
               
            pulgadas = centimetros / 2.54;
               
            System.out.println("Resultado: " +pulgadas);
               
            break;
           
               
            case 4:
           
            System.out.println("saliendo del programa");
               
            break;
               
            default:
            System.out.println("Opcion no válida.");
            break;
               
           
           
            }
   
      }while(seleccion !=4);
   
 
   
}//fin main
 }//fin class
