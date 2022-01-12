import java.util.Locale;
import java.util.Scanner;

public class DNI {

    public static boolean verificarDNI(String dni){
        String letra;
        int numero, posicion;
        String letras [] = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        boolean correcto = false;

        letra = dni.substring(8, 9);
        numero = Integer.parseInt(dni.substring(0, 8));

        posicion = numero % 23;

        if(letra.toUpperCase().equals(letras[posicion])){
            correcto = true;
        }

        return correcto;

    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String dni;
        boolean correcto;

        do{
            System.out.println("Introduzca su DNI: ");
            dni = sc.nextLine();

        }while(!(dni.length() == 9));

        correcto = verificarDNI(dni);

        if(correcto){
            System.out.println("El DNI es correcto");
        }else{
            System.out.println("El DNI es falsete...");
        }
    }
}
