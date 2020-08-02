/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.Controlador;


import ec.ups.edu.Modelo.Matricula;
import ec.ups.edu.Modelo.Quimestre;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 59396
 */
public class ControladorQuimestre {
    
    private Conexion c;
    public ControladorQuimestre(Conexion c){
        this.c = c;
        
    }
    public ControladorQuimestre(){
        
    }
    public String crearQuimestre(Quimestre quimestere){
       String res = "";
        String sql = "INSERT INTO QUIMESTRE(QUIMESTRE_CODIGO,QUIMESTRE_MATRICULA,QUIMESTRE_PRIMERPARCIAL,QUIMESTRE_SEGUNDOARCIAL,"
                + "QUIMESTRE_TERCERPARCIAL,QUIMESTRE_APROVECHAMIENTO,QUIMESTRE_EXAMEN,QUIMESTRE_NOTAFINAL,QUIMESTRE_ESTADO)"
                + "VALUES (?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement consulta = c.conectado().prepareStatement(sql);
            consulta.setInt(1, quimestere.getCodigo());
            consulta.setInt(2, quimestere.getMatricula().getCodigo());
            consulta.setDouble(3, quimestere.getPrimerParcial());
            consulta.setDouble(4, quimestere.getSegundoParcial());
             consulta.setDouble(5, quimestere.getTercerParcial());
              consulta.setDouble(6, quimestere.getAprovechamiento());
               consulta.setDouble(7, quimestere.getExamen());
                consulta.setDouble(8, quimestere.getNotaFinal());
                 consulta.setString(9, quimestere.getEstado());
            
        } catch (Exception e) {

        }
        return res;
    }
    public Quimestre  buscarQuimestre(int codigo, ControladorMatricula controlMatricul){
       String res = "";
        Quimestre quimestre = new Quimestre();
        try {
            String sql = "SELECT * FROM QUIMESTRE "
                    + "WHERE QUIMESTRE_CODIGO = " + "'" + codigo + "'";
            PreparedStatement consulta = c.conectado().prepareStatement(sql);
            
            ResultSet resultado = consulta.executeQuery();
            ControladorPeriodoLectivo cpl = new ControladorPeriodoLectivo ();
            ControladorModalidad cm = new ControladorModalidad();
            ControladorEspecialidad ce = new ControladorEspecialidad();

            while (resultado.next()) {

                quimestre.setCodigo(resultado.getInt("QUIMESTRE_CODIGO".trim()));
                int codigoAsignatura = resultado.getInt("QUIMESTRE_MATRICULA".trim());
                Matricula matricul = controlMatricul.buscarMatricula(codigoAsignatura, cpl, cm, ce);
                quimestre.setMatricula(matricul);
                quimestre.setPrimerParcial(resultado.getDouble("QUIMESTRE_PRIMERPARCIAL".trim()));
               quimestre.setSegundoParcial(resultado.getDouble("QUIMESTRE_SEGUNDOARCIAL".trim()));
                quimestre.setTercerParcial(resultado.getDouble("QUIMESTRE_TERCERPARCIAL".trim()));
                quimestre.setAprovechamiento(resultado.getDouble("QUIMESTRE_APROVECHAMIENTO".trim()));
                quimestre.setExamen(resultado.getDouble("QUIMESTRE_EXAMEN".trim()));
                quimestre.setNotaFinal(resultado.getDouble("QUIMESTRE_NOTAFINAL".trim()));
                quimestre.setEstado(resultado.getString("QUIMESTRE_ESTADO".trim()));
          }
        } catch (Exception e) {
            c.desconectar();
            return null;
        }
        return quimestre;
    }
    public String eliminarQuimestre(Quimestre quimestre){
        String res = "";
        String sql = "DELETE FROM QUIMESTRE"
                + " WHERE QUIMESTRE_CODIGO = " + "'" + quimestre + "'";
        try {

            PreparedStatement ps = c.conectado().prepareStatement(sql);
            ps.executeUpdate();
            res = "QUIMESTRE ELIMINADO";
        } catch (Exception ex) {
            res = " ERROR ";
            c.desconectar();
        }

        return res;
    }
    public List<Quimestre> listarQuimestre(ControladorMatricula controlMatri){
           List<Quimestre> grupoList = new ArrayList<>();
        String sql = "SELECT QUIMESTRE_CODIGO,"
                + "QUIMESTRE_MATRICULA,"
                + "QUIMESTRE_PRIMERPARCIAL,"
                + "QUIMESTRE_SEGUNDOARCIAL,"
                 + "QUIMESTRE_TERCERPARCIAL, "
                 + "QUIMESTRE_APROVECHAMIENTO, "
                 + "QUIMESTRE_EXAMEN, "
                 + "QUIMESTRE_NOTAFINAL ,"
                 + "QUIMESTRE_ESTADO ,"
                + " FROM QUIMESTRE";
        try {
            PreparedStatement consulta = c.conectado().prepareStatement(sql);
            ResultSet resultado = consulta.executeQuery();
            while (resultado.next()) {
                 ControladorPeriodoLectivo cpl = new ControladorPeriodoLectivo();
                 ControladorModalidad cm = new ControladorModalidad();
                  ControladorEspecialidad ce = new ControladorEspecialidad(); 
                Quimestre quimestre = new Quimestre();
                quimestre.setCodigo(resultado.getInt("QUIMESTRE_CODIGO".trim()));
                int codigoMatricula = resultado.getInt("QUIMESTRE_MATRICULA".trim());
                Matricula matri = controlMatri.buscarMatricula(codigoMatricula, cpl, cm, ce);
                quimestre.setMatricula(matri);
                quimestre.setPrimerParcial(resultado.getDouble(("QUIMESTRE_PRIMERPARCIAL".trim())));
                quimestre.setSegundoParcial(resultado.getDouble("QUIMESTRE_SEGUNDOARCIAL".trim()));
                quimestre.setTercerParcial(resultado.getDouble("QUIMESTRE_TERCERPARCIAL".trim()));
                quimestre.setAprovechamiento(resultado.getDouble("QUIMESTRE_APROVECHAMIENTO".trim()));
                quimestre.setExamen(resultado.getDouble("QUIMESTRE_EXAMEN".trim()));
                quimestre.setNotaFinal(resultado.getDouble("QUIMESTRE_NOTAFINAL".trim()));
                quimestre.setEstado(resultado.getString("QUIMESTRE_ESTADO".trim()));
                grupoList.add(quimestre);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            c.desconectar();

        }
        return grupoList;
    

    }
    public String calcularNotaFinal(){
        return("Nota");
    }
    public String cambiarEstado(){
        return("Aprovado");
    }
    
}
