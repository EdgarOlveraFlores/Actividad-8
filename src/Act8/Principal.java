/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Act8;

/**
 *
 * @author olver
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Baraja b = new Baraja();
        
        //MOSTRAMOS LA BARAJA
        b.mostrarCarta();
        System.out.println(b.catrtasDisponible());
        
        //Sacamos 3 cartas
        b.siguienteCarta();
        b.siguienteCarta();
        b.siguienteCarta();
        
        //mostramos la siguiente carta
        System.out.println(b.siguienteCarta());
        
        //Se muestra la carta 
        b.cartaMonton();
        
        //DAR CARTAS "5"
        Carta[] c = b.darCartas(5);
        
        //para mostrar las 5 cartas
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
            
        }
    }
}
