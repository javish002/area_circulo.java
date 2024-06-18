/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.area_trapecio;

import java.util.Scanner;

public class Area_trapecio {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese las bases del trapecio
        System.out.print("Ingresa la longitud de la base mayor (B): ");
        double B = scanner.nextDouble();

        System.out.print("Ingresa la longitud de la base menor (b): ");
        double b = scanner.nextDouble();

        // Pedir al usuario que ingrese la altura del trapecio
        System.out.print("Ingresa la altura del trapecio (h): ");
        double h = scanner.nextDouble();

        // Calcular el área del trapecio sin almacenar en una variable extra
        System.out.println("El área del trapecio con bases " + B + " y " + b + " y altura " + h + " es: " + ((B + b) * h / 2));

        // Cerrar el scanner
        scanner.close();
    }
}


