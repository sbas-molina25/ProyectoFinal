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
 *
 * @author Sebas
 */
public class Materia {

    private String idMateria;
    private String nombreMateria;
    private ArrayList<Estudiante> listaEstudiantes;
    private Profesor profesorAsignado;

    public Materia() {
        this.idMateria = "";
        this.nombreMateria = "";
        this.listaEstudiantes = new ArrayList<>();
        this.profesorAsignado = null;
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
        try (BufferedReader br = new BufferedReader(new FileReader("archivos/registrosMateria"))) {
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

    public String getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(String idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public ArrayList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(ArrayList<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    public Profesor getProfesorAsignado() {
        return profesorAsignado;
    }

    public void setProfesorAsignado(Profesor profesorAsignado) {
        this.profesorAsignado = profesorAsignado;
    }

    public void agregarEstudianteEnMateria(Estudiante e) {
        if (listaEstudiantes.size() == 10) {
            JOptionPane.showMessageDialog(null, "Limite de 10 estudiantes por curso");
            return;
        }
        listaEstudiantes.add(e);
    }

}
