/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simulacion.de.trayectoria.balistica;

import java.util.Scanner;

/**
 *
 * @author marti
 */
public class SimulacionDeTrayectoriaBalistica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner datos = new Scanner(System.in);
        double velocidadI = 0;
        double angulol = 0;
        double gravedad = 9.8;
        double anguloR = 0;
        double velocidady = 0;
        double tiempoA = 0;
        double y = 0;

        
        while (true) {
            System.out.print("Ingrese la velocidad (m/s): ");
            if (datos.hasNextDouble()) {
                velocidadI = datos.nextDouble();
                if (velocidadI > 0) {
                    break;
                } else {
                    System.out.println("La velocidad ingresada debe ser mayor a 0");
                }
            } else {
                System.out.println("Ingresa un numero correcto");
                datos.nextLine();
            }
        }

        
        while (true) {
            System.out.print("Ingrese el angulo (grados): ");
            if (datos.hasNextDouble()) {
                angulol = datos.nextDouble();
                if (angulol >= 1 && angulol <= 89) {
                    break;
                } else {
                    System.out.println("El angulo debe de estar en un grado de 1 a 89");
                }
            } else {
                System.out.println("Ingresa el angulo correcto");
                datos.nextLine();
            }
        }

        
        anguloR = Math.toRadians(angulol);
        velocidady = velocidadI * Math.sin(anguloR);
        tiempoA = velocidady / gravedad; 

        
        int segundoAlturaMaxima = (int) Math.round(tiempoA);

        System.out.println("\n--- Inicio de la Simulacion ---");
        System.out.printf("Tiempo estimado de altura maxima: %.2fs\n\n", tiempoA);

        
        for (int t = 1; t <= 10; t++) {
            
            y = (velocidady * t) - (0.5 * gravedad * Math.pow(t, 2));

            
            if (y < 0) {
                System.out.printf("Segundo %d: El proyectil ha impactado el suelo. (Altura negativa estimada: %.2fm)\n", t, y);
                break;
            } else {
                System.out.printf("Segundo %d: Altura = %.2f metros\n", t, y);
                
                
                if (t == segundoAlturaMaxima) {
                    System.out.printf(" [!] En este segundo el proyectil estuvo en su punto mas alto (Vertice estimado).\n");
                }
            }
        }
        System.out.println("--- Fin de la Simulacion ---");
    }
}