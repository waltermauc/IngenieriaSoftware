/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.Controlador;

import ec.ups.edu.Modelo.Usuario;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author 59396
 */
public class ControladorUsuario {

    private Conexion c;

    public ControladorUsuario() {
        c = new Conexion();

    }

    public String crearUsuario(Usuario usuario) {
        String res = "";
        String sql = "INSERT INTO `proyecto_final`.`usuario`"
                + "(`USUARIO_ID`,"
                + "`USUARIO_NAMEUSER`,"
                + "`USUARIO_PASSWORD`,"
                + "`USUARIO_ROL`,"
                + "`USUARIO_ESTADO`,"
                + "`USUARIO_PERSONA_ID`)"
                + "VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement consulta = c.conectado().prepareStatement(sql);
            consulta.setInt(1, usuario.getCodigo());
            consulta.setString(2, usuario.getNombreUsuario());
            consulta.setString(3, usuario.getContrasenia());
            consulta.setString(4, usuario.getRol());
            consulta.setString(5, usuario.getEstado());
            consulta.setString(6, usuario.getPersona().getCedula());
            consulta.executeUpdate();

            res = "USUARIO CREADO";
        } catch (Exception e) {

        }
        return res;
    }

    public String cambiarEstado(Usuario usaurio, int codigo) {
        String res = " ";
        String sql = "UPDATE USUARIO"
                + " SET `usuario`.`USUARIO_ESTADO` = " + usaurio.getEstado() + " ' " + ","
                + "WHERE codigo =" + " ' " + codigo + " ' ";
        try {

            PreparedStatement ps;
            ps = c.conectado().prepareStatement(sql);
            ps.executeUpdate();
            res = "USUARIO ACTUALIZADO";

        } catch (Exception ex) {

            c.desconectar();
            res = "ERROR";
        }

        return res;

    }

    public int obtenerCodigo() {
        int n = 0;
        String sql = "select max(USUARIO_ID) as Codigo from usuario;";
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

    public String getMD5(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes());
            BigInteger number = new BigInteger(1, messageDigest);
            String hashtext = number.toString(16);

            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
