/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglosdinamicos;

import java.util.ArrayList;

/**
 *
 * @author marti
 */
public class ArreglosDinamicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo;
        int dimension = 0;
        
        ArrayList<Integer> numeros = new ArrayList<Integer>();//int
        ArrayList<Double> decimales = new ArrayList<Double>();//double
        ArrayList<Character> letras = new ArrayList<Character>();//char
        ArrayList<String> palabras = new ArrayList<String>();//String
        ArrayList<Boolean> estado = new ArrayList<Boolean>();//booñean

        dimension = DimensionArraylist(numeros);
        MostrarDimension(dimension);
        
        numeros.add(10);
        numeros.add(200);
        numeros.add(-300);
        numeros.add(50);
        
        dimension = DimensionArraylist(numeros);
        MostrarDimension(dimension);
        
        numeros.add(80);
        dimension = DimensionArraylist(numeros);
        MostrarDimension(dimension);
        
        System.out.println("------------------------------");
        System.out.println("\n Obteniendo Datos");
        System.out.println("-------------------");
        MostrarContenidoArrayList(numeros);
        
        System.out.println("");
        System.out.println("-------------------");
        System.out.println("Modificando un valor");
        numeros.set(0, 600);
        
        MostrarContenidoArrayList(numeros);
        System.out.println("\n Otro cambio");
        numeros.set(3, -40);
        MostrarContenidoArrayList(numeros);
        
        System.out.println("");
        System.out.println("-------------------");
        System.out.println("Eliminando un valor");
        numeros.remove(0);
        MostrarDatoEliminado(numeros);
        numeros.remove(2);
        MostrarDatoEliminado(numeros);
        
        System.out.println("");
        System.out.println("-------------------");
        System.out.println("Eliminando todos los valor");
        numeros.clear();
        MostrarDatoEliminado(numeros);
        
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        
        System.out.println("");
        System.out.println("-------------------");
        System.out.println("Usando For Each");
        UsoForEach(numeros);
        
    }//fin main

    public static int DimensionArraylist(ArrayList<Integer> arreglo) {
        int tempo = 0;
        
        tempo = arreglo.size();
        return tempo;
        
    }//fin de funcion dimension

    public static void MostrarDimension(int valor) {
        System.out.printf("La dimension del ArrayList: %d\n", valor);
    }//fin de la funcion mostrar 

    public static void MostrarContenidoArrayList(ArrayList<Integer> datos) {
        for (int i = 0; i < datos.size(); i++) {
            int valor = 0;
            valor = datos.get(i);
            System.out.printf("Posicion: %d\t", i);
            System.out.printf("valor de [%d]: %d\n", i, valor);
            
        }//fin ciclo for
    }//fin funcion MostrarContenidoArrayList

    public static void MostrarDatoEliminado(ArrayList<Integer> datos) {
        int dimension = DimensionArraylist(datos);
        MostrarContenidoArrayList(datos);
    }//fin funcion MostrarDatoEliminado
    
    public static void UsoForEach(ArrayList<Integer> arreglo){
        
        for (int i : arreglo) {
            
            System.out.printf("Valor: %d \n",i);
        }//fin de ciclo for each
    }// fin de funcion UsoForEach
}//fin class
