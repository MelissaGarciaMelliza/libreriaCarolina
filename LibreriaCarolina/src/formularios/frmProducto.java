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
public class frmProducto extends javax.swing.JInternalFrame {

    Connection conn ;
    public frmProducto() {
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
        lblcodproducto = new javax.swing.JLabel();
        lblcodcategoria = new javax.swing.JLabel();
        lblnomproducto = new javax.swing.JLabel();
        lblpreciocompra = new javax.swing.JLabel();
        lblprecioventa = new javax.swing.JLabel();
        lblnumlote = new javax.swing.JLabel();
        txtcodproducto = new javax.swing.JTextField();
        txtnomproducto = new javax.swing.JTextField();
        txtpreciocompra = new javax.swing.JTextField();
        txtprecioventa = new javax.swing.JTextField();
        txtcodcategoria = new javax.swing.JTextField();
        txtnumlote = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        txtNuevoEmpleado1 = new javax.swing.JLabel();
        txtstock = new javax.swing.JTextField();
        lblstock = new javax.swing.JLabel();
        lblFechNacimiento = new javax.swing.JLabel();
        lblFechNacimiento2 = new javax.swing.JLabel();
        lblFechNacimiento3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblbuscarproducto = new javax.swing.JLabel();
        txtbuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtNuevoEmpleado = new javax.swing.JLabel();

        setTitle("Producto");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblcodproducto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblcodproducto.setText("Codigo Producto:");
        jPanel1.add(lblcodproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        lblcodcategoria.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblcodcategoria.setText("Codigo Categoria");
        jPanel1.add(lblcodcategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        lblnomproducto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblnomproducto.setText("Nombre Producto:");
        jPanel1.add(lblnomproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        lblpreciocompra.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblpreciocompra.setText("Precio de Compra:");
        jPanel1.add(lblpreciocompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        lblprecioventa.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblprecioventa.setText("Precio de Venta:");
        jPanel1.add(lblprecioventa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        lblnumlote.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblnumlote.setText("Numero de Lote:");
        jPanel1.add(lblnumlote, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        txtcodproducto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jPanel1.add(txtcodproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 220, -1));

        txtnomproducto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(txtnomproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 220, -1));

        txtpreciocompra.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(txtpreciocompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 120, -1));

        txtprecioventa.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(txtprecioventa, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 100, -1));

        txtcodcategoria.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtcodcategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodcategoriaActionPerformed(evt);
            }
        });
        jPanel1.add(txtcodcategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 220, -1));

        txtnumlote.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(txtnumlote, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 200, -1));

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

        txtNuevoEmpleado1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtNuevoEmpleado1.setText("Registro de Producto");
        jPanel1.add(txtNuevoEmpleado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        txtstock.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(txtstock, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 90, -1));

        lblstock.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblstock.setText("Stock:");
        jPanel1.add(lblstock, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, -1, -1));

        lblFechNacimiento.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblFechNacimiento.setText("N°");
        jPanel1.add(lblFechNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 20, -1));

        lblFechNacimiento2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblFechNacimiento2.setText("$");
        jPanel1.add(lblFechNacimiento2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 10, -1));

        lblFechNacimiento3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblFechNacimiento3.setText("$");
        jPanel1.add(lblFechNacimiento3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 10, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51)));
        jPanel2.setForeground(new java.awt.Color(255, 255, 51));

        lblbuscarproducto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblbuscarproducto.setText("Codigo Producto: ");

        btnBuscar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        btnBuscar.setText("BUSCAR");

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51)));
        jTable1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "CODIGOPRODUCTO", "CODIGOCATEGORIA", "NOMBREPRODUCTO", "PRECIOCOMPRA", "PRECIOVENTA", "E-MAILEXISTENCIA", "NUMEROLOTE"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnModificar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar.png"))); // NOI18N
        btnModificar.setText("MODIFICAR");

        btnEliminar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/trash_full_recycle_delete_delete_9751.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");

        txtNuevoEmpleado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtNuevoEmpleado.setText("Buscar Producto");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(lblbuscarproducto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(btnBuscar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(426, 426, 426)
                        .addComponent(txtNuevoEmpleado)))
                .addContainerGap(536, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(txtNuevoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblbuscarproducto)
                    .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGap(24, 24, 24)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(96, 96, 96))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try
        {
            String query = " insert into Productos (id_producto, id_categoria,producto,precio_compra, precio_venta, existencia, num_lote )"
            + " values (?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement pst = conn.prepareStatement(query);

            pst.setString(1, this.txtnomproducto.getText().trim());
            pst.setString(2, this.txtcodproducto.getText().trim());
            pst.setString(3, this.txtcodcategoria.getText().trim());
            pst.setString(4, this.txtpreciocompra.getText().trim());
            pst.setString(5, this.txtprecioventa.getText().trim());
            pst.setString(6, this.txtnumlote.getText().trim());
           

            //execute the preparedstatement
            pst.executeUpdate();
            //limpiar controles visuales
            this.txtcodproducto.setText("");
            this.txtcodcategoria.setText("");
            this.txtnomproducto.setText("");
            this.txtpreciocompra.setText("");
            this.txtprecioventa.setText("");
            this.txtnumlote.setText("");

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"ERROR!...DATOS NO INGRESADOS AL SISTEMA: "+e.toString(),
                "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtcodcategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodcategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodcategoriaActionPerformed


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
    private javax.swing.JLabel lblFechNacimiento;
    private javax.swing.JLabel lblFechNacimiento2;
    private javax.swing.JLabel lblFechNacimiento3;
    private javax.swing.JLabel lblbuscarproducto;
    private javax.swing.JLabel lblcodcategoria;
    private javax.swing.JLabel lblcodproducto;
    private javax.swing.JLabel lblnomproducto;
    private javax.swing.JLabel lblnumlote;
    private javax.swing.JLabel lblpreciocompra;
    private javax.swing.JLabel lblprecioventa;
    private javax.swing.JLabel lblstock;
    private javax.swing.JLabel txtNuevoEmpleado;
    private javax.swing.JLabel txtNuevoEmpleado1;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtcodcategoria;
    private javax.swing.JTextField txtcodproducto;
    private javax.swing.JTextField txtnomproducto;
    private javax.swing.JTextField txtnumlote;
    private javax.swing.JTextField txtpreciocompra;
    private javax.swing.JTextField txtprecioventa;
    private javax.swing.JTextField txtstock;
    // End of variables declaration//GEN-END:variables
}
