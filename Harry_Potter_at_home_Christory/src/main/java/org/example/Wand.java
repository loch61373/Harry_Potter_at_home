package org.example;

import java.util.Random;

public class Wand {
    private Core core;
    private int size;

    public Wand() {
        this.core = getRandomCore();
        this.size = getRandomSize();
    }

    private Core getRandomCore() {
        Core[] cores = Core.values();
        Random random = new Random();
        int index = random.nextInt(cores.length);
        return cores[index];
    }

    private int getRandomSize() {
        Random random = new Random();
        return random.nextInt(8) + 7; // la taille est entre 7 et 15 pouces
    }

    public Core getCore() {
        return core;
    }

    public int getSize() {
        return size;
    }
}
