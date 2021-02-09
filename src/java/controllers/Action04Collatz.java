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

/**
 *
 * @author Usuario
 */
public class Action04Collatz extends org.apache.struts.action.Action {

    private static final String SUCCESS = "success";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //capturamos el formulario
        DynaActionForm formulario = (DynaActionForm) form;
        //Capturamos los datos que son enviados: numero
        String dato = formulario.getString("collatz").toString();
        //convertimos los datos a numeros
        int numero = Integer.parseInt(dato);

        //si es par , dividimos entre 2
        //impar multiplicamos * 3 + 1
        String html = "<table border='1'>";
        while (numero != 1) {
            html += "<tr>";
            if (numero % 2 == 0) {
                //PAR
                numero = numero / 2;

            } else {
                //impar
                numero = numero * 3 + 1;
            }
            html += "<td>" + numero + "</td>";
            //cerramos la fila
            html += "</tr>";
        }
        html += "</table>";
        request.setAttribute("collatz", html);
        return mapping.getInputForward();
    }

}
