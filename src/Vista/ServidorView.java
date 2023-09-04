package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author Hitler
 */
public class ServidorView extends javax.swing.JPanel {

    private boolean status = false;
    private Timer timer;
    private int segundos;
    private boolean contadorEnEjecucion;

    public ServidorView() {
        initComponents();
    }

    private void iniciarContador() {
        // Reiniciar el contador y actualizar el JLabel
        segundos = 0;
        actualizarLabelTiempo();

        // Detener el timer anterior si existe
        if (timer != null && timer.isRunning()) {
            timer.stop();
        }

        // Crear un nuevo timer para actualizar el JLabel cada segundo
        timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                segundos++;
                actualizarLabelTiempo();
            }
        });

        // Iniciar el timer
        timer.start();
        contadorEnEjecucion = true;
    }

    private void detenerContador() {
        if (timer != null && timer.isRunning()) {
            timer.stop();
        }

        contadorEnEjecucion = false;
    }

    private void actualizarLabelTiempo() {
        int horas = segundos / 3600;
        int minutos = (segundos % 3600) / 60;
        int segundosRestantes = segundos % 60;

        String tiempoFormateado = String.format("%02d:%02d:%02d", horas, minutos, segundosRestantes);
        Tiempo.setText(tiempoFormateado);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        Start_server = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Tiempo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        Start_server.setBackground(new java.awt.Color(255, 255, 255));
        Start_server.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Start_server.setForeground(new java.awt.Color(0, 0, 0));
        Start_server.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/play.png"))); // NOI18N
        Start_server.setText("Iniciar");
        Start_server.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Start_server.setDisabledSelectedIcon(null);
        Start_server.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Start_serverActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tiempo en linea:");

        Tiempo.setForeground(new java.awt.Color(0, 0, 0));
        Tiempo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tiempo.setText("00:00:00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(830, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Start_server, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Tiempo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Start_server, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(290, Short.MAX_VALUE))
        );
    }// </editor-fold>                        

    private void Start_serverActionPerformed(java.awt.event.ActionEvent evt) {                                             

        status = !status;
        if (status) {
            Start_server.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/stop.png")));
            Start_server.setText("Detener");
        } else {
            Start_server.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/play.png")));
            Start_server.setText("Iniciar");
        }

        if (contadorEnEjecucion) {
            detenerContador();
        } else {
            iniciarContador();
        }
    }                                            


    // Variables declaration - do not modify                     
    private javax.swing.JButton Start_server;
    private javax.swing.JLabel Tiempo;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration                   
}
