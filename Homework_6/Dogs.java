package Homework_6;

import java.util.Random;

public class Dogs extends Animals {
    private Random random = new Random();

    public Dogs () {
        super.run_distance_limit = random.nextInt(500 + 100);
        super.jump_height_limit = random.nextDouble() * 2;
        super.swim_distance_limit = random.nextInt(10 + 15);

    }

}


