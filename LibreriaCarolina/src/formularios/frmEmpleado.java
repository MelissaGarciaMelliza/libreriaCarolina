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
import libreriacarolina.Conexion;

/**
 *
 * @author linke
 */
public class frmEmpleado extends javax.swing.JInternalFrame {
Connection conn ;
DefaultTableModel model;
    /**
     * Creates new form frmEmpleado
     */
    public frmEmpleado() {
        initComponents();
     
        try
        {
              Class.forName("org.gjt.mm.mysql.Driver") ;
              conn = DriverManager.getConnection("jdbc:mysql://localhost/libreria","root","") ;
              System.out.println("CONEXION EXITOSA");
        }
        catch(Exception e) {}
           llenarCargo();
           consultar("");
    }
  public void llenarCargo(){
        
        String consulta="select distinct cargo from cargos where cargo <> 'Seleccione cargo'" ;
        
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(consulta);
            Object Datos[]= new Object[1];
            
            while (rs.next()){
                for (int i=0;i<1;i++){
                    Datos[i]=(rs.getObject(i+1));
                    this.jComboBox1.addItem(String.valueOf(Datos[i]));
                    
                }
            }
            } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error: "+e.toString(),
                "Error", JOptionPane.ERROR_MESSAGE);     
        }
      
    }
    private void consultar(String valor){
     String query = "";
     if(valor.equals("")){
         query="select * from empleados" ;
     }
     else{
         query="select * from empleados where nombre='"+valor+"'" ; 
     }
     
 try {
          Statement stmt = conn.createStatement();
          ResultSet rs = stmt.executeQuery(query) ;
          model = (DefaultTableModel) this.jTable1.getModel();
          model.setRowCount(0);
          Object Datos[]= new Object[8];
          
          while (rs.next())
           {
              for (int i=0;i<8;i++) Datos[i]=rs.getObject(i+1);
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
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtNuevoEmpleado = new javax.swing.JLabel();
        lblApellidos = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblFechNacimiento = new javax.swing.JLabel();
        lblCargo = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtUsuario = new javax.swing.JTextField();
        lblContraseña = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        lblBuscarpor = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNuevoEmpleado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtNuevoEmpleado.setText("Nuevo empleado");
        jPanel1.add(txtNuevoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 29, -1, -1));

        lblApellidos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblApellidos.setText("Apellidos:");
        jPanel1.add(lblApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 76, -1, -1));

        lblNombre.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblNombre.setText("Nombres:");
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        lblID.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblID.setText("DUI:");
        jPanel1.add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        lblCorreo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCorreo.setText("Correo:");
        jPanel1.add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        lblTelefono.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblTelefono.setText("Telefono:");
        jPanel1.add(lblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        lblFechNacimiento.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblFechNacimiento.setText("Fecha nacimiento:");
        jPanel1.add(lblFechNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        lblCargo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCargo.setText("Cargo:");
        jPanel1.add(lblCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        lblUsuario.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblUsuario.setText("Usuario:");
        jPanel1.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        txtApellido.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 220, -1));

        txtID.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 220, -1));

        txtCorreo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 220, -1));

        txtTelefono.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 220, -1));

        txtNombres.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 220, -1));

        jTextField1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 220, -1));

        jComboBox1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE CARGO" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 206, -1));

        btnCancelar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancel_stop_exit_1583.png"))); // NOI18N
        btnCancelar.setText("CANCELAR");
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 379, -1, -1));

        btnGuardar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/_active__save.png"))); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 379, 172, 73));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1487716858-add-user_81636 (1).png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 40, 30));
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 220, -1));

        lblContraseña.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblContraseña.setText("Contraseña:");
        jPanel1.add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        jPasswordField1.setText("jPasswordField1");
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 220, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51)));
        jPanel2.setForeground(new java.awt.Color(255, 255, 51));

        lblBuscarpor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblBuscarpor.setText("Buscar por: ");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE UNA OPCION ", "APELLIDOS", "NOMBRES", "DUI", "USUARIO" }));

        btnBuscar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/search_find_client_user_16693.png"))); // NOI18N
        btnBuscar.setText("BUSCAR");

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51)));
        jTable1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "APELLIDO", "FECHA DE NACIMIENTO", "DIRECCIÓN", "E-MAIL", "CARGO", "ROL"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnModificar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar.png"))); // NOI18N
        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/trash_full_recycle_delete_delete_9751.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblBuscarpor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscar)
                .addContainerGap(240, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminar)
                .addGap(42, 42, 42))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBuscarpor)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(64, 64, 64))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
         try
        {
            String query = " insert into contraseña (id_empleado, apellidos,nombres,correo, telefono, fecha_nac, id_cargo, id_rol  )"
            + " values (?, ?, ?, ?, ?, ?)";

           PreparedStatement pst = conn.prepareStatement(query);
           
            pst.setString(1, this.txtID.getText().trim());
            pst.setString(2, this.txtApellido.getText().trim());
            pst.setString(3, this.txtNombres.getText().trim());
            pst.setString(4, this.txtCorreo.getText().trim());
            pst.setString(5, this.txtTelefono.getText().trim());
            pst.setString(6, this.jTextField1.getText().trim());
           // pst.setString(7, this.txtCorreo.getText().trim());
            //pst.setString(8, this.txtCorreo.getText().trim());
           
                  

            //execute the preparedstatement
        pst.executeUpdate();
            //limpiar controles visuales
            this.txtID.setText("");
            this.txtApellido.setText("");
            this.txtNombres.setText("");
            this.txtCorreo.setText("");
            this.txtTelefono.setText("");
            this.jTextField1.setText("");
            

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"HA OCURRIDO UN ERROR: "+e.toString(),
                "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblBuscarpor;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblFechNacimiento;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JLabel txtNuevoEmpleado;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
