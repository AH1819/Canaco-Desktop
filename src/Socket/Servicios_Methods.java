package Socket;
/*
import Controlador.Control_Almacen;
import Controlador.Control_Envios;
import Controlador.Control_Reportes;
import Controlador.Control_Tienda;
import Controlador.Control_Vehiculo;
import Controlador.Control_Viajes;
import Modelo.Almacen;
import Modelo.Arrays;
import Modelo.Envios;
import Modelo.ReporteViajes;
import Modelo.Tienda;
import Modelo.Vehiculo;
import Modelo.Viajes;
*/
import java.net.Socket;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hitler
 */
public class Servicios_Methods {
/*
    Control_Vehiculo ve = new Control_Vehiculo();
    Control_Envios ev = new Control_Envios();
    Control_Viajes vj = new Control_Viajes();
    Control_Tienda td = new Control_Tienda();
    Control_Almacen am = new Control_Almacen();
    Control_Reportes rpt = new Control_Reportes();
    ArrayList<Object> miLista = new ArrayList<>();
    ConexionSocket srcS;
    Arrays arr = new Arrays();

    public Servicios_Methods(Socket misocket) {
        srcS = new ConexionSocket(misocket);
    }

    //Vehiculo CRUD
    //GET,Vehiculo,ID,ASD-123-12,null,null,null,null
    public void BuscarIDVehiculo(String id) {
        System.out.println("entra mostrar id");
        arr.setVehiculo(ve.Buscar(id));
        int tam = arr.getVehiculo().size();
        if (tam > 0) {
            ArrayList<Object> listaObjetos = new ArrayList<>(arr.getVehiculo().size());
            for (Vehiculo vehiculo : arr.getVehiculo()) {
                listaObjetos.add((Object) vehiculo);
            }
            srcS.EnviarClienteInfo(listaObjetos, "Vehiculo,null,null");
        }
        System.out.println("sale mostrar id");
    }

    public void MostrarVehiculos() {
        System.out.println("entra mostrar");
        arr.setVehiculo(ve.Mostrar_Vehiculo());
        int tam = arr.getVehiculo().size();
        if (tam > 0) {
            ArrayList<Object> listaObjetos = new ArrayList<>(arr.getVehiculo().size());
            for (Vehiculo vehiculo : arr.getVehiculo()) {
                listaObjetos.add((Object) vehiculo);
            }
            srcS.EnviarClienteInfo(listaObjetos, "Vehiculo,null,null");
        }
        System.out.println("sale mostrar");
    }

    public void InsertarVehiculo(String placa, float cap_vol, float cap_kg) {
        String aviso = "";
        if (ve.Insertar_Vehiculo(new Vehiculo(placa, cap_vol, cap_kg))) {
            aviso = "Exito,Vehiculo,Exito al Insertar";
        } else {
            aviso = "Error,Vehiculo,Error al Insertar";
        }
        srcS.EnviarClienteInfo(miLista, aviso);
    }

    public void ActualizarVehiculo(String placabefore, String placaafter, float cap_vol, float cap_kg) {
        String aviso = "";
        if (ve.Actualizar_Vehiculo(placabefore, new Vehiculo(placaafter, cap_vol, cap_kg))) {
            aviso = "Exito,Vehiculo,Exito al Actualizar";
        } else {
            aviso = "Error,Vehiculo,Exito al Actualizar";
        }
        srcS.EnviarClienteInfo(miLista, aviso);
    }

    public void Baja_Vehiculo(String placa) {
        String aviso = "";
        if (ve.Baja_Vehiculo(placa)) {
            aviso = "Exito,Vehiculo,Exito al Dar de baja";
        } else {
            aviso = "Error,Vehiculo,Error al Dar de baja";
        }
        srcS.EnviarClienteInfo(miLista, aviso);
    }

    //Vehiculo fin
    //Envios CRUD
    public void BuscarEnvio(int id) {
        System.out.println("entra mostrar id");
        arr.setEnvios(ev.Buscar(id));
        int tam = arr.getEnvios().size();
        if (tam > 0) {
            ArrayList<Object> listaObjetos = new ArrayList<>(arr.getEnvios().size());
            for (Envios envio : arr.getEnvios()) {
                listaObjetos.add((Object) envio);
            }
            srcS.EnviarClienteInfo(listaObjetos, "Envios,null,null");
        }
        System.out.println("sale mostrar id");
    }

    public void MostrarEnvios() {
        System.out.println("entra mostrar");
        arr.setEnvios(ev.Mostrar_Envios());
        int tam = arr.getEnvios().size();
        if (tam > 0) {
            ArrayList<Object> listaObjetos = new ArrayList<>(arr.getEnvios().size());
            for (Envios envios : arr.getEnvios()) {
                listaObjetos.add((Object) envios);
            }
            srcS.EnviarClienteInfo(listaObjetos, "Envios,null,null");
        }
        System.out.println("sale mostrar");
    }

    public void InsertarEnvios(int num_envio, String placa, float vol, float kg, String destino, Date fecha) {
        String aviso;
        java.sql.Date sqlDate = new java.sql.Date(fecha.getTime());
        if (ev.Insertar_Envios(new Envios(num_envio, placa, vol, kg, destino, sqlDate))) {
            aviso = "Exito,Envios,Exito al Insertar";
        } else {
            aviso = "Error,Envios,Error al Insertar";
        }
        srcS.EnviarClienteInfo(miLista, aviso);
    }

    public void ActualizarEnvios(int num_envio, String placa, float vol, float kg, String destino, Date fecha) {
        String aviso;
        java.sql.Date sqlDate = new java.sql.Date(fecha.getTime());
        System.out.println(sqlDate);
        if (ev.Actualizar_Envios(new Envios(num_envio, placa, vol, kg, destino, sqlDate))) {
            aviso = "Exito,Envios,Exito al Actualizar";
        } else {
            aviso = "Error,Envios,Error al Actualizar";
        }
        srcS.EnviarClienteInfo(miLista, aviso);
    }

    //Envios fin
    //Viajes CRUD
    public void BuscarViaje(int id) {
        System.out.println("entra mostrar id");
        arr.setViajes(vj.Buscar(id));
        int tam = arr.getViajes().size();
        if (tam > 0) {
            ArrayList<Object> listaObjetos = new ArrayList<>(arr.getViajes().size());
            for (Viajes viaje : arr.getViajes()) {
                listaObjetos.add((Object) viaje);
            }
            srcS.EnviarClienteInfo(listaObjetos, "Viajes,null,null");
        }
        System.out.println("sale mostrar id");
    }

    public void MostrarViajes() {
        System.out.println("entra mostrar");
        arr.setViajes(vj.Mostrar_Viajes());
        int tam = arr.getViajes().size();
        if (tam > 0) {
            ArrayList<Object> listaObjetos = new ArrayList<>(arr.getViajes().size());
            for (Viajes viaje : arr.getViajes()) {
                listaObjetos.add((Object) viaje);
            }
            srcS.EnviarClienteInfo(listaObjetos, "Viajes,null,null");
        }
        System.out.println("sale mostrar");
    }

    public void InsertarViajes(int num_viaje, String placa, Date fecha, int cantidad) {
        String aviso;
        java.sql.Date sqlDate = new java.sql.Date(fecha.getTime());
        if (vj.Insertar_Viajes(new Viajes(num_viaje, placa, sqlDate, cantidad))) {
            aviso = "Exito,Viajes,Exito al Insertar";
        } else {
            aviso = "Error,Viajes,Error al Insertar";
        }
        srcS.EnviarClienteInfo(miLista, aviso);
    }

    public void ActualizarViajes(int num_viaje, String placa, Date fecha, int cantidad) {
        String aviso;
        java.sql.Date sqlDate = new java.sql.Date(fecha.getTime());
        if (vj.Actualizar_Viajes(new Viajes(num_viaje, placa, sqlDate, cantidad))) {
            aviso = "Exito,Viajes,Exito al Actualizar";
        } else {
            aviso = "Error,Viajes,Error al Actualizar";
        }
        srcS.EnviarClienteInfo(miLista, aviso);
    }

    public void Baja_Viaje(int num) {
        String aviso;
        if (vj.Baja_Viaje(num)) {
            aviso = "Exito,Viajes,Exito al Dar de baja";
        } else {
            aviso = "Error,Viajes,Error al Dar de baja";
        }
        srcS.EnviarClienteInfo(miLista, aviso);
    }

    //Viajes fin
    //Tienda CRUD
    public void BuscarTienda(int id) {
        System.out.println("entra mostrar id");
        arr.setTienda(td.Buscar(id));
        int tam = arr.getTienda().size();
        if (tam > 0) {
            ArrayList<Object> listaObjetos = new ArrayList<>(arr.getTienda().size());
            for (Tienda tienda : arr.getTienda()) {
                listaObjetos.add((Object) tienda);
            }
            srcS.EnviarClienteInfo(listaObjetos, "Tienda,null,null");
        }
        System.out.println("sale mostrar id");
    }

    public void MostrarTiendas() {
        System.out.println("entra mostrar");
        arr.setTienda(td.Mostrar_Tienda());
        int tam = arr.getTienda().size();
        if (tam > 0) {
            ArrayList<Object> listaObjetos = new ArrayList<>(arr.getTienda().size());
            for (Tienda tienda : arr.getTienda()) {
                listaObjetos.add((Object) tienda);
            }
            srcS.EnviarClienteInfo(listaObjetos, "Tienda,null,null");
        }
        System.out.println("sale mostrar");
    }

    //int num_local, int id_local, String nombre, String direccion
    public void InsertarTiendas(int num_local, int id_local, String nombre, String direccion) {
        String aviso;
        if (td.Insertar_Tienda(new Tienda(num_local, id_local, nombre, direccion))) {
            aviso = "Exito,Tienda,Exito al Insertar";
        } else {
            aviso = "Error,Tienda,Error al Insertar";
        }
        srcS.EnviarClienteInfo(miLista, aviso);
    }

    public void ActualizarTiendas(int num_local, int id_local, String nombre, String direccion) {
        String aviso;
        if (td.Actualizar_Tienda(new Tienda(num_local, id_local, nombre, direccion))) {
            aviso = "Exito,Tienda,Exito al Actualizar";
        } else {
            aviso = "Error,Tienda,Error al Actualizar";
        }
        srcS.EnviarClienteInfo(miLista, aviso);
    }

    //Tienda fin
    //Almacen CRUD
    public void BuscarAlmacen(int id) {
        System.out.println("entra mostrar id");
        arr.setAlmacen(am.Buscar(id));
        int tam = arr.getAlmacen().size();
        if (tam > 0) {
            ArrayList<Object> listaObjetos = new ArrayList<>(arr.getAlmacen().size());
            for (Almacen almacen : arr.getAlmacen()) {
                listaObjetos.add((Object) almacen);
            }
            srcS.EnviarClienteInfo(listaObjetos, "Almacen,null,null");
        }
        System.out.println("sale mostrar");
    }

    public void MostrarAlmacenes() {
        System.out.println("entra mostrar");
        arr.setAlmacen(am.Mostrar_Almacen());
        int tam = arr.getAlmacen().size();
        if (tam > 0) {
            ArrayList<Object> listaObjetos = new ArrayList<>(arr.getAlmacen().size());
            for (Almacen almacen : arr.getAlmacen()) {
                listaObjetos.add((Object) almacen);
            }
            srcS.EnviarClienteInfo(listaObjetos, "Almacen,null,null");
        }
        System.out.println("sale mostrar");
    }

    //int id_almacen, String nombre, String direccion
    public void InsertarAlmacen(int id_almacen, String nombre, String direccion) {
        String aviso;
        if (am.Insertar_Almacen(new Almacen(id_almacen, nombre, direccion))) {
            aviso = "Exito,Almacen,Exito al Insertar";
        } else {
            aviso = "Error,Almacen,Error al Insertar";
        }
        srcS.EnviarClienteInfo(miLista, aviso);
    }

    public void ActualizarAlmacen(int id_almacen, String nombre, String direccion) {
        String aviso;
        if (am.Actualizar_(new Almacen(id_almacen, nombre, direccion))) {
            aviso = "Exito,Almacen,Exito al Actualizar";
        } else {
            aviso = "Error,Almacen,Error al Actualizar";
        }
        srcS.EnviarClienteInfo(miLista, aviso);
    }

    //Almacen fin
    //ReporteViajes MOSTRAR
    public void ReporteViajesM(String fecha1, String fecha2) throws ParseException {
        String aviso;
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");

        Date fechaDate1 = formatoFecha.parse(fecha1);
        Date fechaDate2 = formatoFecha.parse(fecha2);

        java.sql.Date sqlDate1 = new java.sql.Date(fechaDate1.getTime());
        java.sql.Date sqlDate2 = new java.sql.Date(fechaDate2.getTime());

        arr.setReporteViajes(rpt.Reporte_Viajes(sqlDate1, sqlDate2));

        int tam = arr.getReporteViajes().size();

        if (tam > 0) {
            ArrayList<Object> listaObjetos = new ArrayList<>(arr.getReporteViajes().size());
            for (ReporteViajes viajes : arr.getReporteViajes()) {
                listaObjetos.add((Object) viajes);
            }
            srcS.EnviarClienteInfo(listaObjetos, "Reporte,null,null");
        } else {
            aviso = "Error,Reporte,Error al Consultar";
            srcS.EnviarClienteInfo(miLista, aviso);
        }
    }
    //ReportesViajes fin
    */
}
