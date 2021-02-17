package plugins;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import models.Empleados;
import org.apache.struts.action.ActionServlet;
import org.apache.struts.action.PlugIn;
import org.apache.struts.config.ModuleConfig;
import repositories.RepositoryEmpleados;

public class PlugInOficios implements PlugIn {

    RepositoryEmpleados repo;

    public PlugInOficios() {
        this.repo = new RepositoryEmpleados();
    }

    @Override
    public void destroy() {
    }

    @Override
    public void init(ActionServlet servlet, ModuleConfig config) throws ServletException {
        try {
            ArrayList<String> oficios = this.repo.getOficios();
            servlet.getServletContext().setAttribute("LISTAOFICIOS", oficios);
        } catch (SQLException ex) {
            System.out.println("Error: " + ex);

        }
    }
}
