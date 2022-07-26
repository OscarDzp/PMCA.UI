package Empleados;

import Clases.clsEmpleado;
import Seguridad.clsGestor;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author karii
 */
public class FrmListar extends javax.swing.JInternalFrame {

    private clsGestor myGestor;

    /**
     * Creates new form FrmListar
     */
    public FrmListar() {
        this.myGestor = new clsGestor();
        initComponents();
        this.CargarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tListaEmpleados = new javax.swing.JPanel();
        lbInformacionFiltrar = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        lbBuscar = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnLimpiarBuscador = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListarEmpleado = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Lista de empleados registrados.");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/list-16.png"))); // NOI18N

        lbInformacionFiltrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbInformacionFiltrar.setText("Ingrese el código de empleado.");

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

        tblListarEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Tipo ID", "Identificación", "Nombre", "1° Apellido", "2° Apellido", "Dirección", "Puesto", "Correo", "Teléfono", "Departamento", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblListarEmpleado);

        javax.swing.GroupLayout tListaEmpleadosLayout = new javax.swing.GroupLayout(tListaEmpleados);
        tListaEmpleados.setLayout(tListaEmpleadosLayout);
        tListaEmpleadosLayout.setHorizontalGroup(
            tListaEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tListaEmpleadosLayout.createSequentialGroup()
                .addContainerGap(280, Short.MAX_VALUE)
                .addComponent(lbBuscar)
                .addGap(18, 18, 18)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(325, 325, 325))
            .addGroup(tListaEmpleadosLayout.createSequentialGroup()
                .addGroup(tListaEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tListaEmpleadosLayout.createSequentialGroup()
                        .addGap(409, 409, 409)
                        .addComponent(lbInformacionFiltrar))
                    .addGroup(tListaEmpleadosLayout.createSequentialGroup()
                        .addGap(394, 394, 394)
                        .addComponent(btnBuscar)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiarBuscador)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tListaEmpleadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        tListaEmpleadosLayout.setVerticalGroup(
            tListaEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tListaEmpleadosLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbInformacionFiltrar)
                .addGap(18, 18, 18)
                .addGroup(tListaEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tListaEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpiarBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tListaEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tListaEmpleados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.Buscar();
        }
    }//GEN-LAST:event_txtBuscarKeyPressed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        this.Buscar();
        this.txtBuscar.requestFocus();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnBuscarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.Buscar();
        }
    }//GEN-LAST:event_btnBuscarKeyPressed

    private void btnLimpiarBuscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarBuscadorActionPerformed
        this.txtBuscar.setText("");
        this.txtBuscar.requestFocus();
        this.CargarTabla();

    }//GEN-LAST:event_btnLimpiarBuscadorActionPerformed
    private void CargarTabla() {
        ArrayList<clsEmpleado> empleados = this.myGestor.ListarEmpleado();

        String[] columnas = new String[]{
            "Código",
            "TipoId",
            "Identificación",
            "Nombre",
            "1° Apellido",
            "2° Apellido",
            "Dirección",
            "Puesto",
            "Correo",
            "Teléfono",
            "Departamento",
            "Estado"

        };
        DefaultTableModel obModelo = new DefaultTableModel(columnas, 0);
        for (clsEmpleado empleado : empleados) {
            obModelo.addRow(new Object[]{
                empleado.getIdEmpleado(),
                empleado.getCodigo(),
                empleado.getTipoIdentificacion(),
                empleado.getIdentificacion(),
                empleado.getNombre(),
                empleado.getPrimerApellido(),
                empleado.getSegundoApellido(),
                empleado.getDireccion(),
                empleado.getPuesto(),
                empleado.getCorreo(),
                empleado.getTelefono(),
                empleado.getDepartamento(),
                this.ObtenerEstado(empleado.isEstado())
            });
        }

        this.tblListarEmpleado.setModel(obModelo);

    }

    private void CargarTabla(ArrayList<clsEmpleado> empleados) {
        String[] columnas = new String[]{
            "Código",
            "TipoId",
            "Identificación",
            "Nombre",
            "1° Apellido",
            "2° Apellido",
            "Dirección",
            "Puesto",
            "Correo",
            "Teléfono",
            "Departamento",
            "Estado"
        };
        DefaultTableModel obModelo = new DefaultTableModel(columnas, 0);
        for (clsEmpleado empleado : empleados) {
            obModelo.addRow(new Object[]{
                empleado.getIdEmpleado(),
                empleado.getCodigo(),
                empleado.getTipoIdentificacion(),
                empleado.getIdentificacion(),
                empleado.getNombre(),
                empleado.getPrimerApellido(),
                empleado.getSegundoApellido(),
                empleado.getDireccion(),
                empleado.getPuesto(),
                empleado.getCorreo(),
                empleado.getTelefono(),
                empleado.getDepartamento(),
                this.ObtenerEstado(empleado.isEstado())
            });
            this.tblListarEmpleado.setModel(obModelo);
        }
        
        private String ObtenerEstado(boolean estado) {
        if (estado) {
            return "Activo";
        } else {
            return "Inactivo";
        }
    }

    private void Buscar() {
        
    
        String valor = this.txtBuscar.getText().trim().toLowerCase();
        
        if (!valor.isEmpty() && !valor.isBlank()) {
            
        
            ArrayList<clsEmpleado> empleados = this.myGestor.ListarEmpleado();
            
            if (empleados != null && !empleados.isEmpty()) {
                List<clsEmpleado> finales = empleados.stream()
                        .filter(empleado -> empleado.getCodigo().trim().toLowerCase().contains(valor)
                        || empleado.getCodigo().trim().toLowerCase().contains(valor)
                        || empleado.getTipoIdentificacion().trim().toLowerCase().contains(valor)
                        || empleado.getIdentificacion().trim().toLowerCase().contains(valor)
                        || empleado.getNombre().trim().toLowerCase().contains(valor)
                        || empleado.getPrimerApellido().trim().toLowerCase().contains(valor)
                        || empleado.getSegundoApellido().trim().toLowerCase().contains(valor)
                        || empleado.getDireccion().trim().toLowerCase().contains(valor)
                        || empleado.getPuesto().trim().toLowerCase().contains(valor)
                        || empleado.getCorreo().trim().toLowerCase().contains(valor)
                        || empleado.getTelefono().trim().toLowerCase().contains(valor)
                        || empleado.getDepartamento().trim().toLowerCase().contains(valor)
                        || (empleado.getIdEmpleado() + "").trim().toLowerCase().contains(valor)
                        ).collect(Collectors.toList());

                this.CargarTabla((ArrayList<clsEmpleado>) finales);
            }
        } else {
            this.CargarTabla();
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnLimpiarBuscador;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbBuscar;
    private javax.swing.JLabel lbInformacionFiltrar;
    private javax.swing.JPanel tListaEmpleados;
    private javax.swing.JTable tblListarEmpleado;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
