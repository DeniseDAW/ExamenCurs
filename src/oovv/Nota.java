/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oovv;

/**
 *
 * @author Administrador
 */
public class Nota {

    protected double valor;
    private Alumne alumne;

    public Nota(double valor, Alumne alumne) throws Maex {
        if (valor < 0 || valor > 10) {
            throw new Maex("El valor de la nota ha d'estar entre 0 i 10");
        }
        this.valor = valor;
        this.alumne = alumne;
    }

    public Nota(Alumne alumne) {
        this.alumne = alumne;
    }

    public void setValor(double valor) throws Maex {
        if (valor < 0 || valor > 10) {
            throw new Maex("El valor de la nota ha d'estar entre 0 i 10");
        }
        this.valor = valor;
    }

}
