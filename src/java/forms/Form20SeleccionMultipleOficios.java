package forms;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class Form20SeleccionMultipleOficios extends org.apache.struts.action.ActionForm {

    private String[] empleados;

    public String[] getEmpleado() {
        return empleados;
    }

    public String[] getEmpleados() {
        return empleados;
    }

    public void setEmpleados(String[] empleados) {
        this.empleados = empleados;
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();

        return errors;
    }
}
