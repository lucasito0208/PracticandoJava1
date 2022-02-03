package Vehiculo;

import java.time.LocalDate;

public class Validacion {

    public static boolean esPositivo(int num){
        /*String resultado = (num < 0) ? "Debe ser positivo" : "Numero correcto introducido";*/

        if(num > 0){
            return true;
        }else{
            return false;
        }
    }

    public static boolean fechaMayorHoy(LocalDate fecha){

        LocalDate hoy = LocalDate.now();

        //boolean fechita = (hoy.isBefore(fecha) ? true : false);
        if (!hoy.isBefore(fecha)) {
            return true;
        }else{
            return false;
        }
    }

    public static boolean validadDNI(String dni){

        if(dni.length() != 9){
            return false;
        }

        String dniNum = dni.substring(0, dni.length() - 1);
        char dniLetra = dni.charAt(dni.length()-1);

        int numDNI;

        try{
            numDNI = Integer.parseInt(dniNum);
        }catch(NumberFormatException e){
            return false;
        }

        if(!Character.isAlphabetic(dniLetra)){
            return false;
        }

        char letrasNIF[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        int indice = numDNI % 23;
        char dniLetraNueva = letrasNIF[indice];

        String dniNuevo = dniNum + dniLetraNueva;

        if(dni.equals(dniNuevo)){
            return true;
        }else{
            return false;
        }



    }
}
