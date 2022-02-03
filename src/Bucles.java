import java.util.Scanner;

public class Bucles {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;

        do{
            System.out.println("Introduce un numero: ");
            num = sc.nextInt();
        }while(!(num > 0));

        /*for(int i = 1; i <= num; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i +" ");
            }
            System.out.println();
        }

        System.out.println("");

        for(int k = 1; k <= num; k++){
            for(int l = 1; l <= num; l++){
                System.out.print(k +" ");
            }
            System.out.println();
        }*/

        for(int m = num - 1; m >=1; m++){
            for(int n = 1; n <= m; n++){
                System.out.print(m + " ");
            }
            System.out.println(" ");
        }

    }
}
