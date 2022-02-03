package Pila;

public interface InterfazPila <E>{

    /*
    * Push()->añade elemento a la cima
    * Pop()->extrae elemento de la cima
    * Size()->devuelve el tamaño de la pila
    * isEmpty()->pregunta si esta vacía
    * Top()->devuelve el elemento de la cima
    *  */

    //Implemento todos los metodos que voy a utilizar

    public void Push(E elemento);
    public void Pop();
    public int Size();
    public boolean isEmpty();
    public E Top();

}
