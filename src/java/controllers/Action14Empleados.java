/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Empleados;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import repositories.RepositoryEmpleados;

public class Action14Empleados extends org.apache.struts.action.Action {

    RepositoryEmpleados repo;

    public Action14Empleados() {
        this.repo = new RepositoryEmpleados();
    }

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        ArrayList<Empleados> empleados
                = this.repo.getEmpleados();
        request.setAttribute("listaempleados", empleados);
        return mapping.findForward("webempleados");
    }
}
