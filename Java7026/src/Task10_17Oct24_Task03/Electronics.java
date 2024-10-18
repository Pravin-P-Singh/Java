package Task10_17Oct24_Task03;

public class Electronics extends Product{
	int warrantyPeriod;
	Electronics(){
		
	}
	Electronics(String productName,int productPrice,int warrantyPeriod){
		super(productName,productPrice);
		this.warrantyPeriod = warrantyPeriod;
	}
	public void calculateDiscount() {
		if(warrantyPeriod>1) {
			//apply 10% discount
			productPrice = productPrice-(productPrice*0.1);
			System.out.println("You have got the discount of 10 percent and your bill to be paid is: "+productPrice);
		}else {
			System.out.println("You have got no discount and your bill to be paid is: "+productPrice);
		}
	}
	@Override
	public String toString() {
		return "Electronics [productName=" + productName + ", productPrice=" + productPrice + ", warrantyPeriod="
				+ warrantyPeriod + "]";
	}
	
}
