/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.format.DateTimeParseException;
import javax.swing.JOptionPane;
import oovv.Examen;
import oovv.Maex;
import vista.DAfegeixExamen;
import vista.FPrincipal;

/**
 *
 * @author Administrador
 */
public class CDAfegeixExamen implements ActionListener {

    public static Examen getExamenIntroduit(FPrincipal fp) {
        return new CDAfegeixExamen(fp).getExamen();
    }

    private DAfegeixExamen finestra;
    private Examen examen;

    public Examen getExamen() {
        return examen;
    }

    public CDAfegeixExamen(FPrincipal fp) {
        finestra = new DAfegeixExamen(fp, true);
        finestra.setOidor(this);
        finestra.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            switch (e.getActionCommand()) {
                case "valida test resta":
                    examen = finestra.getExamenTR();
                    finestra.dispose();
                    break;
                case "valida test":
                    examen = finestra.getExamenT();
                    finestra.dispose();
                    break;
                case "valida normal":
                    examen = finestra.getExamenN();
                    finestra.dispose();
                    break;
                case "cancela":
                    finestra.dispose();
                    break;
            }
        } catch (Maex ex) {
            JOptionPane.showMessageDialog(finestra, ex.getMessage());
        }catch (DateTimeParseException ex) {
            JOptionPane.showMessageDialog(finestra, "El format de la data és dd/mm/aa");
        }catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(finestra, "El format del nombre és incorrecte");
        }
    }

}
