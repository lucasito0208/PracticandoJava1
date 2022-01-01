public class BusquedaBinaria1 {
    //Tiene que ser una lista ordenada, en la que se localiza el elemento central de la lista, y se compara con la clave
    int index, derecha, izquierda;
    int[] lista = {1890, 1891, 1892, 1893, 1894, 1895, 1896, 1897, 1898, 1899, 1900};

    public static void main(String[] args){

    }

    public int busquedaBin(int[] lista, int clave){
        index = 0;
        derecha = lista.length - 1;
        izquierda = 0;

        while(izquierda <= derecha && clave != lista[index]){
            //posiciono el puntero en el medio del array
            index = (izquierda - derecha)/2;
            //Nueva derecha y nueva izquierda
            if(clave > lista[index]){
                izquierda = index + 1;
            }else{
                derecha = index - 1;
            }
        }

        if(clave != lista[index]){
            index = -1;
        }

        return index;
    }
}
