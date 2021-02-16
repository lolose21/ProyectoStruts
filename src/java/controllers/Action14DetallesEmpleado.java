/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import beans.BeanEmpleados;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import repositories.RepositoryEmpleados;

public class Action14DetallesEmpleado extends org.apache.struts.action.Action {

    BeanEmpleados bean;
    RepositoryEmpleados repo;

    public Action14DetallesEmpleado() {
        this.bean = new BeanEmpleados();
        this.repo = new RepositoryEmpleados();
    }

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        String dato = request.getParameter("idempleado");
        int idempleado = Integer.parseInt(dato);
        this.repo.incrementarSalario(idempleado);
        String html = this.bean.getDetalles(idempleado);
        request.setAttribute("detallesempleado", html);
        request.setAttribute("incremento", idempleado);
        return mapping.findForward("webdetallesempleado");
    }
}
