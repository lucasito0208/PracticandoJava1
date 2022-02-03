package ColaDoble;

/*
*
* size() -> devuelve el tamaño de la lista
* isEmpty() -> true si está vacía, false si no
* font() -> devuelve el primer elemento
* enqueue(E e) -> añadir a la cola
* dequeue() -> quitar de la cola
* tail() -> devuelve el último elemento
*
* */

public interface Cola<E> {

    int size();
    boolean isEmpty();
    E front();
    E tail();
    void Enqueue(E elemento);
    void Dequeue();

}
