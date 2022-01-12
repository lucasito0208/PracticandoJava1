import java.util.Arrays;

public class Traspuesta {

    public static void main(String[] args){

        int[][] matriz = {{123}, {456}, {789}};
        int[][] matrizT = new int[matriz[0].length][matriz.length];
        int[][] aux;

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matrizT[j][i] = matriz[i][j];
                System.out.print(matrizT[j][i]);
            }
            System.out.println();
        }

        //System.out.println(Arrays.toString(matrizT));
    }




}
