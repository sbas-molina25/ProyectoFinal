/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.epn.poo.ClasesAdministracionColegio;

import javax.swing.JOptionPane;

/**
 * Nombre, Edad, Cedula, Telefono, Usuario, Contraseña
 *
 * @author Sebas
 */
public abstract class  Persona {

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
        if (edadP > 0) {
            this.edadP = edadP;
        } else {
            JOptionPane.showMessageDialog(null, "Edad invalida");
        }
    }

    public String getCedulaP() {
        return cedulaP;
    }

    public void setCedulaP(String cedulaP) {
        if (cedulaP.length() == 10) {
            this.cedulaP = cedulaP;
        } else {
            //JOptionPane.showMessageDialog(null, "Cedula invalida");
        }
    }

    public String getTelefonoP() {
        return telefonoP;
    }

    public void setTelefonoP(String telefonoP) {
        if (telefonoP.length() == 10) {
            this.telefonoP = telefonoP;
        } else {
            JOptionPane.showMessageDialog(null, "Telefono invalido");
        }
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
