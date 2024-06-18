/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.area_rectangulo;

import java.util.Scanner;


public class Area_rectangulo {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese la base del rectángulo
        System.out.print("Ingresa la longitud de la base del rectángulo: ");
        double base = scanner.nextDouble();

        // Pedir al usuario que ingrese la altura del rectángulo
        System.out.print("Ingresa la altura del rectángulo: ");
        double altura = scanner.nextDouble();

        // Calcular el área del rectángulo
        double area = base * altura;

        // Imprimir el resultado
        System.out.println("El área del rectángulo con base " + base + " y altura " + altura + " es: " + area);

        // Cerrar el scanner
        scanner.close();
    }
}
