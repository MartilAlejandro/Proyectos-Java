/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package genereacion.de.token;

import java.util.Random;
import java.util.Scanner;

/**
 * * Objetivos 
 * 1. Utilizar el ciclo de repeticion DO - WHILE
 * 2. Uso de Nuevas Librerias
 *      a. Random
 * 3. Uso de Otras Funciones de String
* Desarrollar un algoritmo que me permita registrar
     * un dispositivo y generar un token para su sesion
     * de validacion mientras se esta navegando con dicho dispositivo.
     * 
     * Contexto del problema:
       Un sistema de gestión de red necesita registrar 
      nuevos enrutadores (routers) y asignarles una clave 
        de sesión única generada aleatoriamente. 
        
       Sin embargo, el canal de comunicación tiene "ruido",
       por lo que la generación de la clave no siempre 
       es constante.
 *
 * @author marti
 */
public class GenereacionDeToken {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        Random RD = new Random();
        
        String nombreequipo = "a";
        
        boolean longitudcorrecta = true;
        boolean prefijocorrecto = true;
        boolean validacioncorrecta =true;
        
        int tipocaracter =0;
        int numerotoken =0;
        char letratoken ='@';
        String token = "s";
        
        
        do{
            System.out.print("Ingrese el nombre del equipo: ");
        nombreequipo = teclado.nextLine().toUpperCase();
        
        System.out.printf("\nNombre del equipo %s\n", nombreequipo);
        
        longitudcorrecta = nombreequipo.length()==8;
        prefijocorrecto = nombreequipo.startsWith("RT") || nombreequipo.startsWith("SW");
        
        //System.out.println(longitudcorrecta);
        //System.out.println(prefijocorrecto);
        
        validacioncorrecta = longitudcorrecta && prefijocorrecto;
            
        }while(!validacioncorrecta);//se va ejecutar al menos  veces aunque la condicion sea falsa
        
        System.out.println("Regristro correcto");
        
        
        
        while(token.length() < 12){
            
            tipocaracter = RD.nextInt(2);
            
            if(tipocaracter == 0){
                
                numerotoken = RD.nextInt(10);
                token = token + numerotoken;
            }    
                else{
                
                letratoken = (char)(RD.nextInt(26)+65);//casting temporal
                token = token + letratoken;
                
            }
            
        }
        
        System.out.printf("\nTu Token es:  %s \n", token);
        
   }//fin main
    
}//fin class
