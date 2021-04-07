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
public class Baraja {

    //ATRIBUTOS DE LA CLASE
    private Carta cartas[];
    private int posSiguienteCarta;

    public static final int NUM_CARTAS = 40;

    public Baraja() {
        this.cartas = new Carta[NUM_CARTAS];
        this.posSiguienteCarta = 0;
        barajear();
    }

    private void crearBaraja() {
        String[] palos = Carta.PALOS;

        for (int i = 0; i < palos.length; i++) {
            for (int j = 0; j < Carta.LIM_CARTAS; j++) {
                //Seleccionamos 
                if (j == 7 || j == 8) {
                    if (j > 9) {
                        cartas[((i * (Carta.LIM_CARTAS - 2) + j - 2))] = new Carta(j + 1, palos[i]);
                    } else {
                        cartas[((i * (Carta.LIM_CARTAS - 2) + j))] = new Carta(j + 1, palos[i]);
                    }
                }

            }
        }
    }

    public void barajear() {
        int posAleatoria = 0;
        Carta c;

        for (int i = 0; i < cartas.length; i++) {
            Carta carta = cartas[i];
            posAleatoria = Metodos.generarNumeroEnteroAleatorio(0, NUM_CARTAS - 1);

            c = cartas[i];
            cartas[i] = cartas[posAleatoria];
            cartas[posAleatoria] = c;
        }
        this.posSiguienteCarta=0;
    }

    public Carta siguienteCarta() {
        Carta c = null;
        if (posSiguienteCarta == NUM_CARTAS) {
            System.out.println("Ya no hay mas cartas, debes barajear de nuevo");
        } else {
            c = cartas[posSiguienteCarta++];
        }
        return c;
    }

    public Carta[] darCartas(int numCartas) {

        if (numCartas >= NUM_CARTAS) {
            System.out.println("No se puede dar mas cartas de las que hay");
        } else {
            if (catrtasDisponible() < numCartas) {
                System.out.println("No hay suficientes cartas para mostrar");
            } else {
                Carta[] cartasDar = new Carta[numCartas];
                for (int i = 0; i < cartasDar.length; i++) {
                    cartasDar[i] = siguienteCarta();
                }
                return cartasDar;
            }
        }
        return null;
    }

    public int catrtasDisponible() {
        return NUM_CARTAS - posSiguienteCarta;
    }

    public void cartaMonton() {
        if (catrtasDisponible() == NUM_CARTAS) {
            System.out.println("No se a sacado ninguna carta");

        } else {
            for (int i = 0; i < posSiguienteCarta; i++) {
                System.out.println(cartas[i]);
            }
        }
    }

    public void mostrarCarta() {

        if (catrtasDisponible() == 0) {
            System.out.println("No hay cartas para mostrar");

        } else {
            for (int i = posSiguienteCarta; i<cartas.length ; i++) {
                System.out.println(cartas[i]);
            }
        }
    }
}
