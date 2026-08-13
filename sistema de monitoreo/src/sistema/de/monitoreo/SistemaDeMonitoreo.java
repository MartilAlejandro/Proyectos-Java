/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistema.de.monitoreo;

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
     * 
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
    }//fin de main
    
}//fin class
