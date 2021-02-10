package controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Departamento;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;
import repositories.RepositoryDepartamentos;

public class Action07BuscarDepartamentos extends org.apache.struts.action.Action {

    RepositoryDepartamentos repo;

    public Action07BuscarDepartamentos() {
        this.repo = new RepositoryDepartamentos();
    }

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        DynaActionForm formulario = (DynaActionForm) form;
        String dato = formulario.get("iddepartamento").toString();
        int iddepartamento = Integer.parseInt(dato);
        Departamento departamento = this.repo.buscarDepartamento(iddepartamento);
        if (departamento == null) {
            request.setAttribute("mensaje", "no existe el departamento " + dato);

        } else {
            String html = "<h1>Numero:" + departamento.getNumero() + "</h1>";
            html += "<h2>noMBRE" + departamento.getNombre() + "</h2>";
            html += "<h2>localidad" + departamento.getLocalidad() + "</h2>";
            request.setAttribute("departamento", html);

        }
        return mapping.findForward("buscardepartamentos");
    }
}
