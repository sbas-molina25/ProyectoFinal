/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.epn.poo.ClasesAdministracionColegio;

/**
 * Nombre, Edad, Cedula, Telefono, Usuario, Contraseña
 *
 * @author Sebas
 */
public class Persona {

    private String nombreP;
    private int edadP;
    private String cedulaP;
    private String telefonoP;

    public Persona() {
        this.nombreP = "";
        this.edadP = 5;
        this.cedulaP = "";
        this.telefonoP = "";
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public int getEdadP() {
        return edadP;
    }

    public void setEdadP(int edadP) {
        this.edadP = edadP;
    }

    public String getCedulaP() {
        return cedulaP;
    }

    public void setCedulaP(String cedulaP) {
        this.cedulaP = cedulaP;
    }

    public String getTelefonoP() {
        return telefonoP;
    }

    public void setTelefonoP(String telefonoP) {
        this.telefonoP = telefonoP;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("nombreP=").append(nombreP);
        sb.append(", edadP=").append(edadP);
        sb.append(", cedulaP=").append(cedulaP);
        sb.append(", telefonoP=").append(telefonoP);
        sb.append('}');
        return sb.toString();
    }

}
