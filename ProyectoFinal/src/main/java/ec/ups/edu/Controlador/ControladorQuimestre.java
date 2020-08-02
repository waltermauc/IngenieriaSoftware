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
        String sql = "INSERT INTO MATRICULA (QUIMESTRE_CODIGO,MATRICULA_PERIODO,MATRICULA_MODALIDAD,MATRICULA_ESPECIALIDAD,"
                + "MATRICULA_GRUPO,MATRICULA_ESTUDIANTE)"
                + "VALUES (?,?,?,?,?,?)";
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
            String sql = "SELECT * FROM GRUPO "
                    + "WHERE GRUPO_ID = " + "'" + codigo + "'";
            PreparedStatement consulta = c.conectado().prepareStatement(sql);
            
            ResultSet resultado = consulta.executeQuery();
            ControladorPeriodoLectivo cpl = new ControladorPeriodoLectivo ();
            ControladorModalidad cm = new ControladorModalidad();
            ControladorEspecialidad ce = new ControladorEspecialidad();

            while (resultado.next()) {

                quimestre.setCodigo(resultado.getInt("MATRICULA_ID".trim()));
                int codigoAsignatura = resultado.getInt("MATRICULA_PERIODO".trim());
                Matricula matricul = controlMatricul.buscarMatricula(codigoAsignatura, cpl, cm, ce);
                quimestre.setMatricula(matricul);
                quimestre.setPrimerParcial(resultado.getDouble("GRUPO_ID".trim()));
               quimestre.setSegundoParcial(resultado.getDouble("GRUPO_ID".trim()));
                quimestre.setTercerParcial(resultado.getDouble("GRUPO_ID".trim()));
                quimestre.setAprovechamiento(resultado.getDouble("GRUPO_ID".trim()));
                quimestre.setExamen(resultado.getDouble("GRUPO_ID".trim()));
                quimestre.setNotaFinal(resultado.getDouble("GRUPO_ID".trim()));
                quimestre.setEstado(resultado.getString("".trim()));
          }
        } catch (Exception e) {
            c.desconectar();
            return null;
        }
        return quimestre;
    }
    public String eliminarQuimestre(Quimestre q){
        return("Quimestre eliminado");
    }
    public List<Quimestre> listarQuimestre(){
       return (new ArrayList<>());
    }
    public String calcularNotaFinal(){
        return("Nota");
    }
    public String cambiarEstado(){
        return("Aprovado");
    }
    
}
