package Lesson_7;

import java.util.Random;

public class Healer extends HeroClass {
    private Random random = new Random();

    public Healer() {
        type = "Лекарь";
        current_health = random.nextInt(50) + 100;
        damage = random.nextInt(5) + 10;
        max_health = current_health;
        healingpower = random.nextInt(15) + 10;
    }

    @Override
    void info(int i) {
        System.out.println(i + " " +type + " Здоровье  " + current_health + "/" + max_health + " Урон " + damage + " Сила лечения " + healingpower + " " + status);
    }

}

