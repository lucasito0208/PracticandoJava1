public class Asteriscos5 {

    /*
    * PIRAMIDE INVERTIDA:
    *         (j<i)  (k<5-2*i)      * * * * *
    *   i = 0|      |k = 0            * * *
    *                k = 1              *
    *                k = 2
    *                k = 3
    *                k = 4
    *                k = 5
    *
    *
    * */

    public static void main(String[] args){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k < 5 - 2 * i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
