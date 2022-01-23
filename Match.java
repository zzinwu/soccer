import java.util.Random;

public class Match {

	private Team team1;
	private Team team2;
	private Team winner;

	public Match(Team team1, Team team2) {
		super();
		this.team1 = team1;
		this.team2 = team2;
	}

	private void getRandomWinner() {
		Random myRandom = new Random();

		if (myRandom.nextBoolean())
			setWinner(team1);
		else
			setWinner(team2);
	}

	public Team getTeam1() {
		return team1;
	}

	public Team getTeam2() {
		return team2;
	}

	public Team getWinner() {
		return winner;
	}

	public void playGame() {
		System.out.println("Playing match between " + getTeam1().getName()
				+ " vs " + getTeam2().getName());
		getRandomWinner();
		System.out.println(getWinner().getName() + " won");
	}

	public void setTeam1(Team team1) {
		this.team1 = team1;
	}

	public void setTeam2(Team team2) {
		this.team2 = team2;
	}

	public void setWinner(Team winner) {
		this.winner = winner;
	}
}
