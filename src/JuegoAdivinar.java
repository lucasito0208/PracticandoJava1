import java.util.Scanner;

public class JuegoAdivinar {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int NUM_INT_DEFAULT = 5;
        int NUM_MAX_DEFAULT = 10;

        boolean salir = false;
        int opcion;
        int numInt = NUM_INT_DEFAULT;
        int numMax = NUM_MAX_DEFAULT;



        do{
            System.out.println("1. Configurar \n"+
                                "2. Jugar \n"+
                                "3. Salir");
            System.out.println("Elige una opcion: ");
            opcion = sc.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Introduce el numero de intentos: ");
                    numInt = sc.nextInt();
                    System.out.println("Introduce el numero maximo de intentos: ");
                    numMax = sc.nextInt();
                    break;
                case 2:
                    int numOculto = (int) Math.floor(Math.random()*numMax+1);
                    int intentosJugador = 1;
                    int numJugador = 0;
                    boolean acertado = false;

                    while(intentosJugador <= numInt && !acertado){
                        System.out.println("Introduce un numero");
                        numJugador = sc.nextInt();

                        if(numJugador == numOculto){
                            System.out.println("Has ganador. Has necesitado "+intentosJugador+" intentos");
                            acertado = true;
                        }else{
                            if(numJugador > numOculto){
                                System.out.println("El numero oculto es menor");
                            }else{
                                System.out.println("El numero oculto es mayor");
                            }
                            System.out.println("Te quedan "+(numInt - intentosJugador)+" intentos.");
                            intentosJugador++;
                        }

                    }
                    break;
                case 3:
                    salir = true;
                    break;
                default:

                    break;
            }
        }while(!salir);
    }
}
