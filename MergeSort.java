import java.util.Random;

public class MergeSort {

    public static void main(String[] args){

        Random rand = new Random();
        int[] numbers = new int[10];

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = rand.nextInt(1000000);
        }

        System.out.println("Antes: ");
        printArray(numbers);

        mergeSort(numbers);

        System.out.println("\nDespués: ");
        printArray(numbers);

    }

    public static void mergeSort(int[] inputArray){
        int inputLength = inputArray.length;
        //Si el tamaño del array es menos de dos, no hay comparación necesaria ni posible. Está ordenado
        if(inputLength < 2){
            return;
        }
        //Dividimos el Array inicial en dos arrays más simples.
        int midIndex = inputLength/2;
        //Determino el tamaño de cada sub array
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputLength - midIndex];

        //Copio los elementos del array original en el sub array de la izquierda
        for(int i = 0; i < midIndex; i++){
            leftHalf[i] = inputArray[i];
        }

        for(int i = midIndex; i < inputLength; i++){
            //Quiero que comience a recorrer desde el nuevo 0.
            rightHalf[i - midIndex] = inputArray[i];
        }

        //Llamo recursivamente al método para que repita el proceso para ambos sub arrays
        mergeSort(leftHalf);
        mergeSort(rightHalf);

        //Llamo a merge
        merge(inputArray, leftHalf, rightHalf);


    }

    private static void merge(int[] inputArray, int[] leftHalf, int[] rightHalf){
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;
        //Necesitaré una variable para lada tramo del array, con ella compararé posiciones en el inicio,
        // el final y el dato ordenado del array.
        int i = 0, j = 0, k = 0;

        while(i < leftSize && j < rightSize){
            if(leftHalf[i] <= rightHalf[j]){
                inputArray[k] = leftHalf[i];
                i++;
            }else{
                inputArray[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while(i < leftSize){
            inputArray[k] = leftHalf[i];
            i++;
            k++;
        }

        while(j < rightSize){
            inputArray[k] = rightHalf[j];
            j++;
            k++;
        }


    }

    public static void printArray(int[] numbers){
        for(int i = 0; i < numbers.length; i++){
            //Imprime en cada iteración de numbers
            System.out.println(numbers[i]);
        }
    }


}
