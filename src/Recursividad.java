public class Recursividad {

    public static int funRec(int[] array, int index, int max){

        if(index != array.length){
            if(array[index] > max){
                max = funRec(array, index + 1, array[index]);
            }else{
                max = funRec(array, index + 1, max);
            }
        }

        return max;
    }

    public static int funRec2(int[] array, int index){

        int max = Integer.MIN_VALUE;

        if(index != array.length){

            max = Math.max(array[index], funRec2(array, index + 1));
        }

        return max;
    }


    public static void main(String[] args){

        int[] array = {1, 6, 8, -34, 21, 3};
        System.out.println("Número máximo es: "+ funRec(array, 3, array[0]));

    }


}


