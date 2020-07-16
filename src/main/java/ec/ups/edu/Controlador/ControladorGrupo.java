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
public class ControladorGrupo {
    
     int []numeros = {1,2,3,4,5,6,7,8,9,0};
     String [] letras = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        
    public  String crearGrupo(int codigoGrupo, String asignatura, int codigoEspacio, int codigoModalidad, String nombreDocente  ){
        String resultado = "";
      
       if (numeros.equals(codigoGrupo) ){
            resultado = "codigoCorrecto";
         }else if (letras.equals(codigoGrupo)){
             resultado = "el codigo debe tener solo numeros";
         }else if (asignatura.equals(letras)){
             resultado = "nombre asignatura correcto";
         }else if (asignatura.equals(numeros)){
             resultado = "ingrese solo letras para la asignatura";
         }
        else if (numeros.equals(codigoEspacio)){
            resultado = "codgioEspacio fisico ingresado correctamente";
             
         }
        else if (!numeros.equals(codigoEspacio)){
            resultado = "Ingrese solo numeros para el codigo del espacio fisico";
             
         }
        else if (numeros.equals(codigoModalidad)){
             resultado = "Codigo Modalidad ingreasado correctamente";
         }
        else if (!numeros.equals(codigoModalidad)){
             resultado = "Ingrese solo numeros para el codigo de la modalidad de la carrera";
         }
        else if (nombreDocente.equals(letras)) {
            resultado = "Nombre ingresado correctamente";
        }
        else if (!nombreDocente.equals(letras)) {
            resultado = "ingrese solo letras para el nombre del docente";
        }
            
        return resultado;
        
    }   
    
}
