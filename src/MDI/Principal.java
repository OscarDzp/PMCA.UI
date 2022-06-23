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
        consultarActivoMenu = new javax.swing.JMenuItem();
        listadoActivoMenu = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MCA-Modulo de Control de Activvos");

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
        activosMenu.setText("Activos");

        registrarActivoMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/icons8-save-16.png"))); // NOI18N
        registrarActivoMenu.setMnemonic('t');
        registrarActivoMenu.setText("Registrar activos");
        registrarActivoMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActivoMenuActionPerformed(evt);
            }
        });
        activosMenu.add(registrarActivoMenu);

        actualizarActivoMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/update-16.png"))); // NOI18N
        actualizarActivoMenu.setMnemonic('y');
        actualizarActivoMenu.setText("Actualizar activos");
        activosMenu.add(actualizarActivoMenu);

        consultarActivoMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/consultant-16.png"))); // NOI18N
        consultarActivoMenu.setMnemonic('p');
        consultarActivoMenu.setText("Consultar de activos");
        activosMenu.add(consultarActivoMenu);

        listadoActivoMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/list-view-16.png"))); // NOI18N
        listadoActivoMenu.setMnemonic('d');
        listadoActivoMenu.setText("Listado de activos");
        listadoActivoMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listadoActivoMenuActionPerformed(evt);
            }
        });
        activosMenu.add(listadoActivoMenu);

        menuBar.add(activosMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Contents");
        helpMenu.add(contentMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(416, 310));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void salirSistemaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirSistemaMenuActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirSistemaMenuActionPerformed

    private void registrarActivoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActivoMenuActionPerformed
     Activos.FrmRegistro myForm = new Activos.FrmRegistro();
     this.menuPrincipal.add(myForm);
     myForm.show();
    }//GEN-LAST:event_registrarActivoMenuActionPerformed

    private void listadoActivoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listadoActivoMenuActionPerformed
        Activos.frmListar myForm = new Activos.frmListar();
     this.menuPrincipal.add(myForm);
     myForm.show();
    }//GEN-LAST:event_listadoActivoMenuActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //Mejora de estetica.
        FlatDarculaLaf.setup();
        try {
            UIManager.setLookAndFeel(new FlatDarculaLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenu activosMenu;
    private javax.swing.JMenuItem actualizarActivoMenu;
    private javax.swing.JMenuItem consultarActivoMenu;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuItem listadoActivoMenu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JDesktopPane menuPrincipal;
    private javax.swing.JMenuItem registrarActivoMenu;
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
