package controllers;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.Departamento;
import org.apache.catalina.startup.ClassLoaderFactory;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import repositories.RepositoryDepartamentos;

public class Action06Departamentos extends org.apache.struts.action.Action {

    RepositoryDepartamentos repo;
    HttpSession session;

    public void setSession(HttpSession session) {
        this.session = session;
    }

    public Action06Departamentos() {
        this.repo = new RepositoryDepartamentos();

    }

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        ArrayList< Departamento> departamentos = this.repo.getDepartamentos();

        String html = "<table border='1'";

        html += "<thead>";
        html += "<tr>";
        html += "<th>DEPTNO</th>";
        html += "<th>APELLIDO</th>";
        html += "<th>LOCALIDAD</th>";
        html += "</tr>";
        html += "</thead>";
        html += "<tbody>";
        for (Departamento dept : departamentos) {
            html += "<tr>";
            html += "<td>" + dept.getNumero() + "</td>";
            html += "<td>" + dept.getNombre() + "</td>";
            html += "<td>" + dept.getLocalidad() + "</td>";
            html += "</tr>";

        }

        html += "</tbody>";
        html += "</table>";

        request.setAttribute("tabladepartamentos", html);
        return mapping.getInputForward();
    }
}
