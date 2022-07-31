package Empleados;

import Clases.clsEmpleado;
import Interfaces.intzGestor;
import Seguridad.clsGestor;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author karii
 */
public class FrmActualizar extends javax.swing.JInternalFrame {
    
 private Object btnActualizar;
    private clsGestor myGestor;
    private int idEmpleado;

    /**
     * Creates new form FrmActualizar
     */
    public FrmActualizar() {
        initComponents();
        this.myGestor = new clsGestor();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelActualizar = new javax.swing.JPanel();
        lbInformacionFiltrar = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        lbBuscar = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnLimpiarBuscador = new javax.swing.JButton();
        IbCodigo = new javax.swing.JLabel();
        txtCodigoEmpleado = new javax.swing.JTextField();
        IbIdentificacion = new javax.swing.JLabel();
        txtIdentificacion = new javax.swing.JTextField();
        IbPrimerApellido = new javax.swing.JLabel();
        txtPrimerApellido = new javax.swing.JTextField();
        IbCorreo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        IbPuesto = new javax.swing.JLabel();
        txtPuesto = new javax.swing.JTextField();
        IbDepartamento = new javax.swing.JLabel();
        txtDepartamento = new javax.swing.JTextField();
        lbTipoIdentificacion = new javax.swing.JLabel();
        cbxTipoDeIdentificacion = new javax.swing.JComboBox<>();
        IbNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        IbSegundoApellido = new javax.swing.JLabel();
        txtSegundoApellido = new javax.swing.JTextField();
        IbTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JFormattedTextField();
        lbEstado = new javax.swing.JLabel();
        chkActivo = new javax.swing.JCheckBox();
        chkInactivo = new javax.swing.JCheckBox();
        IbDireccion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDireccion = new javax.swing.JTextArea();
        btActualizar = new javax.swing.JButton();
        btLimpiar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Actualización de empleados.");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/update-16.png"))); // NOI18N

        lbInformacionFiltrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbInformacionFiltrar.setText("Ingrese el código de empleado");

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarKeyPressed(evt);
            }
        });

        lbBuscar.setText("Buscar:");

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/icons8-search-16.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        btnBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnBuscarKeyPressed(evt);
            }
        });

        btnLimpiarBuscador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/clean-16.png"))); // NOI18N
        btnLimpiarBuscador.setText("Limpiar");
        btnLimpiarBuscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarBuscadorActionPerformed(evt);
            }
        });

        IbCodigo.setText("Código:");

        txtCodigoEmpleado.setEditable(false);
        txtCodigoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoEmpleadoActionPerformed(evt);
            }
        });

        IbIdentificacion.setText("Identificación:");

        IbPrimerApellido.setText("Primer apellido:");

        IbCorreo.setText("Correo:");

        IbPuesto.setText("Puesto");

        IbDepartamento.setText("Departamento:");

        lbTipoIdentificacion.setText("Tipo de identificación:");

        cbxTipoDeIdentificacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el tipo de identificación", "Cédula física", "DIMEX", "DIDI" }));
        cbxTipoDeIdentificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoDeIdentificacionActionPerformed(evt);
            }
        });

        IbNombre.setText("Nombre:");

        IbSegundoApellido.setText("Segundo apellido:");

        IbTelefono.setText("Teléfono:");

        try {
            txtTelefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

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

        IbDireccion.setText("Dirección:");

        txtDireccion.setColumns(20);
        txtDireccion.setRows(5);
        jScrollPane1.setViewportView(txtDireccion);

        btActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/save-16.png"))); // NOI18N
        btActualizar.setText("Actualizar");
        btActualizar.setEnabled(false);
        btActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btActualizarActionPerformed(evt);
            }
        });

        btLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/clean-16.png"))); // NOI18N
        btLimpiar.setText("Limpiar");
        btLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelActualizarLayout = new javax.swing.GroupLayout(panelActualizar);
        panelActualizar.setLayout(panelActualizarLayout);
        panelActualizarLayout.setHorizontalGroup(
            panelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelActualizarLayout.createSequentialGroup()
                .addGroup(panelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelActualizarLayout.createSequentialGroup()
                            .addGap(184, 184, 184)
                            .addComponent(lbBuscar)
                            .addGap(18, 18, 18)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelActualizarLayout.createSequentialGroup()
                            .addGroup(panelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelActualizarLayout.createSequentialGroup()
                                    .addGap(14, 14, 14)
                                    .addGroup(panelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(panelActualizarLayout.createSequentialGroup()
                                            .addComponent(IbCodigo)
                                            .addGap(47, 47, 47)
                                            .addComponent(txtCodigoEmpleado))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelActualizarLayout.createSequentialGroup()
                                            .addComponent(IbPrimerApellido)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtPrimerApellido))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelActualizarLayout.createSequentialGroup()
                                            .addComponent(IbIdentificacion)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panelActualizarLayout.createSequentialGroup()
                                            .addGroup(panelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(panelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(IbPuesto)
                                                    .addComponent(IbCorreo))
                                                .addGroup(panelActualizarLayout.createSequentialGroup()
                                                    .addGap(3, 3, 3)
                                                    .addGroup(panelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(IbDireccion)
                                                        .addComponent(IbDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGap(1, 1, 1)
                                            .addGroup(panelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtCorreo)
                                                .addComponent(txtPuesto)
                                                .addComponent(txtDepartamento)))))
                                .addGroup(panelActualizarLayout.createSequentialGroup()
                                    .addGap(290, 290, 290)
                                    .addComponent(btnBuscar)))
                            .addGroup(panelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelActualizarLayout.createSequentialGroup()
                                    .addGap(29, 29, 29)
                                    .addGroup(panelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbTipoIdentificacion)
                                        .addComponent(IbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(IbSegundoApellido)
                                        .addComponent(IbTelefono)
                                        .addComponent(lbEstado))
                                    .addGap(18, 18, 18)
                                    .addGroup(panelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelActualizarLayout.createSequentialGroup()
                                            .addComponent(chkActivo)
                                            .addGap(43, 43, 43)
                                            .addComponent(chkInactivo))
                                        .addGroup(panelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cbxTipoDeIdentificacion, 0, 233, Short.MAX_VALUE)
                                            .addComponent(txtNombre)
                                            .addComponent(txtSegundoApellido)
                                            .addComponent(txtTelefono))))
                                .addGroup(panelActualizarLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnLimpiarBuscador))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelActualizarLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(panelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelActualizarLayout.createSequentialGroup()
                                    .addComponent(btActualizar)
                                    .addGap(18, 18, 18)
                                    .addComponent(btLimpiar)))))
                    .addGroup(panelActualizarLayout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addComponent(lbInformacionFiltrar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelActualizarLayout.setVerticalGroup(
            panelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelActualizarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbInformacionFiltrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbBuscar))
                .addGap(18, 18, 18)
                .addGroup(panelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLimpiarBuscador, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(panelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCodigoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbTipoIdentificacion)
                        .addComponent(cbxTipoDeIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(IbCodigo))
                .addGap(29, 29, 29)
                .addGroup(panelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IbIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IbNombre)
                    .addComponent(txtNombre))
                .addGap(18, 18, 18)
                .addGroup(panelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IbPrimerApellido)
                    .addComponent(txtPrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IbSegundoApellido)
                    .addComponent(txtSegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IbCorreo)
                    .addGroup(panelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(IbTelefono)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IbPuesto)
                    .addGroup(panelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbEstado)
                        .addComponent(chkActivo)
                        .addComponent(chkInactivo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IbDepartamento)
                    .addComponent(txtDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(IbDireccion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(panelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btActualizar)
                    .addComponent(btLimpiar))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed

    }//GEN-LAST:event_txtBuscarActionPerformed

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.Buscar();
        }
    }//GEN-LAST:event_txtBuscarKeyPressed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        this.txtBuscar.requestFocus();
        this.Buscar();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnBuscarKeyPressed
          if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.Buscar();
          }
    }//GEN-LAST:event_btnBuscarKeyPressed

    private void btnLimpiarBuscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarBuscadorActionPerformed
        this.txtBuscar.setText("");
        this.txtBuscar.requestFocus();
        this.btActualizar.setEnabled(false);
    }//GEN-LAST:event_btnLimpiarBuscadorActionPerformed

    private void txtCodigoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoEmpleadoActionPerformed

    private void cbxTipoDeIdentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoDeIdentificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxTipoDeIdentificacionActionPerformed

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

    private void btActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btActualizarActionPerformed
        if (this.txtCodigoEmpleado.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "El código es requerido.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            this.txtCodigoEmpleado.requestFocus();
            return;
        }
        if (this.cbxTipoDeIdentificacion.getSelectedIndex() == 0) {
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

         this.myGestor = new clsGestor();

        boolean estado;
        if (this.chkActivo.isSelected()) {
            estado = true;
        } else {
            estado = false;
        }

        clsEmpleado myEmpleado = new clsEmpleado(
                this.idEmpleado,
                this.txtCodigoEmpleado.getText().trim(),
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

        boolean operacion = myGestor.ActualizarEmpleado(myEmpleado);

        if (operacion) {
            JOptionPane.showMessageDialog(this, "Se completó la actualización correctamente.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            this.LimpiarFormulario();
            this.txtCodigoEmpleado.requestFocus();
            this.btActualizar.setEnabled(false);        
        } else {
            JOptionPane.showMessageDialog(this, "No se logro guardar la información correctamente, Intentar nuevamentepara actualizar.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btActualizarActionPerformed

    private void btLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpiarActionPerformed
        this.LimpiarFormulario();
    }

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
        this.btActualizar.setEnabled(false);


    }//GEN-LAST:event_btLimpiarActionPerformed
    private void Buscar() {
        String codigo = this.txtBuscar.getText().trim().toLowerCase();
        
        if (!codigo.isBlank() && !codigo.isEmpty()) {
            clsEmpleado myEmpleado = this.myGestor.ConsultarEmpleado(Integer.valueOf(title));
            
            if (myEmpleado != null && myEmpleado.getIdEmpleado() > 0) {
                this.btActualizar.setEnabled(true);
                this.idEmpleado = myEmpleado.getIdEmpleado();
                this.txtCodigoEmpleado.setText(myEmpleado.getCodigo());
                this.cbxTipoDeIdentificacion.setSelectedItem(myEmpleado.getTipoIdentificacion());
                this.txtIdentificacion.setText(myEmpleado.getIdentificacion());
                this.txtNombre.setText(myEmpleado.getNombre());
                this.txtPrimerApellido.setText(myEmpleado.getPrimerApellido());
                this.txtSegundoApellido.setText(myEmpleado.getSegundoApellido());
                this.txtCorreo.setText(myEmpleado.getCorreo());
                this.txtTelefono.setText(myEmpleado.getTelefono());
                this.txtPuesto.setText(myEmpleado.getPuesto());
                if (myEmpleado.isEstado()) {
                    chkActivo.setSelected(true);
                } else {
                    chkInactivo.setSelected(true);
                    this.txtDepartamento.setText(myEmpleado.getDepartamento());
                    this.txtDireccion.setText(myEmpleado.getDireccion());
                }
                this.btActualizar.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(this, "El código ingresado no corresponde a ninguno de nuestros empleados.",
                        "Aviso", JOptionPane.WARNING_MESSAGE);
                this.btActualizar.setEnabled(false);
                this.txtBuscar.setText("");
                this.LimpiarFormulario();
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JButton btActualizar;
    private javax.swing.JButton btLimpiar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnLimpiarBuscador;
    private javax.swing.JComboBox<String> cbxTipoDeIdentificacion;
    private javax.swing.JCheckBox chkActivo;
    private javax.swing.JCheckBox chkInactivo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbBuscar;
    private javax.swing.JLabel lbEstado;
    private javax.swing.JLabel lbInformacionFiltrar;
    private javax.swing.JLabel lbTipoIdentificacion;
    private javax.swing.JPanel panelActualizar;
    private javax.swing.JTextField txtBuscar;
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
