/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listadoblementeenlazada;

import java.util.Scanner;

/**
 *
 * @author Usuario_PC
 */
public class ListaDoblementeEnlazada {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        ListaDoble lista = new ListaDoble();

        int opcion;
        do {
            System.out.println("MENU");
            System.out.println("1. Agregar nodo");
            System.out.println("2. Insertar nodo");
            System.out.println("3. Eliminar nodo");
            System.out.println("4. Imprimir lista");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opcion ====> ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el dato del nodo a agregar: ");
                    int datoAgregar = scanner.nextInt();
                    lista.agregarNodo(datoAgregar);
                    break;
                case 2:
                    System.out.print("Ingrese el dato del nodo a insertar: ");
                    int datoInsertar = scanner.nextInt();
                    System.out.print("Ingrese la posición en la que desea insertar el nodo: ");
                    int posicionInsertar = scanner.nextInt();
                    lista.insertarNodo(datoInsertar, posicionInsertar);
                    break;
                case 3:
                    System.out.print("Ingrese el dato del nodo a eliminar: ");
                    int datoEliminar = scanner.nextInt();
                    lista.eliminarNodo(datoEliminar);
                    break;
                case 4:
                    lista.imprimirLista();
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
            System.out.println();
        } while (opcion != 5);

        scanner.close();
    }

}
