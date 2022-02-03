package Vehiculo;

import java.time.LocalDate;
import java.time.Period;

public class Vehiculo {

    private String marca, matricula, descripcion, nombrePropie, dniPropie;
    private int numKM;
    private LocalDate fechaMatri;
    private double precio;

    public Vehiculo(String marca, String matricula, String descripcion, String nombrePropie, String dniPropie, int numKM, LocalDate fechaMatri, double precio) {
        this.marca = marca;
        this.matricula = matricula;
        this.descripcion = descripcion;
        this.nombrePropie = nombrePropie;
        this.dniPropie = dniPropie;
        this.numKM = numKM;
        this.fechaMatri = fechaMatri;
        this.precio = precio;
    }

    public Vehiculo(){

    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", matricula='" + matricula + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", nombrePropie='" + nombrePropie + '\'' +
                ", dniPropie='" + dniPropie + '\'' +
                ", numKM=" + numKM +
                ", fechaMatri=" + fechaMatri +
                ", precio=" + precio +
                '}';
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombrePropie() {
        return nombrePropie;
    }

    public void setNombrePropie(String nombrePropie) {
        this.nombrePropie = nombrePropie;
    }

    public String getDniPropie() {
        return dniPropie;
    }

    public void setDniPropie(String dniPropie) {
        this.dniPropie = dniPropie;
    }

    public int getAnios(){
        LocalDate f1 = this.fechaMatri;
        LocalDate f2 = LocalDate.now();
        Period p = Period.between(f1, f2);
        return p.getYears();
    }

    public int getNumKM() {
        return numKM;
    }

    public void setNumKM(int numKM) {
        this.numKM = numKM;
    }

    public LocalDate getFechaMatri() {
        return fechaMatri;
    }

    public void setFechaMatri(LocalDate fechaMatri) {
        this.fechaMatri = fechaMatri;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
