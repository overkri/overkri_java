package Lesson_7;

import java.util.Scanner;

public class Players_turns {
    private static Scanner sc = new Scanner(System.in);


    public static void playerturn(HeroClass[] team_1, HeroClass[] team_2) {
        int choosefighter;
        do {
            System.out.println("Выберите номер бойца, который будет действовать.");
            choosefighter = sc.nextInt();
            if (team_1[choosefighter - 1].getStatus().equals("Мертв")) {
                System.out.println("Атакующий персонаж мертв!");

            }
        } while (team_1[choosefighter - 1].getStatus().equals("Мертв"));
        if (team_1[choosefighter - 1].getType().equals("Лекарь")) {
            System.out.println("Вы выбрали лекаря, что будете делать, атаковать или лечить?" + "\n" + "1-лечить" + "\n" + "2-атаковать");
            int chooseaction = sc.nextInt();
            if (chooseaction == 1) {
                HealingAction(team_1, choosefighter);
            } else AttackAction(team_1, team_2, choosefighter);
        } else AttackAction(team_1, team_2, choosefighter);
    }


    private static void AttackAction(HeroClass[] team_1, HeroClass[] team_2, int choosefighter) {
        int damage;
        int health;
        damage = team_1[choosefighter - 1].getDamage();
        do {
            System.out.println("Кого будем атаковать?");
            int choosevictim = sc.nextInt();
            if (team_2[choosevictim - 1].getStatus().equals("Жив")) {
                health = team_2[choosevictim - 1].getCurrent_health() - damage;
                team_2[choosevictim - 1].setCurrent_health(health);
                System.out.println("Персонаж " + " под номером " + choosefighter + " - " + team_1[choosefighter - 1].getType() + " нанес " + damage + " урона персонажу " + " под номером " + choosevictim + " - " + team_2[choosevictim - 1].getType() + " .");
                System.out.println();
                break;
            } else System.out.println("Нельзя атаковать мертвого персонажа!");
        } while (true);
    }


    private static void HealingAction(HeroClass[] team_1, int choosefighter) {
        int choosepatient;
        int health;
        do {
            System.out.println("Выберите номер бойца, которого будете лечить.");
            choosepatient = sc.nextInt();
            if (team_1[choosepatient - 1].getStatus().equals("Жив")) {
                break;
            } else
                System.out.println("Неверная цель! Вы пытаетесь лечить мертвого персонажа!");
        } while (true);
        health = team_1[choosepatient - 1].getCurrent_health() + team_1[choosefighter - 1].getHealingpower();
        if (health > team_1[choosepatient - 1].getMax_health()) {
            team_1[choosepatient - 1].setCurrent_health(team_1[choosepatient - 1].getMax_health());
            System.out.println("Персонаж " + " под номером " + choosefighter + " - " + team_1[choosefighter - 1].getType() + " вылечил " + (team_1[choosefighter - 1].getHealingpower() + team_1[choosepatient - 1].getMax_health() - health) + " здоровья персонажу " + "  под номером " + choosepatient + " - " + team_1[choosepatient - 1].getType() + " .");
            System.out.println();
        } else {
            team_1[choosepatient - 1].setCurrent_health(health);
            System.out.println("Персонаж " + " под номером " + choosefighter + " - " + team_1[choosefighter - 1].getType() + " вылечил " + team_1[choosefighter - 1].getHealingpower() + " здоровья персонажу " + " под номером " + choosepatient + " - " + team_1[choosepatient - 1].getType() + " .");
            System.out.println();
        }
    }
}


