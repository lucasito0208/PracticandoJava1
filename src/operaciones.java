import java.util.Scanner;

public class operaciones {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        boolean comprueba = false;
        do{
            System.out.println("Introduce un número: ");
            n = sc.nextInt();
            double aux = (double) 2 % n;
            System.out.println(aux);
            comprueba = true;
        }while(comprueba);


    }
}
