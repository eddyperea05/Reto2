package com.alkomprar.utils;

import java.util.concurrent.ThreadLocalRandom;

public class RandomNum {
    public static int numeroAleatorioEnRango(int minimo, int maximo) {
// nextInt regresa en rango pero con límite superior exclusivo, por eso sumamos 1
        return ThreadLocalRandom.current().nextInt(minimo, maximo);
    }
}
