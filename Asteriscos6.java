public class Asteriscos6 {

    public static void main(String[] args){
        int m = 1;
        int i, j, k, n = 1;
        int height = 3;
        int width = 4;
        int space = width * 5;

        for(i = 1; i <= height; i++){
            for(j = m; j <= width; j++){
                for(k = space; k >= j; k--){
                    System.out.print(" ");
                }
                for(n = 1; n <= j; n++){
                    System.out.print("* ");
                }
                System.out.println();
            }
            m = m + 2;
            width = width + 2;
        }

        for(j = 1; j <= 4; j++){
            for(k = space - 3; k >= 1; k--){
                System.out.print(" ");
            }
            for(n = 1; n <= 4; n++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
