/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.area_circulo;

import java.util.Scanner;


public class Area_circulo {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el radio del círculo
        System.out.print("Ingresa el radio del círculo: ");
        double radio = scanner.nextDouble();

        // Calcular el área usando la fórmula del círculo
        double area = Math.PI * Math.pow(radio, 2);

        // Imprimir el resultado
        System.out.println("El área del círculo con radio " + radio + " es: " + area);

        // Cerrar el scanner
        scanner.close();
    }
}

