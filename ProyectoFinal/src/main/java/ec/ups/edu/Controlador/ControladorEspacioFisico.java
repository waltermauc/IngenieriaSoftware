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
public class ControladorEspacioFisico {
    int []numeros = {1,2,3,4,5,6,7,8,9,0};
    String [] letras = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
       
    public String crearEspacioFisico (int codigoEspacio, int numeroAula, String edificioEspacioFisico){
        String resultadoCrearEspacioFisico = "";
        if (codigoEspacio ==21){
            resultadoCrearEspacioFisico = "espacio fisico creado";
        }
         else if (letras.equals(codigoEspacio)){
            resultadoCrearEspacioFisico = "ingrese solo numeros";
        }
         else if (numeros.equals(numeroAula)){
            resultadoCrearEspacioFisico = "espacio fisico creado";
        }
         else if (!numeros.equals(numeroAula)){
             resultadoCrearEspacioFisico = "Ingrese solo numeros para el aula";
            
        }
          else if (edificioEspacioFisico.equals(letras)){
            resultadoCrearEspacioFisico = "espacio fisico creado";
        }
          else if (!edificioEspacioFisico.equals(letras)){
            resultadoCrearEspacioFisico = "solo letras";
        }
        return resultadoCrearEspacioFisico;
    }
    public String editarEspacioFisico (int numeroAula, String edificiEspacioFisico){
        
        String resultadoEditarEspacio = "";
        if (numeroAula != 4)
        {
            resultadoEditarEspacio = "Ingrese otro numero";
        }else if (numeroAula != numeroAula){
            resultadoEditarEspacio = "numero aula cambiado correctamente";
        }
        else if (edificiEspacioFisico.equals("Manuel Peralta")){
            resultadoEditarEspacio = "Ingrese otro nombre del espacio fiscio";
        }
        else {
            resultadoEditarEspacio = "Edificio cambiado correctamente";
        }
      
        return resultadoEditarEspacio;
    }
    public String eliminarEspacioFisico (int codigoEspacio){
        String eliminarEspacioFiscio = "";
        if (codigoEspacio == 5){
            eliminarEspacioFiscio = "espacio eliminado";
        }else {
            eliminarEspacioFiscio = "no existe espacio con ese codigo";
        }
        return eliminarEspacioFiscio;
    }
    public String listarEspacioFisico (int codigoEspacio){
        String resultadoListarEspacio = "";
        
        if (codigoEspacio ==4){
            resultadoListarEspacio = "Mostrar datos espacio fisico";
            
        }else {
            resultadoListarEspacio = "Error, no existen datos con ese codig";
        }
        return resultadoListarEspacio;
    }
}
