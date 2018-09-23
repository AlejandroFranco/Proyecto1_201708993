package org.pablofranco.remesas.org.pablofranco.Seguridad;

import org.pablofranco.bean.Remitente;

import java.io.*;

public class Seguridad {

    //propiedades
    private static Seguridad instancia;

    // Singleton Seguridad
    public static Seguridad getInstancia() {
        if (instancia == null) {
            instancia = new Seguridad();
        }
        return instancia;
    }

    public static boolean autenticarSesion(String cadenaContrasena, String usuario) {
        boolean autenticar = false;
        boolean seguir = true;
        try {
            FileInputStream fs = new FileInputStream("Remitentes.ser");
            ObjectInputStream os = new ObjectInputStream(fs);
            while (seguir) {
                Remitente remitente = (Remitente) os.readObject();
                if (remitente != null) {

                } else {
                    seguir = false;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("\nNo se encontraron Registros guardados...\n");
        } catch (IOException | ClassNotFoundException e) {

        }
        return autenticar;
    }
}
