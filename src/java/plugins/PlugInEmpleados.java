package plugins;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import models.Empleados;
import org.apache.struts.action.ActionServlet;
import org.apache.struts.action.PlugIn;
import org.apache.struts.config.ModuleConfig;
import repositories.RepositoryEmpleados;

public class PlugInEmpleados implements PlugIn {

    RepositoryEmpleados repo;

    public PlugInEmpleados() {
        this.repo = new RepositoryEmpleados();
    }

    @Override
    public void destroy() {
    }

    @Override
    public void init(ActionServlet servlet, ModuleConfig config) throws ServletException {
        try {
            ArrayList<Empleados> empleados = this.repo.getEmpleados();
            servlet.getServletContext().setAttribute("LISTAEMPLEADOS", empleados);

        } catch (SQLException ex) {
            throw new ServletException("Error SQL: " + ex);
        }

    }
}
