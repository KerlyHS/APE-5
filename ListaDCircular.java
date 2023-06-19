/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication17;

import java.util.Scanner;

/**
 *
 * @author Usuario_PC
 */
public class ListaDCircular {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ListaDobleCircular lista = new ListaDobleCircular();
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Lista Dblemente Enlazada");
        System.out.println("========================");
        int opcion;

        do {
            System.out.println("=== MENU ===");
            System.out.println("1. Agregar elemento");
            System.out.println("2. Insertar elemento en posicion");
            System.out.println("3. Eliminar elemento");
            System.out.println("4. Imprimir lista");
            System.out.println("5. Imprimir conexiones");
            System.out.println("6. Salir");
            
            
            System.out.println(" =====INGRESA LA OPCION======");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el elemento a agregar:");
                    int elementoAgregar = leer.nextInt();
                    lista.agregar(elementoAgregar);
                    break;
                case 2:
                    System.out.println("Ingrese el elemento a insertar:");
                    int elementoInsertar = leer.nextInt();
                    System.out.println("Ingrese la posición de inserción:");
                    int posicion = leer.nextInt();
                    lista.insertar(elementoInsertar, posicion);
                    break;
                case 3:
                    System.out.println("Ingrese el elemento a eliminar:");
                    int elementoEliminar = leer.nextInt();
                    lista.eliminar(elementoEliminar);
                    break;
                case 4:
                    System.out.println("Lista actual:");
                    lista.imprimir();
                    break;
                case 5:
                    System.out.println("Conexiones de la lista:");
                    lista.imprimirConexiones();
                    break;
                case 6:
                    System.out.println("=====GRACIAS POR USAR=====");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                    break;
            }

            System.out.println();
        } while (opcion != 6);

        leer.close();
    }
}
