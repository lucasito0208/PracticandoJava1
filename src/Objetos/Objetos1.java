package Objetos;

public class Objetos1 {

    private String titular;
    private double cantidad;

    public Objetos1(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public Objetos1(String titular) {
        this.titular = titular;
    }

    public void ingresar(double cantidad) {
        if(cantidad > 0){
            this.cantidad += cantidad;
        }
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void retirar(double cantidad){
        if(this.cantidad - cantidad < 0){
            this.cantidad = 0;
        }else{
            this.cantidad = this.cantidad - cantidad;
            //this.cantidad -= cantidad;
        }
    }


}
