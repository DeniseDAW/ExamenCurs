/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package auxiliar;

import java.time.format.DateTimeFormatter;

/**
 *
 * @author Eduardo Silvestre
 */
public class Mut {
    
    public static final DateTimeFormatter DTF = DateTimeFormatter.ofPattern("dd/MM/yy");

    public static int getAleatori(int inf, int sup) {
        if (inf > sup) {
            return getAleatori(sup, inf);
        }
        return inf + (int) (Math.random() * (sup - inf + 1));
    }

}
