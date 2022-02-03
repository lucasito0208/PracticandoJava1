package Matrices;

public class Intercambio {

    public static void main(String[] args) {

        final int TAMANIO=10;
        int lista[]=new int [TAMANIO];
        rellenarArray(lista);

        String lista_String[]={"americano", "Zagal", "pedro", "Tocado", "coz"};

        System.out.println("Array de números sin ordenar:");
        imprimirArray(lista);

        //ordenamos el array
        intercambio(lista);

        System.out.println("Array de números ordenado:");
        imprimirArray(lista);

        System.out.println("Array de String sin ordenar:");
        imprimirArray(lista_String);

        //ordenamos el array
        intercambioPalabras(lista_String);

        System.out.println("Array de String ordenado:");
        imprimirArray(lista_String);

        //Burbuja
        burbuja(lista);
        burbujaString(lista_String);

        imprimirArray(lista);
        imprimirArray(lista_String);

    }

    public static void rellenarArray(int[] lista){
        for(int i = 0; i < lista.length; i++){
            lista[i] = numAlea();
        }
    }

    public static int numAlea(){
        int num = ((int)Math.floor(Math.random() * 1000));
        return num;
    }


    public static void intercambio(int[] array){
        for(int i = 0; i < array.length-1; i++){
            for(int j = i + 1; j < array.length; j++){
                if(array[i] > array[j]) {
                    int aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }
        }
    }

    public static void intercambioPalabras(String[] array){
        for(int i = 0; i < array.length-1; i++){
            for(int j = i + 1; j < array.length; j++){
                if(array[i].compareToIgnoreCase(array[j])>0) {
                    String aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }
        }
    }

    public static void imprimirArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    public static void imprimirArray (String[] lista){
        for(int i=0;i<lista.length;i++){
            System.out.println(lista[i]);
        }
    }

    //BURBUJA

    public static void burbuja (int lista[]){
        int cuentaintercambios=0;
        //Usamos un bucle anidado, saldra cuando este ordenado el array
        for (boolean ordenado=false;!ordenado;){
            for (int i=0;i<lista.length-1;i++){
                if (lista[i]>lista[i+1]){
                    //Intercambiamos valores
                    int variableauxiliar=lista[i];
                    lista[i]=lista[i+1];
                    lista[i+1]=variableauxiliar;
                    //indicamos que hay un cambio
                    cuentaintercambios++;
                }
            }
            //Si no hay intercambios, es que esta ordenado.
            if (cuentaintercambios==0){
                ordenado=true;
            }
            //Inicializamos la variable de nuevo para que empiece a contar de nuevo
            cuentaintercambios=0;
        }
    }

    public static void burbujaString(String lista[]){
        int cambios = 0;

        for(boolean ordenado = false; !ordenado;){
            for(int i = 0; i < lista.length-1; i++){
                if(lista[i].compareToIgnoreCase(lista[i + 1])>0){
                    String aux = lista[i];
                    lista[i] = lista[i+1];
                    lista[i+1] = aux;
                    cambios++;
                }
                if(cambios == 0){
                    ordenado = true;
                }
                cambios = 0;
            }
        }
    }

    //QUICK SORT

    public static void quicksort (int lista1[], int izq, int der){
        int i=izq;
        int j=der;
        int pivote=lista1[(i+j)/2];
        do {
            while (lista1[i]<pivote){
                i++;
            }
            while (lista1[j]>pivote){
                j--;
            }
            if (i<=j){
                int aux=lista1[i];
                lista1[i]=lista1[j];
                lista1[j]=aux;
                i++;
                j--;
            }
        }while(i<=j);
        if (izq<j){
            quicksort(lista1, izq, j);
        }
        if (i<der){
            quicksort(lista1, i, der);
        }
    }
}
