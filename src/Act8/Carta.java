package Act8;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author olver
 */
public class Carta {
    
    private int numero;
    private String palo;
    
    public static final String[] PALOS={"trecoles","corazones","picas"};
    public static final int LIM_CARTAS=12;


    public Carta(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "numero=" + numero + ", palo=" + palo ;
    }
    
    
}
