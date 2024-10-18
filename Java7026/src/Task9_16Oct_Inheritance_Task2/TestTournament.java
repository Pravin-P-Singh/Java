package Task9_16Oct_Inheritance_Task2;

public class TestTournament {
	public static void main(String[] args) {
		CricketTournament CT = new CricketTournament("IPL","INDIA","14-04-2024",20,"NITIN MENON","GREEN");
		CT.startTournament();
		CT.tossCoin("HEADS");
		CT.declareManOfTheMatch("Virat Kohli");
		CT.endTournament();
		System.out.println(CT);
		System.out.println("*********************************");
		
		TennisTournament TT = new TennisTournament("WIMBELDON","AUSTRALIA","15-05-2024","BOX",6,"KOOKABURA");
		TT.startTournament();
		TT.beginMatch("ROGER FEDERER", "DJAN STANKOVIC");
		TT.recordScore(20, 21);
		TT.endTournament();
		System.out.println(TT);
		System.out.println("*********************************");
		
		Football FB = new Football("FIFA WORLDCUP","EUROPE","07-06-24",11,"2 Months","GOLD");
		FB.startTournament();
		FB.scheduleMatch("FRANCE", "ARGENTINA");
		FB.announceWinner("ARGENTINA");
		FB.endTournament();
		System.out.println(FB);
	}
}
