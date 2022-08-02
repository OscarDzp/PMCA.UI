package Autos;

import Seguridad.clsGestor;
import Clases.clsAutos;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author oscar
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

        jPanel1 = new javax.swing.JPanel();
        jActualizarCarro = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        btnLimpiarBuscador = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        lbBuscar = new javax.swing.JLabel();
        lbInformacionFiltrar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tListarAutos = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setTitle("Lista de autos");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/icons8-list-16.png"))); // NOI18N

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

        lbInformacionFiltrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbInformacionFiltrar.setText("Ingrese el código del Auto.");

        tListarAutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id Auto", "Código", "Estilo de Auto", "Marca", "Motor", "Modelo", "Cilindrada", "Año", "Combustible", "Pasajeros", "Chasis", "Transmision", "Kilometraje", "Valor", "Estado", "Anotaciones"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tListarAutos);

        javax.swing.GroupLayout jActualizarCarroLayout = new javax.swing.GroupLayout(jActualizarCarro);
        jActualizarCarro.setLayout(jActualizarCarroLayout);
        jActualizarCarroLayout.setHorizontalGroup(
            jActualizarCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jActualizarCarroLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbInformacionFiltrar)
                .addGap(499, 499, 499))
            .addGroup(jActualizarCarroLayout.createSequentialGroup()
                .addGroup(jActualizarCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jActualizarCarroLayout.createSequentialGroup()
                        .addGap(382, 382, 382)
                        .addComponent(lbBuscar)
                        .addGap(18, 18, 18)
                        .addGroup(jActualizarCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jActualizarCarroLayout.createSequentialGroup()
                                .addComponent(btnBuscar)
                                .addGap(18, 18, 18)
                                .addComponent(btnLimpiarBuscador))
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jActualizarCarroLayout.setVerticalGroup(
            jActualizarCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jActualizarCarroLayout.createSequentialGroup()
                .addComponent(lbInformacionFiltrar)
                .addGap(12, 12, 12)
                .addGroup(jActualizarCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jActualizarCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiarBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jActualizarCarro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jActualizarCarro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.Buscar();
        }
    }//GEN-LAST:event_txtBuscarKeyPressed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed

    }//GEN-LAST:event_txtBuscarActionPerformed

    private void btnLimpiarBuscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarBuscadorActionPerformed
        this.txtBuscar.setText("");
        this.txtBuscar.requestFocus();
        this.CargarTabla();
    }//GEN-LAST:event_btnLimpiarBuscadorActionPerformed

    private void btnBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnBuscarKeyPressed

    }//GEN-LAST:event_btnBuscarKeyPressed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        this.txtBuscar.requestFocus();
        this.Buscar();
    }//GEN-LAST:event_btnBuscarActionPerformed
    private void CargarTabla() {
        ArrayList<clsAutos> autos = this.myGestor.ListarAutos();
        String[] columnas = new String[]{
            "Id Auto",
            "Código",
            "Estilo de Auto",
            "Marca",
            "Motor",
            "Modelo",
            "Cilindrada",
            "Año",
            "Combustible",
            "Pasajeros",
            "Chasis",
            "Transmision",
            "Kilometraje",
            "Valor",
            "Estado",
            "Anotaciones"
        };
        DefaultTableModel obModelo = new DefaultTableModel(columnas, 0);
        for (clsAutos auto : autos) {
            obModelo.addRow(new Object[]{
               auto.getIdAutos() +"",
                auto.getCodigo(),
                auto.getEstilo(),
                auto.getMarca(),
                auto.getMotor(),
                auto.getModelo(),
                auto.getCilindrada(),
                auto.getAno(),
                auto.getCombustible(),
                auto.getPasajeros(),
                auto.getChasis(),
                auto.getTransmision(),
                auto.getKilometraje(),
                auto.getValor(),
                auto.getEstado(),
                auto.getAnotaciones()
            });
            this.tListarAutos.setModel(obModelo);
        }
    }

    private void CargarTabla(ArrayList<clsAutos> autos) {
        String[] columnas = new String[]{
            "Código",
            "Estilo de Auto",
            "Marca",
            "Motor",
            "Modelo",
            "Cilindrada",
            "Año",
            "Combustible",
            "Pasajeros",
            "Chasis",
            "Transmision",
            "Kilometraje",
            "Valor",
            "Estado",
            "Anotaciones"
        };

        DefaultTableModel obModelo = new DefaultTableModel(columnas, 0);

        for (clsAutos auto : autos) {
            obModelo.addRow(new Object[]{
                auto.getIdAutos() +"",
                auto.getCodigo(),
                auto.getEstilo(),
                auto.getMarca(),
                auto.getMotor(),
                auto.getModelo(),
                auto.getCilindrada(),
                auto.getAno(),
                auto.getCombustible(),
                auto.getPasajeros(),
                auto.getChasis(),
                auto.getTransmision(),
                auto.getKilometraje(),
                auto.getValor(),
                auto.getEstado(),
                auto.getAnotaciones()
            });
        }
        this.tListarAutos.setModel((TableModel) obModelo);
    }

    private void Buscar() {
        String valor = this.txtBuscar.getText().trim().toLowerCase();
        if (!valor.isEmpty() && !valor.isBlank()) {

            ArrayList<clsAutos> autos = this.myGestor.ListarAutos();

            if (autos != null && !autos.isEmpty()) {
                List<clsAutos> finales = autos.stream()
                        .filter(auto -> (auto.getIdAutos() + "").contains(valor)
                        || (auto.getAno() + "").trim().toLowerCase().contains(valor)
                        || auto.getAnotaciones().trim().toLowerCase().contains(valor)
                        || auto.getCodigo().trim().toLowerCase().contains(valor)
                        || auto.getEstilo().trim().toLowerCase().contains(valor)
                        || auto.getMarca().trim().toLowerCase().contains(valor)
                        || auto.getMotor().trim().toLowerCase().contains(valor)
                        || auto.getModelo().trim().toLowerCase().contains(valor)
                        || auto.getCilindrada().trim().toLowerCase().contains(valor)
                        || auto.getCombustible().trim().toLowerCase().contains(valor)
                        || (auto.getPasajeros() + "").trim().toLowerCase().contains(valor)
                        || auto.getChasis().trim().toLowerCase().contains(valor)
                        || auto.getTransmision().trim().toLowerCase().contains(valor)
                        || auto.getKilometraje().trim().toLowerCase().contains(valor)
                        || (auto.getValor() + "").trim().toLowerCase().contains(valor)
                        || auto.getEstado().trim().toLowerCase().contains(valor)
                        ).collect(Collectors.toList());
                this.CargarTabla((ArrayList<clsAutos>) finales);
            }
        } else {
            this.CargarTabla();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnLimpiarBuscador;
    private javax.swing.JPanel jActualizarCarro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbBuscar;
    private javax.swing.JLabel lbInformacionFiltrar;
    private javax.swing.JTable tListarAutos;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
