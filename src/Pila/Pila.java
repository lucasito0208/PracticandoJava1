package Pila;

public class Pila<E> implements InterfazPila {

    int size;
    NodoPila<E> cima;

    public Pila(){
        //Al principio el tamaño de la pila será 0, y la cima estará vacía
        size = 0;
        cima = null;
    }

    @Override
    public void Push(Object elemento) {
        if(this.isEmpty()){
            NodoPila<E> pl = new NodoPila<E>();
            pl.setElemento((E) elemento);
            pl.setPrev(null);
            cima = pl;
            this.size = 1;
        }else{
            NodoPila<E> pl = new NodoPila<E>();
            pl.setElemento((E) elemento);
            pl.setPrev(cima);
            cima = pl;
            this.size = size + 1;
        }
    }


    @Override
    public void Pop() {
        if(this.isEmpty()){
            System.out.println("La pila está vacía");
        }else{
            cima = cima.getPrev();
            this.size--;
        }
    }

    @Override
    public int Size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        boolean resultado = (this.size == 0) ? true : false;
        /*if(this.size == 0){
            return true;
        }else{
            return false;
        }*/
        return resultado;
    }

    @Override
    public E Top() {
        //Objeto vacío
        //Me devuelve el elemento que se encuentra en la cima de la pila
        E elemento;
        if(this.isEmpty()){
            elemento = null;
            System.out.println("La pila está vacía");
        }else{
            //Me devuelve el elemento que se encuentra en la cima de la pila
            elemento = cima.getElemento();
        }
        return elemento;
    }
}
