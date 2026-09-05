/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datospersona;

/**
 *
 * @author marti
 */
public class Datos {
    
    //atributos 
    
    public String nombre;
    public int edad;
    public double estatura;
    public char genero;
    public double peso;
    
    String[] nombres = new String[3];
    int[] edades = new int[3];
    double[] estaturas = new double[3];
    double[] pesos = new double[3];
    char[] generos = new char[3];
    


    public void setnombres(String name,int i){
         nombres[i]=name;
        }
    
    public void setedades(int age, int i){
         edades[i]=age;
        }
    
    
     public void setpesos(double weigt, int i){
         pesos[i]=weigt;
        }
    
     
      public void setgeneros(char genres, int i){
         generos[i]=genres;
        }
    
     
      public void setestaturas(double stature, int i){
         estaturas[i]=stature;
        }
    
    
    
    
    
    
    
    
    public Datos(String nombre, int edad,double estatura,char genero,double peso){
        this.nombre=nombre;
        this.edad=edad;
        this.estatura=estatura;
        this.genero=genero;
        this.peso=peso;
    }
    
    public void ImpresionDatos(){
        
        System.out.println("Nombre: "+ nombre);
        System.out.println("Edad: "+ edad);
        System.out.println("Estatura: "+ estatura);
        System.out.println("Genero: "+ genero);
        System.out.println("Peso: "+ peso);
    }
    
    
}
