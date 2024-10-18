package Task9_16Oct_Inheritance_Task2;

public class Tournament {
	String name;
	String location;
	String date;
	
	Tournament(){
		
	}
	Tournament(String name, String location,String date){
		this.name = name;
		this.date = date;
		this.location = location;
	}
	public void startTournament() {
		 System.out.println(name+" tournament has started on "+date);
	}
	public void endTournament() {
		System.out.println("Tournament has ended");
	}
	@Override
	public String toString() {
		return "Tournament [name=" + name + ", location=" + location + ", date=" + date + "]";
	}
	
	
}
