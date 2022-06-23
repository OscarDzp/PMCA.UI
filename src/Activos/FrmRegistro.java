/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Activos;

import Clases.clsActivo;
import Interfaces.intzGestor;
import Seguridad.clsGestor;
import javax.swing.JOptionPane;

/**
 *
 * @author oscar
 */
public class FrmRegistro extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmRegistro
     */
    public FrmRegistro() {
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

        panelRegistroActivo = new javax.swing.JPanel();
        lbinfo = new javax.swing.JLabel();
        separadorEncabezado = new javax.swing.JSeparator();
        lbCódigo = new javax.swing.JLabel();
        lbCódigoRequerido = new javax.swing.JLabel();
        txtCódigo = new javax.swing.JTextField();
        lbNombre = new javax.swing.JLabel();
        lbNombreRequerido = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lbCantidad = new javax.swing.JLabel();
        lbCantidadRequerida = new javax.swing.JLabel();
        lbTipo = new javax.swing.JLabel();
        lbTipoRequerido = new javax.swing.JLabel();
        comboxTipo = new javax.swing.JComboBox<>();
        txtCantidad = new javax.swing.JFormattedTextField();
        lbEstado = new javax.swing.JLabel();
        lbEstadoRequerido = new javax.swing.JLabel();
        chkActivo = new javax.swing.JCheckBox();
        chkInactivo = new javax.swing.JCheckBox();
        lbFragilidad = new javax.swing.JLabel();
        lbFragilidadRequerido = new javax.swing.JLabel();
        comboxFragilidad = new javax.swing.JComboBox<>();
        lbDescripción = new javax.swing.JLabel();
        lbDescripcionRequerida = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtareaDescripción = new javax.swing.JTextArea();
        btGuardar = new javax.swing.JButton();
        btLimpiar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Formulario de registro de activos.");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/icons8-save-16.png"))); // NOI18N

        lbinfo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbinfo.setText("Ingrese la informacion de los activos.");

        lbCódigo.setText("Código:");

        lbCódigoRequerido.setForeground(new java.awt.Color(153, 0, 0));
        lbCódigoRequerido.setText("*");

        txtCódigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCódigoActionPerformed(evt);
            }
        });

        lbNombre.setText("Nombre:");

        lbNombreRequerido.setForeground(new java.awt.Color(153, 0, 0));
        lbNombreRequerido.setText("*");

        lbCantidad.setText("Cantidad:");

        lbCantidadRequerida.setForeground(new java.awt.Color(153, 0, 0));
        lbCantidadRequerida.setText("*");

        lbTipo.setText("Tipo:");

        lbTipoRequerido.setForeground(new java.awt.Color(153, 0, 0));
        lbTipoRequerido.setText("*");

        comboxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el tipo", "Celular", "Equipo de computo", "Muebles y enseres", "Tablets", "Vehículos ", " ", " " }));

        txtCantidad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        lbEstado.setText("Estado:");

        lbEstadoRequerido.setForeground(new java.awt.Color(153, 0, 0));
        lbEstadoRequerido.setText("*");

        chkActivo.setText("Activo");
        chkActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkActivoActionPerformed(evt);
            }
        });

        chkInactivo.setText("Inactivo");
        chkInactivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkInactivoActionPerformed(evt);
            }
        });

        lbFragilidad.setText("Fragilidad:");

        lbFragilidadRequerido.setForeground(new java.awt.Color(204, 0, 0));
        lbFragilidadRequerido.setText("*");

        comboxFragilidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione la fragilidad", "Muy Frágil", "Frágil", "Normal", "Resistente\t", "Muy Resistente" }));

        lbDescripción.setText("Descripción:");

        lbDescripcionRequerida.setForeground(new java.awt.Color(204, 0, 0));
        lbDescripcionRequerida.setText("*");

        javax.swing.GroupLayout panelRegistroActivoLayout = new javax.swing.GroupLayout(panelRegistroActivo);
        panelRegistroActivo.setLayout(panelRegistroActivoLayout);
        panelRegistroActivoLayout.setHorizontalGroup(
            panelRegistroActivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegistroActivoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbinfo)
                .addGap(193, 193, 193))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegistroActivoLayout.createSequentialGroup()
                .addComponent(separadorEncabezado)
                .addContainerGap())
            .addGroup(panelRegistroActivoLayout.createSequentialGroup()
                .addGroup(panelRegistroActivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegistroActivoLayout.createSequentialGroup()
                        .addGroup(panelRegistroActivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCódigo)
                            .addComponent(lbNombre)
                            .addComponent(lbCantidad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbCódigoRequerido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCódigo, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRegistroActivoLayout.createSequentialGroup()
                        .addGroup(panelRegistroActivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRegistroActivoLayout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(panelRegistroActivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbNombreRequerido, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbCantidadRequerida)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegistroActivoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbDescripción)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelRegistroActivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                            .addComponent(txtCantidad)
                            .addComponent(lbDescripcionRequerida))))
                .addGap(18, 18, 18)
                .addGroup(panelRegistroActivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegistroActivoLayout.createSequentialGroup()
                        .addComponent(lbFragilidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbFragilidadRequerido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboxFragilidad, 0, 181, Short.MAX_VALUE))
                    .addGroup(panelRegistroActivoLayout.createSequentialGroup()
                        .addComponent(lbEstado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbEstadoRequerido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkActivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkInactivo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelRegistroActivoLayout.createSequentialGroup()
                        .addComponent(lbTipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbTipoRequerido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboxTipo, 0, 204, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelRegistroActivoLayout.setVerticalGroup(
            panelRegistroActivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistroActivoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbinfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separadorEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRegistroActivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboxTipo)
                    .addGroup(panelRegistroActivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbCódigo)
                        .addComponent(lbCódigoRequerido)
                        .addComponent(txtCódigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbTipo)
                        .addComponent(lbTipoRequerido)))
                .addGap(18, 18, 18)
                .addGroup(panelRegistroActivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNombre)
                    .addComponent(lbNombreRequerido)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEstado)
                    .addComponent(lbEstadoRequerido)
                    .addComponent(chkActivo)
                    .addComponent(chkInactivo))
                .addGap(18, 18, 18)
                .addGroup(panelRegistroActivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCantidad)
                    .addComponent(lbCantidadRequerida)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbFragilidad)
                    .addComponent(lbFragilidadRequerido)
                    .addComponent(comboxFragilidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(panelRegistroActivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbDescripción, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbDescripcionRequerida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        txtareaDescripción.setColumns(20);
        txtareaDescripción.setRows(5);
        jScrollPane1.setViewportView(txtareaDescripción);

        btGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/save-16.png"))); // NOI18N
        btGuardar.setText("Guardar");
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });

        btLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/clean-16.png"))); // NOI18N
        btLimpiar.setText("Limpiar");
        btLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRegistroActivo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btLimpiar)
                        .addGap(18, 18, 18)
                        .addComponent(btGuardar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelRegistroActivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btGuardar)
                    .addComponent(btLimpiar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCódigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCódigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCódigoActionPerformed

    private void chkActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkActivoActionPerformed
        if (this.chkInactivo.isSelected()) {
            this.chkInactivo.setSelected(false);
        }
    }//GEN-LAST:event_chkActivoActionPerformed

    private void chkInactivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkInactivoActionPerformed
        if (this.chkActivo.isSelected()) {
            this.chkActivo.setSelected(false);
        }
    }//GEN-LAST:event_chkInactivoActionPerformed

    private void btLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpiarActionPerformed
      this.LimpiarFormulario();

    }//GEN-LAST:event_btLimpiarActionPerformed
private void LimpiarFormulario(){
  this.txtCantidad.setText("");
        this.txtCantidad.setValue(null);
        this.txtCódigo.setText("");
        this.txtNombre.setText("");
        this.txtareaDescripción.setText("");
        this.comboxTipo.setSelectedIndex(0);
        this.comboxFragilidad.setSelectedIndex(0);
        this.chkActivo.setSelected(false);
        this.chkInactivo.setSelected(false);
}
    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
        if (this.txtCódigo.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "El código es requerido.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            this.txtCódigo.requestFocus();
            return;
        }
        if (this.comboxTipo.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Seleccione un tipo de activo.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            this.comboxTipo.requestFocus();
            return;
        }
        if (this.txtNombre.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "El nombre es requerido.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            this.txtNombre.requestFocus();
            return;
        }
        if (!this.chkActivo.isSelected() && !this.chkInactivo.isSelected()) {
            JOptionPane.showMessageDialog(this, "Marque un estado.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (this.txtCantidad.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "La cantidad es requerida.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            this.txtCantidad.requestFocus();
            return;
        }
        if (this.comboxFragilidad.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Seleccione la fragilidad del activo.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            this.comboxFragilidad.requestFocus();
            return;
        }
        if (this.txtareaDescripción.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Introduzca la descripcion del activo.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            this.txtareaDescripción.requestFocus();
            return;
        }
        // creacion de objectos.
        intzGestor myGestor = new clsGestor();

        //estado en que nace el activo.
        boolean estado;
        if (this.chkActivo.isSelected()) {
            estado = true;
        } else {
            estado = false;
        }

        // objectos del activo.
        clsActivo myActivo = new clsActivo(
                0,
                this.txtCódigo.getText().trim(),
                this.comboxTipo.getSelectedItem().toString(),
                this.txtNombre.getText().trim(),
                this.txtareaDescripción.getText().trim(),
                estado,
                Integer.parseInt(this.txtCantidad.getValue().toString()),
                this.comboxFragilidad.getSelectedItem().toString());

        // operacion de registro.
        boolean operacion = myGestor.GuardarActivo(myActivo);
        // validar resultaddo.
        if (operacion) {
            JOptionPane.showMessageDialog(this, "Se guardo la información correctamente.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
             this.LimpiarFormulario();
             this.txtCódigo.requestFocus();
        } else {
            JOptionPane.showMessageDialog(this, "No se logro guardar la información correctamente, Intentar nuevamente.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton btLimpiar;
    private javax.swing.JCheckBox chkActivo;
    private javax.swing.JCheckBox chkInactivo;
    private javax.swing.JComboBox<String> comboxFragilidad;
    private javax.swing.JComboBox<String> comboxTipo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCantidad;
    private javax.swing.JLabel lbCantidadRequerida;
    private javax.swing.JLabel lbCódigo;
    private javax.swing.JLabel lbCódigoRequerido;
    private javax.swing.JLabel lbDescripcionRequerida;
    private javax.swing.JLabel lbDescripción;
    private javax.swing.JLabel lbEstado;
    private javax.swing.JLabel lbEstadoRequerido;
    private javax.swing.JLabel lbFragilidad;
    private javax.swing.JLabel lbFragilidadRequerido;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbNombreRequerido;
    private javax.swing.JLabel lbTipo;
    private javax.swing.JLabel lbTipoRequerido;
    private javax.swing.JLabel lbinfo;
    private javax.swing.JPanel panelRegistroActivo;
    private javax.swing.JSeparator separadorEncabezado;
    private javax.swing.JFormattedTextField txtCantidad;
    private javax.swing.JTextField txtCódigo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextArea txtareaDescripción;
    // End of variables declaration//GEN-END:variables
}
