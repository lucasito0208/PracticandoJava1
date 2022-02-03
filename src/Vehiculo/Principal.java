package Vehiculo;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        sn.useDelimiter("\n");
        sn.useLocale(Locale.US);
        Vehiculo v1 = null;
        boolean salir = false;
        String marca, matricula, descripcion, dni, nombre;
        int opcion, dia, mes, año, km;
        LocalDate fechaMatricula;
        double precio;

        do {
            try{
                System.out.println("1-Nuevo vehiculo \n" +
                                    "2-Ver Matrícula \n" +
                                    "3-Ver kilometraje \n" +
                                    "4-Actualizar kilómetros \n" +
                                    "5-Ver antigüedad \n" +
                                    "6-Mostrar propietario \n" +
                                    "7-Mostrar descripción \n" +
                                    "8-Mostrar precio \n" +
                                    "9-Salir");
                System.out.println("Introduce una opción: ");
                opcion = sn.nextInt();
                switch (opcion) {
                    case 1:

                            System.out.println("Introduce marca: ");
                            marca = sn.next();
                            System.out.println("Introduce matricula: ");
                            matricula = sn.next();
                            System.out.println("Introduce el número de kilometraje: ");
                            km = sn.nextInt();
                            if(!Validacion.esPositivo(km)){
                                throw new Exception("km debe ser un número positivo...");
                            }
                            System.out.println("Introduce el día de la fecha de matriculación: ");
                            dia = sn.nextInt();
                            System.out.println("Introduce el mes de la fecha de matriculación: ");
                            mes = sn.nextInt();
                            System.out.println("Introduce el año de la fecha de matriculación: ");
                            año = sn.nextInt();
                            fechaMatricula = LocalDate.of(año, mes, dia);
                            if(!Validacion.fechaMayorHoy(fechaMatricula)){
                                throw new Exception("La fecha debe ser anterior a hoy...");
                            }
                            System.out.println("Introduce la descripcion del vehiculo: ");
                            descripcion = sn.next();
                            System.out.println("Introduce el nombre del propietario: ");
                            nombre = sn.next();
                            System.out.println("Introduce el dni del propietario: ");
                            dni = sn.next();
                            if(!Validacion.validadDNI(dni)){
                                throw new Exception("DNI no valido");
                            }
                            System.out.println("Introduce el precio: ");
                            precio = sn.nextDouble();

                            v1 = new Vehiculo(marca, matricula, descripcion, nombre, dni, km, fechaMatricula, precio);
                            System.out.println("Vehiculo creado ;)");

                        break;
                    case 2:
                        if(v1 != null){
                            System.out.println("Matrícula: "+v1.getMatricula());
                        }else{
                            System.out.println("Debes dar de alta un vehiculo");
                        }
                        break;
                    case 3:
                        if(v1 != null){
                            System.out.println("Kilometraje: "+v1.getNumKM());
                        }else{
                            System.out.println("Debes dar de alta un vehiculo");
                        }
                        break;
                    case 4:

                        if(v1 != null){
                            System.out.println("Introduce el número de km: ");
                            km = sn.nextInt();

                            if(!Validacion.esPositivo(km)){
                                throw new Exception("km no es positivo");
                            }
                            v1.setNumKM(km);
                            System.out.println("km actualizados...");

                        }else{
                            System.out.println("Debes dar de alta un vehiculo");
                        }
                        break;
                    case 5:

                        if(v1 != null){
                            System.out.println("Antigüedad: "+v1.getAnios()+" años.");
                        }else{
                            System.out.println("Debes dar de alta un vehículo");
                        }
                        break;
                    case 6:
                        if(v1 != null){
                            System.out.println("Propietario: "+v1.getNombrePropie());
                        }else{
                            System.out.println("Debes dar de alta un vehiculo");
                        }
                        break;
                    case 7:
                        if(v1 != null){
                            System.out.println("Descripción: "+v1.getDescripcion());
                            System.out.println("Matrícula: "+v1.getMatricula());
                            System.out.println("KM: "+v1.getNumKM());
                        }else{
                            System.out.println("Debes dar de alta un vehiculo");
                        }
                        break;
                    case 8:
                        if(v1 != null){
                            System.out.println("Propietario: "+v1.getPrecio());
                        }else{
                            System.out.println("Debes dar de alta un vehiculo");
                        }
                        break;
                    case 9:
                        salir = true;
                        break;
                    default:
                        System.out.println("Elige una de las opciones disponibles...");
                        break;
                }
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        } while (!salir);

    }
}
