package interfaces;

public class FootballImpl implements Football {
    @Override
    public void setHomeTeam(String name) {
        System.out.println("Setting Home Team");
    }

    @Override
    public void switchToChannel() {
        System.out.println("Switching to channel");
    }

    @Override
    public void homeTeamScored(int points) {
        System.out.println("Scored");
    }

    @Override
    public void setVisitingTeam(String name) {
        System.out.println("Setting visiting team");
    }

    @Override
    public void visitingTeamScored(int points) {
        System.out.println("Visiting Team Scored");
    }

    @Override
    public void endOfQuarter(int quarter) {
        System.out.println("End of quarter");
    }
}
