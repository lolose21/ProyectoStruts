package models;

public class Enfermos {

    private int inscripcion;
    private String apellido;
    private String direccion;
    private int nss;

    public Enfermos() {
    }

    public Enfermos(int ins, String ape, String dir, int nss) {

        this.inscripcion = ins;
        this.apellido = ape;
        this.direccion = dir;
        this.nss = nss;
    }
    //<editor-fold defaultstate="collapsed" desc="setter and setter">

    public int getInscripcion() {
        return inscripcion;
    }

    public void setInscripcion(int inscripcion) {
        this.inscripcion = inscripcion;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNss() {
        return nss;
    }

    public void setNss(int nss) {
        this.nss = nss;
    }
//</editor-fold>

}
