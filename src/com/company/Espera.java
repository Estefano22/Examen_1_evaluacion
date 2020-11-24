package com.company;

import java.lang.module.ModuleReader;
import java.util.Random;


public class Espera {


    private static final int MAX_AVAILABLE = 10;

    private static Jugadores ganador;
    private static Object Jugadores;

    public static void addParticipante(Jugadores Jugadores ) throws InterruptedException {
        System.out.println("Entra en la lucha 10 Jugadores " + Jugadores.getName());
        if (!primero(Jugadores)) {
            System.out.println("Comienza la pelea entre los 10 Jugadores " + Jugadores.getName() + " y " + ganador.getName());
            Thread.sleep(1000-5000);
            pelea(ganador, Jugadores);
        }
    }

    private static synchronized boolean primero(Jugadores) throws InterruptedException {
        boolean result;
        if (Jugadores == null) {
            Jugadores = ganador;
            result = true;
        } else {
            result = false;
        }

        return result;
    }

    private static void pelea(Jugadores ganador, Jugadores ) {
        Random r = new Random();
        if (r.nextBoolean()){
            Espera.ganador = Jugadores;
        }
        ModuleReader available;
        available.release();
        System.out.println("El ganador de los Jugadores ha sido" + ganador.getName());
    }
}


}
