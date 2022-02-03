import java.util.Scanner;

public class FirstLast {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numeros[] = {2, 6, 4, 3, 8, 8, 8, 8, 8, 8, 8, 8, 9, 4, 3};
        System.out.println("Qué número quieres encontrar?");
        int num = sc.nextInt();
        buscar(numeros, num);
    }

    public static void buscar(int arr[], int obj){

        int cont = 1;

        for(int i = 0; i <= arr.length-1; i++){
            if(arr[i] == obj){
                while(i+1 <= arr.length && arr[i+1] == obj){
                    i++;
                    cont++;
                }
                System.out.println(cont + " veces se repite el número "+obj);
            }
        }
    }
}
