/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Pantallas;

import static Pantallas.Inicio.bt_entrar;
import com.sun.glass.events.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Flores
 */
public class Alta_Cliente extends javax.swing.JFrame {

    /**
     * Creates new form Alta_cliente
     */
    public Alta_Cliente() {
        initComponents();
        ponerAños();
    }

    public void VerificacionDni(){
        if (txt_dni.getText().equals("")) {
            JOptionPane.showMessageDialog(null,"Falta ingresar el DNI", "Aviso", 0);
        }else{
            if (txt_dni.getText().length()<8 || txt_dni.getText().length()>8) {
                JOptionPane.showMessageDialog(null,"El DNI debe tener 8 digitos", "Aviso", 0);
            }else{
                VerificarCliente();
            }
        }
    }
    public void VerificacionNomyApe(){
        if (txt_nomyape.getText().equals("")) {
            JOptionPane.showMessageDialog(null,"Falta ingresar el Nombre y Apellido", "Aviso", 0);
        }else{
            if (txt_nomyape.getText().length()<3 || txt_nomyape.getText().length()>30) {
                JOptionPane.showMessageDialog(null,"El Nombre y Apellido debe tener mas de 2 y menos de 30 caracteres", "Aviso", 0);
            }else{
                VerificarCiudad();
            }
        }
    }
    public void VerificarCiudad(){
        if (txt_ciudad.getText().equals("")) {
            JOptionPane.showMessageDialog(null,"Falta ingresar la Ciudad", "Aviso", 0);
        }else{
            if (txt_ciudad.getText().length()<3 || txt_ciudad.getText().length()>20 ) {
                JOptionPane.showMessageDialog(null,"La Ciudad debe tener mas de 2 y menos de 20 caracteres", "Aviso", 0);
            }else{
                VerificarDomicilio();
            }
        }
    }
    public void VerificarDomicilio(){
        if (txt_domicilio.getText().equals("")) {
            JOptionPane.showMessageDialog(null,"Falta ingresar el Domicilio", "Aviso", 0);
        }else{
            if (txt_domicilio.getText().length()<3 || txt_domicilio.getText().length()>20) {
               JOptionPane.showMessageDialog(null,"El Domicilio debe tener mas de 2 y menos de 20 caracteres", "Aviso", 0); 
            }else{
                VerificarTelefono();
            }
        }
    }
    public void VerificarTelefono(){
        if (txt_telefono.getText().equals("")) {
            JOptionPane.showMessageDialog(null,"Falta ingresar el Telefono", "Aviso", 0);
        }else{
            if (txt_telefono.getText().length()<3 || txt_telefono.getText().length()>20) {
               JOptionPane.showMessageDialog(null,"El Telefono debe tener mas de 2 y menos de 20 caracteres", "Aviso", 0); 
            }else{
                Alta_Mascota alta_Mascota=new  Alta_Mascota();
                alta_Mascota.setVisible(true);
                this.setVisible(false); 
            }
        }
    }
    public void VerificarCliente(){
        String dni=txt_dni.getText();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection link = DriverManager.getConnection("jdbc:mysql://localhost/veterinaria_bd","root","root");
            PreparedStatement stmt=link.prepareStatement("SELECT * FROM clientes WHERE Dni='"+dni+"'");
            ResultSet rs=stmt.executeQuery();
            String dnibd=null;
            String nomyape=null;
            while (rs.next()) {                
                dnibd=rs.getString("Dni");
                nomyape=rs.getString("NomyApe");
            }
            if (dni.equals(dnibd)) {
               JOptionPane.showMessageDialog(null,"¡El cliente "+nomyape+" con Dni: "+dnibd+" ya existe!" ,"Cliente existente",0);
            }else{
                VerificacionNomyApe(); 
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
        txt_dni = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_nomyape = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_dia = new javax.swing.JComboBox<>();
        txt_mes = new javax.swing.JComboBox<>();
        txt_año = new javax.swing.JComboBox<>();
        txt_ciudad = new javax.swing.JTextField();
        txt_domicilio = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        bt_siguiente = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alta de cliente - MuthanDevs");

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Alta de cliente");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(230, 30, 270, 46);

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("D.N.I");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(230, 90, 29, 16);

        txt_dni.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_dni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_dniKeyPressed(evt);
            }
        });
        jPanel1.add(txt_dni);
        txt_dni.setBounds(230, 110, 120, 30);

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre y apellido");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(230, 150, 160, 16);

        txt_nomyape.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_nomyape.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_nomyapeKeyPressed(evt);
            }
        });
        jPanel1.add(txt_nomyape);
        txt_nomyape.setBounds(230, 170, 160, 30);

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fecha de nacimiento");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(230, 210, 190, 16);

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Ciudad");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(230, 280, 41, 16);

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Domicilio");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(230, 340, 48, 16);

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Teléfono");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(230, 400, 48, 16);

        txt_dia.setBackground(new java.awt.Color(204, 204, 204));
        txt_dia.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_dia.setForeground(new java.awt.Color(255, 255, 255));
        txt_dia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "2", "24", "25", "26", "27", "28", "29", "30", "31" }));
        txt_dia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_diaKeyPressed(evt);
            }
        });
        jPanel1.add(txt_dia);
        txt_dia.setBounds(230, 230, 50, 40);

        txt_mes.setBackground(new java.awt.Color(204, 204, 204));
        txt_mes.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_mes.setForeground(new java.awt.Color(255, 255, 255));
        txt_mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        txt_mes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_mesKeyPressed(evt);
            }
        });
        jPanel1.add(txt_mes);
        txt_mes.setBounds(290, 230, 50, 40);

        txt_año.setBackground(new java.awt.Color(204, 204, 204));
        txt_año.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_año.setForeground(new java.awt.Color(255, 255, 255));
        txt_año.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_añoActionPerformed(evt);
            }
        });
        txt_año.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_añoKeyPressed(evt);
            }
        });
        jPanel1.add(txt_año);
        txt_año.setBounds(350, 230, 90, 40);

        txt_ciudad.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_ciudad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_ciudadKeyPressed(evt);
            }
        });
        jPanel1.add(txt_ciudad);
        txt_ciudad.setBounds(230, 300, 120, 30);

        txt_domicilio.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_domicilio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_domicilioKeyPressed(evt);
            }
        });
        jPanel1.add(txt_domicilio);
        txt_domicilio.setBounds(230, 360, 180, 30);

        txt_telefono.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_telefonoKeyPressed(evt);
            }
        });
        jPanel1.add(txt_telefono);
        txt_telefono.setBounds(230, 420, 140, 30);

        bt_siguiente.setBackground(new java.awt.Color(0, 0, 0));
        bt_siguiente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        bt_siguiente.setForeground(new java.awt.Color(255, 255, 255));
        bt_siguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/siguiente cliente.png"))); // NOI18N
        bt_siguiente.setText("Siguiente");
        bt_siguiente.setBorder(null);
        bt_siguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_siguienteActionPerformed(evt);
            }
        });
        jPanel1.add(bt_siguiente);
        bt_siguiente.setBounds(580, 470, 140, 40);

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar cliente.png"))); // NOI18N
        jButton4.setText("Cancelar");
        jButton4.setBorder(null);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(430, 470, 140, 40);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/domicilio.png"))); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(200, 360, 30, 30);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/telefono.png"))); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(200, 420, 30, 30);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fecha de nacimiento.png"))); // NOI18N
        jPanel1.add(jLabel11);
        jLabel11.setBounds(200, 230, 30, 40);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nombre y apellido cliente.png"))); // NOI18N
        jPanel1.add(jLabel12);
        jLabel12.setBounds(200, 170, 30, 30);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dni.png"))); // NOI18N
        jPanel1.add(jLabel13);
        jLabel13.setBounds(200, 110, 30, 30);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ciudad.png"))); // NOI18N
        jPanel1.add(jLabel14);
        jLabel14.setBounds(200, 300, 30, 30);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo3.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 760, 540);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    
    public void ponerAños(){
        Calendar cal= Calendar.getInstance();
        int year= cal.get(Calendar.YEAR);
        for (int i = year; i >1910; i--) {
            String año=Integer.toString(i);
            txt_año.addItem(año);
        }
    }
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Menu_Cliente menu_Cliente=new Menu_Cliente();
        menu_Cliente.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    
    
    private void bt_siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_siguienteActionPerformed
         VerificacionDni();
    }//GEN-LAST:event_bt_siguienteActionPerformed

    private void txt_añoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_añoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_añoActionPerformed

    private void txt_dniKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_dniKeyPressed
        if (evt.getKeyCode()== KeyEvent.VK_ENTER) {
           bt_siguiente.doClick();
        }        
    }//GEN-LAST:event_txt_dniKeyPressed

    private void txt_nomyapeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nomyapeKeyPressed
        if (evt.getKeyCode()== KeyEvent.VK_ENTER) {
           bt_siguiente.doClick();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_txt_nomyapeKeyPressed

    private void txt_diaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_diaKeyPressed
        if (evt.getKeyCode()== KeyEvent.VK_ENTER) {
           bt_siguiente.doClick();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_txt_diaKeyPressed

    private void txt_mesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_mesKeyPressed
        if (evt.getKeyCode()== KeyEvent.VK_ENTER) {
           bt_siguiente.doClick();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txt_mesKeyPressed

    private void txt_añoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_añoKeyPressed
        if (evt.getKeyCode()== KeyEvent.VK_ENTER) {
           bt_siguiente.doClick();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txt_añoKeyPressed

    private void txt_ciudadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ciudadKeyPressed
        if (evt.getKeyCode()== KeyEvent.VK_ENTER) {
           bt_siguiente.doClick();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ciudadKeyPressed

    private void txt_domicilioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_domicilioKeyPressed
        if (evt.getKeyCode()== KeyEvent.VK_ENTER) {
           bt_siguiente.doClick();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txt_domicilioKeyPressed

    private void txt_telefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_telefonoKeyPressed
        if (evt.getKeyCode()== KeyEvent.VK_ENTER) {
           bt_siguiente.doClick();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telefonoKeyPressed

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
            java.util.logging.Logger.getLogger(Alta_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alta_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alta_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alta_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alta_Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton bt_siguiente;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JComboBox<String> txt_año;
    public static javax.swing.JTextField txt_ciudad;
    public static javax.swing.JComboBox<String> txt_dia;
    public static javax.swing.JTextField txt_dni;
    public static javax.swing.JTextField txt_domicilio;
    public static javax.swing.JComboBox<String> txt_mes;
    public static javax.swing.JTextField txt_nomyape;
    public static javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
