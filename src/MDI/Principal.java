/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/MDIApplication.java to edit this template
 */
package MDI;

import com.formdev.flatlaf.FlatDarculaLaf;
import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

/**
 *
 * @author oscar
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        setExtendedState(MAXIMIZED_BOTH);
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenu6 = new javax.swing.JMenu();
        menuPrincipal = new javax.swing.JDesktopPane(){
            @Override
            protected void paintComponent(Graphics g)
            {
                g.drawImage(new ImageIcon(getClass().getResource("/Recursos/Imagenes/imagen2.jpg")).getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        menuBar = new javax.swing.JMenuBar();
        sistemaMenu = new javax.swing.JMenu();
        salirSistemaMenu = new javax.swing.JMenuItem();
        activosMenu = new javax.swing.JMenu();
        registrarActivoMenu = new javax.swing.JMenuItem();
        actualizarActivoMenu = new javax.swing.JMenuItem();
        listadoActivoMenu = new javax.swing.JMenuItem();
        autosMenu = new javax.swing.JMenu();
        registrarVehiculo = new javax.swing.JCheckBoxMenuItem();
        actualizarVehiculo = new javax.swing.JCheckBoxMenuItem();
        listarVehiculo = new javax.swing.JCheckBoxMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jRegistroEmpleado = new javax.swing.JCheckBoxMenuItem();
        jActualizarEmpleado = new javax.swing.JCheckBoxMenuItem();
        jListarEmpleado = new javax.swing.JCheckBoxMenuItem();
        jSoporte = new javax.swing.JMenu();
        jAyuda = new javax.swing.JCheckBoxMenuItem();

        jMenu2.setText("File");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenu6.setText("jMenu6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rapidos y Facil, Control de Vehiculos");

        sistemaMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/desktop-16.png"))); // NOI18N
        sistemaMenu.setMnemonic('f');
        sistemaMenu.setText("Sistema");

        salirSistemaMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/exit-16.png"))); // NOI18N
        salirSistemaMenu.setMnemonic('x');
        salirSistemaMenu.setText("Salir");
        salirSistemaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirSistemaMenuActionPerformed(evt);
            }
        });
        sistemaMenu.add(salirSistemaMenu);

        menuBar.add(sistemaMenu);

        activosMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/list-16.png"))); // NOI18N
        activosMenu.setMnemonic('e');
        activosMenu.setText("Herramientas");

        registrarActivoMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/icons8-save-16.png"))); // NOI18N
        registrarActivoMenu.setMnemonic('t');
        registrarActivoMenu.setText("Registrar herramienta");
        registrarActivoMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActivoMenuActionPerformed(evt);
            }
        });
        activosMenu.add(registrarActivoMenu);

        actualizarActivoMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/update-16.png"))); // NOI18N
        actualizarActivoMenu.setMnemonic('y');
        actualizarActivoMenu.setText("Actualizar  herramientas");
        actualizarActivoMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActivoMenuActionPerformed(evt);
            }
        });
        activosMenu.add(actualizarActivoMenu);

        listadoActivoMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/list-view-16.png"))); // NOI18N
        listadoActivoMenu.setMnemonic('d');
        listadoActivoMenu.setText("Listado de herramientas");
        listadoActivoMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listadoActivoMenuActionPerformed(evt);
            }
        });
        activosMenu.add(listadoActivoMenu);

        menuBar.add(activosMenu);

        autosMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/-car-16.png"))); // NOI18N
        autosMenu.setText("Autos");

        registrarVehiculo.setSelected(true);
        registrarVehiculo.setText("Registrar Vehiculo");
        registrarVehiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/icons8-cars-16.png"))); // NOI18N
        registrarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarVehiculoActionPerformed(evt);
            }
        });
        autosMenu.add(registrarVehiculo);

        actualizarVehiculo.setSelected(true);
        actualizarVehiculo.setText("Actualizar Vehiculos");
        actualizarVehiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/icons8-car-roof-box-16.png"))); // NOI18N
        actualizarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarVehiculoActionPerformed(evt);
            }
        });
        autosMenu.add(actualizarVehiculo);

        listarVehiculo.setSelected(true);
        listarVehiculo.setText("Listar Vehiculos");
        listarVehiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/icons8-car-16.png"))); // NOI18N
        listarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarVehiculoActionPerformed(evt);
            }
        });
        autosMenu.add(listarVehiculo);

        menuBar.add(autosMenu);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/icons8-user-male-16.png"))); // NOI18N
        jMenu1.setText("Empleados");

        jRegistroEmpleado.setSelected(true);
        jRegistroEmpleado.setText("Registro de Empleado");
        jRegistroEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/icons8-baby-16.png"))); // NOI18N
        jRegistroEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRegistroEmpleadoActionPerformed(evt);
            }
        });
        jMenu1.add(jRegistroEmpleado);

        jActualizarEmpleado.setSelected(true);
        jActualizarEmpleado.setText("Actualizar Empleado");
        jActualizarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/icons8-pixel-man-16.png"))); // NOI18N
        jActualizarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jActualizarEmpleadoActionPerformed(evt);
            }
        });
        jMenu1.add(jActualizarEmpleado);

        jListarEmpleado.setSelected(true);
        jListarEmpleado.setText("Listar Empleados");
        jListarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/icons8-engineer-16.png"))); // NOI18N
        jListarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jListarEmpleadoActionPerformed(evt);
            }
        });
        jMenu1.add(jListarEmpleado);

        menuBar.add(jMenu1);

        jSoporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/customer-service.png"))); // NOI18N
        jSoporte.setText("Soporte");

        jAyuda.setSelected(true);
        jAyuda.setText("Ayuda y Soporte técnico");
        jAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/technical-support.png"))); // NOI18N
        jAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAyudaActionPerformed(evt);
            }
        });
        jSoporte.add(jAyuda);

        menuBar.add(jSoporte);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1160, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 863, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1176, 894));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void salirSistemaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirSistemaMenuActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirSistemaMenuActionPerformed

    private void registrarActivoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActivoMenuActionPerformed
        Herramientas.FrmRegistro myForm = new Herramientas.FrmRegistro();
        this.menuPrincipal.add(myForm);
        myForm.setLocation(
                (menuPrincipal.getSize().width - myForm.getSize().width) / 2,
                (menuPrincipal.getSize().height - myForm.getSize().height) / 2
        );
        myForm.show();
    }//GEN-LAST:event_registrarActivoMenuActionPerformed

    private void listadoActivoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listadoActivoMenuActionPerformed
        Herramientas.FrmListar myForm = new Herramientas.FrmListar ();
        this.menuPrincipal.add(myForm);
        myForm.setLocation(
                (menuPrincipal.getSize().width - myForm.getSize().width) / 2,
                (menuPrincipal.getSize().height - myForm.getSize().height) / 2
        );
        myForm.show();
    }//GEN-LAST:event_listadoActivoMenuActionPerformed

    private void actualizarActivoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActivoMenuActionPerformed
        Herramientas.FrmActualizar myForm = new Herramientas.FrmActualizar();
        this.menuPrincipal.add(myForm);
        myForm.setLocation(
                (menuPrincipal.getSize().width - myForm.getSize().width) / 2,
                (menuPrincipal.getSize().height - myForm.getSize().height) / 2
        );
        myForm.show();
    }//GEN-LAST:event_actualizarActivoMenuActionPerformed

    private void registrarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarVehiculoActionPerformed
     Autos.FrmRegistro myForm = new Autos.FrmRegistro();
        this.menuPrincipal.add(myForm);
        myForm.setLocation(
                (menuPrincipal.getSize().width - myForm.getSize().width) / 2,
                (menuPrincipal.getSize().height - myForm.getSize().height) / 2
        );
    myForm.show();  
    }//GEN-LAST:event_registrarVehiculoActionPerformed

    private void actualizarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarVehiculoActionPerformed
    Autos.FrmActualizar myForm = new Autos.FrmActualizar();
        this.menuPrincipal.add(myForm);
        myForm.setLocation(
                (menuPrincipal.getSize().width - myForm.getSize().width) / 2,
                (menuPrincipal.getSize().height - myForm.getSize().height) / 2
        );
    myForm.show();  
    }//GEN-LAST:event_actualizarVehiculoActionPerformed

    private void listarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarVehiculoActionPerformed
      Autos.FrmListar myForm = new Autos.FrmListar();
        this.menuPrincipal.add(myForm);
        myForm.setLocation(
                (menuPrincipal.getSize().width - myForm.getSize().width) / 2,
                (menuPrincipal.getSize().height - myForm.getSize().height) / 2
        );
    myForm.show();  
    }//GEN-LAST:event_listarVehiculoActionPerformed

    private void jRegistroEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRegistroEmpleadoActionPerformed
        Empleados.FrmRegistro myForm = new Empleados.FrmRegistro();
        this.menuPrincipal.add(myForm);
        myForm.setLocation(
                (menuPrincipal.getSize().width - myForm.getSize().width) / 2,
                (menuPrincipal.getSize().height - myForm.getSize().height) / 2
        );
    myForm.show(); 
    }//GEN-LAST:event_jRegistroEmpleadoActionPerformed

    private void jActualizarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jActualizarEmpleadoActionPerformed
     Empleados.FrmActualizar myForm = new Empleados.FrmActualizar();
        this.menuPrincipal.add(myForm);
        myForm.setLocation(
                (menuPrincipal.getSize().width - myForm.getSize().width) / 2,
                (menuPrincipal.getSize().height - myForm.getSize().height) / 2
        );
    myForm.show();                                               
    }//GEN-LAST:event_jActualizarEmpleadoActionPerformed

    private void jListarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jListarEmpleadoActionPerformed
 Empleados.FrmListar myForm = new Empleados.FrmListar();
        this.menuPrincipal.add(myForm);
        myForm.setLocation(
                (menuPrincipal.getSize().width - myForm.getSize().width) / 2,
                (menuPrincipal.getSize().height - myForm.getSize().height) / 2
        );
    myForm.show();     }//GEN-LAST:event_jListarEmpleadoActionPerformed

    private void jAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAyudaActionPerformed
     Soporte.FrmSoporte myForm = new Soporte.FrmSoporte();
        this.menuPrincipal.add(myForm);
        myForm.setLocation(
                (menuPrincipal.getSize().width - myForm.getSize().width) / 2,
                (menuPrincipal.getSize().height - myForm.getSize().height) / 2
      );
    myForm.show();                                                   

    }//GEN-LAST:event_jAyudaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {     
        FlatDarculaLaf.setup();
        try {
            UIManager.setLookAndFeel(new FlatDarculaLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu activosMenu;
    private javax.swing.JMenuItem actualizarActivoMenu;
    private javax.swing.JCheckBoxMenuItem actualizarVehiculo;
    private javax.swing.JMenu autosMenu;
    private javax.swing.JCheckBoxMenuItem jActualizarEmpleado;
    private javax.swing.JCheckBoxMenuItem jAyuda;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jListarEmpleado;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JCheckBoxMenuItem jRegistroEmpleado;
    private javax.swing.JMenu jSoporte;
    private javax.swing.JMenuItem listadoActivoMenu;
    private javax.swing.JCheckBoxMenuItem listarVehiculo;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JDesktopPane menuPrincipal;
    private javax.swing.JMenuItem registrarActivoMenu;
    private javax.swing.JCheckBoxMenuItem registrarVehiculo;
    private javax.swing.JMenuItem salirSistemaMenu;
    private javax.swing.JMenu sistemaMenu;
    // End of variables declaration//GEN-END:variables

    private static class Imagelcon {

        public Imagelcon(URL resource) {
        }

        private Image getimage() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }

}
