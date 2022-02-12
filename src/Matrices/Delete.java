package Matrices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Delete {
    public static void main(String[] args){
        Integer[] arr = {13, 56, 4, 9, 20, 7, 10};
        int elementoBorrar = 9;

        System.out.println("Matriz original: "+Arrays.toString(arr));

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == elementoBorrar){
                arr = borrarElemento(arr, i);
                break;
            }
        }

        System.out.println("Matriz después de borrar el elemento: "+elementoBorrar + "--");
        for(int i = 0; i < arr.length; i++){
            System.out.println(" "+ arr[i]);
        }
    }

    public static Integer[] borrarElemento(Integer[] arr, int indice){
        List<Integer> listaTemporal = new ArrayList<Integer>(Arrays.asList(arr));
        listaTemporal.remove(indice);

        return listaTemporal.toArray(new Integer[0]);
    }

    
}
