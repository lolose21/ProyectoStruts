package controllers;

import forms.Form20SeleccionMultipleOficios;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Empleados;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import repositories.RepositoryEmpleados;

public class Action20SeleccionMultipleOficios extends org.apache.struts.action.Action {

    RepositoryEmpleados repo;

    public Action20SeleccionMultipleOficios() {
        this.repo = new RepositoryEmpleados();
    }

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        Form20SeleccionMultipleOficios f
                = (Form20SeleccionMultipleOficios) form;
        String[] datos = f.getEmpleados();
        ArrayList<Empleados> empleado
                = this.repo.getEmpleadosDepastamentos(datos);
        request.setAttribute("LISTAEMPLEADOS", empleado);
        return mapping.findForward("web20seleccionmultipleoficios");
    }
}
