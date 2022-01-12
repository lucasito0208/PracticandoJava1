import java.util.Arrays;

public class ArrayDelete {
    /*
    * How to delete element in array
    * */

    public static void main(String[] args){

        int a[] = new int[]{12, 45, 36, 76, 89};
        int index = 2;
        int b[] = new int[a.length - 1];

        for(int i = 0, j = 0; i < a.length - 1; i++){
            if(i != index) {
                b[j] = a[i];
                j++;
            }
        }

        System.out.println(Arrays.toString(a));

        System.out.println(Arrays.toString(b));

    }

}
