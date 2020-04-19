/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabbo09
 */
public class frmProveedor extends javax.swing.JInternalFrame {

    Connection conn ;
    public frmProveedor() {
        initComponents();
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
        lblcodproveedor = new javax.swing.JLabel();
        lblnomproveedor = new javax.swing.JLabel();
        lbltelefono = new javax.swing.JLabel();
        lbldireccion = new javax.swing.JLabel();
        txtcodproveedor = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        txtnomproveedor = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        lblregistroproduc = new javax.swing.JLabel();
        lblcorreo1 = new javax.swing.JLabel();
        txtcorreo1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        lblcodproveedor2 = new javax.swing.JLabel();
        txtbuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        lblbsucarprovee = new javax.swing.JLabel();

        setIconifiable(true);
        setTitle("Proveedor");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblcodproveedor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblcodproveedor.setText("Codigo Proveedor:");
        jPanel1.add(lblcodproveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        lblnomproveedor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblnomproveedor.setText("Nombre Proveedor:");
        jPanel1.add(lblnomproveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        lbltelefono.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbltelefono.setText("Telefono:");
        jPanel1.add(lbltelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        lbldireccion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbldireccion.setText("Direccion:");
        jPanel1.add(lbldireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        txtcodproveedor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jPanel1.add(txtcodproveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 220, -1));

        txttelefono.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 160, -1));

        txtdireccion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(txtdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 280, -1));

        txtnomproveedor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtnomproveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomproveedorActionPerformed(evt);
            }
        });
        jPanel1.add(txtnomproveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 220, -1));

        btnCancelar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancel_stop_exit_1583.png"))); // NOI18N
        btnCancelar.setText("CANCELAR");
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, -1, -1));

        btnGuardar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/_active__save.png"))); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 379, 172, 73));

        lblregistroproduc.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblregistroproduc.setText("Registro de Proveedor");
        jPanel1.add(lblregistroproduc, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        lblcorreo1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblcorreo1.setText("Correo:");
        jPanel1.add(lblcorreo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        txtcorreo1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(txtcorreo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 280, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51)));
        jPanel2.setForeground(new java.awt.Color(255, 255, 51));

        lblcodproveedor2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblcodproveedor2.setText("Codigo Proveedor: ");

        btnBuscar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        btnBuscar.setText("BUSCAR");

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51)));
        jTable1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CODIGOPROVEEDOR", "NOMBREPROVEEDOR", "TELEFONO", "CORREO", "DIRECCION"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnModificar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar.png"))); // NOI18N
        btnModificar.setText("MODIFICAR");

        btnEliminar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/trash_full_recycle_delete_delete_9751.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");

        lblbsucarprovee.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblbsucarprovee.setText("Buscar Proveedor");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(202, 202, 202)
                                .addComponent(lblcodproveedor2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(btnBuscar))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(426, 426, 426)
                                .addComponent(lblbsucarprovee)))
                        .addGap(187, 187, 187))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnModificar)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminar)
                                .addGap(48, 48, 48))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 862, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(lblbsucarprovee, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcodproveedor2)
                    .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnomproveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomproveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomproveedorActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try
        {
            String query = " insert into Proveedores (id_proveedor, proveedor,telefono,correo,direccion )"
            + " values (?, ?, ?, ?, ?)";

            PreparedStatement pst = conn.prepareStatement(query);

            pst.setString(1, this.txtcodproveedor.getText().trim());
            pst.setString(2, this.txtnomproveedor.getText().trim());
            pst.setString(3, this.txttelefono.getText().trim());
            pst.setString(4, this.txtcorreo1.getText().trim());
            pst.setString(4, this.txtdireccion.getText().trim());

            //execute the preparedstatement
            pst.executeUpdate();
            //limpiar controles visuales
            this.txtcodproveedor.setText("");
            this.txtnomproveedor.setText("");
            this.txttelefono.setText("");
            this.txtcorreo1.setText("");
            this.txtdireccion.setText("");

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"ERROR!...DATOS NO INGRESADOS AL SISTEMA: "+e.toString(),
                "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblbsucarprovee;
    private javax.swing.JLabel lblcodproveedor;
    private javax.swing.JLabel lblcodproveedor2;
    private javax.swing.JLabel lblcorreo1;
    private javax.swing.JLabel lbldireccion;
    private javax.swing.JLabel lblnomproveedor;
    private javax.swing.JLabel lblregistroproduc;
    private javax.swing.JLabel lbltelefono;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtcodproveedor;
    private javax.swing.JTextField txtcorreo1;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtnomproveedor;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
