
import java.util.*;

class Team {
    String name;
    int points;
    int goalDiff;

    Team(String name, int points, int goalDiff) {
        this.name = name;
        this.points = points;
        this.goalDiff = goalDiff;
    }

    public String toString() {
        return name + " (" + points + " points, Goal Difference: " + goalDiff + ")";
    }
}

class Leaderboard<T> {
    private List<T> teams = new ArrayList<>();

    public void add(T team) {
        teams.add(team);
    }

    public void display(Comparator<? super T> comparator) {
        teams.sort(comparator);

        for (T team : teams) {
            System.out.println(team);
        }
    }
}

public class LeaderboardDemo {
    public static void main(String[] args) {

        Leaderboard<Team> board = new Leaderboard<>();

        board.add(new Team("Panthers", 9, 4));
        board.add(new Team("Eagles", 9, 6));
        board.add(new Team("Cobras", 6, 1));
        board.add(new Team("Bisons", 9, 4));

        Comparator<Team> ranking = Comparator
                .comparingInt((Team t) -> t.points).reversed()
                .thenComparing(Comparator.comparingInt((Team t) -> t.goalDiff).reversed())
                .thenComparing(t -> t.name);

        System.out.println("TEAM LEADERBOARD");
        board.display(ranking);
    }
}
