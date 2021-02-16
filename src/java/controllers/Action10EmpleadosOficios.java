package controllers;

import beans.BeanEmpleados;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class Action10EmpleadosOficios extends org.apache.struts.action.Action {

    private final BeanEmpleados bean;

    public Action10EmpleadosOficios() {
        this.bean = new BeanEmpleados();
    }

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        String oficio = request.getParameter("oficio");
        String html = this.bean.getEmpleadosOficio(oficio);
        request.setAttribute("empleadosoficio", html);

        return mapping.findForward("webempleadosoficio");
    }
}
