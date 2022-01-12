package Algoritmos;

import java.util.Scanner;

public class Ordenacion {

    public static void llenarVector(int[] v){
        for(int i = 0; i < v.length; i++){
            v[i] = (int) (Math.random() * 100);
        }
    }

    public static void mostrarVector(int[] v){
        for(int i = 0; i < v.length; i++){
            System.out.print(v[i]+" ");
        }
        System.out.println();
    }

    public static void insercionDirecta(int[] v){
        int aux, p, j;

        for(p = 1; p < v.length; p++){
            aux = v[p];
            j = p - 1; //Elemento anterior
            while((j>=0) && (aux < v[j])){
                v[j + 1] = v[j];
                j--;
            }
            v[j + 1] = aux;
            mostrarVector(v);
        }
    }



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[30];

        boolean salir = false;
        boolean llenado = false;

        do{
            System.out.println("1-Llenar el vector \n" +
                                "2-Mostrar el vector \n" +
                                "3-Inserción Directa \n" +
                                "4-Selección Directa \n" +
                                "5-Intercambio Directo 1 \n" +
                                "6-Intercambio Directo 2 \n" +
                                "7-Salir");
            int opcion = sc.nextInt();

            switch(opcion){
                case 1:
                        llenarVector(vector);
                        System.out.println("Vector llenado...");
                        llenado = true;
                        salir = false;
                    break;
                case 2:
                    if(llenado == false){
                        System.out.println("Debes llenar el vector primero...");
                        salir = false;
                        break;
                    }else{
                        System.out.println("El vector es este:");
                        mostrarVector(vector);
                        llenado = true;
                        salir = false;
                        break;
                    }
                case 3:
                    System.out.println("Metodo de ordenacion por inserción directa: ");
                    insercionDirecta(vector);
                    salir = false;
                    break;
                case 7:
                    System.out.println("Hasta pronto!");
                    salir = true;
            }
        }while(!salir);
    }



}
