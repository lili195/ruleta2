package com.uptc.prg3.roulette.server.circularList;

import java.util.Comparator;

// simplemente enlazada
public class SimpleCirularList <T> {
    private Node<T> any;
    private final Comparator<T> comparator;

    public SimpleCirularList() {
        this.any = null;
        this.comparator = null;
    }

    public SimpleCirularList(Comparator<T> comparator) {
        this.any = null;
        this.comparator = comparator;
    }

    public Node<T> getAny() {
        return this.any;
    }

    public boolean isEmpty() {
        return this.any == null;
    }
    /**
     * Complejidad: 
     * O(3) -> cte
     * @param info -> elemento a insertar
     * @return 
     */
    public SimpleCirularList<T> insert(T info) {
        if (this.any == null) {
            this.any = new Node<>(info);
            this.any.next = this.any;
        } else {
            this.any.next = new Node<>(info, this.any.next);
        }
        return this;
    }

    public int size() {
        Node<T> current = this.any.next;
        int count = 0;
        if (current != null) {
            while (current != this.any) {
                current = current.next;
                count++;
            }
        }
        return count;
    }

    public void delete(T info) {
        if (this.any != null) {
            Node<T> node = this.any;
            Node<T> next = this.any.next;
            for (int i = 0; i < size(); i++) {
                if (this.comparator.compare(next.info, info) == 0) {
                    node.next = next.next;
                    break;
                } else {
                    node = node.next;
                    next = node.next;
                }
            }
        }
    }

    public T search(T info) {
        T isEmpty = null;
        if (this.any != null) {
            Node<T> current = this.any.next;
            while (current != this.any) {
                if (current.info == info) {
                    isEmpty = current.info;
                    break;
                }
                current = current.next;
            }
        }
        return isEmpty;
    }

    /**
     * pasar al siguiente elemento de la lista y retornar su valor
     * @return
     */
    public T nextAndGet() {
        this.any = this.any.next;
        return this.any.info;
    }

    /**
     * obtener el valor del elemento actual y avanzar
     * @return
     */

    public T getAndNext() {
        T aux = this.any.info;
        this.any = this.any.next;
        return aux;
    }

    /**
     * solo avanza en la lista
     */
    public void next() {
        this.any = this.any.next;
    }

    public T getInfo() {
        return this.any.info;
    }
}
