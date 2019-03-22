package Lesson_7;

import java.util.Scanner;

public class Team_builder {
    Scanner sc = new Scanner(System.in);

    public HeroClass[] Team_builder() {
        System.out.println("Выберите количество бойцов в команде.");
        int team_size = sc.nextInt();
        HeroClass[] Team = new HeroClass[team_size];
        for (int i = 0; i < team_size; i++) {
            System.out.println("Выберите класс бойца" + "\n" + "1-Воин" + "\n" + "2-Лекарь" + "\n" + "3-Убийца");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    Team[i] = new Warrior();
                    break;
                case 2:
                    Team[i] = new Healer();
                    break;
                case 3:
                    Team[i] = new Assassin();
                    break;
                default:
                    System.out.println("Неверное значение!");
                    break;
            }
        }
        return Team;
    }
}
