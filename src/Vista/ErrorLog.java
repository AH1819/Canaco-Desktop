package Vista;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 *
 * @author Hitler
 */
public class ErrorLog extends javax.swing.JPanel {
    
    String rutalog = "C:\\Program Files\\PostgreSQL\\13\\data\\log\\";
    
    public ErrorLog() {
        initComponents();
        LlenarCombo();
    }
    
    private void LlenarCombo() {
        String rutaCarpeta = "C:\\Program Files\\PostgreSQL\\13\\data\\log";
        File carpeta = new File(rutaCarpeta);
        if (carpeta.isDirectory()) {
            // Obtener la lista de archivos contenidos en la carpeta
            File[] archivos = carpeta.listFiles();

            // Agregar los nombres de archivos al JComboBox
            if (archivos != null) {
                nombre_archivo.addItem("Selecciona un archivo");
                for (File archivo : archivos) {
                    if (archivo.isFile()) { // Asegurarse de agregar solo archivos (no carpetas)
                        nombre_archivo.addItem(archivo.getName());
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "La ruta especificada no corresponde a una carpeta válida.");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombre_archivo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        Log = new javax.swing.JTextArea();
        ruta = new javax.swing.JLabel();

        nombre_archivo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                nombre_archivoItemStateChanged(evt);
            }
        });
        nombre_archivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_archivoActionPerformed(evt);
            }
        });

        Log.setColumns(20);
        Log.setRows(5);
        jScrollPane1.setViewportView(Log);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nombre_archivo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 705, Short.MAX_VALUE))
                    .addComponent(ruta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nombre_archivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ruta, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nombre_archivoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_nombre_archivoItemStateChanged

    }//GEN-LAST:event_nombre_archivoItemStateChanged

    private void nombre_archivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_archivoActionPerformed
        if (nombre_archivo.getSelectedIndex() > 0) {
            ruta.setText(rutalog + nombre_archivo.getSelectedItem().toString());
            showLogContent(rutalog + nombre_archivo.getSelectedItem().toString());
        } else {
            Log.setText("");
        }
    }//GEN-LAST:event_nombre_archivoActionPerformed
    private void showLogContent(String filePath) {
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(new FileInputStream(filePath), "ISO-8859-1"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Log.append(line + "\n");
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
            Log.setText("Error al leer el archivo de log: " + e.getMessage());
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Log;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> nombre_archivo;
    private javax.swing.JLabel ruta;
    // End of variables declaration//GEN-END:variables
}
