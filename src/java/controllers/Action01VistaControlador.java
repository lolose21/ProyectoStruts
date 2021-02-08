/*

 */
package controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;

public class Action01VistaControlador extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        //la informacion viene con un formulario de tipo
        //dynaActionForm
        DynaActionForm formulario = (DynaActionForm) form;
        //este formulario viene una propiedad llamada respuesta
        String respuesta = formulario.getString("respuesta").toString();
        int valor = Integer.parseInt(respuesta);
        if (valor == 4) {
            //respuesta correcta
            return mapping.findForward("respuestacorrecta");
        } else {
            //respuesta incorecta
            //
            return mapping.getInputForward();
        }
    }
}
