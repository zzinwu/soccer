public class SoccerSimulator {
	
	public static void main(String[] args) {
		Team Barcelona = new Team("Barcelona");
		Team RealMadrid = new Team("Real Madrid");
		Team America = new Team("America");
		Team Chivas = new Team("Chivas");
		
		
//		Match classic= new Match(Barcelona, RealMadrid);
//		classic.playGame();
		
		Tournament myTournament = new Tournament(Barcelona, RealMadrid, America, Chivas);
		
		myTournament.playTournament();
		
		System.out.println("Final winner: USA");
		
	}
}
