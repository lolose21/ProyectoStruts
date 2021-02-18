package beans;

import java.sql.SQLException;
import java.util.ArrayList;
import models.Empleados;
import repositories.RepositoryEmpleados;

public class BeanEmpleados {

    RepositoryEmpleados repo;

    public BeanEmpleados() {
        this.repo = new RepositoryEmpleados();
    }

    public String getEmpleadosOficio(String oficio) throws SQLException {
        Empleados empleados
                = this.repo.getbuscarOficio(oficio);
        String html = "<table border='1'";

        html += "<thead>";
        html += "<tr>";
        html += "<th>APELLIDO</th>";
        html += "<th>OFICIO</th>";
        html += "<th>SALARIO</th>";
        html += "</tr>";
        html += "</thead>";
        html += "<tbody>";

        html += "<tr>";
        html += "<td>" + empleados.getApellido() + "</td>";
        html += "<td>" + empleados.getOficio() + "</td>";
        html += "<td>" + empleados.getSalario() + "</td>";
        html += "</tr>";
        html += "</tbody>";
        html += "</table>";
        return html;
    }

    public String getDetalles(int idempleado) throws SQLException {
        Empleados empleado = this.repo.buscarEmpleado(idempleado);

        String html = "<table border='1'";

        html += "<thead>";
        html += "<tr>";
        html += "<th>EmpleadoNU</th>";
        html += "<th>APELLIDO</th>";
        html += "<th>OFICIO</th>";
        html += "<th>SALARIO</th>";
        html += "<th>DEPTNO</th>";
        html += "</tr>";
        html += "</thead>";
        html += "<tbody>";

        html += "<tr>";
        html += "<td>" + empleado.getIdEmpleado() + "</td>";
        html += "<td>" + empleado.getApellido() + "</td>";
        html += "<td>" + empleado.getOficio() + "</td>";
        html += "<td>" + empleado.getSalario() + "</td>";
        html += "<td>" + empleado.getIddepartamento() + "</td>";

        html += "</tr>";
        html += "</tbody>";
        html += "</table>";
        return html;
    }

}
