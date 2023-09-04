package Socket;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hitler
 */
public final class ConexionSocket {

    Socket misocket;
    Socket enviar;

    public ConexionSocket(Socket misocket) {
        this.misocket = misocket;
        try {
            System.out.println(this.misocket.getInetAddress().getHostAddress());
            enviar = new Socket(this.misocket.getInetAddress().getHostAddress(), 1000);
        } catch (IOException ex) {
            Logger.getLogger(ConexionSocket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void EnviarClienteInfo(ArrayList<Object> datos_obtenidos, String info) {
        try {
            DataOutputStream dos = new DataOutputStream(enviar.getOutputStream());
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(enviar.getOutputStream());

            objectOutputStream.writeObject(datos_obtenidos);
            dos.writeUTF(info);

            dos.close();
            objectOutputStream.close();
            enviar.close();

        } catch (IOException ex) {
            Logger.getLogger(ConexionSocket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
