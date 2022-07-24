package Autos;

import Clases.clsAutos;
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

        jPanel2 = new javax.swing.JPanel();
        lbCódigoRequerido = new javax.swing.JLabel();
        lbCantidad1 = new javax.swing.JLabel();
        lbMotor = new javax.swing.JLabel();
        txtMotor = new javax.swing.JTextField();
        lbCilindrada = new javax.swing.JLabel();
        txtAno = new javax.swing.JFormattedTextField();
        txtChasis = new javax.swing.JFormattedTextField();
        lbDescripción = new javax.swing.JLabel();
        lbTipoRequerido = new javax.swing.JLabel();
        txtCilidrada = new javax.swing.JFormattedTextField();
        lbCantidad = new javax.swing.JLabel();
        lbCantidad3 = new javax.swing.JLabel();
        lbCantidad4 = new javax.swing.JLabel();
        lbCantidadRequerida2 = new javax.swing.JLabel();
        txtValor = new javax.swing.JFormattedTextField();
        jlTitulo = new javax.swing.JLabel();
        lbCantidadRequerida5 = new javax.swing.JLabel();
        lbCantidadRequerida6 = new javax.swing.JLabel();
        txtKilometraje = new javax.swing.JFormattedTextField();
        txtMarca = new javax.swing.JTextField();
        lbMarca1 = new javax.swing.JLabel();
        txtPasajeros = new javax.swing.JFormattedTextField();
        txtCombustible = new javax.swing.JFormattedTextField();
        lbCantidadRequerida9 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        lbCódigo = new javax.swing.JLabel();
        lbTipo = new javax.swing.JLabel();
        lbCantidadRequerida7 = new javax.swing.JLabel();
        lbCantidadRequerida4 = new javax.swing.JLabel();
        lbCantidadRequerida1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lbCantidadRequerida = new javax.swing.JLabel();
        lbCódigoRequerido2 = new javax.swing.JLabel();
        lbCantidadRequerida8 = new javax.swing.JLabel();
        lbCódigoRequerido1 = new javax.swing.JLabel();
        lbCombustible = new javax.swing.JLabel();
        lbMarca = new javax.swing.JLabel();
        lbCantidad5 = new javax.swing.JLabel();
        txtTransmision = new javax.swing.JFormattedTextField();
        lbCódigoRequerido3 = new javax.swing.JLabel();
        lbCantidadRequerida3 = new javax.swing.JLabel();
        lbCantidad6 = new javax.swing.JLabel();
        lbCantidad2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAnotaciones = new javax.swing.JTextArea();
        btLimpiar = new javax.swing.JButton();
        comboxTipoEstilo = new javax.swing.JComboBox<>();
        btGuardar = new javax.swing.JButton();
        txtEstado = new javax.swing.JFormattedTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Registrar Vehiculo.");
        setToolTipText("");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/icons8-car-16.png"))); // NOI18N

        lbCódigoRequerido.setForeground(new java.awt.Color(153, 0, 0));
        lbCódigoRequerido.setText("*");

        lbCantidad1.setText("Pasajeros:");

        lbMotor.setText("Motor:");

        txtMotor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMotorActionPerformed(evt);
            }
        });

        lbCilindrada.setText("Cilindrada:");

        txtAno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        txtChasis.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        lbDescripción.setText("Anotaciones del Vehiculo.");

        lbTipoRequerido.setForeground(new java.awt.Color(153, 0, 0));
        lbTipoRequerido.setText("*");

        txtCilidrada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        lbCantidad.setText("Año:");

        lbCantidad3.setText("Transmision:");

        lbCantidad4.setText("Kilometraje:");

        lbCantidadRequerida2.setForeground(new java.awt.Color(153, 0, 0));
        lbCantidadRequerida2.setText("*");

        txtValor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jlTitulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlTitulo.setText("Registrar Autos.");

        lbCantidadRequerida5.setForeground(new java.awt.Color(153, 0, 0));
        lbCantidadRequerida5.setText("*");

        lbCantidadRequerida6.setForeground(new java.awt.Color(153, 0, 0));
        lbCantidadRequerida6.setText("*");

        txtKilometraje.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        txtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaActionPerformed(evt);
            }
        });

        lbMarca1.setText("Modelo:");

        txtPasajeros.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        txtCombustible.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtCombustible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCombustibleActionPerformed(evt);
            }
        });

        lbCantidadRequerida9.setForeground(new java.awt.Color(153, 0, 0));
        lbCantidadRequerida9.setText("*");

        txtModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModeloActionPerformed(evt);
            }
        });

        lbCódigo.setText("Código:");

        lbTipo.setText("Estilo de Auto:");

        lbCantidadRequerida7.setForeground(new java.awt.Color(153, 0, 0));
        lbCantidadRequerida7.setText("*");

        lbCantidadRequerida4.setForeground(new java.awt.Color(153, 0, 0));
        lbCantidadRequerida4.setText("*");

        lbCantidadRequerida1.setForeground(new java.awt.Color(153, 0, 0));
        lbCantidadRequerida1.setText("*");

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        lbCantidadRequerida.setForeground(new java.awt.Color(153, 0, 0));
        lbCantidadRequerida.setText("*");

        lbCódigoRequerido2.setForeground(new java.awt.Color(153, 0, 0));
        lbCódigoRequerido2.setText("*");

        lbCantidadRequerida8.setForeground(new java.awt.Color(153, 0, 0));
        lbCantidadRequerida8.setText("*");

        lbCódigoRequerido1.setForeground(new java.awt.Color(153, 0, 0));
        lbCódigoRequerido1.setText("*");

        lbCombustible.setText("Combustible:");

        lbMarca.setText("Marca:");

        lbCantidad5.setText("Estado:");

        txtTransmision.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        lbCódigoRequerido3.setForeground(new java.awt.Color(153, 0, 0));
        lbCódigoRequerido3.setText("*");

        lbCantidadRequerida3.setForeground(new java.awt.Color(153, 0, 0));
        lbCantidadRequerida3.setText("*");

        lbCantidad6.setText("Valor:");

        lbCantidad2.setText("Chasis:");

        txtAnotaciones.setColumns(20);
        txtAnotaciones.setRows(5);
        jScrollPane1.setViewportView(txtAnotaciones);

        btLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/clean-16.png"))); // NOI18N
        btLimpiar.setText("Limpiar");
        btLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimpiarActionPerformed(evt);
            }
        });

        comboxTipoEstilo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el tipo", "4x4", "4x2", "Compactos", "Crossover", "Coupé", "Deportivos", "Crossover", "Convertibles", "Hatchback", "MPV", "Pick-up", "Sedán", "Station Wagon", "SUV", "Utilitarios", " ", " " }));

        btGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/save-16.png"))); // NOI18N
        btGuardar.setText("Guardar");
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });

        txtEstado.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addGap(364, 364, 364)
                                    .addComponent(jlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(lbCantidad3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbCantidadRequerida5, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(lbCantidad6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbCantidadRequerida8, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(lbCantidad1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbCantidadRequerida3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtValor, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                                            .addComponent(txtTransmision)
                                            .addComponent(txtPasajeros)))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lbMarca1)
                                                        .addComponent(lbCantidad))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lbCantidadRequerida, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lbCódigoRequerido2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addComponent(lbMarca)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(lbCódigoRequerido1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addComponent(lbCódigo)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(lbCódigoRequerido, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGap(26, 26, 26)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txtModelo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                                                .addComponent(txtMarca, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtAno)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                            .addComponent(lbDescripción)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lbCantidadRequerida9, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lbTipo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbTipoRequerido)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(comboxTipoEstilo, 0, 262, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(lbCilindrada)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(lbCantidadRequerida1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(lbMotor)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbCódigoRequerido3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(lbCombustible)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbCantidadRequerida2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(lbCantidad2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbCantidadRequerida4, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtChasis)
                                            .addComponent(txtMotor)
                                            .addComponent(txtCilidrada)
                                            .addComponent(txtCombustible, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(lbCantidad4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbCantidadRequerida6, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(lbCantidad5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbCantidadRequerida7, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(37, 37, 37)))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                                            .addComponent(txtKilometraje))))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 23, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 843, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(btLimpiar)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlTitulo)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbCódigo)
                                        .addComponent(lbCódigoRequerido)
                                        .addComponent(lbTipo))
                                    .addComponent(lbTipoRequerido))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(comboxTipoEstilo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbMarca)
                            .addComponent(lbCódigoRequerido1)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbMotor)
                            .addComponent(lbCódigoRequerido3)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtMotor, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMarca1)
                    .addComponent(lbCódigoRequerido2)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCilindrada)
                    .addComponent(lbCantidadRequerida1)
                    .addComponent(txtCilidrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCantidad)
                    .addComponent(lbCantidadRequerida)
                    .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCombustible)
                    .addComponent(lbCantidadRequerida2)
                    .addComponent(txtCombustible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCantidad1)
                    .addComponent(lbCantidadRequerida3)
                    .addComponent(txtPasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCantidad2)
                    .addComponent(lbCantidadRequerida4)
                    .addComponent(txtChasis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCantidad3)
                    .addComponent(lbCantidadRequerida5)
                    .addComponent(txtTransmision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCantidad4)
                    .addComponent(lbCantidadRequerida6)
                    .addComponent(txtKilometraje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCantidad5)
                    .addComponent(lbCantidadRequerida7)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCantidad6)
                    .addComponent(lbCantidadRequerida8)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDescripción)
                    .addComponent(lbCantidadRequerida9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLimpiar)
                    .addComponent(btGuardar))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMotorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMotorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMotorActionPerformed

    private void txtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaActionPerformed

    private void txtCombustibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCombustibleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCombustibleActionPerformed

    private void txtModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModeloActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void btLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpiarActionPerformed
        this.LimpiarFormulario();
    }//GEN-LAST:event_btLimpiarActionPerformed

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
        if (this.txtCodigo.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "El código es requerido.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            this.txtCodigo.requestFocus();
            return;
        }
        if (this.comboxTipoEstilo.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Seleccione el estilo del auto.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            this.comboxTipoEstilo.requestFocus();
            return;
        }
        if (this.txtMarca.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "El nombre es requerido.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            this.txtMarca.requestFocus();
            return;
        }
        if (this.txtMotor.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "La cantidad es requerida.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            this.txtMotor.requestFocus();
            return;
        }
        if (this.txtModelo.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Introduzca el modelo del vehiculo.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            this.txtModelo.requestFocus();
            return;
        }
        if (this.txtCilidrada.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Introduzca la cilidrada del vehiculo.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            this.txtCilidrada.requestFocus();
            return;
        }
        if (this.txtAno.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Introduzca el año del vehiculo.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            this.txtAno.requestFocus();
            return;
        }
        if (this.txtCombustible.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Introduzca el tipo de combustibles.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            this.txtCombustible.requestFocus();
            return;
        }
        if (this.txtPasajeros.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Introduzca el numero de pasajeros.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            this.txtPasajeros.requestFocus();
            return;
        }
        if (this.txtChasis.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Introduzca el numero de chasis.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            this.txtChasis.requestFocus();
            return;
        }
        if (this.txtTransmision.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Introduzca el tipo de transmision.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            this.txtTransmision.requestFocus();
            return;
        }
        if (this.txtKilometraje.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Introduzca el kilometraje del vehiculo.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            this.txtKilometraje.requestFocus();
            return;
        }
        if (this.txtValor.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Introduzca el valor del vehiculo.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            this.txtValor.requestFocus();
            return;
        }
        if (this.txtEstado.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Introduzca el estado del vehiculo.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            this.txtEstado.requestFocus();
            return;
        }
        if (this.txtAnotaciones.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Introduzca la anotaciones del vehiculo.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            this.txtAnotaciones.requestFocus();
            return;
        }

        intzGestor myGestor = new clsGestor();

   clsAutos myAutos = new clsAutos(
            0,
            this.txtCodigo.getText(),
            this.txtMarca.getText(),
            this.txtModelo.getText(),
            this.txtAno.getText(),
            this.comboxTipoEstilo.getSelectedItem().toString(),
            this.txtMotor.getText(),
            this.txtCilidrada.getText(),
            this.txtCombustible.getText(),                
            this.txtPasajeros.getText(),
            this.txtChasis.getText(),          
            this.txtTransmision.getText(),
            this.txtKilometraje.getText(),
            this.txtEstado.getText(),
            this.txtValor.getText(),
            this.txtAnotaciones.getText().trim());
                
        
        boolean operacion = myGestor.GuardarAutos(myAutos);

        if (operacion) {
            JOptionPane.showMessageDialog(this, "Se guardo la información correctamente.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            this.LimpiarFormulario();
            this.txtCodigo.requestFocus();
        } else {
            JOptionPane.showMessageDialog(this, "No se logro guardar la información correctamente, Intentar nuevamente.", "Aviso", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btGuardarActionPerformed
    private void LimpiarFormulario() {
        this.txtCodigo.setText("");
        this.txtMarca.setText("");
        this.txtModelo.setText("");
        this.txtAno.setText("");
        this.txtPasajeros.setText("");
        this.txtTransmision.setText("");
        this.txtValor.setText("");
        this.txtMotor.setText("");
        this.txtCilidrada.setText("");
        this.txtCombustible.setText("");
        this.txtChasis.setText("");
        this.txtKilometraje.setText("");
        this.txtEstado.setText("");
        this.comboxTipoEstilo.setSelectedIndex(0);
        this.txtAnotaciones.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton btLimpiar;
    private javax.swing.JComboBox<String> comboxTipoEstilo;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JLabel lbCantidad;
    private javax.swing.JLabel lbCantidad1;
    private javax.swing.JLabel lbCantidad2;
    private javax.swing.JLabel lbCantidad3;
    private javax.swing.JLabel lbCantidad4;
    private javax.swing.JLabel lbCantidad5;
    private javax.swing.JLabel lbCantidad6;
    private javax.swing.JLabel lbCantidadRequerida;
    private javax.swing.JLabel lbCantidadRequerida1;
    private javax.swing.JLabel lbCantidadRequerida2;
    private javax.swing.JLabel lbCantidadRequerida3;
    private javax.swing.JLabel lbCantidadRequerida4;
    private javax.swing.JLabel lbCantidadRequerida5;
    private javax.swing.JLabel lbCantidadRequerida6;
    private javax.swing.JLabel lbCantidadRequerida7;
    private javax.swing.JLabel lbCantidadRequerida8;
    private javax.swing.JLabel lbCantidadRequerida9;
    private javax.swing.JLabel lbCilindrada;
    private javax.swing.JLabel lbCombustible;
    private javax.swing.JLabel lbCódigo;
    private javax.swing.JLabel lbCódigoRequerido;
    private javax.swing.JLabel lbCódigoRequerido1;
    private javax.swing.JLabel lbCódigoRequerido2;
    private javax.swing.JLabel lbCódigoRequerido3;
    private javax.swing.JLabel lbDescripción;
    private javax.swing.JLabel lbMarca;
    private javax.swing.JLabel lbMarca1;
    private javax.swing.JLabel lbMotor;
    private javax.swing.JLabel lbTipo;
    private javax.swing.JLabel lbTipoRequerido;
    private javax.swing.JFormattedTextField txtAno;
    private javax.swing.JTextArea txtAnotaciones;
    private javax.swing.JFormattedTextField txtChasis;
    private javax.swing.JFormattedTextField txtCilidrada;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JFormattedTextField txtCombustible;
    private javax.swing.JFormattedTextField txtEstado;
    private javax.swing.JFormattedTextField txtKilometraje;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtMotor;
    private javax.swing.JFormattedTextField txtPasajeros;
    private javax.swing.JFormattedTextField txtTransmision;
    private javax.swing.JFormattedTextField txtValor;
    // End of variables declaration//GEN-END:variables

   

}
