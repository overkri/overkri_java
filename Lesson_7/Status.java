package Lesson_7;


public class Status {
    static void CheckStatus(HeroClass[] team) {
        for (int i = 0; i < team.length; i++) {
            if (team[i].getCurrent_health() <= 0) {
                team[i].setCurrent_health(0);
                team[i].setStatus("Мертв");
            }
        }
    }

    static boolean CheckWinCondition(HeroClass[] team1, HeroClass[] team2) {
        int team1losecount = 0;
        int team2losecount = 0;
        for (int i = 0; i < team1.length; i++) {
            if (team1[i].getStatus() == "Мертв") {
                team1losecount++;
            }
        }
        for (int i = 0; i < team2.length; i++) {
            if (team2[i].getStatus() == "Мертв") {
                team2losecount++;
            }
        }
        if (team1losecount == team1.length) {
            System.out.println("Игрок 2 победил!");
            return true;
        }
        if (team2losecount == team2.length) {
            System.out.println("Игрок 1 победил!");
            return true;
        }
        return false;
    }

    static void GetTeamInfo(HeroClass[] Team) {

        for (int i = 0; i < Team.length; i++) {
            Team[i].info(i + 1);
        }
        System.out.println();
    }
}
