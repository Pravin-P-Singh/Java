package Task9_16Oct_Inheritance_Task2;

public class CricketTournament extends Tournament {
	int overs;
	String umpires;
	String pitchType;
	
	CricketTournament(){
		
	}
	CricketTournament(String name, String location , String date, int overs, String umpires,String pitchType){
		super(name,location,date);
		this.overs = overs;
		this.umpires = umpires;
		this.pitchType = pitchType;
	}
	
	public void tossCoin(String call) {
		System.out.println("The call for the toss is "+call);
	}
	public void declareManOfTheMatch(String MoM) {
		System.out.println("Man of the match is: "+MoM);
	}
	@Override
	public String toString() {
		return "CricketTournament [overs=" + overs + ", umpires=" + umpires + ", pitchType=" + pitchType + "]";
	}
	
}
