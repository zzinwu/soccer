public class Team {
	private int goals;
	private String name;
	
	public int getGoals() {
		return goals;
	}

	public String getName() {
		return name;
	}

	public Team(String name) {
		this.name=name;
	}

	public void scoreGoal(){
		goals+=1;
	}
}
