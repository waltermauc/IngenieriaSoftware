/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Medico;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author 59396
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        ControladorMedico c = new ControladorMedico();

        boolean salirMenu = false;
        Scanner entrada = new Scanner(System.in);
        while (!salirMenu) {
            System.out.println("DEMO GESTION MEDICOS");
            System.out.println("INSERTAR");
            System.out.println("ELIMINAR");
            System.out.println("BUSCAR");
            System.out.println("ACTUALIZAR");
            System.out.println("SALIR");
            System.out.println("INGRESE UNA OPCION");
            int opMenu = entrada.nextInt();
            int contador = 0;
            switch (opMenu) {
                case 1:
                    contador += 1;
                    System.out.println("INGRESE UN NOMBRE");
                    String nombre = entrada.nextLine();
                    System.out.println("INGRESE UN APELLIDO");
                    String apellido = entrada.nextLine();
                    System.out.print("INGRESE SU DIRECCION");
                    String direccion = entrada.nextLine();
                    System.out.println("INGRESE SU CORREO");
                    String correo = entrada.nextLine();
                    System.out.println("INGRESE CEDULA");
                    String cedula = entrada.nextLine();
                    System.out.println("INGRESE SU SEXO ");
                    String sexo = entrada.nextLine();
                    System.out.println("INGRESE SU FECHA DE NACIMIENTO");
                    String fecha = entrada.nextLine();
                    System.out.println("INGRESE SU CONTRASENIA");
                    String contrasenia = entrada.nextLine();
                    System.out.println("INGRESE  NUMERO DE CONSULTORIO ");
                    String numeroCon = entrada.nextLine();
                    System.out.println("INGRESE ESPECIALIDAD");
                    String especialidad = entrada.nextLine();
                    DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                    Date myDate = formatter.parse(fecha);
                    java.sql.Date date = new java.sql.Date(myDate.getTime());
                    c.crearMedico(new Medico(especialidad, numeroCon, contrasenia, contador, cedula, nombre, apellido, direccion, correo, date, sexo));
                    break;
                case 2:
                    System.out.println("INGRESE CEDULA DEL MEDICO A ELIMINAR");
                    String cedulaEli = entrada.nextLine();
                    c.borrarMedico(cedulaEli);

                    break;
                case 3:
                    System.out.println("INGRESE CEDULA DEL MEDICO A BUSCAR");
                    String cedulaBus = entrada.nextLine();
                    c.borrarMedico(cedulaBus);
                    break;
                case 4:
                    System.out.println("INGRESE CEDULA DEL MEDICO A ACTUALIZAR");
                    String cedulaAct = entrada.nextLine();
                    System.out.println("INGRESE UN NOMBRE");
                    String nombreAct = entrada.nextLine();
                    System.out.println("INGRESE UN APELLIDO");
                    String apellidoAct = entrada.nextLine();
                    System.out.print("INGRESE SU DIRECCION");
                    String direccionAct = entrada.nextLine();
                    System.out.println("INGRESE SU CORREO");
                    String correoAct= entrada.nextLine();
                    System.out.println("INGRESE SU SEXO ");
                    String sexoAct = entrada.nextLine();
                    System.out.println("INGRESE SU FECHA DE NACIMIENTO");
                    String fechaAct = entrada.nextLine();
                    System.out.println("INGRESE SU CONTRASENIA");
                    String contraseniaAct = entrada.nextLine();
                    System.out.println("INGRESE  NUMERO DE CONSULTORIO ");
                    String numeroConAct = entrada.nextLine();
                    System.out.println("INGRESE ESPECIALIDAD");
                    String especialidadAct = entrada.nextLine();
                    DateFormat formatterAct = new SimpleDateFormat("yyyy-MM-dd");
                    Date myDateAct = formatterAct.parse(fechaAct);
                    java.sql.Date dateAct = new java.sql.Date(myDateAct.getTime());
                    
                    c.actualizar(new Medico(especialidadAct, numeroConAct, contraseniaAct, contador, cedulaAct, nombreAct, apellidoAct, direccionAct, correoAct, myDateAct, sexoAct), cedulaAct);
                    break;
                   
                case 5:
                    salirMenu = true;
                    break;

            }

        }

    }
}
