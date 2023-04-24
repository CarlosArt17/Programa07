/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package org.uv.programa07;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author minio
 */

public class Productos extends javax.swing.JInternalFrame {
    
    private DAOProducto daoProducto=null;
    private boolean isNew=false;
    public Productos() {
        initComponents();
        daoProducto=new DAOProducto();
        fillData();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnNuevo = new javax.swing.JButton();
        btoGuardar = new javax.swing.JButton();
        btoModificar = new javax.swing.JButton();
        btoEliminar = new javax.swing.JButton();
        Principal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtClave = new javax.swing.JTextField();
        btoBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setTitle("Catálogo de Productos");

        jToolBar1.setRollover(true);

        btnNuevo.setText("Nuevo");
        btnNuevo.setToolTipText("nuevo documento ");
        btnNuevo.setFocusable(false);
        btnNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jToolBar1.add(btnNuevo);

        btoGuardar.setText("Guardar");
        btoGuardar.setToolTipText("Guardar Producto");
        btoGuardar.setFocusable(false);
        btoGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btoGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btoGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoGuardarActionPerformed(evt);
            }
        });
        jToolBar1.add(btoGuardar);

        btoModificar.setText("Modificar");
        btoModificar.setToolTipText("Modificar Producto");
        btoModificar.setFocusable(false);
        btoModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btoModificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btoModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoModificarActionPerformed(evt);
            }
        });
        jToolBar1.add(btoModificar);

        btoEliminar.setText("Eliminar");
        btoEliminar.setToolTipText("Eliminar Producto");
        btoEliminar.setFocusable(false);
        btoEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btoEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btoEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoEliminarActionPerformed(evt);
            }
        });
        jToolBar1.add(btoEliminar);

        getContentPane().add(jToolBar1, java.awt.BorderLayout.PAGE_START);

        jLabel1.setText("Clave");

        jLabel2.setText("Nombre");

        jLabel3.setText("Precio");

        txtClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClaveActionPerformed(evt);
            }
        });

        btoBuscar.setText("Buscar");
        btoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoBuscarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout PrincipalLayout = new javax.swing.GroupLayout(Principal);
        Principal.setLayout(PrincipalLayout);
        PrincipalLayout.setHorizontalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(PrincipalLayout.createSequentialGroup()
                        .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrincipalLayout.createSequentialGroup()
                                .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(604, 604, 604))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrincipalLayout.createSequentialGroup()
                                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(PrincipalLayout.createSequentialGroup()
                                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(195, 195, 195))
                                    .addGroup(PrincipalLayout.createSequentialGroup()
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(187, 187, 187)))
                                .addComponent(btoBuscar)
                                .addGap(334, 334, 334))))))
        );
        PrincipalLayout.setVerticalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btoBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        getContentPane().add(Principal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btoGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoGuardarActionPerformed
        // TODO add your handling code here:
            Producto p=new Producto();
            long id=Long.parseLong(txtClave.getText());
            p.setClave(id);
            p.setNombre(txtNombre.getText());
            double precio=Double.parseDouble(txtPrecio.getText());
            p.setPrecio(precio);
            daoProducto.create(p);
            txtClave.setText(String.valueOf(p.getClave()));
            JOptionPane.showMessageDialog(this, "se guardo");
        
    }//GEN-LAST:event_btoGuardarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        isNew=true;
     
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoBuscarActionPerformed
        // TODO add your handling code here:
        Producto p=daoProducto.findById(Long.parseLong(txtClave.getText()));
        if(p!=null){
            txtNombre.setText(p.getNombre());
            txtPrecio.setText(String.valueOf(p.getPrecio()));
        }else{
            JOptionPane.showMessageDialog(this,"No existe del producto");
        }
    }//GEN-LAST:event_btoBuscarActionPerformed

    private void txtClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClaveActionPerformed

    private void btoModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoModificarActionPerformed
        // TODO add your handling code here:
         Producto p = daoProducto.findById(Long.parseLong(txtClave.getText()));
        p.setNombre(txtNombre.getText());
        double precio = Double.parseDouble(txtPrecio.getText());
        p.setPrecio(precio);
        daoProducto.update(p, Long.parseLong(txtClave.getText()));
        JOptionPane.showMessageDialog(this, "Se actualizo");
    }//GEN-LAST:event_btoModificarActionPerformed

    private void btoEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoEliminarActionPerformed
        // TODO add your handling code here:
        Object [] opciones ={"Aceptar","Cancelar"};
        Producto p = daoProducto.findById(Long.parseLong(txtClave.getText()));
        if (p != null) {
          int eleccion = 
                  JOptionPane.showOptionDialog(rootPane,"En realidad desea eliminar el producto","Mensaje de Confirmacion",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE,null,opciones,"Aceptar");
            if (eleccion == JOptionPane.YES_OPTION){
             daoProducto.delete(p.getClave());
            JOptionPane.showMessageDialog(this, "Se elimino");
           }else{
                 JOptionPane.showMessageDialog(this, "Cancelo la operacion");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Este producto no existe");
        }
    }//GEN-LAST:event_btoEliminarActionPerformed
  public void fillData(){
        List<String> columns = new ArrayList<String>();
        List<String[]> values = new ArrayList<String[]>();
        columns.add("Clave");
        columns.add("Nombre");
        columns.add("Precio");
        
        List<Producto> lstProductor = daoProducto.findAll();
        for(Producto producto : lstProductor){
            values.add(new String[]{String.valueOf(producto.getClave()), 
                producto.getNombre(),String.valueOf(producto.getPrecio())});
        }
        TableModel tablemodel=
                new DefaultTableModel
        (values.toArray(new Object[][] {}), columns.toArray());
        jTable1.setModel(tablemodel);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Principal;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btoBuscar;
    private javax.swing.JButton btoEliminar;
    private javax.swing.JButton btoGuardar;
    private javax.swing.JButton btoModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables



}
