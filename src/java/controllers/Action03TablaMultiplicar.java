/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;

public class Action03TablaMultiplicar extends org.apache.struts.action.Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        //capturamos el formulario
        DynaActionForm formulario = (DynaActionForm) form;
        //capturamos los datos que son enviados: numero
        String dato = formulario.get("numero").toString();
        //convertimos el dato a numero
        int numero = Integer.parseInt(dato);
        String html = "<table border='1'>";
        for (int i = 1; i <= 10; i++) {

            //devolvemos la vista que nos ha enviado la peticion
            html += "<tr>";
            html += "<td>" + numero + "</td>";
            html += "<td>" + "x" + "</td>";
            html += "<td>" + i + "</td>";
            html += "<td>" + "=" + "</td>";
            html += "<td>" + numero * i + "</td>";
            html += "</tr>";

            //almacenamos el valor para mandarlo a la vista
            request.setAttribute("numero", html);
            //devolvemos la vista que nos ha enviado la peticion

        }
        html += "</table>";
        return mapping.getInputForward();
    }
}
