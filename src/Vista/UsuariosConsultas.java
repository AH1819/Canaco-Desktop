package Vista;

import Dao.UserConsultaDao;
import Modelo.UserConsulta;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hitler
 */
public class UsuariosConsultas extends javax.swing.JPanel {

    ArrayList<UserConsulta> datos;
    DefaultTableModel modelo;

    public UsuariosConsultas() {
        initComponents();
        modelo = (DefaultTableModel) Mostrar.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Mostrar = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        Busqueda = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Detalle = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(153, 153, 153));

        Mostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuario", "Consulta", "fecha", "Hora"
            }
        ));
        Mostrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MostrarMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(Mostrar);

        jButton1.setText("Mostrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Busqueda.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Busqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BusquedaKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Buscar Usuario:");

        Detalle.setBackground(new java.awt.Color(0, 0, 0));
        Detalle.setColumns(20);
        Detalle.setForeground(new java.awt.Color(255, 255, 255));
        Detalle.setRows(5);
        jScrollPane2.setViewportView(Detalle);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 955, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        UserConsultaDao ucd = new UserConsultaDao();
        datos = new ArrayList<>(ucd.MostrarConsultas());
        System.out.println("tamaño: " + datos.size());
        DataTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void MostrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MostrarMousePressed
        if (Mostrar.getSelectedRow() != -1 && Mostrar.getSelectedRow() < Mostrar.getRowCount()) {
            Detalle.setText("");
            String consulta = Mostrar.getValueAt(Mostrar.getSelectedRow(), 1).toString();
            Detalle.append(consulta);
        }
    }//GEN-LAST:event_MostrarMousePressed

    private void BusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BusquedaKeyReleased
        if (!Busqueda.getText().isEmpty() && Busqueda.getText().trim().length() > 2) {
            Filtro(Busqueda.getText());
        }
    }//GEN-LAST:event_BusquedaKeyReleased

    private void Filtro(String busqueda) {

        boolean Status = false;

        modelo.setRowCount(0);
        for (UserConsulta dato : datos) {
            if (dato.getUsuario().toLowerCase().contains(busqueda)) {
                Object[] arr = {dato.getUsuario(), dato.getConsulta(), dato.getFecha(), dato.getHora()};
                modelo.addRow(arr);
                Status = true;
            }
        }
        
        if (!Status) {
            System.out.println("regresando");
            DataTable();
            return;
        }
        Mostrar.setModel(modelo);
    }

    private void DataTable() {
        modelo.setRowCount(0);
        for (UserConsulta dato : datos) {
            Object[] fila = {dato.getUsuario(), dato.getConsulta(), dato.getFecha(), dato.getHora()};
            modelo.addRow(fila);
        }
        Mostrar.setModel(modelo);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Busqueda;
    private javax.swing.JTextArea Detalle;
    private javax.swing.JTable Mostrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
