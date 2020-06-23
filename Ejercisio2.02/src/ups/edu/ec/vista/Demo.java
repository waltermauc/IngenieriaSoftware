/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.vista;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import ups.edu.ec.modelo.Cliente;
import ups.edu.ec.modelo.Venta;
import ups.edu.ec.modelo.Credito;
import ups.edu.ec.modelo.DetalleVenta;
import ups.edu.ec.modelo.Libro;
import ups.edu.ec.modelo.LibroImpreso;
import ups.edu.ec.modelo.RecargarCredito;

/**
 *
 * @author 59396
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Cliente> listaClientes;
        listaClientes = new ArrayList<Cliente>();

        ArrayList<Libro> listaLibro;
        listaLibro = new ArrayList<Libro>();

        ArrayList<Venta> listaCompra;
        listaCompra = new ArrayList<Venta>();

        ArrayList<DetalleVenta> listaDetalle;
        listaDetalle = new ArrayList<DetalleVenta>();

        ArrayList<Credito> listaCredito;
        listaCredito = new ArrayList<Credito>();
        Libro[] mislibros = new Libro[3];
        listaLibro.add(mislibros[0] = new Libro(1, "El Diario De Gravity Falls 3", "Rob Renzetti", "LIBRERÍA \"LA CABAÑA\"", 10) {
            @Override
            public String calcularBase() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Double calcularEnvio() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

           

           });
        listaLibro.add(mislibros[1] = new Libro(2, "Harry Potter y la piedra filosofal", "J. K. Rowling", "Bloomsbury", 14.99) {
            @Override
            public String calcularBase() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Double calcularEnvio() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

           
        });
        listaLibro.add(mislibros[2] = new Libro(3, "Animales fantásticos y dónde encontrarlos", "J. K. Rowling", "Scholastic", 14.05) {
            @Override
            public String calcularBase() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Double calcularEnvio() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            
        });

        boolean salirMenuPri = false;
        boolean salirMenuSec = false;
        Scanner entrada;
        entrada = new Scanner(System.in);
        int codCli = 0;
        int codClicompras = 0;
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date testDate = null;
        String date = "15/05/2020";
        try {
            testDate = df.parse(date);

        } catch (Exception e) {
            System.out.println("invalid format");
        }
        while (!salirMenuPri) {
            for (Cliente i : listaClientes) {
                codCli = i.getCod_cliente();

            }
            System.out.println("1...REGISTARSE");
            System.out.println("2...RALIZAR COMPRA LIBROS");
            System.out.println("INGRESE UNA OPCION");
            int opMenuPrincipal = entrada.nextInt();
            switch (opMenuPrincipal) {
                case 1:
                    Scanner entrada1 = new Scanner(System.in);
                    System.out.println("INGRESE SU NOMBRE");
                    String nombre = entrada1.nextLine();
                    Cliente c = new Cliente(codCli + 1, nombre);
                    listaClientes.add(c);
                    System.out.println("INGRESE CREDITO");
                    int credito = entrada1.nextInt();
                    for (Cliente i : listaClientes) {
                        listaCredito.add(new Credito(codCli, credito, c));
                    }
                    System.out.println("REGISTRO COMPLETO");
                    break;
                case 2:
                    Scanner entrada2 = new Scanner(System.in);
                    int codLib = 0;
                    double total = 0.0;
                    int opMenuRecar = 0;
                    while (!salirMenuSec) {
                        System.out.println("BIENVENIDO AL ASISTENTE DE COMPRAS");
                        System.out.println("1.....LIBRO IMPRESO");
                        System.out.println("2.....LIBRO DIGITAL");
                        System.out.println("3.....SALIR");
                        System.out.println("INGRESE UNA OPCION");
                        int opMenuCompras = entrada2.nextInt();

                        switch (opMenuCompras) {
                            case 1:
                                Venta compra = null;
                                int codCom = 0;
                                for (Venta i : listaCompra) {
                                    codCli = i.getCod_compra();
                                }
                                System.out.println("INGRESE SU CODIGO CLIENTE");
                                int codCliCom = entrada2.nextInt();
                                for (Cliente i : listaClientes) {
                                    if (i.getCod_cliente() == codCliCom) {
                                        compra = new Venta(codCom + 1, testDate, i);
                                        listaCompra.add(compra);
                                    }
                                }
                                int ultimo = 0;
                                DetalleVenta detalle = new DetalleVenta();
                                detalle.setCod_detalle(1);
                                System.out.println("LISTA DE LIBROS:");
                                boolean salirMenuLib = false;
                                while (!salirMenuLib) {
                                    for (Libro l : listaLibro) {
                                        System.out.println(l.toString());
                                    }
                                    ultimo = listaLibro.size() + 1;
                                    System.out.println(listaLibro.size() + 1 + ") SALIR");
                                    System.out.print("INGRESE CODIGO LIBRO ");

                                    codLib = entrada2.nextInt();

                                    if (ultimo == codLib) {
                                        salirMenuLib = true;
                                        break;
                                    }
                                    break;

                                }
                                if (codLib < listaLibro.size() + 1) {
                                    for (final Libro l : mislibros) {
                                        if (l.getCod_libro() == codLib) {
                                            Libro libro = new Libro(l.getCod_libro(), l.getTitulo(), l.getAutor(), l.getEdicion(), l.getPrecio()) {
                                                @Override
                                                public String calcularBase() {
                                                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                                                }

                                                @Override
                                                public Double calcularEnvio() {
                                                    double com = l.getPrecio() * 0.5;
                                                    return com;
                                                }

                                               
                                            };
                                            detalle.setProducto(libro);
                                            detalle.setCompra(compra);
                                            System.out.println("INGRESE CANTIDAD");
                                            int cant = entrada2.nextInt();
                                            detalle.setCantidad(cant);
                                            detalle.setPrecio(l.getPrecio());
                                        }
                                    }
                                    listaDetalle.add(detalle);

                                    for (int i = 0; i < listaDetalle.size(); i++) {
                                        detalle = new DetalleVenta();
                                        total = detalle.calcularTotalImpreso(listaDetalle);

                                        double monto = 0;
                                        String montoRecorte = "";
                                        for (int j = 0; j < listaCredito.size(); j++) {
                                            if (listaCredito.get(j).getCliente().getCod_cliente() == codCliCom) {
                                                monto = listaCredito.get(j).getPrecio();
                                                if (monto > total) {
                                                    Credito credito1 = new Credito();
                                                    credito1.debitarCredito(monto, listaCredito, codCliCom, total);

                                                    System.out.println(" ");
                                                    System.out.println("  ");
                                                    System.out.println("TABLA DE DEBITO ACTUALIZADA");
                                                    for (int y = 0; y < listaCredito.size(); y++) {
                                                        System.out.println(listaCredito.get(y).getCliente().getNombre() + "   " + listaCredito.get(y).getPrecio());
                                                        System.out.println("\n");
                                                    }
                                                } else {
                                                    System.out.println("");
                                                    System.out.println("SIN FONDOS");
                                                    do {
                                                        System.out.println("1....RECARGAR");
                                                        System.out.println("2....SALIR");

                                                        opMenuRecar = entrada2.nextInt();
                                                        switch (opMenuRecar) {
                                                            case 1:
                                                                System.out.print("INGRESE CANTIDAD A RECARGAR : ");
                                                                double recargar = entrada2.nextDouble();

                                                                RecargarCredito recarga = new RecargarCredito();
                                                                recarga.recargarCredito(recargar, listaCredito, codCliCom);

                                                                System.out.println(" ");
                                                                System.out.println("  ");
                                                                System.out.println("TABLA DE DEBITO ACTUALIZADA");
                                                                for (int y = 0; y < listaCredito.size(); y++) {
                                                                    System.out.println(listaCredito.get(y).getCliente().getNombre() + "   " + listaCredito.get(y).getPrecio());
                                                                    System.out.println("\n");
                                                                }
                                                                break;
                                                            case 2:
                                                                salirMenuSec = true;

                                                                break;
                                                            default:
                                                                throw new AssertionError();
                                                        }

                                                    } while (opMenuRecar == 2);
                                                }
                                            }
                                        }

                                    }

                                } else {
                                    System.out.println("REVISE EL CODIGO DEL LIBRO");
                                    break;
                                }

                            case 2:
                                Venta compra1 = null;
                                int codCom1 = 0;
                                for (Venta i : listaCompra) {
                                    codCli = i.getCod_compra();
                                }
                                System.out.println("INGRESE SU CODIGO CLIENTE");
                                int codCliCom1 = entrada2.nextInt();
                                for (Cliente i : listaClientes) {
                                    if (i.getCod_cliente() == codCliCom1) {
                                        compra1 = new Venta(codCom1 + 1, testDate, i);
                                        listaCompra.add(compra1);
                                    }
                                }
                                int ultimo1 = 0;
                                DetalleVenta detalle1 = new DetalleVenta();
                                detalle1.setCod_detalle(1);
                                System.out.println("LISTA DE LIBROS:");
                                boolean salirMenuLib1 = false;
                                while (!salirMenuLib1) {
                                    for (Libro l : listaLibro) {
                                        System.out.println(l.toString());
                                    }
                                    ultimo1 = listaLibro.size() + 1;
                                    System.out.println(listaLibro.size() + 1 + ") SALIR");
                                    System.out.print("INGRESE CODIGO LIBRO ");

                                    codLib = entrada2.nextInt();

                                    if (ultimo1 == codLib) {
                                        salirMenuLib1 = true;
                                        break;
                                    }
                                    break;

                                }
                                if (codLib < listaLibro.size() + 1) {
                                    for (final Libro l : mislibros) {
                                        if (l.getCod_libro() == codLib) {
                                            Libro libro = new Libro(l.getCod_libro(), l.getTitulo(), l.getAutor(), l.getEdicion(), l.getPrecio()) {
                                                @Override
                                                public String calcularBase() {
                                                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                                                }

                                                @Override
                                                public Double calcularEnvio() {
                                                    double com = l.getPrecio() * 0.02;
                                                    return com;
                                                }

                                                
                                            };
                                            detalle1.setProducto(libro);
                                            detalle1.setCompra(compra1);
                                            System.out.println("INGRESE CANTIDAD");
                                            int cant = entrada2.nextInt();
                                            detalle1.setCantidad(cant);
                                            detalle1.setPrecio(l.getPrecio());
                                        }
                                    }
                                    listaDetalle.add(detalle1);

                                    for (int i = 0; i < listaDetalle.size(); i++) {
                                        detalle1 = new DetalleVenta();
                                        total = detalle1.calcularTotalDigital(listaDetalle);

                                        double monto = 0;
                                        String montoRecorte = "";
                                        for (int j = 0; j < listaCredito.size(); j++) {
                                            if (listaCredito.get(j).getCliente().getCod_cliente() == codCliCom1) {
                                                monto = listaCredito.get(j).getPrecio();
                                                if (monto > total) {
                                                    Credito credito1 = new Credito();
                                                    credito1.debitarCredito(monto, listaCredito, codCliCom1, total);

                                                    System.out.println(" ");
                                                    System.out.println("  ");
                                                    System.out.println("TABLA DE DEBITO ACTUALIZADA");
                                                    for (int y = 0; y < listaCredito.size(); y++) {
                                                        System.out.println(listaCredito.get(y).getCliente().getNombre() + "   " + listaCredito.get(y).getPrecio());
                                                        System.out.println("\n");
                                                    }
                                                } else {
                                                    System.out.println("");
                                                    System.out.println("SIN FONDOS");
                                                    do {
                                                        System.out.println("1....RECARGAR");
                                                        System.out.println("2....SALIR");

                                                        opMenuRecar = entrada2.nextInt();
                                                        switch (opMenuRecar) {
                                                            case 1:
                                                                System.out.print("INGRESE CANTIDAD A RECARGAR : ");
                                                                double recargar = entrada2.nextDouble();

                                                                RecargarCredito recarga = new RecargarCredito();
                                                                recarga.recargarCredito(recargar, listaCredito, codCliCom1);

                                                                System.out.println(" ");
                                                                System.out.println("  ");
                                                                System.out.println("TABLA DE DEBITO ACTUALIZADA");
                                                                for (int y = 0; y < listaCredito.size(); y++) {
                                                                    System.out.println(listaCredito.get(y).getCliente().getNombre() + "   " + listaCredito.get(y).getPrecio());
                                                                    System.out.println("\n");
                                                                }
                                                                break;
                                                            case 2:
                                                                salirMenuSec = true;

                                                                break;
                                                            default:
                                                                throw new AssertionError();
                                                        }

                                                    } while (opMenuRecar == 2);
                                                }
                                            }
                                        }

                                    }

                                } else {
                                    System.out.println("REVISE EL CODIGO DEL LIBRO");
                                    break;
                                }
                            case 3:
                                salirMenuSec = true;
                                break;

                        }

                    }

            }
        }
    }
}
