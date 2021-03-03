package plugins;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import models.Enfermos;
import org.apache.struts.action.ActionServlet;
import org.apache.struts.action.PlugIn;
import org.apache.struts.config.ModuleConfig;
import repositories.RepositoryEnfermo;

public class PlugInEnfermo implements PlugIn {

    RepositoryEnfermo repo;

    //creamos constuctor
    public PlugInEnfermo() {
        this.repo = new RepositoryEnfermo();
    }

    @Override
    public void destroy() {

    }

    @Override
    public void init(ActionServlet servlet, ModuleConfig config) throws ServletException {

        try {
            ArrayList<Enfermos> enfermo
                    = this.repo.getEnfermos();
            servlet.getServletContext().setAttribute("LISTAENFERMO", enfermo);
        } catch (SQLException ex) {
            System.out.println("Error SQL" + ex);

        }

    }
}
