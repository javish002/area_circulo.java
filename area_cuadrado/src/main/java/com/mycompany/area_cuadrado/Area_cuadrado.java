/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.area_cuadrado;

import java.util.Scanner;

public class Area_cuadrado {
    public static void main(String[] args) {
        // Registrar el tiempo de inicio
        long startTime = System.currentTimeMillis();

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el lado del cuadrado
        System.out.print("Ingresa el lado del cuadrado: ");
        double lado = scanner.nextDouble();

        // Calcular el área del cuadrado (lado * lado)
        double area = lado * lado;

        // Imprimir el resultado
        System.out.println("El área del cuadrado con lado " + lado + " es: " + area);

        // Cerrar el scanner
        scanner.close();

        // Registrar el tiempo de fin y calcular la duración
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Tiempo de ejecución: " + duration + " milisegundos");
    }
}
