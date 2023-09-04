package Modelo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author Hitler
 */
public class PersistenciaGetSet {

    public boolean Guardar(Object logeo) {
        //Escritura
        FileOutputStream fichero = null;
        try {
            fichero = new FileOutputStream("Logeo.bin");
            ObjectOutputStream objg = new ObjectOutputStream(fichero);
            objg.writeObject(logeo);
            fichero.close();
            objg.close();
            return true;
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error -->\n" + e, "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
        return false;
    }

    public void Leer() {
        //Lectura
        FileInputStream fichero = null;

        try {
            fichero = new FileInputStream("Logeo.bin");
            ObjectInputStream obji = new ObjectInputStream(fichero);
            PersistenciaLogin l = (PersistenciaLogin) obji.readObject();
            Logeo p = new Logeo(l.getPuerto(), l.getHost(), l.getBase());
            obji.close();
            fichero.close();
        } catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "No se a configurado la conexion\n Usando base local", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            PersistenciaLogin p = new PersistenciaLogin("localhost", "canaco", "5432");
            Guardar(p);
        }
    }
}
