/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectolistaenlazada;

import java.util.Scanner;

/**
 *
 * @author Usuario_PC
 */
public class MenuLista {

    private ListaEnlazada lista;
    private Scanner leer;

    public MenuLista(ListaEnlazada lista, Scanner scanner) {
        this.lista = lista;
        this.leer = scanner;
    }

    public void mostrarMenu() {
        boolean continuar = true;
        while (continuar) {
            System.out.println("=== Menu de Lista Enlazada ===");
            System.out.println("1. Agregar elementos");
            System.out.println("2. Editar elemento");
            System.out.println("3. Eliminar elemento");
            System.out.println("4. Imprimir lista");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opcion: ");
            int opcion = leer.nextInt();
            leer.nextLine(); // Limpiar el carácter de nueva línea

            switch (opcion) {
                case 1:
                    agregarElementos();
                    break;
                case 2:
                    editarElemento();
                    break;
                case 3:
                    eliminarElemento();
                    break;
                case 4:
                    imprimirLista();
                    break;
                case 5:
                    continuar = false;
                    break;
                default:
                    System.out.println("======GRACIAS POR USAR=======");
                    break;
            }
            System.out.println();
        }
        System.out.println("¡Hasta luego!");
    }

    private void agregarElementos() {
        System.out.print("Ingrese los valores a agregar separados por espacios: ");
        String valoresAgregar = leer.nextLine().trim();
        String[] valores = valoresAgregar.split(" ");
        for (String valor : valores) {
            lista.agregar(Integer.parseInt(valor));
        }
        System.out.println("Valores agregados correctamente.");
        System.out.println("Lista actual:");
        lista.imprimirLista();
    }

    private void editarElemento() {
        System.out.print("Ingrese la posición del valor a editar: ");
        int posicionEditar = leer.nextInt();
        System.out.print("Ingrese el nuevo valor: ");
        int nuevoValor = leer.nextInt();
        lista.editar(posicionEditar, nuevoValor);
        System.out.println("Valor editado correctamente.");
        System.out.println("Lista actual:");
        lista.imprimirLista();
    }

    private void eliminarElemento() {
        System.out.print("Ingrese el valor a eliminar: ");
        int valorEliminar = leer.nextInt();
        lista.eliminar(valorEliminar);
        System.out.println("Valor eliminado correctamente.");
        System.out.println("Lista actual:");
        lista.imprimirLista();
    }

    private void imprimirLista() {
        System.out.println("Lista actual:");
        lista.imprimirLista();
    }

}
