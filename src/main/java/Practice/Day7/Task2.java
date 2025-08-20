package Practice.Day7;

public class Task2 {

    public static void main(String[] args) {

        Player player1 = new Player(90);
        Player player2 = new Player(95);
        Player player3 = new Player(91);
        for (int i = 0; i < 91; i++) {
            player3.run();
        }

        Player.info();

        Player player4 = new Player(93);
        Player player5 = new Player(100);
        Player player6 = new Player(98);

        Player.info();

        Player player7 = new Player(90);

        Player.info();

    }
}

class Player {

    private int stamina;

    private final static int MAX_STAMINA = 100;
    private final static int MIN_STAMINA = 0;
    private static int countPlayers;

    public Player(int stamina) {
        this.stamina = stamina;

        if (countPlayers < 6) countPlayers++;
    }

    public void run() {
        if (stamina == 0) {
            return;
        }
        stamina--;

        if (stamina == 0) {
            countPlayers--;
        }
    }

    public static void info() {
        if (countPlayers < 6) {
            System.out.println("Команды неполные, еще есть " + (6 - countPlayers) + " свободных мест");
        } else {
            System.out.println("Мест в командах больше нет");
        }
    }

}