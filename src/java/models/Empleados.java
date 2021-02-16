package models;

public class Empleados {

    private String apellido;
    private String oficio;
    private int salario;
    private int iddepartamento;
    private int idEmpleado;

    public Empleados(int id, String ape, String ofi, int sal, int deptno) {
        this.idEmpleado = id;
        this.apellido = ape;
        this.oficio = ofi;
        this.salario = sal;
        this.iddepartamento = deptno;

    }

    public int getIddepartamento() {
        return iddepartamento;
    }

    public void setIddepartamento(int iddepartamento) {
        this.iddepartamento = iddepartamento;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Empleados() {

    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getOficio() {
        return oficio;
    }

    public void setOficio(String oficio) {
        this.oficio = oficio;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

}
