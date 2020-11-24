package com.company;

public class Jugadores {

    public static String getName() {
    }

    @Override
    public void run() {
        try {
            Espera.addParticipante(this);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void setName(String s) {
        final String name = Jugadores.getName();



    }

    public void Start() {

    }

    public void start() {
    }
}

