/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package facturacion;

import java.util.Scanner;

/**
 *objetivos 
 * 1.definir el concepto de funcion / metodo
 * 2.conocer la estructura de funcion 
 * 3.implementar funciones en el algoritmo 
 * 
 * caracteristicas de las funciones / metodos 
 * 1.reutilizarlas 
 * 2.modular -> pequeñas tareas 
 * 3.mantenimiento
 * 
 * estructura de una funcion
 * 1. acceso de la funcion 
 *           public, private, protected
 * 2.tipo de dato retorna/devuelve 
 *         void
 *         int,double
 *         char,string
 *         boolean, long
 *         arraylist....
 * 3.nombre de la funcion 
 * 4. parametros de trabajo 
 *         int,double
 *         char,string
 *         boolean, long
 *         arraylist....
 * 
 */
public class Facturacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      Scanner scan = new Scanner(System.in);
        
        final double ISV = 0.15;
        
        int precioProducto = 0;
        int cantidad = 0;
        double descuento = 0;
        double impuesto = 0;
        double subTotal = 0;
        double total = 0;
        
        System.out.println("---------------------------");
        System.out.println(" Sistema de Facturacion");
        System.out.println(" La logica de Programacion");
        System.out.println("---------------------------");
        
        mensajebienvenida();
        
        System.out.print("Ingresa el Precio del Producto: ");
        precioProducto = scan.nextInt();
        
        precioProducto = validacionnumerica(precioProducto,scan);
        
        System.out.print("Cuantos productos llevas?");
        cantidad = scan.nextInt();
        cantidad = validacionnumerica(cantidad,scan);
        
        subTotal = precioProducto * cantidad;
        if(subTotal >100){
            descuento = subTotal *0.10;
        }
        else{
            descuento = 0;
        }
        
        impuesto = (subTotal - descuento)*ISV;
        
        resultadofactura(subTotal,descuento,impuesto,total);
        
      
        
    }//fin main
    
    /**
     * funcion con las siguientes caracteristicas 
     * sin parametros 
     * sin retorno
     */
    public static void mensajebienvenida(){
        
        System.out.println("---------------------------");
        System.out.println(" Sistema de Facturacion");
        System.out.println(" La logica de Programacion");
        System.out.println("---------------------------");   
        
    }//fin de la funcion mensajebienvenida
    
    
    public static int validacionnumerica(int numero, Scanner input){
        int numerovalido =numero;
        final int limite =0;
        do{
            
        if(numerovalido<limite){
            System.out.println("valor numerico no puede");
            System.out.println("ser menos 0");
           System.out.println("ingrese nuevamente el dato");
           numerovalido = input.nextInt();
            
        }
        
        }while(numerovalido<limite);
        
        return numerovalido;
        
        
        
    }//fin de la funcion validacionnumerica
    
    public static void resultadofactura(double sub, double des, double imp,double tot){
        tot = sub - des + imp;
         System.out.printf("\nSubtotal: %.2f",sub);
         System.out.printf("\nDescuento: %.2f",des);
         System.out.printf("\nImpuesto: %.2f",imp);
         System.out.printf("\nPrecio a Pagar: %.2f",tot);
    }
}//fin class
