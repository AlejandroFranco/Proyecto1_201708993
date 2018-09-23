package org.pablofranco.remesas.org.pablofranco.ui;

import org.pablofranco.remesas.org.pablofranco.Seguridad.Seguridad;
import org.pablofranco.remesas.org.pablofranco.Serializacion.Serializadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class InterfazLogin {

    private static JLabel etiquetaUsuario;
    private static JLabel etiquetaContrasena;
    private static JLabel etiquetaNuevaCuenta;
    private static JPasswordField campoContrasena;
    private static JTextField campoUsuario;
    private static JButton botonNuevaCuenta;
    private static JButton botonIngresar;
    private static JFrame ventanaLogin;

    public static void ventanaLogin() {
        ventanaLogin = new JFrame("VentaLogin");
        ventanaLogin.setPreferredSize(new Dimension(500, 400));
        ventanaLogin.setLayout(new GridBagLayout());
        ventanaLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaLogin.setResizable(false);
        ventanaLogin.setLocationRelativeTo(null);
        agregarComponentesPanel(ventanaLogin.getContentPane());
        ventanaLogin.pack();
        ventanaLogin.setVisible(true);
    }

    private static void agregarComponentesPanel(Container panel) {
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(10, 10, 10, 10);
        etiquetaUsuario = new JLabel();
        etiquetaUsuario.setText("Usuario");
        c.gridx = 1;
        c.gridy = 1;
        panel.add(etiquetaUsuario, c);

        etiquetaContrasena = new JLabel();
        etiquetaContrasena.setText("Contraseña");
        c.gridx = 2;
        c.gridy = 1;
        panel.add(etiquetaContrasena, c);

        etiquetaNuevaCuenta = new JLabel();
        etiquetaNuevaCuenta.setText("Crear Cuenta");
        c.gridx = 3;
        c.gridy = 1;
        panel.add(etiquetaNuevaCuenta, c);

        campoContrasena = new JPasswordField();
        c.gridx = 2;
        c.gridy = 2;
        panel.add(campoContrasena, c);

        campoUsuario = new JTextField();
        c.gridx = 1;
        c.gridy = 2;
        panel.add(campoUsuario, c);

        botonNuevaCuenta = new JButton();
        botonNuevaCuenta.setText("Nueva Cuenta");
        c.gridx = 3;
        c.gridy = 2;
        panel.add(botonNuevaCuenta, c);
        botonNuevaCuenta.addMouseListener(new AdaptadorMouse());

        botonIngresar = new JButton();
        botonIngresar.setText("Ingresar");
        c.gridx = 1;
        c.gridy = 3;
        panel.add(botonIngresar, c);
        botonIngresar.addMouseListener(new AdaptadorMouse());
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
                if (Seguridad.getInstancia().autenticarSesion(s.toString(), usuario)) {
                    ventanaLogin.dispose();

                } else {

                }


            } else {
                ventanaLogin.dispose();
                FormularioNuevoUsuario.ventanaNuevoUsuario();

            }

        }
    }
}

