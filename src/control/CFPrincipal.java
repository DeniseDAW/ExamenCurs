/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import oovv.Curs;
import oovv.Examen;
import vista.DElegeixExamen;
import vista.FPrincipal;

/**
 *
 * @author Administrador
 */
public class CFPrincipal implements ActionListener {

    private FPrincipal finestra;
    private Curs curs;

    public CFPrincipal(FPrincipal finestra) {
        this.finestra = finestra;
        curs = new Curs("Jardinería");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Afegeix Examen" ->
                afegeixExamen();
            case "Esborra Examen" ->
                esborraExamen();
            case "Afegeix notes" ->
                afegeixNotes();
            case "Llista Alumnes NIA" ->
                finestra.mostra(curs.llistaAlumnesNia());
            case "Llista Alumnes Cognoms" ->
                finestra.mostra(curs.llistaAlumnesCognoms());
            case "Llista Examens" ->
                finestra.mostra(curs.llistaExamens());
            case "Llista Un Examen" ->
                llistaUnExamen();
            case "Llista Un Examen Ordenat" ->
                llistaExamensOrdenats();
            case "Guarda" ->
                guarda();
            case "Recupera" ->
                recupera();
            case "Tanca" ->
                System.exit(0);
        }
    }

    private void recupera() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void guarda() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void llistaExamensOrdenats() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void llistaUnExamen() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    private void afegeixNotes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void esborraExamen() {
        DElegeixExamen d = new DElegeixExamen(finestra, true);
        d.carregaLlista(curs.getClausExamens());
        d.setVisible(true);
    }

    private void afegeixExamen() {
        Examen examen = CDAfegeixExamen.getExamenIntroduit(finestra);
        if (examen != null) {
            if (!curs.afegeixExamen(examen)) {
                JOptionPane.showMessageDialog(finestra,
                        "L'examen ja existeix",
                        "Afegeix examen",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

}
