package controllers;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Enfermos;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;
import repositories.RepositoryEnfermo;

public class Action16EliminarEnfermos extends org.apache.struts.action.Action {

    RepositoryEnfermo repo;

    public Action16EliminarEnfermos() {
        this.repo = new RepositoryEnfermo();
    }

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        DynaActionForm formulario = (DynaActionForm) form;
        String dato = formulario.get("inscripcion").
                toString();

        int inscripcion = Integer.parseInt(dato);

        this.repo.eliminarEnfermo(inscripcion);
        request.setAttribute("mensaje", "<h1> enfermo eliminado"
                + dato + "</h1>");
        ArrayList<Enfermos> enfermo = this.repo.getEnfermos();
        request.setAttribute("LISTAENFERMO", enfermo);
        return mapping.findForward("web16eliminarenfermos");
    }
}
