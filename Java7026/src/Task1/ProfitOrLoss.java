package Task1;

public class ProfitOrLoss {
	public static void main(String[] args) {
		int costPrice = 200;
		int sellingPrice = 1000;
		if(sellingPrice > costPrice) {
			System.out.println("Profit: " + (sellingPrice - costPrice));
		} else if(costPrice == sellingPrice) {
			System.out.println("No Profit or Loss");
		} else {
			System.out.println("Loss: " + -(costPrice - sellingPrice));
		}
	}
}
