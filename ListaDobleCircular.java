/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication17;

/**
 *
 * @author Usuario_PC
 */
public class ListaDobleCircular {

    Nodo head;

    public ListaDobleCircular() {
        this.head = null;
    }

    public void agregar(int dato) {
        Nodo nuevoNodo = new Nodo(dato);

        if (head == null) {
            head = nuevoNodo;
            nuevoNodo.siguiente = head;
            nuevoNodo.anterior = head;
        } else {
            Nodo ultimo = head.anterior;
            nuevoNodo.siguiente = head;
            nuevoNodo.anterior = ultimo;
            head.anterior = nuevoNodo;
            ultimo.siguiente = nuevoNodo;
        }

        System.out.println("Se agregó el elemento " + dato + " a la lista.");
    }

    public void insertar(int dato, int posicion) {
        if (head == null) {
            System.out.println("La lista está vacía. No se puede insertar en la posición especificada.");
            return;
        }

        Nodo nuevoNodo = new Nodo(dato);
        Nodo actual = head;

        for (int i = 1; i < posicion; i++) {
            actual = actual.siguiente;
            if (actual == head) {
                System.out.println("La posición especificada está fuera de rango.");
                return;
            }
        }

        Nodo anterior = actual.anterior;
        nuevoNodo.siguiente = actual;
        nuevoNodo.anterior = anterior;
        actual.anterior = nuevoNodo;
        anterior.siguiente = nuevoNodo;

        System.out.println("Se insertó el elemento " + dato + " en la posición " + posicion + ".");
    }

    public void eliminar(int dato) {
        if (head == null) {
            System.out.println("La lista está vacía. No se puede eliminar ningún elemento.");
            return;
        }

        Nodo actual = head;

        do {
            if (actual.dato == dato) {
                Nodo siguiente = actual.siguiente;
                Nodo anterior = actual.anterior;
                siguiente.anterior = anterior;
                anterior.siguiente = siguiente;

                if (actual == head) {
                    head = siguiente;
                }

                System.out.println("Se eliminó el elemento " + dato + " de la lista.");
                return;
            }

            actual = actual.siguiente;
        } while (actual != head);

        System.out.println("El elemento " + dato + " no se encuentra en la lista.");
    }

    public void imprimir() {
        if (head == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        Nodo actual = head;

        do {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        } while (actual != head);

        System.out.println();
    }

    public void imprimirConexiones() {
        if (head == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        Nodo actual = head;

        do {
            System.out.println("Nodo " + actual.dato + " | Siguiente: " + actual.siguiente.dato + " | Anterior: " + actual.anterior.dato);
            actual = actual.siguiente;
        } while (actual != head);
    }
}
