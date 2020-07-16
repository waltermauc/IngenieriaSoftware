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
public class ControladorNivelAsignatura {
    int []numeros = {1,2,3,4,5,6,7,8,9,0};
    String [] letras = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        
       
    public String crearNivelAsignatura (int codigoNivelAsignatura, String descripcionNivelAsignatura){
        String resultadoCrearNivel = "";
        if(numeros.equals(codigoNivelAsignatura))
        {
            resultadoCrearNivel = "Creado correctamnete";
            
        }else if (letras.equals(codigoNivelAsignatura)){
            resultadoCrearNivel = "Solo numeros";
        }
        else if (descripcionNivelAsignatura.equals(letras)){
            resultadoCrearNivel = "Creado correctamnete";
        }
        else if (numeros.equals(descripcionNivelAsignatura)){
            resultadoCrearNivel = "Ingrese en letras  la descripcion del nivel de la asignatura";
        }
        return resultadoCrearNivel;
    }
     public String editarNivelAsignatura (String descripcionNivelAsignatura){
        String resultadEditarNivel = "";
        
        if (descripcionNivelAsignatura.equals("quinto ciclo")){
            resultadEditarNivel = "Ingrese una nueva descripcion de la asignatura ";
        }
        else  {
            resultadEditarNivel = "Descripcion del nivel de asignatura creada correctamente";
        }
        return resultadEditarNivel;
    }
      public String EliminarNivelAsignatura (int codigoNivelAsignatura){
        String resultadoEliminarNivel = "";
        if(codigoNivelAsignatura ==10)
        {
            resultadoEliminarNivel = "codigo del nivel eliminado correctamnete";
            
        }else  {
            resultadoEliminarNivel = "Solo numeros";
        }
      
       
        return resultadoEliminarNivel;
    }
       public String listarNivelAsignatura (int codigoNivelAsignatura){
        String resultadolistarNivel = "";
        if(codigoNivelAsignatura==10)
        {
            resultadolistarNivel = "mostrar datos del nivel de las asignatura";
            
        }else {
            resultadolistarNivel = "Solo numeros";
        }
        
        return resultadolistarNivel;
    }
}
