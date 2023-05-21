/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oovv;

/**
 *
 * @author Administrador
 */
public class NotaTest extends Nota{
    
    protected int nEncerts;

    public NotaTest(int nEncerts, Alumne alumne) {
        super(alumne);
        this.nEncerts = nEncerts;
    }

    public void setValor(int nPreguntes) throws Maex {
        super.setValor(nEncerts * 10.0 / nPreguntes); 
    }
    
    
    
}
