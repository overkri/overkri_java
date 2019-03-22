package Lesson_7;


public class Main {

    public static void main(String[] args) {
        Team_builder teamBuilder = new Team_builder();
        System.out.println("Игрок 1, сформируйте свою команду");
        HeroClass[] Team_1 = teamBuilder.Team_builder();
        System.out.println("Игрок 2, сформируйте свою команду");
        HeroClass[] Team_2 = teamBuilder.Team_builder();
        System.out.println("Команда 1");
        Status.GetTeamInfo(Team_1);
        System.out.println("Команда 2");
        Status.GetTeamInfo(Team_2);
        do {
            System.out.println("Игрок 1, ваш ход.");
            Players_turns.playerturn(Team_1, Team_2);
            Status.CheckStatus(Team_2);
            System.out.println("Команда 1");
            Status.GetTeamInfo(Team_1);
            System.out.println("Команда 2");
            Status.GetTeamInfo(Team_2);
            if (Status.CheckWinCondition(Team_1, Team_2)) {
                break;
            }
            System.out.println("Игрок 2, ваш ход.");
            Players_turns.playerturn(Team_2, Team_1);
            Status.CheckStatus(Team_1);
            if (Status.CheckWinCondition(Team_1, Team_2)) {
                break;
            }
            System.out.println("Команда 1");
            Status.GetTeamInfo(Team_1);
            System.out.println("Команда 2");
            Status.GetTeamInfo(Team_2);
            Status.CheckWinCondition(Team_1, Team_2);
        } while (true);


    }
}


