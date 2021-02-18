package repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import models.Enfermos;
import oracle.jdbc.OracleDriver;

public class RepositoryEnfermo {

    private Connection getConnection() throws SQLException {
        DriverManager.registerDriver(new OracleDriver());
        String cadena = "jdbc:oracle:thin:@LOCALHOST:1521:XE";
        Connection cn
                = DriverManager.getConnection(cadena, "system", "oracle");
        return cn;
    }

    public void eliminarEnfermo(int inscripcion) throws SQLException {
        Connection cn = this.getConnection();
        String sql = "delete from enfermo where inscripcion=?";
        PreparedStatement pst = cn.prepareStatement(sql);
        pst.setInt(1, inscripcion);
        pst.executeUpdate();
        cn.close();
    }

    public ArrayList<Enfermos> getEnfermos() throws SQLException {
        Connection cn = this.getConnection();
        //consulta
        String sql = "select * from enfermo";
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        //almacenamos los  datos en arraylist
        ArrayList<Enfermos> lista = new ArrayList<>();
        //recorremos los datos
        while (rs.next()) {
            int inscripcion = rs.getInt("inscripcion");
            String ape = rs.getString("apellido");
            String dir = rs.getString("direccion");
            int nss = rs.getInt("nss");
            Enfermos enfermo = new Enfermos(inscripcion, ape, dir, nss);
            lista.add(enfermo);
        }
        cn.close();
        rs.close();
        return lista;
    }

    public void modificarEmfermo(String apellido, int inscripcion) throws SQLException {
        Connection cn = this.getConnection();
        String sql = "update enfermo set apellido=? where inscripcion =?";
        PreparedStatement pst = cn.prepareStatement(sql);
        pst.setString(1, apellido);
        pst.setInt(2, inscripcion);
        pst.executeUpdate();
        cn.close();
    }
}
