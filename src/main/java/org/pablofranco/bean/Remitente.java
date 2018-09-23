package org.pablofranco.bean;

public class Remitente extends Usuario {

    int identificadorUnicoRemitente;
    String nombreUsuario;
    String contrasena;

    public Remitente(String nombre, String apellido, String nacionalidad, String fechaNacimiento, String direccionResidencia, String telefono, String mail, String tipoUsuario, int identificadorUnicoRemitente, String nombreUsuario, String contrasena) {
        super(nombre, apellido, nacionalidad, fechaNacimiento, direccionResidencia, telefono, mail, tipoUsuario);
        this.identificadorUnicoRemitente = identificadorUnicoRemitente;
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
    }

    public int getIdentificadorUnicoRemitente() {
        return identificadorUnicoRemitente;
    }

    public void setIdentificadorUnicoRemitente(int identificadorUnicoRemitente) {
        this.identificadorUnicoRemitente = identificadorUnicoRemitente;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}
