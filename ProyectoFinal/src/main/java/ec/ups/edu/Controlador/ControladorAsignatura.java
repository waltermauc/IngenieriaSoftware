/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.Controlador;

import ec.ups.edu.Modelo.Asignatura;
import ec.ups.edu.Modelo.NivelAsignatura;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rayner
 */
public class ControladorAsignatura {

    private Conexion c;

    public ControladorAsignatura() {
        c = new Conexion();

    }

    int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
    String[] letras = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

    public String crearAsignatura(Asignatura asignatura, NivelAsignatura nivel) {

        String sql = "INSERT INTO NIVEL_ASIGNATURA(NIVELASIGNATURA_ID, NIVELASIGNATURA_DESCRIPCION) VALUES (?,?)";
        try {
            PreparedStatement consulta = c.conectado().prepareStatement(sql);
            consulta.setString(1, nivel.getDescripcionNivelAsignatura());
            if (consulta.executeUpdate() == 1) {
                String sqlEst = "INSERT INTO ASIGNATURA(ASIGNATURA_ID, ASIGNATURA_DESCRIPCION, COSTO_CREDITOS, ASIGNATURA_NIVELASIGNATURA) VALUES (?,?,?),?";
                PreparedStatement consultaEst = c.conectado().prepareStatement(sqlEst);
                consultaEst.setInt(1, asignatura.getCodigoAsignatura());
                consultaEst.setString(2, asignatura.getDescripcion());
                consultaEst.setInt(3, asignatura.getCostoCreditos());
                consultaEst.setObject(4, asignatura.getCodigoNivelAsignatura());
                consultaEst.executeUpdate();
            }
        } catch (Exception e) {
            c.desconectar();
        }
        return "Asignatura creada";

    }

    public String editarAsignatura(Asignatura asignatura, int codigo) {

        String sql = "UPDATE ASIGNATURA"
                + " SET ASIGNATURA_ID = " + " ' " + asignatura.getCodigoAsignatura() + " ' " + ","
                + "  ASIGNATURA_DESCRIPCION =" + " ' " + asignatura.getDescripcion() + " ' " + ","
                + "  COSTO_CREDITOS =  " + " ' " + asignatura.getCostoCreditos() + " ' " + ","
                + "  ASIGNATURA_NIVELASIGNATURA = " + " ' " + asignatura.getCodigoNivelAsignatura() + " ' " + ","
                + "WHERE codigo =" + " ' " + codigo + " ' ";
        try {

            PreparedStatement ps;
            ps = c.conectado().prepareStatement(sql);
            ps.executeUpdate();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        try {
            c.desconectar();
        } catch (Exception ex) {
            System.out.println("Error al momento de cerrar la coneccion :" + ex.getMessage());

        }
        return "Asignatura actualizada";

    }

    public String eliminarAsignatura(int codigo) {
        String sql = "DELETE FROM ASIGNATURA"
                + " WHERE ASIGNATURA_ID = " + "'" + codigo + "'";
        try {

            PreparedStatement ps = c.conectado().prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
            c.desconectar();
        }
        try {
            c.desconectar();
        } catch (Exception ex) {
            System.out.println("Error al cerrar la coneccion :" + ex.getMessage());
        }

        return "Asignatura eliminada";
    }

    public List<Asignatura> listarAsignatura() {
        List<Asignatura> asignaturaList = new ArrayList<>();
        String sql = "SELECT ASIGNATURA_ID,"
                + "ASIGNATURA_DESCRIPCION,"
                + "COSTO_CREDITOS, "
                + "ASIGNATURA_NIVELASIGNATURA,"
                + " FROM ASIGNATURA";
        //System.out.println(sql);
        try {
            PreparedStatement consulta = c.conectado().prepareStatement(sql);
            ResultSet resultado = consulta.executeQuery();

            while (resultado.next()) {
                // System.out.println(resultado.getString("CEDULA"));
                Asignatura asignature = new Asignatura();
                asignature.setCodigoAsignatura(resultado.getInt("ASIGNATURA_ID".trim()));
                asignature.setDescripcion(resultado.getString("ASIGNATURA_DESCRIPCION".trim()));
                asignature.setCostoCreditos(resultado.getInt("COSTO_CREDITOS".trim()));
                asignaturaList.add(asignature);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        try {
            c.desconectar();
        } catch (Exception ex) {
            System.out.println(" Error mientras se cerraba el puerto :" + ex.getMessage());
        }
        return asignaturaList;

    }
}
