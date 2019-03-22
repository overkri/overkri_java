package Lesson_7;


import java.util.Random;

public class Warrior extends HeroClass {
    private Random random = new Random();

    public Warrior() {
        type = "Воин";
        current_health = random.nextInt(100) + 100;
        damage = random.nextInt(10) + 15;
        max_health = current_health;

    }

}
