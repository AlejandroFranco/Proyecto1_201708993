package org.pablofranco.bean;

public class Beneficiario extends Usuario {

    int identificadorUnicoBeneficiario;

    public Beneficiario(String nombre, String apellido, String nacionalidad, String fechaNacimiento, String direccionResidencia, String telefono, String mail, String tipoUsuario, int identificadorUnicoBeneficiario) {
        super(nombre, apellido, nacionalidad, fechaNacimiento, direccionResidencia, telefono, mail, tipoUsuario);
        this.identificadorUnicoBeneficiario = identificadorUnicoBeneficiario;
    }

    public int getIdentificadorUnicoBeneficiario() {
        return identificadorUnicoBeneficiario;
    }

    public void setIdentificadorUnicoBeneficiario(int identificadorUnicoBeneficiario) {
        this.identificadorUnicoBeneficiario = identificadorUnicoBeneficiario;
    }


}
