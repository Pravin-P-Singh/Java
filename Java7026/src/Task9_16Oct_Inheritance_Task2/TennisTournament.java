package Task9_16Oct_Inheritance_Task2;

public class TennisTournament extends Tournament {
	String courtType;
	int numberOfSets;
	String ballBrand;
	
	TennisTournament(){
		
	}
	TennisTournament(String name, String location, String date,String courtType,int numberOfSets,String ballBrand){
		super(name,location,date);
		this.courtType = courtType;
		this.numberOfSets = numberOfSets;
		this.ballBrand = ballBrand;
	}
	public void beginMatch(String name1,String name2) {
		System.out.println("Match has started between: "+name1+ " and "+name2);
	}
	public void recordScore(int score1, int score2) {
		System.out.println("Scores are: "+score1 +" : "+score2);
	}
	@Override
	public String toString() {
		return "TennisTournament [courtType=" + courtType + ", numberOfSets=" + numberOfSets + ", ballBrand="
				+ ballBrand + "]";
	}
	
}
