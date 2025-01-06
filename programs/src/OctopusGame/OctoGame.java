package OctopusGame;

public class OctoGame {
    private int players;
    private int trials;
    private int numberToSitOut;

    // Constructor
    public OctoGame(int p) {
        this.players = p;
        this.trials = 0;
        this.numberToSitOut = 0;
    }

    // Accessor Methods
    public int getTrials() {
        return trials;
    }

    public int getSurvivors() {
        return players;
    }
    public int getNumberToSitOut() {
        return numberToSitOut;
    }

    // Modifier Methods
    public void playGame(double successRate) {
        players = (int) (players * successRate);
        trials++;
    }

    public void playTeamGame(double successRate, int numberOfTeams) {
        int playersPerTeam = players / numberOfTeams;
        numberToSitOut = players % numberOfTeams;
        int survivingTeams = (int) (numberOfTeams * successRate);
        players = (survivingTeams * playersPerTeam) + numberToSitOut;
        trials++;
    }

}
