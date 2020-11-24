package com.company;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            Jugadores t = new Jugadores();
            t.setName("Jugadores " + i);
            t.Start();
        }
    }
}
