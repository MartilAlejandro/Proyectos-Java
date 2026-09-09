/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package defensacorporativa;

import java.util.Scanner;

/**
 *
 * Operación "Cortafuegos": Defensa de la Red Corporativa Eres un Analista de
 * Seguridad Junior (Blue Team) en una importante firma de telecomunicaciones.
 * Anoche, los sistemas de alerta temprana detectaron un ataque cibernético
 * coordinado contra la infraestructura principal. El tiempo corre en tu contra
 * y el ingeniero en jefe te ha pedido que desarrolles un script en Java para
 * auditar los registros del sistema, identificar el foco del ataque y cerrar
 * las brechas antes de que los atacantes roben información confidencial.
 *
 * Fase 1: Análisis de Tráfico Perimetral El firewall perimetral tiene 8
 * servidores de entrada. Los atacantes están enviando miles de paquetes
 * maliciosos (DDoS) para saturarlos. Necesitas analizar los registros de la
 * última hora.
 *
 * Crear un arreglo unidimensional que almacene la cantidad de intentos de
 * intrusión bloqueados por cada uno de los 8 servidores. El programa debe
 * procesar estos datos para: Calcular el total de ataques repelidos por toda la
 * red. Encontrar qué servidor (índice) recibió la mayor cantidad de ataques,
 * para que el equipo asigne más ancho de banda a ese nodo. Calcular el promedio
 * de ataques por servidor.
 *
 * Fase 2: Escaneo de Subredes Internas Los atacantes lograron evadir el
 * perímetro y están escaneando la red interna en busca de puertos vulnerables.
 * La red interna está dividida en 4 subredes, cada una con 4 equipos críticos
 * (una matriz de 4x4). El sistema IDS (Sistema de Detección de Intrusos) ha
 * asignado un "Nivel de Amenaza" del 0 al 100 a cada equipo.
 *
 * Crear un arreglo bidimensional de 4x4 que represente el Nivel de Amenaza de
 * cada equipo en la red.
 *
 * El sistema debe: Mostrar la matriz completa en consola simulando un panel de
 * monitoreo. Identificar y emitir una alerta crítica con las coordenadas
 * (Subred/Fila y Equipo/Columna) de cualquier máquina que tenga un nivel de
 * amenaza mayor o igual a 85, ordenando su aislamiento inmediato de la red.
 *
 *
 *
 * @author marti
 */
public class DefensaCorporativa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scan = new Scanner(System.in);

        final int SERVIDORES = 8;
        int[] cantidadIntentos = new int[SERVIDORES];
        int sumaAtaques = 0;
        int posicionServidor = 0;
        double promedio = 0;

        for (int i = 0; i < SERVIDORES; i++) {
            System.out.print("Ingresa cantidad de intentos: ");
            cantidadIntentos[i] = ValidacionNumeroIngresado(scan);
        }//Fin Ciclo For

        sumaAtaques = TotalAtaquesRepelidos(cantidadIntentos);
        posicionServidor = ServidorMasAtacado(cantidadIntentos);
        promedio = CalculoPromedio(sumaAtaques, SERVIDORES);
        ImpresionResultados(sumaAtaques, posicionServidor, promedio);
    }//Fin de Main

    public static int ValidacionNumeroIngresado(Scanner sc) {

        int datoTemporal = 0;

        do {
            System.out.println("lectura de Dato Echo");
            System.out.print("Lectura: ");
            datoTemporal = sc.nextInt();
            if (datoTemporal < 0) {
                System.out.println("Valor Ingresado");
                System.out.println("No puede ser negativo");
                System.out.println("Ingrese Nuevamente Dato");
                System.out.println("---------------");
            }
        } while (datoTemporal < 0);

        return datoTemporal;

    }//Fin de Funcion ValidacionNumeroIngresado

    public static int TotalAtaquesRepelidos(int[] arregloAtaques) {

        int acumulador = 0;

        for (int i = 0; i < arregloAtaques.length; i++) {

            acumulador += arregloAtaques[i];

        }//Fin Ciclo For

        return acumulador;

    }//Fin ValidacionNumeroIngresado

    public static int ServidorMasAtacado(int[] arregloAtaques) {

        int indice = 0;
        int mayorAtaque = 0;

        for (int i = 0; i < 10; i++) {

            if (arregloAtaques[i] > mayorAtaque) {

                mayorAtaque = arregloAtaques[i];
                indice = i;
            }//Fin if

        }//Fin for

        return indice;
    }//Fin funcion ServidorMasAtacado

    public static int CalculoPromedio(int totalIntentos, int totalServidores) {
        int promedio = 0;

        promedio = totalIntentos / totalServidores;

        return promedio;

    }//Fin CalculoPromedio

    public static void ImpresionResultados(int Total, int posicionServidor, double promedio) {

        System.out.println("la suma toal de los ataques es: ");
        System.out.println(Total);
        System.out.println("La posicion del servidor es: ");
        System.out.println(posicionServidor);
        System.out.println("El promedio es: ");
        System.out.println(promedio);

    }//Fin ImpresionResultados    

}//Fin Class
