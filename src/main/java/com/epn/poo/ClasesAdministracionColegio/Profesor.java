/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.epn.poo.ClasesAdministracionColegio;

import java.io.*;
import javax.swing.JOptionPane;

/**
 * Especialidad (que materia imparte) El profesor es el que pone calificaciones
 *
 * @author Sebas
 */
public class Profesor extends Persona {

    private String usuarioProf;
    private String contrasenaProf;
    private String especialidadProf;

    public Profesor() {
        this.usuarioProf = cambiarUsuario();
        this.contrasenaProf = "12345";
        this.especialidadProf = "";
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
        try (BufferedReader br = new BufferedReader(new FileReader("archivos/registrosProfesor"))) {
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
    
    public String generarContrasena(String cedula) {
        return "cv" + cedula;
    }
    
    @Override
    public void setCedulaP(String cedula) {
        super.setCedulaP(cedula);
        this.contrasenaProf = generarContrasena(cedula);
    }

    public String getUsuarioProf() {
        return usuarioProf;
    }

    public void setUsuarioProf(String usuarioProf) {
        this.usuarioProf = usuarioProf;
    }

    public String getContrasenaProf() {
        return contrasenaProf;
    }

    public void setContrasenaProf(String contrasenaProf) {
        this.contrasenaProf = contrasenaProf;
    }

    public String getEspecialidadProf() {
        return especialidadProf;
    }

    public void setEspecialidadProf(String especialidadProf) {
        this.especialidadProf = especialidadProf;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Profesor{");
        sb.append("usuarioProf=").append(usuarioProf);
        sb.append(", contrasenaProf=").append(contrasenaProf);
        sb.append(", especialidadProf=").append(especialidadProf);
        sb.append('}');
        return sb.toString();
    }

}
