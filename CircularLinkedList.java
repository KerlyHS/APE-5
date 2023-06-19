/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listacircular;

/**
 *
 * @author Usuario_PC
 * @param <T>
 */
public class CircularLinkedList<T> {
    
    private Node head;
    private Node tail;
    private int size;

    private static class Node {
        Integer data;
        Node next;

        Node(Integer data) {
            this.data = data;
            this.next = null;
        }
    }

    public CircularLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void agregar(Integer data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
        size++;
    }

    public void insertar(Integer data, int position) {
        if (position < 0 || position > size) {
            System.out.println("Posición inválida.");
            return;
        }

        Node newNode = new Node(data);
        if (position == 0) {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        } else if (position == size) {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        } else {
            Node current = head;
            for (int i = 0; i < position - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        size++;
    }

    public void eliminar(int position) {
        if (position < 0 || position >= size) {
            System.out.println("Posición inválida.");
            return;
        }

        if (position == 0) {
            head = head.next;
            tail.next = head;
        } else {
            Node current = head;
            for (int i = 0; i < position - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
            if (position == size - 1) {
                tail = current;
                tail.next = head;
            }
        }
        size--;
    }

    public void mostrar() {
    if (head == null) {
        System.out.println("La lista está vacía.");
        return;
    }

    Node current = head;
    int count = 0;
    do {
        
        System.out.println("Conexión: " + current.data+ " -> " + current.next.data);
        current = current.next;
        count++;
    } while (current != head);
}


    public int getSize() {
        return size;
    }

    

}
   
         