package EsctructurasDeDatos;

public class Pila<E> implements InterPila<E> {

    int size;
    NodoPila<E> cima;

    //Hago un constructor que se comporte como yo quiera
    //cuando cree una estructura nueva, son su comportamiento inicial
    public Pila(){
        size = 0;
        cima = null;
    }

    @Override
    public void Push(E elemento) {

    }

    @Override
    public void Pop() {

    }

    @Override
    public int Size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        if(this.size == 0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public E Top() {
        //Cuando llame a este método me tiene que devolver el elemento que está en la cima de la pila
        E elemento;
        if(this.isEmpty()){
            elemento = null;
            System.out.println("La pila está vacía...");
        }else{
            elemento = cima.getElemento();
        }
        return elemento;
    }
}
