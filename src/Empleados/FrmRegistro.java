package Empleados;

import Clases.clsEmpleado;
import Interfaces.intzGestor;
import Seguridad.clsGestor;
import javax.swing.JOptionPane;

/**
 *
 * @author karii
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

        Correo = new javax.swing.JPanel();
        lbinfo = new javax.swing.JLabel();
        separadorEncabezado = new javax.swing.JSeparator();
        IbCodigo = new javax.swing.JLabel();
        txtCodigoEmpleado = new javax.swing.JTextField();
        lbCódigoRequerido = new javax.swing.JLabel();
        cbxTipoDeIdentificacion = new javax.swing.JComboBox<>();
        lbTipoIdentificacion = new javax.swing.JLabel();
        lbTipoIdentificacionRequerido = new javax.swing.JLabel();
        IbIdentificacion = new javax.swing.JLabel();
        txtIdentificacion = new javax.swing.JTextField();
        IbNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        IbPrimerApellido = new javax.swing.JLabel();
        txtPrimerApellido = new javax.swing.JTextField();
        IbSegundoApellido = new javax.swing.JLabel();
        txtSegundoApellido = new javax.swing.JTextField();
        IbCorreo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        IbTelefono = new javax.swing.JLabel();
        IbPuesto = new javax.swing.JLabel();
        txtPuesto = new javax.swing.JTextField();
        IbDireccion = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JFormattedTextField();
        IbDepartamento = new javax.swing.JLabel();
        txtDepartamento = new javax.swing.JTextField();
        lbEstado = new javax.swing.JLabel();
        chkActivo = new javax.swing.JCheckBox();
        chkInactivo = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDireccion = new javax.swing.JTextArea();
        btGuardar = new javax.swing.JButton();
        btLimpiar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Formulario de registro de empleados.");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/icons8-save-16.1.png"))); // NOI18N

        lbinfo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbinfo.setText("Ingrese la informacion solicitad.");

        IbCodigo.setText("Código:");

        txtCodigoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoEmpleadoActionPerformed(evt);
            }
        });

        lbCódigoRequerido.setForeground(new java.awt.Color(153, 0, 0));
        lbCódigoRequerido.setText("*");

        cbxTipoDeIdentificacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el tipo de identificación", "Cédula física", "DIMEX", "DIDI" }));
        cbxTipoDeIdentificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoDeIdentificacionActionPerformed(evt);
            }
        });

        lbTipoIdentificacion.setText("Tipo de identificación:");

        lbTipoIdentificacionRequerido.setForeground(new java.awt.Color(153, 0, 0));
        lbTipoIdentificacionRequerido.setText("*");

        IbIdentificacion.setText("Identificación:");

        IbNombre.setText("Nombre:");

        IbPrimerApellido.setText("Primer apellido:");

        IbSegundoApellido.setText("Segundo apellido:");

        IbCorreo.setText("Correo:");

        IbTelefono.setText("Teléfono:");

        IbPuesto.setText("Puesto");

        IbDireccion.setText("Dirección:");

        try {
            txtTelefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        IbDepartamento.setText("Departamento:");

        lbEstado.setText("Estado:");

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

        txtDireccion.setColumns(20);
        txtDireccion.setRows(5);
        jScrollPane1.setViewportView(txtDireccion);

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

        javax.swing.GroupLayout CorreoLayout = new javax.swing.GroupLayout(Correo);
        Correo.setLayout(CorreoLayout);
        CorreoLayout.setHorizontalGroup(
            CorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CorreoLayout.createSequentialGroup()
                .addGroup(CorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(separadorEncabezado)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CorreoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(CorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CorreoLayout.createSequentialGroup()
                                .addGroup(CorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CorreoLayout.createSequentialGroup()
                                        .addComponent(IbIdentificacion)
                                        .addGap(18, 18, 18))
                                    .addGroup(CorreoLayout.createSequentialGroup()
                                        .addGroup(CorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(CorreoLayout.createSequentialGroup()
                                                .addComponent(IbCodigo)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbCódigoRequerido))
                                            .addComponent(IbPrimerApellido))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(CorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCodigoEmpleado)
                                    .addComponent(txtIdentificacion)
                                    .addComponent(txtPrimerApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)))
                            .addGroup(CorreoLayout.createSequentialGroup()
                                .addGroup(CorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(IbCorreo)
                                    .addComponent(IbPuesto))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(CorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCorreo)
                                    .addComponent(txtPuesto, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE))))
                        .addGap(48, 48, 48)
                        .addGroup(CorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(CorreoLayout.createSequentialGroup()
                                .addComponent(lbTipoIdentificacion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbTipoIdentificacionRequerido))
                            .addComponent(IbSegundoApellido)
                            .addComponent(IbTelefono)
                            .addComponent(lbEstado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CorreoLayout.createSequentialGroup()
                                .addComponent(chkActivo)
                                .addGap(43, 43, 43)
                                .addComponent(chkInactivo))
                            .addGroup(CorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cbxTipoDeIdentificacion, 0, 248, Short.MAX_VALUE)
                                .addComponent(txtNombre)
                                .addComponent(txtSegundoApellido)
                                .addComponent(txtTelefono)))
                        .addGap(428, 428, 428))
                    .addGroup(CorreoLayout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addComponent(lbinfo))
                    .addGroup(CorreoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(CorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CorreoLayout.createSequentialGroup()
                                .addComponent(IbDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(IbDireccion))))
                .addContainerGap())
            .addGroup(CorreoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(CorreoLayout.createSequentialGroup()
                        .addComponent(btGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(btLimpiar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 786, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CorreoLayout.setVerticalGroup(
            CorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CorreoLayout.createSequentialGroup()
                .addGroup(CorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CorreoLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lbinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(separadorEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(CorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxTipoDeIdentificacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(CorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(IbCodigo)
                                .addComponent(txtCodigoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbCódigoRequerido)
                                .addComponent(lbTipoIdentificacion)
                                .addComponent(lbTipoIdentificacionRequerido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(CorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CorreoLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtNombre))
                            .addGroup(CorreoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(CorreoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(CorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IbNombre)
                            .addComponent(IbIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IbPrimerApellido)
                    .addComponent(txtPrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IbSegundoApellido)
                    .addComponent(txtSegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IbCorreo)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IbTelefono)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IbPuesto)
                    .addComponent(txtPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEstado)
                    .addComponent(chkActivo)
                    .addComponent(chkInactivo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IbDepartamento)
                    .addComponent(txtDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(IbDireccion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btGuardar)
                    .addComponent(btLimpiar))
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 798, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Correo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkInactivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkInactivoActionPerformed
        if (this.chkActivo.isSelected()) {
            this.chkActivo.setSelected(false);
        }
    }//GEN-LAST:event_chkInactivoActionPerformed

    private void chkActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkActivoActionPerformed
        if (this.chkInactivo.isSelected()) {
            this.chkInactivo.setSelected(false);
        }
    }//GEN-LAST:event_chkActivoActionPerformed

    private void txtCodigoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoEmpleadoActionPerformed

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
        if (this.txtCodigoEmpleado.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "El código es requerido.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            this.txtCodigoEmpleado.requestFocus();
            return;
        }
        if (this.cbxTipoDeIdentificacion.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(this, "El tipo de identificación es requerida.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            this.cbxTipoDeIdentificacion.requestFocus();
            return;
        }
        if (this.txtNombre.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "El nombre es requerido.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            this.txtNombre.requestFocus();
            return;
        }
        
        if (this.txtPrimerApellido.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "El primer apellido es requerido.", "Aviso", JOptionPane.WARNING_MESSAGE);
            this.txtPrimerApellido.requestFocus();
            return;
        }
        if (this.txtSegundoApellido.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "El segundo apellido es requerido.", "Aviso", JOptionPane.WARNING_MESSAGE);
            this.txtSegundoApellido.requestFocus();
            return;
        }
        if (this.txtIdentificacion.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "La identificación es requerida.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            this.txtIdentificacion.requestFocus();
            return;
        }
        if (this.txtTelefono.getText().trim().equals("") || this.txtTelefono.getValue() == null) {
            JOptionPane.showMessageDialog(this, "El teléfono es requerido.", "Aviso", JOptionPane.WARNING_MESSAGE);
            this.txtTelefono.requestFocus();
            return;
        }
        if (this.txtCorreo.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "El correo es requerido.", "Aviso", JOptionPane.WARNING_MESSAGE);
            this.txtCorreo.requestFocus();
            return;
        }
        if (this.txtDepartamento.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "El departamento es requerido.", "Aviso", JOptionPane.WARNING_MESSAGE);
            this.txtDepartamento.requestFocus();
            return;
        }
        if (this.txtPuesto.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "El puesto es requerido.", "Aviso", JOptionPane.WARNING_MESSAGE);
            this.txtPuesto.requestFocus();
            return;
        }
        if (!this.chkActivo.isSelected() && !this.chkInactivo.isSelected()) {
            JOptionPane.showMessageDialog(this, "Marque un estado.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        if (this.txtDireccion.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Introduzca la direacción del empleado.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            this.txtDireccion.requestFocus();
            return;
        }

        intzGestor myGestor = new clsGestor();

        boolean estado;
        if (this.chkActivo.isSelected()) {
            estado = true;
        } else {
            estado = false;
        }
        
 
        
     clsEmpleado myEmpleado = new clsEmpleado(
                0,
                this.txtCodigoEmpleado.getText(),
                this.cbxTipoDeIdentificacion.getSelectedItem().toString(),
                this.txtIdentificacion.getText(),
                this.txtNombre.getText(),
                this.txtPrimerApellido.getText(),
                this.txtSegundoApellido.getText(),
                this.txtDireccion.getText(),             
                this.txtPuesto.getText(),
                this.txtCorreo.getText(),
                this.txtTelefono.getText(),
                this.txtDepartamento.getText(),
                estado);

        boolean operacion = myGestor.GuardarEmpleado(myEmpleado);

        if (true) {
            JOptionPane.showMessageDialog(this, "Se guardo la información correctamente.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            this.LimpiarFormulario();
            this.txtCodigoEmpleado.requestFocus();
        } else {
            JOptionPane.showMessageDialog(this, "No se logro guardar la información correctamente, Intentar nuevamente.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btGuardarActionPerformed

    private void btLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpiarActionPerformed
        this.LimpiarFormulario();
    }//GEN-LAST:event_btLimpiarActionPerformed
    private void LimpiarFormulario() {
        this.txtCodigoEmpleado.setText("");
        this.cbxTipoDeIdentificacion.setSelectedIndex(0);
        this.txtIdentificacion.setText("");
        this.txtNombre.setText("");
        this.txtPrimerApellido.setText("");
        this.txtSegundoApellido.setText("");
        this.txtTelefono.setText("");
        this.txtCorreo.setText("");
        this.txtDepartamento.setText("");
        this.txtPuesto.setText("");
        this.chkInactivo.setSelected(false);
        this.chkActivo.setSelected(false);
        this.txtDireccion.setText("");
    }
    private void cbxTipoDeIdentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoDeIdentificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxTipoDeIdentificacionActionPerformed

    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Correo;
    private javax.swing.JLabel IbCodigo;
    private javax.swing.JLabel IbCorreo;
    private javax.swing.JLabel IbDepartamento;
    private javax.swing.JLabel IbDireccion;
    private javax.swing.JLabel IbIdentificacion;
    private javax.swing.JLabel IbNombre;
    private javax.swing.JLabel IbPrimerApellido;
    private javax.swing.JLabel IbPuesto;
    private javax.swing.JLabel IbSegundoApellido;
    private javax.swing.JLabel IbTelefono;
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton btLimpiar;
    private javax.swing.JComboBox<String> cbxTipoDeIdentificacion;
    private javax.swing.JCheckBox chkActivo;
    private javax.swing.JCheckBox chkInactivo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCódigoRequerido;
    private javax.swing.JLabel lbEstado;
    private javax.swing.JLabel lbTipoIdentificacion;
    private javax.swing.JLabel lbTipoIdentificacionRequerido;
    private javax.swing.JLabel lbinfo;
    private javax.swing.JSeparator separadorEncabezado;
    private javax.swing.JTextField txtCodigoEmpleado;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDepartamento;
    private javax.swing.JTextArea txtDireccion;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrimerApellido;
    private javax.swing.JTextField txtPuesto;
    private javax.swing.JTextField txtSegundoApellido;
    private javax.swing.JFormattedTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
