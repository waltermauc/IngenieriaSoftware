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
public class ControladorAsignatura {
    int []numeros = {1,2,3,4,5,6,7,8,9,0};
    String [] letras = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
       
    
     public String crearAsignatura (String descripcionAsignatura, int costo,  int nivelAsignatura){
        String resultadoCrearAsignatura = "";
        if (descripcionAsignatura.equals(letras))
        {
            resultadoCrearAsignatura = "Creada correctamente";
            
        }else if (descripcionAsignatura.equals(numeros)) {
            resultadoCrearAsignatura = "Ingrese solo letras";
            
        }else if (numeros.equals(costo)){
            resultadoCrearAsignatura = "Creada correctamente";
        }
        else if (letras.equals(costo)){
            resultadoCrearAsignatura = "ingrese solo numeros";
        }  
        else if (numeros.equals(nivelAsignatura)) 
        {
            resultadoCrearAsignatura = "Creada correctamente";
        }  
        else if (letras.equals(nivelAsignatura))
        {
           resultadoCrearAsignatura = "Ingrese solo numeros"; 
        }  
       
        return resultadoCrearAsignatura;
    }
    public String editarAsignatura (String descripcionAsignatura, int costo ){
       
         String resultadoEditaaAsignatura = "";
        if (descripcionAsignatura.equals(letras))
        {
            resultadoEditaaAsignatura = "Creada correctamente";
            
        }else if (descripcionAsignatura.equals(numeros)) {
            resultadoEditaaAsignatura = "Ingrese solo letras";
            
        }else if (numeros.equals(costo)){
            resultadoEditaaAsignatura = "Creada correctamente";
        }
        else {
            resultadoEditaaAsignatura = "ingrese solo numeros";
        }  
       
        return resultadoEditaaAsignatura;
       
    }
    public String eliminarAsignatura (String descripcionAsignatura){
        String eliminarAsignatura = "";
        if (descripcionAsignatura.equals("matematicas")){
            eliminarAsignatura = "asignatura eliminada";
        }else {
            eliminarAsignatura = "No existe asignatura con ese nombre";
            
        }
        return eliminarAsignatura;
    }
    public String listarAsignatura ( String descripcionAsignatura){
        String listarAsignatura = "";
        if (descripcionAsignatura.equals("Lengua")){
            listarAsignatura = "mostrar datos de la asignatura";
        }else {
            listarAsignatura = "No existe asignatura con ese nombre";
        }
        return listarAsignatura;
    }
}
