package Homework_6;

import java.util.Random;

public class Cats extends Animals {
    private Random random = new Random();


    public Cats() {
        run_distance_limit = random.nextInt(200 + 100);
        jump_height_limit = random.nextDouble() * 4;
    }


    @Override
    void swim(int c) {
        System.out.println("Cats can't swim :( (but not really)");
        System.out.println();
    }

}

