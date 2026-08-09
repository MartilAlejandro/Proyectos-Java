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
    //entrada de datos
   Scanner teclado = new Scanner(System.in);
   //variables declaradas
    int num1 = 0;
    int num2 = 0;
    char operador = '@';
   
//titulo del proyecto 
System.out.printf("\n Calculadora Aritmetica de Consola \n"); 

//ingreso del primer numero
System.out.printf("\n Ingresar primer numero: ");
num1 = teclado.nextInt();

//ingreso del segundo 
System.out.printf("\n Ingresar segundo numero: ");
num2 = teclado.nextInt();

//ingreso del operador aritmetico a utilizar
System.out.printf("\n Ingresar operador aritmetico solo se puede ingresar (+,-,*,/,%%)");
operador = teclado.next().charAt(0);

//inicio del switch para los casos de las operaciones
switch(operador){
   
    //caso + suma
    case'+':
     System.out.printf("\nResultado de la suma es: %.2f%n",(double)num1+num2);
    break;

    //caso - resta
    case'-':
    System.out.printf("\nResultado de la resta es: %.2f%n",(double)num1-num2);
    break;
    
    //caso * multiplicacion
    case'*':
    System.out.printf("\nResultado de la multiplicacion es: %.2f%n",(double)num1*num2);
    break;
    
    //caso / division con condicion para que no se pueda dividir entre 0
    case'/':
        if(num2 !=0){
    System.out.printf("\nResultado de la division es: %.2f%n",(double)num1/num2);
    
        }
        else{
        
    System.out.print("\n Error: No se puede dividir entre cero. \n");
        }
        
    break;
    
    //caso % con condicion para que el modulo no divida entre 0
    case'%':
        if(num2 !=0){
            
         System.out.printf("\nResultado modulo es: %.2f%n",(double)num1 % num2);
            
        }
        else{
         
         System.out.print("\nError: No se puede calcular el modulo con divisor cero. \n");
        
        }
        break;
       
     
     // para que solo se puedan ingresar los operadores de los casos   
    default:
    System.out.print("\n Operador no reconocido \n");
}//fin de caso

}//fin main
}//fin class
