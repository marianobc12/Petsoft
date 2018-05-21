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
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

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
        ScheduledExecutorService timer = Executors.newSingleThreadScheduledExecutor();
        timer.scheduleAtFixedRate(SeleccionarMascota, 1, 1, TimeUnit.MICROSECONDS);
    }

      final Runnable SeleccionarMascota = new Runnable() {
        public void run(){
            String mascota=select_mascota.getSelectedItem().toString();
            if (mascota.equals("Buscar mascota")) {
                Ocultarpanelmascota();
            }else{
                panel_mascota.setVisible(true);
                try {
                int dni=Integer.parseInt(Buscar_Cliente.dni_tx.getText());
                Class.forName("com.mysql.jdbc.Driver");
                Connection link = DriverManager.getConnection("jdbc:mysql://localhost/veterinaria_bd","root","root");
                PreparedStatement stmt=link.prepareStatement("SELECT * FROM mascotas WHERE Dni='"+dni+"' AND Nombre='"+mascota+"'");
                ResultSet rs=stmt.executeQuery();
                while (rs.next()) {                    
                    nombre_tx.setText(rs.getString("Nombre"));
                    especie_tx.setText(rs.getString("Especie"));
                    raza_tx.setText(rs.getString("Raza"));
                    sexo_tx.setText(rs.getString("Sexo"));
                    edad_tx.setText(rs.getString("Edad"));
                }
                
                } catch (Exception e) {
                }
            }
            
       
        
        }
    };
            
            
            
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
    public void Traermascostas(){
        int dni=Integer.parseInt(Buscar_Cliente.dni_tx.getText());
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection link = DriverManager.getConnection("jdbc:mysql://localhost/veterinaria_bd","root","root");
            PreparedStatement stmt=link.prepareStatement("SELECT Nombre FROM mascotas WHERE Dni='"+dni+"'");
            ResultSet rs=stmt.executeQuery();
            while (rs.next()) {
               String nombre=rs.getString("Nombre");
               select_mascota.addItem(nombre);
            }
        } catch (Exception e) {
        }
    }
    
    public void Ocultarbotones(){
        bt_cancelar_c.setVisible(false);
        bt_guardar_c.setVisible(false);
    }
    
    public void Deshabilitarcampos(){
        dni_tx.setEnabled(false);
        nomyape_tx.setEnabled(false);
        ciudad_tx.setEnabled(false);
        dia_tx.setEnabled(false);
        mes_tx.setEnabled(false);
        año_tx.setEnabled(false);
        domicilio_tx.setEnabled(false);
        telefono_tx.setEnabled(false);  
    }
    
    public void Habilitarcampos(){
        dni_tx.setEnabled(true);
        nomyape_tx.setEnabled(true);
        ciudad_tx.setEnabled(true);
        dia_tx.setEnabled(true);
        mes_tx.setEnabled(true);
        año_tx.setEnabled(true);
        domicilio_tx.setEnabled(true);
        telefono_tx.setEnabled(true);
        
    }
    public void Ocultarpanelmascota(){
        panel_mascota.setVisible(false);
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
        bt_eliminar_c = new javax.swing.JButton();
        bt_guardar_c = new javax.swing.JButton();
        bt_cancelar_c = new javax.swing.JButton();
        bt_modificar_c = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        select_mascota = new javax.swing.JComboBox<>();
        ciudad_tx = new javax.swing.JTextField();
        dni_tx = new javax.swing.JTextField();
        domicilio_tx = new javax.swing.JTextField();
        telefono_tx = new javax.swing.JTextField();
        nomyape_tx = new javax.swing.JTextField();
        dia_tx = new javax.swing.JComboBox<>();
        mes_tx = new javax.swing.JComboBox<>();
        año_tx = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        panel_mascota = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        bt_guardar_m = new javax.swing.JButton();
        bt_cancelar_m = new javax.swing.JButton();
        bt_eliminar_m = new javax.swing.JButton();
        bt_modificar_m = new javax.swing.JButton();
        especie_tx = new javax.swing.JTextField();
        raza_tx = new javax.swing.JTextField();
        sexo_tx = new javax.swing.JTextField();
        edad_tx = new javax.swing.JTextField();
        nombre_tx = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administración de datos");
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
        jLabel2.setBounds(450, 30, 320, 46);

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

        bt_eliminar_c.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        bt_eliminar_c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        bt_eliminar_c.setText("Eliminar");
        jPanel1.add(bt_eliminar_c);
        bt_eliminar_c.setBounds(90, 400, 120, 40);

        bt_guardar_c.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        bt_guardar_c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar.png"))); // NOI18N
        bt_guardar_c.setText("Guardar");
        jPanel1.add(bt_guardar_c);
        bt_guardar_c.setBounds(230, 400, 120, 40);

        bt_cancelar_c.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        bt_cancelar_c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar cliente.png"))); // NOI18N
        bt_cancelar_c.setText("Cancelar");
        bt_cancelar_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cancelar_cActionPerformed(evt);
            }
        });
        jPanel1.add(bt_cancelar_c);
        bt_cancelar_c.setBounds(90, 400, 120, 40);

        bt_modificar_c.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        bt_modificar_c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar.png"))); // NOI18N
        bt_modificar_c.setText("Modificar");
        bt_modificar_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_modificar_cActionPerformed(evt);
            }
        });
        jPanel1.add(bt_modificar_c);
        bt_modificar_c.setBounds(230, 400, 120, 40);

        jLabel9.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 40)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Datos de cliente");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(40, 30, 290, 46);

        select_mascota.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        select_mascota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Buscar mascota" }));
        select_mascota.setToolTipText("");
        jPanel1.add(select_mascota);
        select_mascota.setBounds(450, 120, 320, 40);

        ciudad_tx.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ciudad_tx.setEnabled(false);
        jPanel1.add(ciudad_tx);
        ciudad_tx.setBounds(180, 230, 150, 30);

        dni_tx.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        dni_tx.setEnabled(false);
        jPanel1.add(dni_tx);
        dni_tx.setBounds(180, 90, 150, 30);

        domicilio_tx.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        domicilio_tx.setEnabled(false);
        jPanel1.add(domicilio_tx);
        domicilio_tx.setBounds(180, 280, 150, 30);

        telefono_tx.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        telefono_tx.setEnabled(false);
        jPanel1.add(telefono_tx);
        telefono_tx.setBounds(180, 330, 150, 30);

        nomyape_tx.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nomyape_tx.setEnabled(false);
        jPanel1.add(nomyape_tx);
        nomyape_tx.setBounds(180, 140, 150, 30);

        dia_tx.setBackground(new java.awt.Color(204, 204, 204));
        dia_tx.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        dia_tx.setForeground(new java.awt.Color(255, 255, 255));
        dia_tx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "2", "24", "25", "26", "27", "28", "29", "30", "31" }));
        dia_tx.setEnabled(false);
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
        mes_tx.setEnabled(false);
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
        año_tx.setEnabled(false);
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

        jLabel15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Selecciona una mascota");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(450, 90, 160, 17);

        panel_mascota.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setText("Edad");
        panel_mascota.add(jLabel10);
        jLabel10.setBounds(0, 170, 33, 17);

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setText("Nombre");
        panel_mascota.add(jLabel11);
        jLabel11.setBounds(0, 10, 50, 17);

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setText("Especie");
        panel_mascota.add(jLabel12);
        jLabel12.setBounds(0, 50, 50, 17);

        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setText("Raza");
        panel_mascota.add(jLabel13);
        jLabel13.setBounds(0, 90, 40, 17);

        jLabel14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel14.setText("Sexo");
        panel_mascota.add(jLabel14);
        jLabel14.setBounds(0, 130, 40, 17);

        bt_guardar_m.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        bt_guardar_m.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar.png"))); // NOI18N
        bt_guardar_m.setText("Guardar");
        panel_mascota.add(bt_guardar_m);
        bt_guardar_m.setBounds(170, 250, 120, 40);

        bt_cancelar_m.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        bt_cancelar_m.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar cliente.png"))); // NOI18N
        bt_cancelar_m.setText("Cancelar");
        panel_mascota.add(bt_cancelar_m);
        bt_cancelar_m.setBounds(20, 250, 120, 40);

        bt_eliminar_m.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        bt_eliminar_m.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        bt_eliminar_m.setText("Eliminar");
        panel_mascota.add(bt_eliminar_m);
        bt_eliminar_m.setBounds(170, 200, 120, 40);

        bt_modificar_m.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        bt_modificar_m.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar.png"))); // NOI18N
        bt_modificar_m.setText("Modificar");
        panel_mascota.add(bt_modificar_m);
        bt_modificar_m.setBounds(20, 200, 120, 40);

        especie_tx.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        panel_mascota.add(especie_tx);
        especie_tx.setBounds(60, 40, 150, 30);

        raza_tx.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        panel_mascota.add(raza_tx);
        raza_tx.setBounds(60, 80, 150, 30);

        sexo_tx.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        panel_mascota.add(sexo_tx);
        sexo_tx.setBounds(60, 120, 150, 30);

        edad_tx.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        panel_mascota.add(edad_tx);
        edad_tx.setBounds(60, 160, 150, 30);

        nombre_tx.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        panel_mascota.add(nombre_tx);
        nombre_tx.setBounds(60, 0, 150, 30);

        jPanel1.add(panel_mascota);
        panel_mascota.setBounds(450, 180, 320, 290);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo3.jpg"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, -10, 830, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
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
        Traermascostas();
        Ocultarbotones();
    }//GEN-LAST:event_formWindowOpened

    private void bt_modificar_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_modificar_cActionPerformed
        bt_cancelar_c.setVisible(true);
        bt_guardar_c.setVisible(true);
        bt_eliminar_c.setVisible(false);
        bt_modificar_c.setVisible(false);
        Habilitarcampos();
    }//GEN-LAST:event_bt_modificar_cActionPerformed

    private void bt_cancelar_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cancelar_cActionPerformed
        bt_cancelar_c.setVisible(false);
        bt_guardar_c.setVisible(false);
        bt_eliminar_c.setVisible(true);
        bt_modificar_c.setVisible(true);
        Deshabilitarcampos();
    }//GEN-LAST:event_bt_cancelar_cActionPerformed

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
    private javax.swing.JButton bt_cancelar_c;
    private javax.swing.JButton bt_cancelar_m;
    private javax.swing.JButton bt_eliminar_c;
    private javax.swing.JButton bt_eliminar_m;
    private javax.swing.JButton bt_guardar_c;
    private javax.swing.JButton bt_guardar_m;
    private javax.swing.JButton bt_modificar_c;
    private javax.swing.JButton bt_modificar_m;
    private javax.swing.JTextField ciudad_tx;
    public static javax.swing.JComboBox<String> dia_tx;
    private javax.swing.JTextField dni_tx;
    private javax.swing.JTextField domicilio_tx;
    private javax.swing.JTextField edad_tx;
    private javax.swing.JTextField especie_tx;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JComboBox<String> mes_tx;
    private javax.swing.JTextField nombre_tx;
    private javax.swing.JTextField nomyape_tx;
    private javax.swing.JPanel panel_mascota;
    private javax.swing.JTextField raza_tx;
    private javax.swing.JComboBox<String> select_mascota;
    private javax.swing.JTextField sexo_tx;
    private javax.swing.JTextField telefono_tx;
    // End of variables declaration//GEN-END:variables
}
