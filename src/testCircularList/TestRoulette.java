package testCircularList;

import com.uptc.prg3.roulette.server.models.Roulette;

/**
 * TAREA
 * implementar GUI (elegir imagenes -10- libres de uso o palabras 
 * para q se vea en la ruleta)
 * leer sincronizacion de hilos, agrupacion de hilos, joint hilos
 */

public class TestRoulette {
    public static void main(String[] args) {
        Roulette<Integer> roulette = new Roulette<>(100);
        //agregar elementos
        for (int i = 0; i < 52; i++) {
            roulette.insert(i);
        }
        roulette.start();
        //mostrar datos
        roulette.setRunning(true); 
        int currentValue = roulette.getInfo();
        while (roulette.isRunning()) {
            // if (roulette.getInfo() != currentValue) {
                System.out.println(roulette.getInfo());
            //     currentValue = roulette.getInfo();   
            // }
        }
    }
}
