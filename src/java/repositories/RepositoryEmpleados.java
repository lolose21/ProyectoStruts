package repositories;

import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.naming.spi.DirStateFactory;
import models.Empleados;
import oracle.jdbc.OracleDriver;

public class RepositoryEmpleados {

    //HACEMOS LA CONEXION
    private Connection getConnection() throws SQLException {
        DriverManager.registerDriver(new OracleDriver());
        String cadena = "jdbc:oracle:thin:@LOCALHOST:1521:XE";
        Connection cn
                = DriverManager.getConnection(cadena, "system", "oracle");
        return cn;

    }

    public Empleados getbuscarOficio(String oficio) throws SQLException {
        Connection cn = this.getConnection();

        String sql = "select * from emp where lower(oficio) =lower(?) ";
        //pasamos un parametro pst
        PreparedStatement pst = cn.prepareStatement(sql);
        //recuperamos la consulta
        pst.setString(1, oficio);
        ResultSet rs = pst.executeQuery();
        //guardamos los datos y los recorremos
        if (rs.next()) {
            Empleados emp = new Empleados();
            emp.setApellido(rs.getString("apellido"));
            emp.setOficio(rs.getString("oficio"));
            emp.setSalario(rs.getInt("salario"));
            rs.close();
            cn.close();
            return emp;
        } else {
            rs.close();
            cn.close();
            return null;
        }
    }

    public ArrayList<Empleados> getEmpleados() throws SQLException {
        Connection cn = this.getConnection();
        String sql = "select * from emp";
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        ArrayList<Empleados> lista = new ArrayList<>();
        while (rs.next()) {
            int idempleado = rs.getInt("emp_no");
            String ape = rs.getString("apellido");
            String ofi = rs.getString("oficio");
            int sal = rs.getInt("salario");
            int deptno = rs.getInt("dept_no");
            Empleados empleado = new Empleados(idempleado, ape, ofi, sal, deptno);
            empleado.setIdEmpleado(idempleado);
            empleado.setApellido(ape);
            empleado.setOficio(ofi);
            empleado.setSalario(sal);
            empleado.setIddepartamento(deptno);
            lista.add(empleado);
        }
        rs.close();
        cn.close();
        return lista;
    }

    public ArrayList<String> getOficios() throws SQLException {
        Connection cn = this.getConnection();
        String sql = "select distinct oficio from emp";
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        ArrayList<String> oficios = new ArrayList<>();
        while (rs.next()) {
            String ofi = rs.getString("OFICIO");
            oficios.add(ofi);
        }
        rs.close();
        cn.close();
        return oficios;
    }

    public ArrayList<Empleados> getEmpleadosOficio(String oficio) throws SQLException {
        Connection cn = this.getConnection();
        String sql = "select * from emp where upper(oficio)=upper(?)";
        PreparedStatement pst = cn.prepareStatement(sql);
        pst.setString(1, oficio);
        ResultSet rs = pst.executeQuery();
        ArrayList<Empleados> lista = new ArrayList<>();
        while (rs.next()) {
            int id = rs.getInt("EMP_NO");
            String ape = rs.getString("APELLIDO");
            String ofi = rs.getString("OFICIO");
            int sal = rs.getInt("SALARIO");
            Empleados emp = new Empleados(id, ape, ofi, sal, sal);
            lista.add(emp);
        }
        rs.close();
        cn.close();
        return lista;
    }

    public Empleados buscarEmpleado(int idempleado) throws SQLException {
        Connection cn = this.getConnection();
        String sql = "select * from emp where emp_no= ?";
        PreparedStatement pst = cn.prepareStatement(sql);
        pst.setInt(1, idempleado);
        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            int id = rs.getInt("emp_no");
            String ape = rs.getString("apellido");
            String ofi = rs.getString("oficio");
            int sal = rs.getInt("salario");
            int deptno = rs.getInt("dept_no");
            Empleados empleado = new Empleados(id, ape, ofi, sal, deptno);
            rs.close();
            cn.close();
            return empleado;
        } else {
            rs.close();
        }
        cn.close();
        return null;
    }

    public void incrementarSalario(int idempleado) throws SQLException {
        Connection cn = this.getConnection();
        String sql = "update emp set salario = salario + 1 where emp_no = ?";
        PreparedStatement pst = cn.prepareStatement(sql);
        pst.setInt(1, idempleado);
        pst.executeUpdate();
        cn.close();
    }

    public ArrayList<Empleados> getEmpleadosDepastamentos(String[] datos) throws SQLException {
        Connection cn = this.getConnection();
        String deptnos = "";
        for (String d : datos) {
            deptnos += d + ",";
        }
        deptnos = deptnos.substring(0, deptnos.length() - 1);
        String sql = "select * from emp where dept_no in(" + deptnos + ")";
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        ArrayList<Empleados> lista = new ArrayList<>();
        while (rs.next()) {
            int id = rs.getInt("emp_no");
            String ape = rs.getString("apellido");
            String ofi = rs.getString("oficio");
            int sal = rs.getInt("salario");
            int deptno = rs.getInt("dept_no");
            Empleados emp = new Empleados(id, ape, ofi, sal, deptno);
            lista.add(emp);

        }
        rs.close();
        cn.close();
        return lista;
    }
}
