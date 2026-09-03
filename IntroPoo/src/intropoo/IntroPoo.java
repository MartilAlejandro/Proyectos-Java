/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package intropoo;

import java.awt.BorderLayout;

/**
 *
 * @author marti
 */
public class IntroPoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona Javier = new Persona();
        Persona sthepanie = new Persona("Astrid",19,1.63);
        
        System.out.println("----------------");
        Javier.Impresionnombre();
        Javier.CaracteristicasPersona();
        
        System.out.println("----------------");
        
       sthepanie.Impresionnombre();
       sthepanie.CaracteristicasPersona();
       
       System.out.println("----------------");
        
        
        Javier.nombre="Antonio";
        Javier.edad=27;
        Javier.estatura=1.70;
        Javier.setgenero('M');
        
        sthepanie.nombre="sarai";
        sthepanie.edad=19;
        sthepanie.estatura=1.72;
        sthepanie.setgenero('F');
        
        Javier.Impresionnombre();
        sthepanie.Impresionnombre();
        System.out.println("-------------");
        
        
        
        Javier.CaracteristicasPersona();
        System.out.printf("Genero: %c\n",Javier.getgenero());
        
        sthepanie.CaracteristicasPersona();
        System.out.printf("Genero: %c\n",sthepanie.getgenero());
        
        VentanaPrincipal VP = new VentanaPrincipal(Javier.nombre,Javier.edad,Javier.estatura);
        VP.setVisible(true);
        VP.setLocationRelativeTo(null);

    }//fin main

}//fin class 
