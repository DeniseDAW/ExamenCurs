/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oovv;

import auxiliar.CreadorDeNoms;
import auxiliar.Mut;
import java.util.Objects;

/**
 *
 * @author Administrador
 */
public class Alumne implements Comparable<Alumne> {

    private String nia;
    private String nom;
    private String cognoms;

    public Alumne(String nia, String nom, String cognoms) throws Maex {
        if (nia.isBlank() || nom.isBlank() || cognoms.isBlank()) {
            throw new Maex("No pot haver-hi dades buides");
        }
        this.nia = nia;
        this.nom = nom;
        this.cognoms = cognoms;
    }

    public Alumne() {
        this.nia = "" + Mut.getAleatori(1000, 9999);
        this.nom = CreadorDeNoms.getNom();
        this.cognoms = CreadorDeNoms.getCognoms();
    }
    
    public String getCognoms() {
        return cognoms;
    }

    @Override
    public String toString() {
        return nia + "___" + nom + " " + cognoms;
    }

    public String getTxtCognoms() {
        return cognoms + ", " + nom + "___" + nia;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + Objects.hashCode(this.nia);
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
        final Alumne other = (Alumne) obj;
        return Objects.equals(this.nia, other.nia);
    }

    @Override
    public int compareTo(Alumne o) {
        return this.nia.compareTo(o.nia);
    }

}
