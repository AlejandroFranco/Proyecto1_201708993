package org.pablofranco.remesas.org.pablofranco.Serializacion;

import org.pablofranco.bean.Beneficiario;
import org.pablofranco.bean.Remitente;

import java.io.*;


public class Serializadora {

    //propiedades
    private static Serializadora instancia;

    // Singleton Serializadora
    public static Serializadora getInstancia() {
        if (instancia == null) {
            instancia = new Serializadora();
        }
        return instancia;
    }

    public static void guardarDatosRemitentes(Remitente rem) {
        try {
            FileOutputStream fs = new FileOutputStream("Remitentes.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(rem);
            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void guardarDatosBeneficiarios(Beneficiario ben) {
        try {
            FileOutputStream fs = new FileOutputStream("Beneficiarios.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(ben);
            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
