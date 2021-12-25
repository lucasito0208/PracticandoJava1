import java.util.Scanner;

public class Recursividad2 {
    //Buscar un elemento de un array de forma recursiva.

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] array={3, 5, 8, 90, 54, -3};
        System.out.println("Número que deseas buscar: ");
        int buscado = sc.nextInt();
        System.out.println("El numero buscado se encuentra en la posición: " + buscar(array, buscado, 0));

    }

    public static int buscar(int[] array, int buscado, int index){
        if(index == array.length || array[index] == buscado){
            if(index == array.length){
                return -1;
            }else{
                return index;
            }
        }else{
            return buscar(array, buscado, index + 1);
        }
    }
}
