public class Recursividad4 {

    /*
    * Invertir una palabra
    * */

    public static void main(String[] args){
        String palabra = "Hola";

        System.out.println(invertida(palabra, palabra.length()-1));
    }

    public static String invertida(String palabra, int longi){
        if(longi == 0){
            return palabra.charAt(longi) + " ";
        }else{
            return palabra.charAt(longi) + invertida(palabra, longi - 1);
        }
    }
}
