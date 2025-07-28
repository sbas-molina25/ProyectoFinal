/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.epn.poo.ClasesAdministracionColegio;

import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Sebas
 */
public class Curso {

    private String idCurso;
    private String nombreCurso;
    private ArrayList<Profesor> listaProfesores;
    private ArrayList<Estudiante> listaEstudiantes;

    public Curso() {
        this.idCurso = cambiarUsuario();
        this.nombreCurso = "";
        this.listaProfesores = new ArrayList<>();
        this.listaEstudiantes = new ArrayList<>();
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
        try (BufferedReader br = new BufferedReader(new FileReader("archivos/registrosCurso"))) {
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

    public String getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(String idCurso) {
        this.idCurso = idCurso;
    }
    
    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public ArrayList<Profesor> getListaProfesores() {
        return listaProfesores;
    }

    public void setListaProfesores(ArrayList<Profesor> listaProfesores) {
        this.listaProfesores = listaProfesores;
    }

    public ArrayList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(ArrayList<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    public void agregarEstudianteEnCurso(Estudiante e) {
        if (listaEstudiantes.size() == 10) {
            JOptionPane.showMessageDialog(null, "Limite de 10 estudiantes por curso");
            return;
        }
        listaEstudiantes.add(e);
    }

    public void agregarProfesorEnCurso(Profesor p) {
        if (listaProfesores.size() == 3) {
            JOptionPane.showMessageDialog(null, "Limite de 3 materias/profesores por curso");
            return;
        }
        listaProfesores.add(p);
    }

    public String getIDArregloEstudiantes() {
        StringBuilder codigos = new StringBuilder();
        for (int i = 0; i < listaEstudiantes.size(); i++) {
            codigos.append(listaEstudiantes.get(i).getUsuarioEst());
            if (i < listaEstudiantes.size() - 1) {
                codigos.append(";");
            }
        }
        return codigos.toString();
    }
    
    public String getIDArregloProfesores() {
        StringBuilder codigos = new StringBuilder();
        for (int i = 0; i < listaProfesores.size(); i++) {
            codigos.append(listaProfesores.get(i).getUsuarioProf());
            if (i < listaProfesores.size() - 1) {
                codigos.append(";");
            }
        }
        return codigos.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Curso{");
        sb.append("idCurso=").append(idCurso);
        sb.append(", nombreCurso=").append(nombreCurso);
        sb.append(", listaProfesores=").append(listaProfesores);
        sb.append(", listaEstudiantes=").append(listaEstudiantes);
        sb.append('}');
        return sb.toString();
    }

}
