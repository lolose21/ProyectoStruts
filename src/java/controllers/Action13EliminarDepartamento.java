/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import beans.BeanDepartamentos;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;
import repositories.RepositoryDepartamentos;

public class Action13EliminarDepartamento extends org.apache.struts.action.Action {

    RepositoryDepartamentos repo;
    BeanDepartamentos bean;

    public Action13EliminarDepartamento() {
        this.repo = new RepositoryDepartamentos();
        this.bean = new BeanDepartamentos();
    }

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        DynaActionForm formulario = (DynaActionForm) form;
        //capturo el dato o numero de departamento q quiero borrar
        //el que escribo en el input.
        String dato = formulario.get("iddepartamento").toString();
        //convierto el dato a numero
        int iddepartamento = Integer.parseInt(dato);
        this.repo.eliminarDepartamento(iddepartamento);
        String html = this.bean.getTablaDepartamentos();
        request.setAttribute("tabladepartamentos", html);
        return mapping.findForward("web13eliminardepartamento");
    }

}
