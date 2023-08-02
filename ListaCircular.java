/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listacircular;

import java.util.Scanner;

/**
 *
 * @author Usuario_PC
 */
public class ListaCircular {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CircularLinkedList lista = new CircularLinkedList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lista Circular");
        
        System.out.println("=========================");
        int opcion;
        do {
            System.out.println("----- MENU -----");
            System.out.println("1. Agregar elemento");
            System.out.println("2. Insertar elemento");
            System.out.println("3. Eliminar elemento");
            System.out.println("4. Mostrar lista");
            System.out.println("5. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el numero a agregar: ");
                    int numeroAgregar = scanner.nextInt();
                    lista.agregar(numeroAgregar);
                    break;
                case 2:
                    System.out.print("Ingrese el numero a insertar: ");
                    int numeroInsertar = scanner.nextInt();
                    System.out.print("Ingrese la posicion de insercion: ");
                    int posicionInsertar = scanner.nextInt();
                    lista.insertar(numeroInsertar, posicionInsertar);
                    break;
                case 3:
                    System.out.print("Ingrese la posicion del numero a eliminar: ");
                    int posicionEliminar = scanner.nextInt();
                    lista.eliminar(posicionEliminar);
                    break;
                case 4:
                    lista.mostrar();
                    break;
                case 5:
                    System.out.println("=====GRACIAS POR USAR=====");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (opcion != 5);
    }
}
