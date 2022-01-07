import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Traspuesta2 {

    public static void main(String[] args){

        File f = pedirNombreFichero();

        if(f != null){
            int[][] matriz = leerFichero(f);

            if(matriz!=null){
                if(esMatrizSimetrica(matriz)){
                    trasponerMatrizSimetrica(matriz);
                }else{
                    trasponerMatrizNoSimetrica(matriz);
                }

                File fGuardar = new File(f.getName());
                guardarMatrizFichero(fGuardar, matriz);
                System.out.println("Fichero guardado...");

            }else{
                System.out.println("Comprueba el fichero");
            }
        }else{
            System.out.println("El fichero no existe");
        }

    }

    public static File pedirNombreFichero(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el nombre del fichero: ");
        String nombre = sc.next();

        File f = new File(nombre);

        if(f.exists()){
            return f;
        }else{
            return null;
        }
    }

    public static int[][] leerFichero(File f){

        int[][] matriz = null;

        try{
            Scanner sn = new Scanner(f);

            int filas = 0, columnas = 0, contador = 0;
            //Mientras haya un siguiente número, sigo...
            while(sn.hasNextInt()){
                switch(contador){
                    case 0:
                        filas = sn.nextInt();
                        break;
                    case 1:
                        columnas = sn.nextInt();
                        matriz = new int[filas][columnas];
                        break;
                    default:
                        matriz[(contador - 2) / columnas][(contador - 2) % columnas] = sn.nextInt();
                }
                contador++;
            }



        }catch(FileNotFoundException e){
            Logger.getLogger(Traspuesta2.class.getName()).log(Level.SEVERE, null, e);
        }

        return matriz;

    }

    public static boolean esMatrizSimetrica(int[][] matriz){

        return matriz.length == matriz[0].length;
    }

    public static void trasponerMatrizSimetrica(int[][] matriz){
        boolean[][] cambios = new boolean[matriz.length][matriz[0].length];
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                if(!cambios[i][j]){
                    intercambio(matriz, i, j);
                    cambios[i][j] = true;
                    cambios[j][i] = true;
                }
            }
        }
    }

    public static void trasponerMatrizNoSimetrica(int[][] matriz){

        int[][] matrizTras = new int[matriz[0].length][matriz.length];
        //boolean[][] cambios = new boolean[matriz.length][matriz[0].length];
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                intercambio(matriz, matrizTras, i, j);
            }
        }
        matriz = matrizTras;
    }

    public static void intercambio(int[][] matriz, int i, int j){
        int aux = matriz[i][j];
        matriz[i][j] = matriz[j][i];
        matriz[j][i] = aux;
    }

    public static void intercambio(int[][] matriz, int[][] matrizT, int i, int j){
        matriz[i][j] = matrizT[j][i];
    }

    public static void guardarMatrizFichero(File f, int[][] matriz) {

        try{
            PrintWriter pw = new PrintWriter(f);
            pw.print(matriz.length + " ");
            pw.print(matriz[0].length+" ");

            for(int i = 0; i < matriz.length; i++){
                for(int j = 0; j < matriz[0].length; j++){
                    pw.print(matriz[i][j]+" ");
                }
            }
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
