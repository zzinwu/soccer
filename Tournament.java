public class Tournament {
	private Team team1, team2, team3, team4;

	public Tournament(Team team1, Team team2, Team team3, Team team4) {
		super();
		this.team1 = team1;
		this.team2 = team2;
		this.team3 = team3;
		this.team4 = team4;
	}
	
	
	public void playTournament(){
		Match match1=new Match(getTeam1(), getTeam2());
		match1.playGame();
		Match match2=new Match(getTeam3(), getTeam4());
		match2.playGame();
		
		System.out.println("Final Match");
		Match finalmatch = new Match(match1.getWinner(), match2.getWinner());
		finalmatch.playGame();
		
	}


	public Team getTeam1() {
		return team1;
	}


	public void setTeam1(Team team1) {
		this.team1 = team1;
	}


	public Team getTeam2() {
		return team2;
	}


	public void setTeam2(Team team2) {
		this.team2 = team2;
	}


	public Team getTeam3() {
		return team3;
	}


	public void setTeam3(Team team3) {
		this.team3 = team3;
	}


	public Team getTeam4() {
		return team4;
	}


	public void setTeam4(Team team4) {
		this.team4 = team4;
	}
}
