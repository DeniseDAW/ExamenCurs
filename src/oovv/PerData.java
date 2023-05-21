/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oovv;

import java.util.Comparator;

/**
 *
 * @author Administrador
 */
public class PerData implements Comparator<Examen>{

    @Override
    public int compare(Examen o1, Examen o2) {
        if (o1.getData().equals(o2.getData())) {
            return o1.getAssignatura().compareTo(o2.getAssignatura());
        }
        return o1.getData().compareTo(o2.getData());
    }

    @Override
    public Comparator<Examen> reversed() {
        return Comparator.super.reversed(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
