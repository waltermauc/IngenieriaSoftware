/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.Controlador;

import ec.ups.edu.Modelo.Horario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 59396
 */
public class ControladorHorario {

    private Conexion c;

    public ControladorHorario() {
    }

    public ControladorHorario(Conexion c) {
        this.c = c;
    }

    public String crearHorario(Horario horario) {
        String res = "";
        try {
            String sql = "INSERT INTO `proyecto_final`.`horario`"
                    + "(`HORARIO_ ID`,"
                    + "`HORARIO_DIA`,"
                    + "`HORARIO_HORAINICIO`,"
                    + "`HORARIO_HORAFIN`)"
                    + " VALUES (?,?,?,?)";

            PreparedStatement consulta = c.conectado().prepareStatement(sql);
            consulta.setInt(1, horario.getCodigo());
            consulta.setString(2, horario.getDiaSemana());
            consulta.setString(3, horario.getHoraInicio());
            consulta.setString(4, horario.getHoraFin());
            consulta.executeUpdate();
            res = " HORARIO CREADA";

        } catch (Exception e) {
            res = "ERROR";
            c.desconectar();
        }
        return res;
    }

    public List<Horario> listar() {
        List<Horario> listHorario = new ArrayList<>();
        String sql = "SELECT * FROM proyecto_final.horario;";
        try {
            PreparedStatement consulta = c.conectado().prepareStatement(sql);
            ResultSet resultado = consulta.executeQuery();
            while (resultado.next()) {
                Horario horario = new Horario();
                horario.setCodigo(resultado.getInt("HORARIO_ ID".trim()));
                horario.setDiaSemana(resultado.getString("HORARIO_DIA".trim()));
                horario.setHoraInicio(resultado.getString("HORARIO_HORAINICIO".trim()));
                horario.setHoraFin(resultado.getString("HORARIO_HORAFIN".trim()));
                listHorario.add(horario);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
            c.desconectar();

        }
        return listHorario;

    }
    

    public int obtenerCodigo() {
        int n = 0;
        String sql = "select max(`HORARIO_ ID`) as Codigo from `proyecto_final`.`horario`;";
        try {
            PreparedStatement consulta = c.conectado().prepareStatement(sql);
            ResultSet resultado = consulta.executeQuery();
            while (resultado.next()) {
                n = resultado.getInt("Codigo".trim());
            }

        } catch (Exception e) {

        }
        return n;
    }

}
