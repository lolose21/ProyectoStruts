package controllers;

import forms.Form05Persona;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Usuario
 */
public class Action05Persona extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        //aqui recuperamos los datos del formulario
        Form05Persona formulario = (Form05Persona) form;
        String nombre = formulario.getNombre();
        String email = formulario.getEmail();
        int edad = formulario.getEdad();
        String html = "<h1 style='color:blue'>su nombre es" + nombre + "</h1>";
        html += "<h2 style='color:red'>se email es :" + email + "</h2>";
        html += "<h2> su edad es " + edad + "</h2>";
        request.setAttribute("datospersona", html);
        return mapping.getInputForward();
    }
}
