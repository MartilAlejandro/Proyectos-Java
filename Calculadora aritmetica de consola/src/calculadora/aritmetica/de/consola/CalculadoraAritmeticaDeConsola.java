/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora.aritmetica.de.consola;

import java.util.Scanner;

/**
 *
 * @author marti
 */
public class CalculadoraAritmeticaDeConsola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
   Scanner teclado = new Scanner(System.in);
   
    int num1 = 0;
    int num2 = 0;
    char operador = '@';
   
   
System.out.printf("\n Calculadora Aritmetica de Consola \n");  

System.out.printf("\n Ingresar primer numero: ");
num1 = teclado.nextInt();

System.out.printf("\n Ingresar segundo numero: ");
num2 = teclado.nextInt();

System.out.printf("\n Ingresar operador aritmetico solo se puede ingresar (+,-,*,/,%%)");
operador = teclado.next().charAt(0);

switch(operador){
   
    case'+':
     System.out.printf("\nResultado de la suma es: %.2f%n",(double)num1+num2);
    break;

    case'-':
    System.out.printf("\nResultado de la resta es:: %.2f%n",(double)num1-num2);
    break;
   
    case'*':
    System.out.printf("\nResultado de la multiplicacion es: %.2f%n",(double)num1*num2);
    break;
   
    case'/':
        if(num2 !=0){
    System.out.printf("\nResultado de la division es: %.2f%n",(double)num1/num2);
    
        }
        else{
        
    System.out.print("\n Error: No se puede dividir entre cero. \n");
        }
        
    break;
    
    case'%':
        if(num2 !=0){
            
         System.out.printf("\nResultado modulo es: %.2f%n",(double)num1 % num2);
            
        }
        else{
         
         System.out.print("\nError: No se puede calcular el modulo con divisor cero. \n");
        
        }
        break;
       
   
    default:
    System.out.print("\n Operador no reconocido \n");
}//fin de caso

}//fin main
}//fin class
