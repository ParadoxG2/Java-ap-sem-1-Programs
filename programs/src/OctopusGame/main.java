package OctopusGame;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the initial number of players and create an OctopusGame object
        System.out.print("Enter number of players: ");
        int initialPlayers = scanner.nextInt();
        OctoGame game = new OctoGame(initialPlayers);

        // Trial 1 - Individual play
        System.out.println("\nTrial 1 - Individual play:");
        System.out.print("Enter a success rate: ");
        double successRate1 = scanner.nextDouble();
        game.playGame(successRate1);
        System.out.println("Survivors left after Trial 1 is " + game.getSurvivors());

        // Trial 2 - Individual play
        System.out.println("\nTrial 2 - Individual play:");
        System.out.print("Enter a success rate: ");
        double successRate2 = scanner.nextDouble();
        game.playGame(successRate2);
        System.out.println("Survivors left after Trial 2 is " + game.getSurvivors());

        // Trial 3 - Team play
        System.out.println("\nTrial 3 - Team play:");
        System.out.print("Enter number of teams: ");
        int numberOfTeams = scanner.nextInt();
        System.out.print("Enter a success rate: ");
        double successRate3 = scanner.nextDouble();
        game.playTeamGame(successRate3, numberOfTeams);
        System.out.println("Number of players sitting out this round: " + game.getNumberToSitOut());
        System.out.println("Survivors left after Trial 3 is " + game.getSurvivors());
    }
}