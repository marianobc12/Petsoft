/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pantallas;

import com.sun.glass.events.KeyEvent;
import controlador.CuentasDAO;
import java.awt.Color;
import java.awt.Desktop;
import java.net.URI;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        CuentasDAO cuentasDAO =new CuentasDAO();
        cuentasDAO.ConectarBD();
    }

    
    
    public void VerificarCuenta(){
        String usuario=txt_usuario.getText();
        char[] pass =txt_contraseña.getPassword();
        String passString = new String(pass);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection link = DriverManager.getConnection("jdbc:mysql://localhost/veterinaria_bd","root","root");
            PreparedStatement stmt=link.prepareStatement("SELECT * FROM cuentas WHERE Usuario='"+usuario+"'");
            ResultSet rs=stmt.executeQuery();
            String usuariobd = null;
            String passbd = null;
            while (rs.next()) {                
                usuariobd=rs.getString("Usuario");
                passbd=rs.getString("Contraseña");
            }
            if (usuario.equals(usuariobd)) {
                if (passString.equals(passbd)) {
                    Menu_Principal menu_Principal=new Menu_Principal();
                    menu_Principal.setVisible(true);
                    this.setVisible(false);
                }else{
                    JOptionPane.showMessageDialog(null, "¡La contraseña es incorrecta!", "Contraseña incorrecto", ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(null, "¡El usuario ingresado no existe!", "Usuario incorrecto", ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falta Iniciar el WAMPSERVER "+e,"Aviso",JOptionPane.WARNING_MESSAGE);
        }
    }

 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_contraseña = new javax.swing.JPasswordField();
        bt_entrar = new javax.swing.JButton();
        bt_recuperar = new javax.swing.JButton();
        hechopor = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PetSoft - MuthanDevs");
        setMinimumSize(new java.awt.Dimension(740, 450));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Vijaya", 0, 120)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PetSoft");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(180, 30, 400, 100);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Usuario");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(270, 150, 48, 17);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(270, 170, 30, 30);

        txt_usuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_usuario.setToolTipText("Ingrese su nombre usuario");
        txt_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_usuarioKeyPressed(evt);
            }
        });
        jPanel1.add(txt_usuario);
        txt_usuario.setBounds(300, 170, 160, 30);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contraseña");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(270, 220, 74, 17);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/contraseña.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(270, 240, 30, 30);

        txt_contraseña.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_contraseña.setToolTipText("Ingrese su contraseña");
        txt_contraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_contraseñaKeyPressed(evt);
            }
        });
        jPanel1.add(txt_contraseña);
        txt_contraseña.setBounds(300, 240, 160, 30);

        bt_entrar.setBackground(new java.awt.Color(0, 204, 51));
        bt_entrar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        bt_entrar.setForeground(new java.awt.Color(255, 255, 255));
        bt_entrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/entrar sesion.png"))); // NOI18N
        bt_entrar.setText("Entrar");
        bt_entrar.setToolTipText("Presiona para acceder al sistema");
        bt_entrar.setBorder(null);
        bt_entrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bt_entrar.setFocusCycleRoot(true);
        bt_entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_entrarActionPerformed(evt);
            }
        });
        jPanel1.add(bt_entrar);
        bt_entrar.setBounds(250, 300, 250, 50);

        bt_recuperar.setBackground(new java.awt.Color(255, 51, 51));
        bt_recuperar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        bt_recuperar.setForeground(new java.awt.Color(255, 255, 255));
        bt_recuperar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/recuperar pass.png"))); // NOI18N
        bt_recuperar.setText("Recuperar contraseña");
        bt_recuperar.setToolTipText(" ¿Olvidaste tu contraseña? No te preocupes , presiona el boton y seguì los pasos.");
        bt_recuperar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bt_recuperar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_recuperarActionPerformed(evt);
            }
        });
        jPanel1.add(bt_recuperar);
        bt_recuperar.setBounds(250, 360, 250, 50);

        hechopor.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        hechopor.setForeground(new java.awt.Color(255, 255, 255));
        hechopor.setText("Desarrollado por MuthanDevs");
        hechopor.setToolTipText("¡Presiona para ir a nuestra pagina web!");
        hechopor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        hechopor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hechoporMouseClicked(evt);
            }
        });
        jPanel1.add(hechopor);
        hechopor.setBounds(310, 430, 150, 20);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(740, 450));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-1, -9, 750, 470);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      
    }//GEN-LAST:event_formWindowOpened

    private void bt_recuperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_recuperarActionPerformed
        Recuperar_Cuenta recuperar_Cuenta=new  Recuperar_Cuenta();
        recuperar_Cuenta.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bt_recuperarActionPerformed

    private void txt_usuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_usuarioKeyPressed
        if (evt.getKeyCode()== KeyEvent.VK_ENTER) {
           bt_entrar.doClick();
        }
    }//GEN-LAST:event_txt_usuarioKeyPressed

    private void txt_contraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_contraseñaKeyPressed
        if (evt.getKeyCode()== KeyEvent.VK_ENTER) {
           bt_entrar.doClick();
        }       
    }//GEN-LAST:event_txt_contraseñaKeyPressed

    private void hechoporMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hechoporMouseClicked
        try {
            if (Desktop.isDesktopSupported()) {
            Desktop desktop = Desktop.getDesktop();
            if (desktop.isSupported(Desktop.Action.BROWSE)) {
            desktop.browse(new URI("http://www.google.cl"));
            }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_hechoporMouseClicked

    private void bt_entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_entrarActionPerformed
        VerificarCuenta();
    }//GEN-LAST:event_bt_entrarActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton bt_entrar;
    private javax.swing.JButton bt_recuperar;
    private javax.swing.JLabel hechopor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txt_contraseña;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
