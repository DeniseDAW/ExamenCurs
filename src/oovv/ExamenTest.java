/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oovv;

import java.time.LocalDate;

/**
 *
 * @author Administrador
 */
public class ExamenTest extends Examen {

    private int nPreguntes;

    public ExamenTest(int nPreguntes, LocalDate data, String assignatura, double notaAprovat) throws Maex {
        super(data, assignatura, notaAprovat);
        if (nPreguntes < 2) {
            throw new Maex("El nombre de preguntes ha de ser 2 com a mínim");
        }
        this.nPreguntes = nPreguntes;
    }

    @Override
    public String getDadesSenseNotes() {
        return super.getDadesSenseNotes()+"__Preguntes="+nPreguntes;
    }
}
