package ColaDoble;

public class QueueDouble<E> implements Cola{

    ColaDobleNodo<E> head;
    ColaDobleNodo<E> tail;
    int size;

    public QueueDouble() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        boolean tamaño = (this.size == 0) ? true : false;
        return tamaño;
    }
    //Comentario
    @Override
    public E front() {
        E elemento;
        if (isEmpty()) {
            elemento = null;
            System.out.println("La cola está vacía...");

        }else{
            //Llamo al nodo cabecera, que me da el elemento...
            elemento = this.head.getElemento();
        }
        return elemento;
    }

    @Override
    public E tail() {
        E elemento;
        if(isEmpty()){
            elemento = null;
            System.out.println("La cola está vacía...");
        }else{
            elemento = this.tail.getElemento();

        }
        return elemento;
    }

    @Override
    public void Enqueue(Object elemento) {
        if (this.isEmpty()){
            ColaDobleNodo<E> newNode = new ColaDobleNodo<E>();
            newNode.setElemento((E) elemento);
            newNode.setNext(null);
            newNode.setPrev(null);
            this.head = newNode;
            this.tail = newNode;
            this.size = 1;
        }else{
            ColaDobleNodo<E> newNode = new ColaDobleNodo<E>();
            newNode.setElemento((E) elemento);
            newNode.setNext(null);
            newNode.setPrev(tail);
            this.tail.setNext(newNode); //Enlazamos doblemente por ambos lados
            tail = newNode;
            this.size ++;
        }
    }

    @Override
    public void Dequeue() {
        if(this.isEmpty()){
            System.out.println("La cola está vacía...");
        }else{
            head = head.getNext();
            this.size --;
        }

    }


}
