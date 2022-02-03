package EsctructurasDeDatos;

public class NodoPila<E> {
    //necesitamos un puntero y un elemento
    //Esto funciona como una estructura recursiva, cuyo caso base sea el primer elemento

    E elemento;
    NodoPila<E> prev;

    public NodoPila(E elemento, NodoPila<E> prev) {
        this.elemento = elemento;
        this.prev = prev;
    }

    public NodoPila(){
        elemento = null;
        prev = null;
    }

    public E getElemento() {
        return elemento;
    }

    public void setElemento(E elemento) {
        this.elemento = elemento;
    }

    public NodoPila<E> getPrev() {
        return prev;
    }

    public void setPrev(NodoPila<E> prev) {
        this.prev = prev;
    }
}
