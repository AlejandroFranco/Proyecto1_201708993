package org.pablofranco.remesas.org.pablofranco.ui;

import javafx.scene.layout.BorderPane;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class InterfazPrincipal extends JTabbedPane {

    private static JLabel etiquetaUsuario;
    private static JLabel etiquetaContrasena;
    private static JLabel etiquetaNuevaCuenta;
    private static JPasswordField campoContrasena;
    private static JTextField campoUsuario;
    private static JButton botonNuevaCuenta;
    private static JButton botonIngresar;
    private static JFrame ventanaPrincipal;
    private static JTabbedPane apartados;
    private static JPanel panelContenido;
    private static JMenuBar menuBar;
    private static JMenu menu, submenu;
    private static JMenuItem menuItem;


    public static void VentanaPrincipal() {
        menuBar = new JMenuBar();
        menu = new JMenu("Menu");
        menuItem = new JMenuItem();
        menuItem = new JMenuItem("Opcion 1", KeyEvent.VK_T);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
        menuItem.getAccessibleContext().setAccessibleDescription("opcion 1");
        menu.add(menuItem);
        menuBar.add(menu);
        ventanaPrincipal = new JFrame("Aplicacion de remesas");
        ventanaPrincipal.setPreferredSize(new Dimension(500, 400));
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaPrincipal.setResizable(false);
        ventanaPrincipal.setLocationRelativeTo(null);
        ventanaPrincipal.setJMenuBar(menuBar);
        panelContenido = new JPanel();
        panelContenido.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(10, 10, 10, 10);
        etiquetaUsuario = new JLabel();
        etiquetaUsuario.setText("Usuario");
        c.gridx = 1;
        c.gridy = 1;
        panelContenido.add(etiquetaUsuario, c);
        apartados = new JTabbedPane();
        apartados.addTab("Administrador", panelContenido);
        apartados.setTabComponentAt(0, null);
        apartados.addTab("Vendedor", null);
        apartados.addTab("Remitente", null);
        apartados.addTab("Observador", panelContenido);
        apartados.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
        ventanaPrincipal.add(apartados);
        ventanaPrincipal.pack();
        ventanaPrincipal.setVisible(true);
    }


    private static class AdaptadorMouse extends MouseAdapter {
        public void mouseClicked(MouseEvent e) {
            if (e.getSource() == botonIngresar) {
                char[] contrasena = campoContrasena.getPassword();
                StringBuffer s = new StringBuffer();
                for (int i = 0; i < contrasena.length; i++) {
                    s.append(contrasena[i]);
                }
                String usuario = campoUsuario.getText();


            } else {
                ventanaPrincipal.dispose();
                FormularioNuevoUsuario.ventanaNuevoUsuario();

            }

        }
    }
}

