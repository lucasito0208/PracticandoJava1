package EsctructurasDeDatos;

public interface InterPila<E> {
    /*
    * Push()->Añade un elemento a la cima
    * Pop()->Quitar elemento de la cima
    * Size()->devuelve el tamaño de la pila
    * isEmpty()->Pregunta si está vacía
    * Top()->Devuelve el elemento de la cima de la pila
    * */

    public void Push(E elemento);
    public void Pop();
    public int Size();
    public boolean isEmpty();
    public E Top();


}
