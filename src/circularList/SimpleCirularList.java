package circularList;
// simplemente enlazada
public class SimpleCirularList <T> {
    private Node<T> any;
    
    public SimpleCirularList() {

        this.any = null;
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

    public void delete(T info) {
        //TODO
    }

    public void search(T info) {
        //TODO
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
