package beans;

import java.sql.SQLException;
import java.util.ArrayList;
import models.Departamento;
import repositories.RepositoryDepartamentos;

public class BeanDepartamentos {

    RepositoryDepartamentos repo;

    public BeanDepartamentos() {
        this.repo = new RepositoryDepartamentos();
    }
    //esta clase se utiliza para dibujos estaticos, que no
    //van a realizar interaccion con el usuario
// hemos repetido varias veces la tabla departamentos
    // la llamada desde varios action

    public String getTablaDepartamentos() throws SQLException {
        ArrayList<Departamento> departamentos
                = this.repo.getDepartamentos();

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

        return html;
    }

    public String getDetallesDepartamento(int iddepartamento) throws SQLException {
        Departamento departamento
                = this.repo.buscarDepartamento(iddepartamento);
        String html = "<h1 style='color:blue'>Nombre: " + departamento.getNombre() + "</h1>";
        html += "<h1 style='color:blue'>Localidad: " + departamento.getLocalidad() + "</h1>";
        html += "<h2 style='color:green'> numero " + departamento.getNumero() + "</h2>";
        return html;
    }
}
