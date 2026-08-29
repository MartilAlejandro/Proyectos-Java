/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistema.de.monitoreo;

import java.util.Random;
import java.util.Scanner;

/**
 * * Desarrolla un programa en Java que simule la lectura de sensores de 
     * temperatura en un cuarto de servidores. El programa debe solicitar 
     * el nombre del operador encargado y cuántas lecturas de sensores se 
     * van a simular. Debe validar que la cantidad de lecturas sea mayor a 0 
     * y menor o igual a 50. Por cada lectura, el sistema generará una temperatura 
     * aleatoria en grados Celsius. El programa debe convertir cada lectura a 
     * Fahrenheit, determinar si hay una alerta de sobrecalentamiento y, al final, 
     * mostrar un resumen estadístico.
 * @author marti
 */
/*
    1. Comprender el problema que se esta abordando
       a. que datos de entrada necesito?.
       b. la transformacion / calculos necesarios.
       c. Que resultados se presentan?

    2.Visualizacion / Diseño de la Solucion.
       a. Diagrama de flujo
       b. Pseudocodigo

    3. Programacion incremental.
      a. Listando las tareas a cumplir
        i.declaracion de variables
        ii. estructura de seleccion
        iii. ciclos de repeticion
        iiii. validacion de datos
      b.Validacion

    4. Pruebas de escritorio
       a. Casos
       b. Escenerios 
       c. resultados / Patrones Definidos
*/
public class SistemaDeMonitoreo {

    /**
     * comprension problema
     * 1. entradas:
     *      nombre de usuario
     *      numero de lectura
     *      ingreso de temperatura
     * 2. Calculos / Transformacion
     *       formula Celsius - farenheit
     *       definicion de sobrecalentamiento
     *       validacion lectura (0 > lectura menor 50)
     *       promediar el numero de calentamiento
     *       promediar el monitoreo
     *       -validacion de temperatura
     * 3. salidas
     *       resumen estadisticos 
     *       alerta de sobrecalentamineto
     *       
     * Lista de tareas 
     * 1. capturar el nombre del usuario
     *        a. definicion de libreria / Instancia
     *        b. declaracion de variables para el usuario
     * 2. captura de numeros de lecturas
     *        a. Declaracion de variables para numeros de lectura
     * 3. generacion de temperatura 
     *        a. definicion de libreria RANDOM
     *        b. declaracion de variable
     *        c. mostrar el numero Random generado temporalmente
     *        d. rango de temp 200-400
     *        e.ciclo de repeticion, while
     * 4. formula f=(c * 9/5)+32
     * 5. limite de sobrecalentamiento 350 c (602 f)
     *               estructura de seleccion (if/else)
     * 6. validacion de lectura (do - while) 0-50
     * 7. sumar los numeros de sobrecalentamiento
     * 8. calcular el promedio
     * 9.mostrar el resumen 
     *     promedio
     *      #sobrecalentamiento
     * 10.generar una alerta de sobrecalentamiento
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        Random rd = new Random();
        
        String nombreusuario = "jhon doe";
        int lectura =0;
        double tempc =0;
        int ciclo =0;
        double tempf =0;
        int sumac =0;
        double promedio =0;
        double acumtemp=0;
        System.out.print("nombre de operario :");
        nombreusuario = teclado.nextLine().toUpperCase();
        System.out.printf("validar captura: %s\n",nombreusuario);
       do{ 
        System.out.print("numero de lectura :");
        lectura = teclado.nextInt();
       // System.out.printf("validacion captura :%d\n",lectura);
       if(!(lectura <0 && lectura < 50)){
           System.out.println("valor no valido");
           System.out.println("tiene que ser entre 0-50");
       }
       }while(!(lectura >0 && lectura<50));
        tempc = rd.nextDouble(200,400);
        //tempc = (Math.random()*500)-300 + 200);
        System.out.printf("validacion random :%.2f\n",tempc);
        
        while (ciclo < lectura){
            
             tempc = rd.nextDouble(200,400);
             tempf = (tempc *9/5)+32;     
             //tempc = (Math.random()*500)-300 + 200);
             System.out.printf("validacion random :%.2f\n",tempc);
             System.out.printf("num lec: %d\ttemp c: %.2f\n",ciclo+1,tempc);
             System.out.printf("temp en faren: %.2f\n",tempf);
             
             if(tempf > 662){
                 System.out.println("alerta!!!...sobrecalentamiento");
                 sumac++;
             }
                 else{
                 acumtemp +=tempf;        
                         
                         }
   
            ciclo++;
        }//fin while
        
        promedio = acumtemp / lectura;
        
        System.out.println("-------------------");
        System.out.println("      resumen       ");
        System.out.println("-------------------");    
        System.out.printf("promedio de temp: %.2f\n",promedio);
        System.out.printf("# sobrecalentamiento: %d", sumac);
    }//fin de mainf
    
}//fin class
