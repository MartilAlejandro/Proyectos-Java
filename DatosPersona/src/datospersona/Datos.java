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

    String[] nombres = new String[2];
    int[] edades = new int[2];
    double[] estaturas = new double[2];
    double[] pesos = new double[2];
    char[] generos = new char[2];

    public void Setnombres(String name, int indice) {
        nombres[indice] = name;
    }

    public void setedades(int age, int i) {
        edades[i] = age;
    }

    public void setpesos(double weigt, int i) {
        pesos[i] = weigt;
    }

    public void setgeneros(char genres, int i) {
        generos[i] = genres;
    }

    public void setestaturas(double stature, int i) {
        estaturas[i] = stature;
    }

    public void ImpresionDatos() {
        for (int i = 0; i < 2; i++) {

            System.out.println("Nombre: " + nombres[i]);
            System.out.println("Edad: " + edades[i]);
            System.out.println("Estatura: " + estaturas[i]);
            System.out.println("Genero: " + generos[i]);
            System.out.println("Peso: " + pesos[i]);
            System.out.println("----------------------------");

        }

    }

}
