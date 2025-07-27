/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.epn.poo.ClasesAdministracionColegio;

/**
 * Materia, nota
 *
 * @author Sebas
 */
public class Calificaciones {

    private Estudiante estudianteCal;
    private String materiaCal;
    private double nota;

    public Calificaciones() {
        this.estudianteCal = null;
        this.materiaCal = null;
        this.nota = 0;
    }

    public Estudiante getEstudianteCal() {
        return estudianteCal;
    }

    public void setEstudianteCal(Estudiante estudianteCal) {
        this.estudianteCal = estudianteCal;
    }

    public String getMateriaCal() {
        return materiaCal;
    }

    public void setMateriaCal(String materiaCal) {
        this.materiaCal = materiaCal;
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
        sb.append(", materiaCal=").append(materiaCal);
        sb.append(", nota=").append(nota);
        sb.append('}');
        return sb.toString();
    }

}
