/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oovv;

import auxiliar.CreadorDeNoms;
import auxiliar.Mut;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrador
 */
public class Curs {

    private String nom;
    private List<Alumne> alumnes;
    private List<Examen> examens;

    public Curs(String nom) {
        this.nom = nom;
        this.alumnes = new ArrayList<>();
        creaAlumnes();
        this.examens = new ArrayList<>();
    }

    private void creaAlumnes() {
        try {
            Alumne a = new Alumne("" + Mut.getAleatori(1111, 9999),
                    CreadorDeNoms.getNom(),
                    CreadorDeNoms.getCognoms());
            for (int i = 0; i < 19;) {
                a = new Alumne("" + Mut.getAleatori(1111, 9999),
                        CreadorDeNoms.getNom(),
                        CreadorDeNoms.getCognoms());
                if (!alumnes.contains(a)) {
                    alumnes.add(a);
                    i++;
                }
            }
        } catch (Maex ex) {
        }
    }

    public boolean afegeixExamen(Examen examen) {
        if (examens.contains(examen)) {
            return false;
        }
        examens.add(examen);
        return true;
    }

    public String llistaAlumnesNia() {
        String llistat = "Llistat dels alumnes per NIA\n----------------------------------\n";
        Collections.sort(alumnes);
        for (Alumne alumne : alumnes) {
            llistat += alumne + "\n";
        }
        return llistat;
    }

    public String llistaAlumnesCognoms() {
        String llistat = "Llistat dels alumnes per cognoms\n----------------------------------\n";
        List<Alumne> copia = new ArrayList<>(alumnes);
        copia.sort((a1, a2) -> a1.getCognoms().compareTo(a2.getCognoms()));
        for (Alumne alumne : copia) {
            llistat += alumne.getTxtCognoms() + "\n";
        }
        return llistat;
    }

    public String llistaExamens() {
        String llistat = "Llistat dels examens\n----------------------------------\n";
        Collections.sort(examens, new PerData());
        for (Examen examen : examens) {
            llistat += examen.getDadesSenseNotes() + "\n";
        }
        return llistat;
    }

    public List<String> getClausExamens() {
        Collections.sort(examens, new PerData());
        List<String> claus = new ArrayList<>();
        for (Examen examen : examens) {
            claus.add(examen.getClau());
        }
        return claus;
    }

}
