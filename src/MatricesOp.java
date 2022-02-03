import java.util.Scanner;

public class MatricesOp {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int matriz[][] = new int[4][4];
        boolean salir = false, rellenado = false;
        int fila, columna, opcion;

        do{
            System.out.println("Elige una opción: \n" +
                    "1. Rellenar Matriz \n" +
                    "2. Mostrar la Matriz \n" +
                    "3. Sumar fila \n" +
                    "4. Sumar columna \n" +
                    "5. Sumar diagonal principal \n" +
                    "6. Sumar diagonal inversa \n" +
                    "7. Media de elementos \n" +
                    "8. Salir");
            System.out.println("Elige una opción: ");
            opcion = sc.nextInt();

            switch(opcion){
                case 1:

                    //Relleno la matriz
                    rellenarMatriz(sc, matriz);
                    rellenado = true;
                    break;

                case 2:

                    if(rellenado){
                        mostrarMatriz(matriz);

                    }else{
                        System.out.println("Debes rellenar la matriz primero...");
                    }
                    break;

                case 3:

                    if(rellenado){
                        //Mientras la fila NO sea mayor que 0 y menor que la longitud de la matriz, preguntamelo de nuevo.
                        do{
                            System.out.println("Elige una fila: ");
                            fila = sc.nextInt();
                        }while(!(fila >=0 && fila < matriz.length));

                        System.out.println("La suma es: " + sumarFila(matriz, fila));

                    }else{
                        System.out.println("Debes rellenar la matriz primero...");
                    }
                    break;

                case 4:

                    if(rellenado){

                        do{
                            System.out.println("Elige una columna: ");
                            columna = sc.nextInt();

                        }while(!(columna >= 0 && columna < matriz.length));

                        System.out.println("La suma es: "+sumarColumna(matriz, columna));

                    }else{
                        System.out.println("Debes rellenar la matriz primero...");
                    }
                    break;
                case 5:

                    if(rellenado){
                        System.out.println("La suma de la diagonal principal es: "+sumaDiagonal(matriz));
                    }else{
                        System.out.println("Debes rellenar la matriz primero...");
                    }
                    break;
                case 6:

                    if(rellenado){
                        System.out.println("La suma de la diagonal inversa es: "+sumaDiagonalInversa(matriz));
                    }else{
                        System.out.println("Debes rellenar la matriz primero...");
                    }
                    break;
                case 7:

                    if(rellenado){
                        System.out.println("La media de los valores de la matriz es: "+mediaElementos(matriz));
                    }else{
                        System.out.println("Debes rellenar la matriz primero...");
                    }
                    break;
                case 8:
                    salir = true;
                    break;
                default:
                    System.out.println("Tines que introducir un valor en el rango adecuado (entre 0 y 7).");

            }

        }while(!salir);

        System.out.println("FIN");
    }

    public static void mostrarMatriz(int[][] matriz){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public static void rellenarMatriz(Scanner sc, int[][] matriz){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                System.out.println("Escribe un número en la fila "+ i + " y en la columna " + j);
                matriz[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }

    public static int sumarFila(int[][] matriz, int fila){
        int suma = 0;
        for(int j = 0; j < matriz.length; j++){
            //solo varían las columnas, la fila es la que nosotros queramos sumar
            suma = suma + matriz[fila][j];
        }
        //Devuelvo suma que es la variable en la estoy depositando la suma de los elementos de la fila.
        return suma;
    }

    public static int sumarColumna(int[][] matriz, int columna){
        int suma = 0;
        for(int i = 0; i < matriz.length; i++){
            suma = suma + matriz[i][columna];
        }
        return suma;
    }

    public static int sumaDiagonal(int[][] matriz){
        //Tanto j como i van a ser iguales
        int suma = 0;

        for(int i = 0, j = 0; i < matriz.length; i++, j++){
            //Quiero que tanto las filas como las columnas se incrementen al unísono
            suma = suma + matriz[i][j];

            /*Alternativa
            for(int i = 0; i < matriz.length; i++){
                for(int j = 0; j < matriz.length; j++){
                    if(i == j){
                        suma = suma + matriz[i][j];
                    }
                }
            }*/

        }

        return suma;
    }

    public static int sumaDiagonalInversa(int[][] matriz){
        int suma = 0;

        for(int i = 0, j = matriz.length; i < matriz.length; i++, j--){
            suma = suma + matriz[i][j];
        }

        /*for(int i = 0; i < matriz.length; i++){
            for(int j = matriz[i].length; j >= 0; j--){
                suma = suma + matriz[i][j];
            }
        }*/

        return suma;
    }

    public static double mediaElementos(int[][] matriz){

        double suma = 0, media;

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                suma += matriz[i][j];
            }
        }
        media = suma / Math.pow(matriz.length, 2);

        return media;
    }


}
