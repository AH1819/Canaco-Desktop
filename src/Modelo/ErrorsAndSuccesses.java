package Modelo;

/**
 *
 * @author Hitler
 */
public class ErrorsAndSuccesses {

    private static String cadenaErrorBD;
    private static boolean conexion;

    public String getCadenaErrorBD() {
        return cadenaErrorBD;
    }

    public void setCadenaErrorBD(String cadenaErrorBD) {
        this.cadenaErrorBD = cadenaErrorBD;
    }

    public boolean isConexion() {
        return conexion;
    }

    public void setConexion(boolean conexion) {
        this.conexion = conexion;
    }
}
