/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author linke
 */
public class frmRoles extends javax.swing.JInternalFrame {
Connection conn ;
DefaultTableModel model;
    /**
     * Creates new form frmRoles
     */
    public frmRoles() {
        initComponents();
         try
        {
              Class.forName("org.gjt.mm.mysql.Driver") ;
              conn = DriverManager.getConnection("jdbc:mysql://localhost/libreria","root","") ;
              System.out.println("CONEXION EXITOSA");
        }
        catch(Exception e) {}
           
           jPasswordField1.setText("");
            consultar ("");
            txtNuevoEmpleado.setVisible(false);
            lblUsuario.setVisible(false);
            lblUsuario1.setVisible(false);
            txtUsuario.setVisible(false);
            lblContraseña.setVisible(false);
            jPasswordField1.setVisible(false);
            btnGuardar.setVisible(false);
            btnCancelar.setVisible(false);
            btnCancelar1.setVisible(false);
            
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private void consultar(String valor){
     String query = "";
     if(valor.equals("")){
         query="select DISTINCT  id_rol, usuario, clave from roles" ;
     }
     else{
         query="SELECT DISTINCT id_rol, usuario, clave from roles where usuario LIKE '%"+valor+"%'"
                 ; 
     }
     
 try {
          Statement stmt = conn.createStatement();
          ResultSet rs = stmt.executeQuery(query) ;
          model = (DefaultTableModel) this.jTable1.getModel();
          model.setRowCount(0);
          Object Datos[]= new Object[3];
          
          while (rs.next())
           {
              for (int i=0;i<3;i++) Datos[i]=rs.getObject(i+1);
              model.addRow(Datos);
           }
           this.jTable1.setModel(model);
          
        }
        catch(Exception e) 
        {
            JOptionPane.showMessageDialog(null,"HA OCURRIDO UN ERROR: "+e.toString(),
                "Error", JOptionPane.ERROR_MESSAGE);          
        }

 }
    public void buscar (String buscar){
       String query = "";
        query="select DISTINCT * from roles where usuario ='"+this.txtBuscar+"'" ;
        try {
          Statement stmt = conn.createStatement();
          ResultSet rs = stmt.executeQuery(query) ;
          model = (DefaultTableModel) this.jTable1.getModel();
          model.setRowCount(0);
          Object Datos[]= new Object[3];
          
          while (rs.next())
           {
              for (int i=0;i<3;i++) Datos[i]=rs.getObject(i+1);
              model.addRow(Datos);
           }
           this.jTable1.setModel(model);
          
        }
        catch(Exception e) 
        {
            JOptionPane.showMessageDialog(null,"HA OCURRIDO UN ERROR: "+e.toString(),
                "Error", JOptionPane.ERROR_MESSAGE);          
        }
   }
    public void seleccionar (){
       int fila = this.jTable1.getSelectedRow();
       if (fila>=0){
           this.lblID.setText(this.jTable1.getValueAt(fila, 0).toString());
           this.txtUsuario.setText(this.jTable1.getValueAt(fila, 1).toString());
            this.jPasswordField1.setText(this.jTable1.getValueAt(fila, 2).toString());
           
            txtNuevoEmpleado.setVisible(true);
            lblUsuario.setVisible(true);
            lblUsuario1.setVisible(true);
            txtUsuario.setVisible(true);
            lblContraseña.setVisible(true);
            jPasswordField1.setVisible(true);
            btnGuardar.setVisible(true);
            btnCancelar1.setVisible(true);
            
            btnCancelar.setVisible(true);
       }else {
           JOptionPane.showMessageDialog(null, "Seleccione fila");
       }
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtNuevoEmpleado = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        txtUsuario = new javax.swing.JTextField();
        lblContraseña = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        btnBuscar = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnCancelar1 = new javax.swing.JButton();
        lblID = new javax.swing.JLabel();
        lblUsuario1 = new javax.swing.JLabel();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNuevoEmpleado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtNuevoEmpleado.setText("Usuario");
        jPanel1.add(txtNuevoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        lblUsuario.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblUsuario.setText("ID:");
        jPanel1.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));

        btnCancelar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/trash_full_recycle_delete_delete_9751.png"))); // NOI18N
        btnCancelar.setText("ELIMINAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 650, -1, -1));

        btnGuardar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar.png"))); // NOI18N
        btnGuardar.setText("MODIFICAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 172, 70));
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 250, -1));

        lblContraseña.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblContraseña.setText("Contraseña:");
        jPanel1.add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        jPasswordField1.setText("jPasswordField1");
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 250, -1));

        btnBuscar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/search_106707.png"))); // NOI18N
        btnBuscar.setText("BUSCAR:");
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 330, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "USUARIO", "CONTRASEÑA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, 330));

        btnCancelar1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCancelar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancel_stop_exit_1583.png"))); // NOI18N
        btnCancelar1.setText("CANCELAR");
        btnCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, -1, 70));

        lblID.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 220, 30));

        lblUsuario1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblUsuario1.setText("Usuario:");
        jPanel1.add(lblUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
      try {
        
         
        String query = "UPDATE roles SET usuario = ? , clave = ? where id_rol= ?";
        
          PreparedStatement pst = conn.prepareStatement(query);
         
          pst.setString (1,  this.txtUsuario.getText().trim());
            pst.setString(2, this.jPasswordField1.getText().trim());
             pst.setString(3, this.lblID.getText().trim());
            
           
           
            pst.executeUpdate();
         
       }
       catch (Exception e){
      JOptionPane.showMessageDialog(null,"Ha ocurrido un error: "+e.toString(),
                "Error", JOptionPane.ERROR_MESSAGE); 
   }
       this.consultar ("");
       this.txtBuscar.setText("");
   
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        seleccionar ();
        btnCancelar.setVisible(true);
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
       int fila = jTable1.getSelectedRow();
        if (fila>=0){
            String dato="";
            dato=jTable1.getValueAt(fila, 0).toString();
            try
            {
                String query = "DELETE FROM roles WHERE id_rol='"+dato+"'";

                PreparedStatement pst = conn.prepareStatement(query);
                // execute the preparedstatement
                pst.executeUpdate();

                // actualizar la tabla
                this.consultar("");
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"HA OCURRIDO UN ERROR: "+e.toString(),
                    "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Seleccione fila.",
                "Acción", JOptionPane.WARNING_MESSAGE);
        }
        txtNuevoEmpleado.setVisible(false);
            lblUsuario.setVisible(false);
            lblUsuario1.setVisible(false);
            txtUsuario.setVisible(false);
            lblContraseña.setVisible(false);
            jPasswordField1.setVisible(false);
            btnGuardar.setVisible(false);
            btnCancelar.setVisible(false);
            btnCancelar1.setVisible(false);
            lblID.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
      consultar(txtBuscar.getText());
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void btnCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar1ActionPerformed
        txtNuevoEmpleado.setVisible(false);
            lblUsuario.setVisible(false);
            lblUsuario1.setVisible(false);
            txtUsuario.setVisible(false);
            lblContraseña.setVisible(false);
            jPasswordField1.setVisible(false);
            btnGuardar.setVisible(false);
            btnCancelar1.setVisible(false);
            lblID.setVisible(false);
            this.txtBuscar.setText("");
    }//GEN-LAST:event_btnCancelar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelar1;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblUsuario1;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JLabel txtNuevoEmpleado;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}