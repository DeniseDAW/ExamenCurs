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
public class ExamenTestResta extends ExamenTest {

    private int nFalladesQResten;

    public ExamenTestResta(int nFalladesQResten, int nPreguntes, LocalDate data, String assignatura, double notaAprovat) throws Maex {
        super(nPreguntes, data, assignatura, notaAprovat);
        if (nFalladesQResten < 1) {
            throw new Maex("El nombre de fallades que resten unn encert ha de ser 1 com a mínim");
        }
        this.nFalladesQResten = nFalladesQResten;
    }

    @Override
    public String getDadesSenseNotes() {
        return super.getDadesSenseNotes() + "__Fallades que resten=" + nFalladesQResten;
    }

}
