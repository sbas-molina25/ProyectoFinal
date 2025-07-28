/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.epn.poo.ClasesAdministracionColegio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * CursoAsingado, Lista de calificaciones estudiante solo va a poder ver sus
 * calificaciones
 *
 * @author Sebas
 */
public class Estudiante extends Persona {

    private String usuarioEst;
    private String contrasenaEst;

    public Estudiante() {
        super();
        this.usuarioEst = cambiarUsuario();
        this.contrasenaEst = "12345";
    }

    public String cambiarUsuario() {
        String userArchivo = getUltimoCodigo();
        String userID = userArchivo.substring(0, 3);
        int userNum = Integer.parseInt(userArchivo.substring(3, 6));
        userNum++;
        String nuevoUser = userID + String.valueOf(userNum);
        return nuevoUser;
    }

    public String getUltimoCodigo() {
        String ultimaLinea = "";
        try (BufferedReader br = new BufferedReader(new FileReader("archivos/registrosEstudiante"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                ultimaLinea = linea;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al abrir el archivo" + e.getMessage());
        }

        if (ultimaLinea != null && !ultimaLinea.isEmpty()) {
            String[] partes = ultimaLinea.split(";");
            return partes[0];
        } else {
            return null;
        }
    }

    public String getUsuarioEst() {
        return usuarioEst;
    }

    public void setUsuarioEst(String usuarioEst) {
        this.usuarioEst = usuarioEst;
    }

    public String getContrasenaEst() {
        return contrasenaEst;
    }

    public void setContrasenaEst(String contrasenaEst) {
        this.contrasenaEst = contrasenaEst;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Estudiante{");
        sb.append("usuarioEst=").append(usuarioEst);
        sb.append(", contrasenaEst=").append(contrasenaEst);
        sb.append('}');
        return sb.toString();
    }

}
