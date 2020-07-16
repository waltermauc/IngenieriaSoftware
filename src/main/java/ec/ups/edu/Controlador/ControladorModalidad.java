/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.Controlador;

/**
 *
 * @author rayner
 */
public class ControladorModalidad {
    int []numeros = {1,2,3,4,5,6,7,8,9,0};
     String [] letras = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
     
    
    public String crearModalidadCarrera (int codigoModalida,String modalida){
        String  resultadoCrearModalidad = "";
        if (numeros.equals(codigoModalida)){
            resultadoCrearModalidad = " creado correctamente";
        }else if (letras.equals(codigoModalida)){
            resultadoCrearModalidad = "Solo numeros";
            
        }else if  (modalida.equals("Diurna")|| modalida.endsWith("Vespertina")){
            resultadoCrearModalidad = "creado correctamente";
        }
        else if  (!modalida.equals("Diurna")|| modalida.endsWith("Vespertina")){
            resultadoCrearModalidad = "modalidad no creada, ingrese solo letras";
        }
        return resultadoCrearModalidad;
    }
    public String editarModalidadCarrera (String modalida){
        String resultadoEditarModalidad = "";
        if (modalida.equals("Diurna")){
            resultadoEditarModalidad = "Ingrese una nueva modalidad";
        }else {
            resultadoEditarModalidad = "Modalidad modificada correctamente";
        }
        return resultadoEditarModalidad;
    }
    public String eliminarModalidadCarrera (String modalida){
        
        String resultadoEliminarModalida = "";
        if (modalida.equals("Diurna")){
            resultadoEliminarModalida = "Eliminar modalidad";
        }else {
            resultadoEliminarModalida = "No existe esta modalidad";
        }
        return resultadoEliminarModalida;
    }
    public String listarModalidadCarrera (String modalida){
        String resultadoListarModalidad = "";
        if (modalida.equals("Vespertina")){
            resultadoListarModalidad = "mostrar datos modalidad";
            
        }else {
            resultadoListarModalidad = "no existe esa modalidad";
        }
        return resultadoListarModalidad;
    }
}
