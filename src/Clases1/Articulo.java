package Clases1;
public class Articulo {
    String nombre;
    int cantidad;
    double precioUnidad;

    public Articulo(String nombre, int cantidad, double precioUnidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precioUnidad = precioUnidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(double precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    public boolean vendido(int num) {
        if(num <= cantidad) {
            cantidad -= num;
        }
        else {
            System.out.println("No hay suficiente cantidad de producto");
            return false;
        }

        return true;
    }

    public String getArticulo() {
        return "Nombre: " + nombre + ", Cantidad: " + cantidad + ", Pvp unidad: " + precioUnidad;
    }
}   