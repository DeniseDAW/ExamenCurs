/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oovv.Curs;
import oovv.Examen;
import oovv.Maex;
import vista.DAfegeixExamen;

/**
 *
 * @author DeniseGT
 */
public class CDAfegirExamen implements ActionListener{

    private DAfegeixExamen finestra;
    private Curs curs;

    public CDAfegirExamen(DAfegeixExamen finestra, Curs curs) {
        this.finestra = finestra;
        this.curs = curs;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Validar")) {
            Examen examen = finestra.getExamen();
        }
        finestra.dispose();
    }
}
