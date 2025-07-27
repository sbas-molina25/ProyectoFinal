/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.epn.poo.ClasesAdministracionColegio;

import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JOptionPane;

/**
 * Materia, nota
 *
 * @author Sebas
 */
public class Calificaciones {

    private String codigoCal;
    private Estudiante estudianteCal;
    private Profesor profesorCal;
    private double nota;

    public Calificaciones() {
        this.codigoCal = cambiarUsuario();
        this.estudianteCal = null;
        this.profesorCal = null;
        this.nota = 0;
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
        try (BufferedReader br = new BufferedReader(new FileReader("archivos/registrosCalificacion"))) {
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

    public String getCodigoCal() {
        return codigoCal;
    }

    public void setCodigoCal(String codigoCal) {
        this.codigoCal = codigoCal;
    }

    public Profesor getProfesorCal() {
        return profesorCal;
    }

    public void setProfesorCal(Profesor profesorCal) {
        this.profesorCal = profesorCal;
    }
        

    public Estudiante getEstudianteCal() {
        return estudianteCal;
    }

    public void setEstudianteCal(Estudiante estudianteCal) {
        this.estudianteCal = estudianteCal;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Calificaciones{");
        sb.append("estudianteCal=").append(estudianteCal);
        sb.append(", nota=").append(nota);
        sb.append('}');
        return sb.toString();
    }

}
