/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pantallas;

import Clases.Clientes;
import controlador.ClientesDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Administrator
 */
public class Datos_Clientes extends javax.swing.JFrame {

    /**
     * Creates new form Datos_Clientes
     */
    public Datos_Clientes() {
        initComponents();
    }

    public void Mostrardatoscliente(){
        int dni=Integer.parseInt(Buscar_Cliente.dni_tx.getText());
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection link = DriverManager.getConnection("jdbc:mysql://localhost/veterinaria_bd","root","root");
            PreparedStatement stmt=link.prepareStatement("SELECT * FROM clientes WHERE Dni='"+dni+"'");
            ResultSet rs=stmt.executeQuery();
            while (rs.next()) {
                dni_tx.setText(rs.getString("Dni")); 
                nomyape_tx.setText(rs.getString("NomyApe"));
                ciudad_tx.setText(rs.getString("Ciudad"));
                domicilio_tx.setText(rs.getString("Domicilio"));
                telefono_tx.setText(rs.getString("Telefono")); 
            }
        } catch (Exception e) {
        }
        
    }
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        ciudad_tx = new javax.swing.JTextField();
        dni_tx = new javax.swing.JTextField();
        domicilio_tx = new javax.swing.JTextField();
        telefono_tx = new javax.swing.JTextField();
        nomyape_tx = new javax.swing.JTextField();
        dia_tx = new javax.swing.JComboBox<>();
        mes_tx = new javax.swing.JComboBox<>();
        año_tx = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(809, 470));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setMaximumSize(new java.awt.Dimension(809, 470));
        jPanel1.setMinimumSize(new java.awt.Dimension(809, 470));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Datos de mascota");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(460, 30, 320, 46);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("D.N.I");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 100, 30, 17);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Domicilio");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 290, 60, 17);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre y apellido");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 150, 120, 17);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Fecha de Nacimiento");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(40, 190, 140, 17);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Teléfono");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(40, 340, 60, 17);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Ciudad");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(40, 240, 50, 17);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        jButton1.setText("Eliminar");
        jPanel1.add(jButton1);
        jButton1.setBounds(200, 370, 120, 40);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar.png"))); // NOI18N
        jButton2.setText("Guardar");
        jPanel1.add(jButton2);
        jButton2.setBounds(200, 420, 120, 40);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar cliente.png"))); // NOI18N
        jButton3.setText("Cancelar");
        jPanel1.add(jButton3);
        jButton3.setBounds(70, 370, 120, 40);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar.png"))); // NOI18N
        jButton4.setText("Modificar");
        jPanel1.add(jButton4);
        jButton4.setBounds(70, 420, 120, 40);

        jLabel9.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 40)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Datos de cliente");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(40, 30, 290, 46);

        jComboBox1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(460, 80, 320, 40);

        ciudad_tx.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(ciudad_tx);
        ciudad_tx.setBounds(180, 230, 150, 30);

        dni_tx.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(dni_tx);
        dni_tx.setBounds(180, 90, 150, 30);

        domicilio_tx.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(domicilio_tx);
        domicilio_tx.setBounds(180, 280, 150, 30);

        telefono_tx.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(telefono_tx);
        telefono_tx.setBounds(180, 330, 150, 30);

        nomyape_tx.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(nomyape_tx);
        nomyape_tx.setBounds(180, 140, 150, 30);

        dia_tx.setBackground(new java.awt.Color(204, 204, 204));
        dia_tx.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        dia_tx.setForeground(new java.awt.Color(255, 255, 255));
        dia_tx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "2", "24", "25", "26", "27", "28", "29", "30", "31" }));
        dia_tx.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dia_txKeyPressed(evt);
            }
        });
        jPanel1.add(dia_tx);
        dia_tx.setBounds(180, 180, 50, 40);

        mes_tx.setBackground(new java.awt.Color(204, 204, 204));
        mes_tx.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mes_tx.setForeground(new java.awt.Color(255, 255, 255));
        mes_tx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        mes_tx.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mes_txKeyPressed(evt);
            }
        });
        jPanel1.add(mes_tx);
        mes_tx.setBounds(240, 180, 50, 40);

        año_tx.setBackground(new java.awt.Color(204, 204, 204));
        año_tx.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        año_tx.setForeground(new java.awt.Color(255, 255, 255));
        año_tx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                año_txActionPerformed(evt);
            }
        });
        año_tx.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                año_txKeyPressed(evt);
            }
        });
        jPanel1.add(año_tx);
        año_tx.setBounds(300, 180, 90, 40);

        jPanel2.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setText("Edad");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(0, 170, 33, 17);

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setText("Nombre");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(0, 10, 50, 17);

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setText("Especie");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(0, 50, 50, 17);

        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setText("Raza");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(0, 90, 40, 17);

        jLabel14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel14.setText("Sexo");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(0, 130, 40, 17);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar.png"))); // NOI18N
        jButton5.setText("Guardar");
        jPanel2.add(jButton5);
        jButton5.setBounds(190, 270, 120, 40);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar cliente.png"))); // NOI18N
        jButton6.setText("Cancelar");
        jPanel2.add(jButton6);
        jButton6.setBounds(40, 210, 120, 40);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        jButton7.setText("Eliminar");
        jPanel2.add(jButton7);
        jButton7.setBounds(190, 210, 120, 40);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar.png"))); // NOI18N
        jButton8.setText("Modificar");
        jPanel2.add(jButton8);
        jButton8.setBounds(40, 270, 120, 40);

        jTextField6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(jTextField6);
        jTextField6.setBounds(60, 40, 150, 30);

        jTextField7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(jTextField7);
        jTextField7.setBounds(60, 80, 150, 30);

        jTextField8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(jTextField8);
        jTextField8.setBounds(60, 120, 150, 30);

        jTextField9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(jTextField9);
        jTextField9.setBounds(60, 160, 150, 30);

        jTextField10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(jTextField10);
        jTextField10.setBounds(60, 0, 150, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(450, 130, 320, 340);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, -10, 830, 490);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dia_txKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dia_txKeyPressed
          // TODO add your handling code here:
    }//GEN-LAST:event_dia_txKeyPressed

    private void mes_txKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mes_txKeyPressed
      // TODO add your handling code here:
    }//GEN-LAST:event_mes_txKeyPressed

    private void año_txActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_año_txActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_año_txActionPerformed

    private void año_txKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_año_txKeyPressed
       // TODO add your handling code here:
    }//GEN-LAST:event_año_txKeyPressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Mostrardatoscliente();
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Datos_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Datos_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Datos_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Datos_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Datos_Clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> año_tx;
    private javax.swing.JTextField ciudad_tx;
    public static javax.swing.JComboBox<String> dia_tx;
    private javax.swing.JTextField dni_tx;
    private javax.swing.JTextField domicilio_tx;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox1;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    public static javax.swing.JComboBox<String> mes_tx;
    private javax.swing.JTextField nomyape_tx;
    private javax.swing.JTextField telefono_tx;
    // End of variables declaration//GEN-END:variables
}
