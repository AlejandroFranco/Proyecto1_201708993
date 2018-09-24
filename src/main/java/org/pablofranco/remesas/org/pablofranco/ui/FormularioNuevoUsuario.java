package org.pablofranco.remesas.org.pablofranco.ui;

import org.pablofranco.bean.Beneficiario;
import org.pablofranco.bean.Remitente;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FormularioNuevoUsuario {

    private static JLabel etiquetaNombre;
    private static JLabel etiquetaApellido;
    private static JTextField campoNombre;
    private static JTextField campoApellido;
    private static JButton botonCrear;
    private static JComboBox comboTipoUsuario;
    private static JFrame ventaNuevoUsuario;
    private static GridBagConstraints c;
    private static String[] tipoUsuario;
    private static JLabel etiquetaFechaNacimiento;
    private static JTextField campoFechaNacimiento;
    private static JTextField campoIdentificador;
    private static JLabel etiquetaIdentificador;
    private static JLabel etiquetaNacionalidad;
    private static JTextField campoNacionalidad;
    private static JLabel etiquetaDireccionResidencia;
    private static JTextField campoDireccionResidencia;
    private static JLabel etiquetaTelefono;
    private static JTextField campoTelefono;
    private static JLabel etiquetaMail;
    private static JTextField campoMail;
    private static JButton botonVolver;
    private static JTextField campoNombreUsuario;
    private static JLabel etiquetaNombreUsuario;
    private static JTextField campoContrasena;
    private static JLabel etiquetaContrasena;

    public static void ventanaNuevoUsuario() {

        ventaNuevoUsuario = new JFrame("VentaNuevoUsuario");
        ventaNuevoUsuario.setPreferredSize(new Dimension(600, 600));
        ventaNuevoUsuario.setLayout(new GridBagLayout());
        ventaNuevoUsuario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventaNuevoUsuario.setResizable(false);
        ventaNuevoUsuario.setLocationRelativeTo(null);
        agregarComponentesPanel(ventaNuevoUsuario.getContentPane());
        ventaNuevoUsuario.pack();
        ventaNuevoUsuario.setVisible(true);

    }

    private static void agregarComponentesPanel(Container panel) {
        tipoUsuario = new String[]{"Remitente", "Beneficiario"};
        c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(10, 10, 10, 10);

        comboTipoUsuario = new JComboBox(tipoUsuario);
        comboTipoUsuario.setSelectedIndex(0);
        c.gridx = 3;
        c.gridy = 1;
        panel.add(comboTipoUsuario, c);
        comboTipoUsuario.addActionListener(new ListenerItemsCombo());

        etiquetaIdentificador = new JLabel();
        etiquetaIdentificador.setText("Identificador Remitente");
        c.gridx = 1;
        c.gridy = 1;
        panel.add(etiquetaIdentificador, c);

        campoIdentificador = new JTextField();
        campoIdentificador.setEditable(false);
        c.gridx = 1;
        c.gridy = 2;
        panel.add(campoIdentificador, c);

        etiquetaNombre = new JLabel();
        etiquetaNombre.setText("Nombre");
        c.gridx = 1;
        c.gridy = 3;
        panel.add(etiquetaNombre, c);

        campoNombre = new JTextField();
        c.gridx = 1;
        c.gridy = 4;
        panel.add(campoNombre, c);

        etiquetaApellido = new JLabel();
        etiquetaApellido.setText("Apellido");
        c.gridx = 1;
        c.gridy = 5;
        panel.add(etiquetaApellido, c);

        campoApellido = new JTextField();
        c.gridx = 1;
        c.gridy = 6;
        panel.add(campoApellido, c);

        etiquetaFechaNacimiento = new JLabel();
        etiquetaFechaNacimiento.setText("Fecha Nacimiento");
        c.gridx = 1;
        c.gridy = 7;
        panel.add(etiquetaFechaNacimiento, c);

        campoFechaNacimiento = new JTextField();
        c.gridx = 1;
        c.gridy = 8;
        panel.add(campoFechaNacimiento, c);

        etiquetaNacionalidad = new JLabel();
        etiquetaNacionalidad.setText("nacionalidad");
        c.gridx = 2;
        c.gridy = 1;
        panel.add(etiquetaNacionalidad, c);

        campoNacionalidad = new JTextField();
        c.gridx = 2;
        c.gridy = 2;
        panel.add(campoNacionalidad, c);

        etiquetaDireccionResidencia = new JLabel();
        etiquetaDireccionResidencia.setText("Direccion de residencia");
        c.gridx = 2;
        c.gridy = 3;
        panel.add(etiquetaDireccionResidencia, c);

        campoDireccionResidencia = new JTextField();
        c.gridx = 2;
        c.gridy = 4;
        panel.add(campoDireccionResidencia, c);

        etiquetaTelefono = new JLabel();
        etiquetaTelefono.setText("telefono");
        c.gridx = 2;
        c.gridy = 5;
        panel.add(etiquetaTelefono, c);

        campoTelefono = new JTextField();
        c.gridx = 2;
        c.gridy = 6;
        panel.add(campoTelefono, c);

        etiquetaMail = new JLabel();
        etiquetaMail.setText("correo");
        c.gridx = 2;
        c.gridy = 7;
        panel.add(etiquetaMail, c);

        campoMail = new JTextField();
        c.gridx = 2;
        c.gridy = 8;
        panel.add(campoMail, c);

        botonVolver = new JButton();
        botonVolver.setText("volver");
        c.gridx = 1;
        c.gridy = 10;
        panel.add(botonVolver, c);
        botonVolver.addMouseListener(new AdaptadorMouse());

        botonCrear = new JButton();
        botonCrear.setText("Crear");
        c.gridx = 2;
        c.gridy = 10;
        panel.add(botonCrear, c);
        botonCrear.addMouseListener(new AdaptadorMouse());

        etiquetaNombreUsuario = new JLabel();
        etiquetaNombreUsuario.setText("Nombre de Usuario");
        c.gridx = 3;
        c.gridy = 3;
        panel.add(etiquetaNombreUsuario, c);
        etiquetaNombreUsuario.setVisible(true);

        campoNombreUsuario = new JTextField();
        c.gridx = 3;
        c.gridy = 4;
        panel.add(campoNombreUsuario, c);
        campoNombreUsuario.setVisible(true);

        etiquetaContrasena = new JLabel();
        etiquetaContrasena.setText("Contraseña");
        c.gridx = 3;
        c.gridy = 5;
        panel.add(etiquetaContrasena, c);
        etiquetaContrasena.setVisible(true);

        campoContrasena = new JTextField();
        c.gridx = 3;
        c.gridy = 6;
        panel.add(campoContrasena, c);
        campoContrasena.setVisible(true);
    }

    private static class AdaptadorMouse extends MouseAdapter {
        public void mouseClicked(MouseEvent e) {
            if (e.getSource() == botonVolver) {


            } else if (comboTipoUsuario.getSelectedItem().equals("Remitente")) {
                String identificadorTexto = campoIdentificador.getText();
                String nombre = campoNombre.getText();
                String apellido = campoApellido.getText();
                String fechaNacimiento = campoFechaNacimiento.getText();
                String nacionalidad = campoNacionalidad.getText();
                String direccionResidencia = campoDireccionResidencia.getText();
                String mail = campoMail.getText();
                String nombreUsuario = campoNombreUsuario.getText();
                String telefono = campoTelefono.getText();
                String contrasena = campoContrasena.getText();
                String tipoUsuario = comboTipoUsuario.getSelectedItem().toString();
                Remitente rem = new Remitente(nombre, apellido, nacionalidad,
                        fechaNacimiento, direccionResidencia, telefono, mail, tipoUsuario,
                        123, nombreUsuario, contrasena);
            } else {
                String identificadorTexto = campoIdentificador.getText();
                int identificadorNumero = Integer.parseInt(identificadorTexto);
                String nombre = campoNombre.getText();
                String apellido = campoApellido.getText();
                String fechaNacimiento = campoFechaNacimiento.getText();
                String nacionalidad = campoNacionalidad.getText();
                String direccionResidencia = campoDireccionResidencia.getText();
                String mail = campoMail.getText();
                String telefono = campoTelefono.getText();
                String tipoUsuario = comboTipoUsuario.getSelectedItem().toString();
                Beneficiario beneficiario = new Beneficiario(nombre, apellido, nacionalidad, fechaNacimiento,
                        direccionResidencia, telefono, mail, tipoUsuario, identificadorNumero);
                ventaNuevoUsuario.dispose();
            }

        }
    }

    private static class ListenerItemsCombo implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JComboBox cb = (JComboBox) e.getSource();
            String tipoUsuario = (String) cb.getSelectedItem();
            if (tipoUsuario.equals("Remitente")) {
                campoContrasena.setVisible(true);
                campoNombreUsuario.setVisible(true);
                etiquetaContrasena.setVisible(true);
                etiquetaNombreUsuario.setVisible(true);
            } else {
                etiquetaIdentificador.setText("Identificador Beneficiario");
                campoContrasena.setVisible(false);
                campoNombreUsuario.setVisible(false);
                etiquetaContrasena.setVisible(false);
                etiquetaNombreUsuario.setVisible(false);
            }
        }
    }
}