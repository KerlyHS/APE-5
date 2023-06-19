/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectolistaenlazada;

/**
 *
 * @author Usuario_PC
 */
public class ListaEnlazada {

    private Nodo cabeza;

    public ListaEnlazada() {
        this.cabeza = null;
    }

    public void agregar(int valor) {
        Nodo nuevoNodo = new Nodo(valor);

        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo nodoActual = cabeza;
            while (nodoActual.getSiguiente() != null) {
                nodoActual = nodoActual.getSiguiente();
            }
            nodoActual.setSiguiente(nuevoNodo);
        }
    }

    public void editar(int posicion, int nuevoValor) {
        Nodo nodoActual = cabeza;
        int indice = 0;
        while (nodoActual != null && indice < posicion) {
            nodoActual = nodoActual.getSiguiente();
            indice++;
        }
        if (nodoActual != null) {
            nodoActual.setValor(nuevoValor);
        } else {
            System.out.println("La posición especificada no existe en la lista.");
        }
    }

    public void eliminar(int valor) {
        if (cabeza == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        if (cabeza.getValor() == valor) {
            cabeza = cabeza.getSiguiente();
            return;
        }

        Nodo nodoActual = cabeza;
        while (nodoActual.getSiguiente() != null) {
            if (nodoActual.getSiguiente().getValor() == valor) {
                nodoActual.setSiguiente(nodoActual.getSiguiente().getSiguiente());
                return;
            }
            nodoActual = nodoActual.getSiguiente();
        }

        System.out.println("El valor especificado no existe en la lista.");
    }

    public void imprimirLista() {
        Nodo nodoActual = cabeza;
        while (nodoActual != null) {
            System.out.print(nodoActual.getValor() + " ");
            nodoActual = nodoActual.getSiguiente();
        }
        System.out.println();
    }
}
