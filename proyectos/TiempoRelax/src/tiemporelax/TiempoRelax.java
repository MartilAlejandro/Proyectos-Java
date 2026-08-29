/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiemporelax;

import java.util.Scanner;

/**objetivos 
 * 1. selecciones multiples
 *       a.estructura
 *       b.tipo de condiciones
 * 2.formateo de cadenas (printf)
 * 
 *
 * @author marti
 */
public class TiempoRelax {

    /**
     * Desarrollar algoritmo que me permita escoger un pais a visitar
     * posterior a ello, debemos nosotros escoger las posibles ciudades 
     * a recorrer, sin embargo, solo se puede una ciudad 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        
        int seleccionMenu = 0;
        char seleccionsubmenu ='@';
     
        System.out.println("Agencia de viajes");
        System.out.printf("|%20s| |%-20s| \n","Tanias's Travel","buen viaje");
        System.out.println("----------------------------------------");
        
        System.out.println("1. japon");
        System.out.println("2. Francia");
        System.out.println("3. Nueva Zelanda");
        System.out.println("4. Canada");
        System.out.print("Respuesta: ");
        
        seleccionMenu = teclado.nextInt();
        
        
        switch(seleccionMenu){
            case 1:
                System.out.println("Nihon e yokoso Japon");
                System.out.println("--------------------");
                System.out.println("A.Osaka");
                System.out.println("B.Tokyo");
                System.out.println("C. Kioto");
                System.out.println("Respuesta: ");
                teclado.nextLine();
                seleccionsubmenu = teclado.nextLine().toUpperCase().charAt(0);
                
                switch(seleccionsubmenu){
                    
                    case 'A':
                        System.out.println("Super nintendo World Tour");
                        break;
                        
                    case 'B':
                        System.out.println("Car Meet");
                        break;
                        
                    case 'C':
                        System.out.println("Pabellon Dorado segun google");
                        break;
                    default:
                        System.out.println("cualquier ciudad...");
                        System.out.println("por que no esta opcion");
                        System.out.println("que escogiste");
                    }//fin de submenu
                break;
            case 2:
                System.out.println("Bienvenue en France");
                System.out.println("---------------");
                System.out.println("1.Paris");
                System.out.println("2. Marsella");
                System.out.println("Lyon");
                System.out.println("Respuesta: ");
                
                teclado.nextLine();
                seleccionsubmenu = teclado.nextLine().charAt(0);
                
                switch(seleccionsubmenu){
                    case '1':
                        System.out.println("Torre Ifel");
                        break;
                    
                    case '2':
                        System.out.println("palacio de marsella");
                        break;
                        
                    case '3':
                        System.out.println("lea ombe no esta la opcion esa");
                        break;
                }//fin de switch submenu
                
                break;
            case 3:
                System.out.println("Nau mai, haere mai! Nueva Zelanda");
                System.out.println("--------------------------");
                
                System.out.println("A. Sky Tower");
                System.out.println("B. Hogbbiton");
                System.out.println("C. Mildford Sound");
                System.out.println("Respuesta: ");
                
                teclado.nextLine();
                seleccionsubmenu =teclado.nextLine().toUpperCase().charAt(0);
                
                if(seleccionsubmenu == 'A'){
                    
                    System.out.printf("%s Sky Tower %s","\u001B[31m","\u001B[0m");
                    
                }else if(seleccionsubmenu =='B'){
                    System.out.printf("%s Hogbbiton %s","\u001B[32m","\u001B[0m");
                    
                }else if(seleccionsubmenu =='C'){
                    System.out.printf("%s Mildford sound %s","\u001B[34m","\u001B[0m");
                }
                else{
                    System.out.println("Usted no lee va?!!!");
                    
                }//fin de if submenu
                break;
                
            case 4:
                    System.out.println("welcome to Canada");
                break;
        }//fin de switch Menu
        
        
      
      }//fin main
    
}//fin class
