public class Recursividad3 {
    /**
     * Cómo recorrer un array con recursividad
     *
     */

    public static void main(String[] args){
        int[][] array = {
                {2,5,4},
                {65,2,87},
                {23,1,9}
        };

        recorriendoArray(array, 0, 0);
    }

    public static void recorriendoArray(int[][] array, int i, int j){

        System.out.print(array[i][j] + " ");

        if(i != array.length - 1 || j != array[i].length - 1){
            if(j == array[i].length - 1){
                //Salto de linea dentro del array
                i++;
                j = 0;
                System.out.println(" ");
            } else{
                //Salto de columna
                j++;
            }

            recorriendoArray(array, i, j);
        }
    }

}
