/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pantallas;
import Clases.Clientes;
import Clases.Mascotas;
import controlador.ClientesDAO;
import controlador.MascotasDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Timer;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
/**
 *
 * @author Flores
 */
public class Alta_Mascota extends javax.swing.JFrame {

    /**
     * Creates new form Alta_Mascota
     */
    public Alta_Mascota() {
        initComponents(); 
        ScheduledExecutorService timer = Executors.newSingleThreadScheduledExecutor();
        timer.scheduleAtFixedRate(tieneraza, 1, 1, TimeUnit.MICROSECONDS);
        txt_dueño.setText(Alta_Cliente.txt_nomyape.getText());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
  final Runnable tieneraza = new Runnable() {
        public void run(){
            String especie=txt_especie.getSelectedItem().toString();
            if (especie.equals("Perro")||especie.equals("Gato")) {
                lb_raza.setVisible(true);
                txt_raza.setVisible(true);
            }else{
              
                lb_raza.setVisible(false);
                txt_raza.setVisible(false);   
                txt_raza.setText("");
            }
       
        
        }
    };
 
  
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_especie = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        lb_raza = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_sexo = new javax.swing.JComboBox<>();
        txt_raza = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_edad = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_dueño = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alta de mascota - MuthanDevs");
        setMinimumSize(new java.awt.Dimension(732, 471));
        setSize(new java.awt.Dimension(732, 471));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setPreferredSize(new java.awt.Dimension(731, 471));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Alta de mascota");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(140, 30, 480, 46);

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar cliente.png"))); // NOI18N
        jButton4.setText("Cancelar");
        jButton4.setBorder(null);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(400, 410, 140, 40);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar mascota.png"))); // NOI18N
        jButton1.setText("Guardar ");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(550, 410, 140, 40);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(140, 130, 50, 17);

        txt_nombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(txt_nombre);
        txt_nombre.setBounds(140, 150, 120, 30);

        txt_especie.setBackground(new java.awt.Color(204, 204, 204));
        txt_especie.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_especie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Perro", "Gato", "Caballo", "Conejo", "Pajaro", "Roedor", "Otros" }));
        jPanel1.add(txt_especie);
        txt_especie.setBounds(140, 210, 140, 40);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Especie");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(140, 190, 50, 17);

        lb_raza.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lb_raza.setForeground(new java.awt.Color(255, 255, 255));
        lb_raza.setText("Raza");
        jPanel1.add(lb_raza);
        lb_raza.setBounds(300, 200, 40, 17);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Sexo");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(140, 260, 40, 17);

        txt_sexo.setBackground(new java.awt.Color(204, 204, 204));
        txt_sexo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Macho", "Hembra" }));
        jPanel1.add(txt_sexo);
        txt_sexo.setBounds(140, 280, 140, 40);

        txt_raza.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(txt_raza);
        txt_raza.setBounds(300, 220, 120, 30);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Edad");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(140, 330, 60, 17);

        txt_edad.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(txt_edad);
        txt_edad.setBounds(140, 350, 70, 30);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nombre mascota.png"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(110, 150, 24, 30);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sexo mascota.png"))); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(110, 280, 24, 30);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/edad mascota.png"))); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(110, 350, 24, 30);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/especie mascota.png"))); // NOI18N
        jPanel1.add(jLabel11);
        jLabel11.setBounds(110, 210, 24, 30);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 255, 153));
        jLabel4.setText("Dueño :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(140, 90, 70, 20);

        txt_dueño.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_dueño.setForeground(new java.awt.Color(153, 255, 153));
        jPanel1.add(txt_dueño);
        txt_dueño.setBounds(210, 90, 310, 20);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo3.jpg"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(0, -6, 740, 480);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Menu_Cliente menu_Cliente=new Menu_Cliente();
        menu_Cliente.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

 
            Clientes clientes=new Clientes();
            int dnint=Integer.valueOf(Alta_Cliente.txt_dni.getText());
            clientes.setDni(dnint);
            clientes.setNomyApe(Alta_Cliente.txt_nomyape.getText());
            clientes.setFecha_nac(Alta_Cliente.txt_dia.getSelectedItem().toString()+"/"+Alta_Cliente.txt_mes.getSelectedItem().toString()+"/"+Alta_Cliente.txt_año.getSelectedItem().toString());
            clientes.setCiudad(Alta_Cliente.txt_ciudad.getText());
            clientes.setDomicilio(Alta_Cliente.txt_domicilio.getText());
            clientes.setTelefono(Alta_Cliente.txt_telefono.getText());
            
            Mascotas mascotas=new Mascotas();
            mascotas.setDni(dnint);
            mascotas.setNombre(txt_nombre.getText());
            mascotas.setEspecie(txt_especie.getSelectedItem().toString());
            mascotas.setRaza(txt_raza.getText());
            mascotas.setSexo(txt_sexo.getSelectedItem().toString());
            int edadint=Integer.valueOf(txt_edad.getValue().toString());
            mascotas.setEdad(edadint);
            
            MascotasDAO mascotasDAO=new MascotasDAO();
            ClientesDAO clientesDAO=new ClientesDAO();
            clientesDAO.guardaCliente(clientes);
            mascotasDAO.guardaMascota(mascotas);
            
            JOptionPane.showMessageDialog(null,"¡El cliente fue guardado!", "Aviso", INFORMATION_MESSAGE);
            
            Menu_Cliente menu_Cliente=new Menu_Cliente();
            menu_Cliente.setVisible(true);
            this.setVisible(false);


        
        
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
     
    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
    }//GEN-LAST:event_formWindowActivated
   
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
            java.util.logging.Logger.getLogger(Alta_Mascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alta_Mascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alta_Mascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alta_Mascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alta_Mascota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb_raza;
    private javax.swing.JLabel txt_dueño;
    private javax.swing.JSpinner txt_edad;
    private javax.swing.JComboBox<String> txt_especie;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_raza;
    private javax.swing.JComboBox<String> txt_sexo;
    // End of variables declaration//GEN-END:variables
}
