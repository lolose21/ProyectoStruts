package controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;
import repositories.RepositoryEnfermo;

public class Action16ModificarEnfermos extends org.apache.struts.action.Action {

    RepositoryEnfermo repo;

    public Action16ModificarEnfermos() {
        this.repo = new RepositoryEnfermo();
    }

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        DynaActionForm formulario = (DynaActionForm) form;
        String dato = formulario.get("inscripcion").toString();
        String apellido = formulario.get("update").toString();
        int inscripcion = Integer.parseInt(dato);
        this.repo.modificarEmfermo(apellido, inscripcion);
        request.setAttribute("mensaje1", "<h1> enfermo" + " " + dato + " "
                + "modificado" + ", aora se llama  ," + apellido + "</h1>");

        return mapping.findForward("web16eliminarenfermos");
    }
}
