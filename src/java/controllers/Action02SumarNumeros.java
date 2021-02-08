/*

 */
package controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;

public class Action02SumarNumeros extends org.apache.struts.action.Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        //capturamos el formulario
        DynaActionForm formulario = (DynaActionForm) form;
        //capturamos los datos que son enviados numero 1 numero 2
        String dato1 = formulario.getString("numero1").toString();
        String dato2 = formulario.getString("numero2").toString();
        int numero1 = Integer.parseInt(dato1);
        int numero2 = Integer.parseInt(dato2);
        int suma = numero1 + numero2;
        String html = "<h1 style='color:blue'>";
        html += "la suma es " + suma;
        html += "</h1>";
        //almacenamos el valor para mandarlo a la vista
        request.setAttribute("suma", html);
        //devolvemos la vista que nos ha enviado la peticion
        return mapping.getInputForward();

    }
}
