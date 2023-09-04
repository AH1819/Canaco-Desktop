package Dao;

import ConexionBD.Conexion;
import Modelo.UserConsulta;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hitler
 */
public class UserConsultaDao {

    private static ResultSet Resultado;
    private Conexion conexion = Conexion.getInstance();

    public ArrayList<UserConsulta> MostrarConsultas() {
        ArrayList<UserConsulta> UC = new ArrayList<>();

        String sql = "SELECT * FROM obtener_consultas_todos();";

        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql);
            Resultado = comando.executeQuery();
            System.out.println(comando);
            System.out.println(Resultado);
            while (Resultado.next()) {
                UserConsulta uc = new UserConsulta();
                uc.setUsuario(Resultado.getString("usuario"));
                uc.setConsulta(Resultado.getString("consulta"));
                uc.setFecha(Resultado.getString("fecha"));
                uc.setHora(Resultado.getString("hora"));
                UC.add(uc);
            }
            System.out.println("Exito");
            conexion.conectar().close();
            comando.close();
        } catch (SQLException ex) {
            Logger.getLogger(UserConsultaDao.class.getName()).log(Level.SEVERE, null, ex.getMessage());
        }
        return UC;
    }

}
