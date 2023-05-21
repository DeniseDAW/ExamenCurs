/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oovv;

import auxiliar.Mut;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Administrador
 */
public class Examen {

    private LocalDate data;
    private String assignatura;
    private double notaAprovat;
    private List<Nota> notes;

    public Examen(LocalDate data, String assignatura, double notaAprovat) throws Maex {
        if (notaAprovat < 0 || notaAprovat > 10) {
            throw new Maex("La nota de l'aprovat ha d'estar entre 0 i 10");
        }
        if (assignatura.isBlank()) {
            throw new Maex("L'assignatura no pot estar buida");
        }
        this.data = data;
        this.assignatura = assignatura;
        this.notaAprovat = notaAprovat;
        this.notes = new ArrayList<>();
    }

    public LocalDate getData() {
        return data;
    }

    public String getAssignatura() {
        return assignatura;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.data);
        hash = 97 * hash + Objects.hashCode(this.assignatura);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Examen other = (Examen) obj;
        if (!Objects.equals(this.assignatura, other.assignatura)) {
            return false;
        }
        return Objects.equals(this.data, other.data);
    }

    public String getDadesSenseNotes() {
        return Mut.DTF.format(data) + "__" + assignatura + "__Aprovat = " + notaAprovat;
    }

    public String getClau() {
        return Mut.DTF.format(data) + "__" + assignatura;
    }

}
