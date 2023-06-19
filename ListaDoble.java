/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listadoblementeenlazada;

/**
 *
 * @author Usuario_PC
 */
public class ListaDoble {

    private Nodo cabeza;

    public void agregarNodo(int dato) {
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.dato = dato;

        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
            nuevoNodo.anterior = actual;
        }
        System.out.println("Nodo agregado correctamente.");
    }

    public void insertarNodo(int dato, int posicion) {
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.dato = dato;

        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else if (posicion == 1) {
            nuevoNodo.siguiente = cabeza;
            cabeza.anterior = nuevoNodo;
            cabeza = nuevoNodo;
        } else {
            Nodo actual = cabeza;
            int contador = 1;

            while (contador < posicion - 1 && actual.siguiente != null) {
                actual = actual.siguiente;
                contador++;
            }

            if (actual.siguiente != null) {
                nuevoNodo.siguiente = actual.siguiente;
                actual.siguiente.anterior = nuevoNodo;
            }

            actual.siguiente = nuevoNodo;
            nuevoNodo.anterior = actual;
        }
        System.out.println("Nodo insertado correctamente.");
    }

    public void eliminarNodo(int dato) {
        if (cabeza == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        Nodo actual = cabeza;

        while (actual != null) {
            if (actual.dato == dato) {
                if (actual == cabeza) {
                    cabeza = actual.siguiente;
                    if (cabeza != null) {
                        cabeza.anterior = null;
                    }
                } else {
                    actual.anterior.siguiente = actual.siguiente;
                    if (actual.siguiente != null) {
                        actual.siguiente.anterior = actual.anterior;
                    }
                }
                System.out.println("Nodo eliminado correctamente.");
                return;
            }
            actual = actual.siguiente;
        }

        System.out.println("El nodo no se encuentra en la lista.");
    }

    public void imprimirLista() {
        Nodo actual = cabeza;
        if (actual == null) {
            System.out.println("La lista está vacía.");
            return;
        }
        System.out.println("Lista enlazada:");

       
        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        }
        System.out.println();

      
        System.out.println();
    }

}
