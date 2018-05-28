/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pantallas;

import static Pantallas.Alta_Cliente.txt_dni;
import static Pantallas.Buscar_Cliente.dni_tx;
import com.sun.glass.events.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class Buscar_Historia extends javax.swing.JFrame {

    /**
     * Creates new form Buscar_Historia
     */
    public Buscar_Historia() {
        initComponents();
    }
    
    
    public void VerificacionDni(){
        if (dni_tx.getText().equals("")) {
            JOptionPane.showMessageDialog(null,"Falta ingresar el DNI", "Aviso", 0);
        }else{
            if (dni_tx.getText().length()<8 || dni_tx.getText().length()>8) {
                JOptionPane.showMessageDialog(null,"El DNI debe tener 8 digitos", "Aviso", 0);
            }else{
                BuscarMascota();
            }
        }
    }

    public void BuscarMascota(){
            try {
            int dni=Integer.valueOf(dni_tx.getText());
            Class.forName("com.mysql.jdbc.Driver");
            Connection link = DriverManager.getConnection("jdbc:mysql://localhost/veterinaria_bd","root","root");
            PreparedStatement stmt=link.prepareStatement("SELECT Dni FROM mascotas WHERE Dni='"+dni+"'");
            ResultSet rs=stmt.executeQuery();
            int dnibd = 0;
            while (rs.next()) {                
                dnibd=rs.getInt("Dni");
            }
            if (dnibd==dni) {
                bt_buscar.setEnabled(false);
                dni_tx.setEnabled(false);
                mascota_tx.setEnabled(true);
                stmt=link.prepareStatement("SELECT Nombre FROM mascotas WHERE Dni='"+dni+"'");
                rs=stmt.executeQuery();
                while (rs.next()) {                
                    mascota_tx.addItem(rs.getString("Nombre"));
                }
            }else{
                JOptionPane.showMessageDialog(null, "¡No se encontro ninguna mascota!", "Aviso", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dni_tx = new javax.swing.JTextField();
        bt_buscar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        mascota_tx = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(523, 300));
        setMinimumSize(new java.awt.Dimension(523, 300));
        setPreferredSize(new java.awt.Dimension(523, 320));
        setResizable(false);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Buscar Historia Clínica");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 10, 420, 46);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mascota");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 150, 60, 17);

        dni_tx.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        dni_tx.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dni_txKeyPressed(evt);
            }
        });
        jPanel1.add(dni_tx);
        dni_tx.setBounds(50, 90, 250, 40);

        bt_buscar.setBackground(new java.awt.Color(0, 0, 0));
        bt_buscar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        bt_buscar.setForeground(new java.awt.Color(255, 255, 255));
        bt_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar cliente.png"))); // NOI18N
        bt_buscar.setText("Buscar");
        bt_buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bt_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_buscarActionPerformed(evt);
            }
        });
        jPanel1.add(bt_buscar);
        bt_buscar.setBounds(300, 90, 130, 40);

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/siguiente cliente.png"))); // NOI18N
        jButton4.setText("Siguiente");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(260, 240, 130, 40);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("D.N.I");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 60, 30, 17);

        mascota_tx.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mascota_tx.setEnabled(false);
        jPanel1.add(mascota_tx);
        mascota_tx.setBounds(50, 170, 320, 40);

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar cliente.png"))); // NOI18N
        jButton5.setText("Cancelar");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(120, 240, 130, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo3.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 523, 300);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Historia_clinica historia_clinica=new Historia_clinica();
        historia_clinica.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Menu_Principal menu_Principal=new Menu_Principal();
        menu_Principal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void bt_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_buscarActionPerformed
        VerificacionDni();
    }//GEN-LAST:event_bt_buscarActionPerformed

    private void dni_txKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dni_txKeyPressed
        if (evt.getKeyCode()== KeyEvent.VK_ENTER) {
           bt_buscar.doClick();
        }   
    }//GEN-LAST:event_dni_txKeyPressed

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
            java.util.logging.Logger.getLogger(Buscar_Historia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Buscar_Historia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Buscar_Historia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Buscar_Historia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Buscar_Historia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_buscar;
    public static javax.swing.JTextField dni_tx;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JComboBox<String> mascota_tx;
    // End of variables declaration//GEN-END:variables
}
