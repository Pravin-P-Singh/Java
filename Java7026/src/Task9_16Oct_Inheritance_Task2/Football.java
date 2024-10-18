package Task9_16Oct_Inheritance_Task2;

public class Football extends Tournament{
	int numberOfTeams;
	String duration;
	String trophyType;
	
	Football(){
		
	}
	Football(String name,String location,String date,int numberOfTeams, String duration,String trophyType){
		super(name,location,date);
		this.numberOfTeams = numberOfTeams;
		this.duration = duration;
		this.trophyType = trophyType;
	}
	
	public void scheduleMatch(String team1,String team2) {
		System.out.println("Match has been scheduled between "+team1+" and "+team2);
	}
	public void announceWinner(String winner) {
		System.out.println("Winner is: "+winner);
	}
	@Override
	public String toString() {
		return "Football [numberOfTeams=" + numberOfTeams + ", duration=" + duration + ", trophyType=" + trophyType
				+ "]";
	}
	
	
}
