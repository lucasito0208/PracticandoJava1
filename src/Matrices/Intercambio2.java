package Matrices;

import java.util.Scanner;

public class Intercambio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tamaño de la matriz: ");
        int tam = sc.nextInt();
        int[] numeros = new int[tam];

        for (int i=0, valor=1; i < numeros.length ; i++, valor+=2) {
            numeros[i] = valor;
            System.out.print(numeros[i]);
        }


    }

}
