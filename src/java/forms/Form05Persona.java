/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class Form05Persona extends org.apache.struts.action.ActionForm {

    private String nombre;
    private String email;
    private int edad;
    private int numero;
    private String localidad;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        //si error esta vacio , llegara hasta el action
        //si tiene contenido , funciona de cortafuegos y devuelve a la vista
        //errors.add("nombre" , new ActionMesseage("error.nombre.obligatorio"));
        if (getNombre() == null || getNombre().equals("")) {
            //obligatorio
            errors.add("nombre", new ActionMessage("error.nombre.obligatorio"));
        } else if (getEmail() == null || getEmail().equals("")) {
            //obligatorio
            errors.add("email", new ActionMessage("error.email.obligatorio"));
        } else if (getEdad() < 18) {
            //mayor de edad
            errors.add("edad", new ActionMessage("error.edad.rango"));

        }

        return errors;
    }

}
