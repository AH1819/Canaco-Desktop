package Vista;

import ConexionBD.Conexion;
import Modelo.ErrorsAndSuccesses;
import Modelo.Logeo;
import Modelo.PersistenciaGetSet;
import Modelo.PersistenciaLogin;
import java.awt.Color;
import javax.swing.JTextField;

/**
 *
 * @author Hitler
 */
public class ConfigurarBD extends javax.swing.JFrame {
    
    Logeo lg;
    ErrorsAndSuccesses eas;
    Conexion cn;
    PersistenciaGetSet pgs;
    boolean status_conexion;
    Login vista;
    
    public ConfigurarBD(Login vista) {
        initComponents();
        this.setLocationRelativeTo(this);
        this.vista = vista;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Host_BD = new javax.swing.JTextField();
        BD_name = new javax.swing.JTextField();
        Port = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Test_con = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        User = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        password_view = new javax.swing.JLabel();
        Guardar = new javax.swing.JButton();
        result = new javax.swing.JLabel();
        ErrorMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Configurar la base de datos");
        setAlwaysOnTop(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Host_BD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Host_BD.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Host_BDFocusGained(evt);
            }
        });
        Host_BD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Host_BDKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Host_BDKeyTyped(evt);
            }
        });

        BD_name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BD_name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BD_nameFocusGained(evt);
            }
        });

        Port.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Port.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PortFocusGained(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Datos de conexion");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Host del servidor:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombre de la base de datos:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Puerto:");

        Test_con.setBackground(new java.awt.Color(18, 90, 173));
        Test_con.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Test_con.setForeground(new java.awt.Color(255, 255, 255));
        Test_con.setText("Probar conexion");
        Test_con.setBorder(null);
        Test_con.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Test_conActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Usuario:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Contraseña:");

        User.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                UserFocusGained(evt);
            }
        });

        Password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PasswordFocusGained(evt);
            }
        });

        password_view.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Visible.png"))); // NOI18N
        password_view.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                password_viewMouseClicked(evt);
            }
        });

        Guardar.setBackground(new java.awt.Color(18, 90, 173));
        Guardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Guardar.setForeground(new java.awt.Color(255, 255, 255));
        Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/guardar.png"))); // NOI18N
        Guardar.setText("Guardar");
        Guardar.setBorder(null);
        Guardar.setEnabled(false);
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        result.setBackground(new java.awt.Color(153, 153, 153));
        result.setOpaque(true);

        ErrorMessage.setForeground(new java.awt.Color(204, 0, 0));
        ErrorMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(183, 183, 183))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(Host_BD, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(BD_name))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(User, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(password_view)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Port, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Test_con, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(result, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ErrorMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(User, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(password_view, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Password, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Host_BD, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BD_name, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(result, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Test_con, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Port, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ErrorMessage, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Host_BDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Host_BDKeyReleased

    }//GEN-LAST:event_Host_BDKeyReleased

    private void Host_BDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Host_BDKeyTyped

    }//GEN-LAST:event_Host_BDKeyTyped

    private void Test_conActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Test_conActionPerformed
        if (!User.getText().isEmpty()) {
            if (!String.valueOf(Password.getPassword()).isEmpty()) {
                if (!Host_BD.getText().isEmpty()) {
                    if (!BD_name.getText().isEmpty()) {
                        if (!Port.getText().isEmpty()) {
                            TestearConexion();
                        } else {
                            cambioColor(Port, "Campo vacio", Color.red);
                        }
                    } else {
                        cambioColor(BD_name, "Campo vacio", Color.red);
                    }
                } else {
                    cambioColor(Host_BD, "Campo vacio", Color.red);
                }
            } else {
                cambioColor(Password, "Campo vacio", Color.red);
            }
        } else {
            cambioColor(User, "Campo vacio", Color.red);
        }
    }//GEN-LAST:event_Test_conActionPerformed

    private void Host_BDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Host_BDFocusGained
        if (Host_BD.getText().equals("Campo vacio")) {
            cambioColor(Host_BD, "", Color.BLACK);
        }
    }//GEN-LAST:event_Host_BDFocusGained

    private void BD_nameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BD_nameFocusGained
        if (BD_name.getText().equals("Campo vacio")) {
            cambioColor(BD_name, "", Color.BLACK);
        }
    }//GEN-LAST:event_BD_nameFocusGained

    private void PortFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PortFocusGained
        if (Port.getText().equals("Campo vacio")) {
            cambioColor(Port, "", Color.BLACK);
        }
    }//GEN-LAST:event_PortFocusGained
    boolean status = false;
    private void password_viewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_password_viewMouseClicked
        status = !status;
        
        if (status) {
            password_view.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Invisible.png")));
            Password.setEchoChar((char) 0);
        } else {
            password_view.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Visible.png")));
            Password.setEchoChar('*');
        }
    }//GEN-LAST:event_password_viewMouseClicked

    private void UserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UserFocusGained
        if (User.getText().equals("Campo vacio")) {
            cambioColor(User, "", Color.BLACK);
        }
    }//GEN-LAST:event_UserFocusGained

    private void PasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordFocusGained
        if (Password.getText().equals("Campo vacio")) {
            cambioColor(Password, "", Color.BLACK);
        }
    }//GEN-LAST:event_PasswordFocusGained

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        if (status_conexion) {
            GuardarConexion();
        }
    }//GEN-LAST:event_GuardarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        vista.setVisible(true);
    }//GEN-LAST:event_formWindowClosed
    
    private void cambioColor(JTextField field, String text, Color color) {
        field.setForeground(color);
        field.setText(text);
    }
    
    private void TestearConexion() {
        char[] passwordChars = Password.getPassword();
        lg = new Logeo(User.getText(), new String(passwordChars));
        lg = new Logeo(Port.getText(), Host_BD.getText(), BD_name.getText());
        
        cn = Conexion.getInstance();
        cn.conectar();
        eas = new ErrorsAndSuccesses();
        if (!eas.isConexion()) {
            status_conexion = false;
            ErrorMessage.setText("<html>" + eas.getCadenaErrorBD() + "</html>");
            result.setBackground(Color.red);
        } else {
            status_conexion = true;
            ErrorMessage.setText("");
            result.setBackground(Color.green);
        }
        Guardar.setEnabled(status_conexion);
    }
    
    private void GuardarConexion() {
        PersistenciaLogin p = new PersistenciaLogin(Host_BD.getText(), BD_name.getText(), Port.getText());
        pgs = new PersistenciaGetSet();
        if (pgs.Guardar(p)) {
            ErrorMessage.setText("Guardado con exito");
            ErrorMessage.setForeground(Color.GREEN);
            this.dispose();
            vista.setVisible(true);
        }
        Guardar.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BD_name;
    private javax.swing.JLabel ErrorMessage;
    private javax.swing.JButton Guardar;
    private javax.swing.JTextField Host_BD;
    private javax.swing.JPasswordField Password;
    private javax.swing.JTextField Port;
    private javax.swing.JButton Test_con;
    private javax.swing.JTextField User;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel password_view;
    private javax.swing.JLabel result;
    // End of variables declaration//GEN-END:variables
}
