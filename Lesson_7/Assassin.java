package Lesson_7;

import java.util.Random;

public class Assassin extends HeroClass {
    private Random random = new Random();

    public Assassin() {
        type = "Убийца";
        current_health = random.nextInt(20) + 100;
        damage = random.nextInt(10) + 30;
        max_health = current_health;
    }
}
