/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oovv;

/**
 *
 * @author Administrador
 */
public class NotaTestResta extends NotaTest {

    private int nFalladesQResten;

    public NotaTestResta(int nFalladesQResten, int nEncerts, Alumne alumne) {
        super(nEncerts, alumne);
        this.nFalladesQResten = nFalladesQResten;
    }

    @Override
    public void setValor(int nPreguntes) {
        int nf = nPreguntes - nEncerts;
        int ner = nf / nFalladesQResten;
        valor = (nEncerts - ner) * 10.0 / nPreguntes;
    }



}
