/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paroimpar;

import java.util.Scanner;

/**
 *
 * @author Usuario_PC
 */
public class ParOImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Programa que dice si un numero entero es par o impar ");
        System.out.println("========================================================");
        int option;

        do {

            System.out.println("=======MENU=========");
            System.out.println("=====================");

            System.out.println(" 1. Ingresa tu numero");
            System.out.println("2. Salir");
            System.out.print("Eliguir una opcion ==>");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Ingrese el numero entero ==> ");
                    int numero = scanner.nextInt();
                    if (numero % 2 == 0) {
                        System.out.println("El numero " + numero + " es par.");
                    } else {
                        System.out.println("El numero " + numero + " es impar.");
                    }

                    break;

                case 2:

                    System.out.println("GRACIAS POR USAR");
                    
                    break;
                    
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");

                    break;
            }

            System.out.println();

        } while (option != 3);

        scanner.close();
    }
}
