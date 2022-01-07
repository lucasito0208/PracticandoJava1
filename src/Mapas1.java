import java.util.HashMap;

public class Mapas1 {

    /*
    * Mapa es un conjunto de clave/valor conjunto
    * <String == valor, Integer == clave>
    * <nombre, id>
    * */

    public static void main(String[] args){

        HashMap<String, Integer> empIds = new HashMap<>();

        empIds.put("Lucas", 100);
        empIds.put("Gonzalo", 200);
        empIds.put("Lucia", 300);

        //Imprime mis valores con sus respectivas claves
        System.out.println(empIds);
        //Le paso un valor, y me devuelve su clave
        System.out.println(empIds.get("Lucas"));
        //Compruebo valor
        System.out.println(empIds.containsKey("jorge"));



    }
}
