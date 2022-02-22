package Principal;

import java.util.Scanner;

/**
 * @author Lautaro Toloza
 */
public class Principal {

    public static void main(String[] args) {
//        Consigna ejercicio 2:
//        Dada 5 calificaciones de un alumno obtenidas a lo largo del
//        semestre, construya un programa que imprima el 
//        promedio de sus calificaciones.

        int cantidadNotas = 5;
        double acumula = 0;
        String nombre = cargarNombre("Ingresa el nombre y apellido del alumno: ");
        int[] notas = new int[cantidadNotas];
        for (int i = 0; i < notas.length; i++) {
            String texto = "Ingrese la nota número (" + (i + 1) + ") : ";
            notas[i] = cargarNota(texto);
            acumula += notas[i];
        }
        double promedio = acumula / cantidadNotas;

        System.out.println("\nEl promedio del alumno " + nombre + " es: " + promedio);

    }

    public static int cargarNota(String texto) {
        Scanner leer = new Scanner(System.in);
        System.out.print(texto);
        int nota = leer.nextInt();
        return nota;
    }

    public static String cargarNombre(String texto) {
        Scanner leer = new Scanner(System.in);
        System.out.print(texto);
        String nombre = leer.nextLine();
        return nombre;
    }

}
