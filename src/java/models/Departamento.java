package models;

public class Departamento {

    private int numero;
    private String nombre;
    private String localidad;

    public Departamento() {
    }

    public Departamento(int num, String nom, String loc) {
        this.numero = num;
        this.nombre = nom;
        this.localidad = loc;
    }
//<editor-fold defaultstate="collapsed" desc="setter and getter">

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
//</editor-fold>

}
