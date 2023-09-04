package Vista;

import ConexionBD.Conexion;
import Modelo.ErrorsAndSuccesses;
import Modelo.Logeo;
import Modelo.PersistenciaGetSet;
import java.awt.Color;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Hitler
 */
public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        Logo();
        this.setLocationRelativeTo(this);
        cargando.setVisible(false);
    }

    private void Logo() {
        ImageIcon original = new ImageIcon(getClass().getResource("/Recursos/logo_canaco.png")); // Cambia por la ruta de tu imagen
        Image img = original.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        Icon icono = new ImageIcon(img);
        logo_label.setIcon(icono);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logo_label = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        User = new javax.swing.JTextField();
        Initxt = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        Entrar = new javax.swing.JButton();
        User_Line = new javax.swing.JSeparator();
        Password_Line = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        User_error = new javax.swing.JLabel();
        Password_error = new javax.swing.JLabel();
        cargando = new javax.swing.JLabel();
        ErrorMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(200, 500));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPanel1KeyReleased(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(logo_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 160));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/User.png"))); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 70, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Password.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 80, 60));

        User.setBackground(new java.awt.Color(255, 255, 255));
        User.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        User.setForeground(new java.awt.Color(0, 0, 0));
        User.setText(" Usuario");
        User.setBorder(null);
        User.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                UserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                UserFocusLost(evt);
            }
        });
        User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserActionPerformed(evt);
            }
        });
        User.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                UserKeyReleased(evt);
            }
        });
        jPanel1.add(User, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 310, 35));

        Initxt.setFont(new java.awt.Font("Roboto Light", 1, 36)); // NOI18N
        Initxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Initxt.setText("INICIAR SESION");
        jPanel1.add(Initxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 500, 60));

        Password.setBackground(new java.awt.Color(255, 255, 255));
        Password.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Password.setForeground(new java.awt.Color(0, 0, 0));
        Password.setText("Password");
        Password.setBorder(null);
        Password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PasswordFocusLost(evt);
            }
        });
        Password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PasswordKeyReleased(evt);
            }
        });
        jPanel1.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 310, 35));

        Entrar.setBackground(new java.awt.Color(0, 0, 255));
        Entrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Entrar.setForeground(new java.awt.Color(255, 255, 255));
        Entrar.setText("Entrar");
        Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrarActionPerformed(evt);
            }
        });
        jPanel1.add(Entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, -1, -1));

        User_Line.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(User_Line, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 310, 10));

        Password_Line.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(Password_Line, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 310, 10));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Visible.png"))); // NOI18N
        jLabel3.setOpaque(true);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, 30, -1));

        User_error.setForeground(new java.awt.Color(255, 255, 255));
        User_error.setText("Usuario vacio");
        jPanel1.add(User_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 310, 20));

        Password_error.setForeground(new java.awt.Color(255, 255, 255));
        Password_error.setText("Contraseña vacia");
        jPanel1.add(Password_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 310, -1));

        cargando.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cargando.gif"))); // NOI18N
        jPanel1.add(cargando, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 450, 50, 50));

        ErrorMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(ErrorMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 480, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UserFocusGained
        if (User.getText().equals(" Usuario")) {
            User.setText("");
        }
    }//GEN-LAST:event_UserFocusGained

    private void UserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UserFocusLost
        if (User.getText().isEmpty()) {
            User.setText(" Usuario");
        }
    }//GEN-LAST:event_UserFocusLost

    private void UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserActionPerformed

    private void PasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordFocusGained
        if (String.valueOf(Password.getPassword()).equals("Password")) {
            Password.setText("");
        }
    }//GEN-LAST:event_PasswordFocusGained

    private void PasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordFocusLost
        if (String.valueOf(Password.getPassword()).isEmpty()) {
            Password.setText("Password");
        }
    }//GEN-LAST:event_PasswordFocusLost

    private void EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrarActionPerformed
        cargando.setVisible(true);
        Validar();
    }//GEN-LAST:event_EntrarActionPerformed
    boolean status = false;
    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked

        status = !status;

        if (status) {
            jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Invisible.png")));
            Password.setEchoChar((char) 0);
        } else {
            jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Visible.png")));
            Password.setEchoChar('*');
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        jLabel3.setBackground(Color.gray);
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        jLabel3.setBackground(Color.white);
    }//GEN-LAST:event_jLabel3MouseExited

    private void PasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PasswordKeyReleased
        if (evt.getKeyCode() == 10) {
            Validar();
        }
    }//GEN-LAST:event_PasswordKeyReleased

    private void jPanel1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyReleased

    }//GEN-LAST:event_jPanel1KeyReleased

    private void UserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UserKeyReleased
        if (evt.getKeyCode() == 115) {
            ConfigurarBD cb = new ConfigurarBD(this);
            cb.setVisible(true);
            this.setVisible(false);
        }
        System.out.println(evt.getKeyCode());
        System.out.println(evt.getExtendedKeyCode());
        System.out.println(evt.getKeyChar());
    }//GEN-LAST:event_UserKeyReleased

    private void Validar() {
        if (!User.getText().isEmpty() && !User.getText().equals(" Usuario")) {
            User_Line.setForeground(Color.BLACK);
            User_error.setForeground(Color.white);
            if (!String.valueOf(Password.getPassword()).isEmpty() && !String.valueOf(Password.getPassword()).equals("Password")) {
                Password_Line.setForeground(Color.BLACK);
                Password_error.setForeground(Color.white);
                char[] passwordChars = Password.getPassword();
                new Thread() {
                    public void run() {
                        Autentificacion(User.getText(), new String(passwordChars));
                    }
                }.start();
            } else {
                Password.requestFocus();
                Password_error.setForeground(Color.red);
                Password_Line.setForeground(Color.red);
            }
        } else {
            User.requestFocus();
            User_error.setForeground(Color.red);
            User_Line.setForeground(Color.red);
        }
    }

    private void Autentificacion(String user, String password) {
        PersistenciaGetSet pgs = new PersistenciaGetSet();
        pgs.Leer();
        Conexion con = Conexion.getInstance();
        Logeo l = new Logeo(user, password);
        con.conectar();
        ErrorsAndSuccesses eas = new ErrorsAndSuccesses();
        if (eas.isConexion()) {
            cargando.setVisible(false);
            Principal p = new Principal();
            p.setVisible(true);
            this.dispose();
        } else {
            try {
                cargando.setVisible(false);
                ErrorMessage.setText("<html>" + eas.getCadenaErrorBD() + "</html>");
                ErrorMessage.setForeground(Color.red);
                Thread.sleep(4000);
                ErrorMessage.setText("");
            } catch (InterruptedException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Dark nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Entrar;
    private javax.swing.JLabel ErrorMessage;
    private javax.swing.JLabel Initxt;
    private javax.swing.JPasswordField Password;
    private javax.swing.JSeparator Password_Line;
    private javax.swing.JLabel Password_error;
    private javax.swing.JTextField User;
    private javax.swing.JSeparator User_Line;
    private javax.swing.JLabel User_error;
    private javax.swing.JLabel cargando;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo_label;
    // End of variables declaration//GEN-END:variables
}
