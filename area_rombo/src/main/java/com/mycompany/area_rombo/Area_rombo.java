/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.area_rombo;

import java.util.Scanner;


public class Area_rombo {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese las diagonales del rombo
        System.out.print("Ingresa la longitud de la diagonal mayor (d1): ");
        double d1 = scanner.nextDouble();

        System.out.print("Ingresa la longitud de la diagonal menor (d2): ");
        double d2 = scanner.nextDouble();

        // Calcular el área del rombo usando la fórmula (d1 * d2) / 2
        double area = (d1 * d2) / 2;

        // Imprimir el resultado
        System.out.println("El área del rombo con diagonales " + d1 + " y " + d2 + " es: " + area);

        // Cerrar el scanner
        scanner.close();
    }
}
