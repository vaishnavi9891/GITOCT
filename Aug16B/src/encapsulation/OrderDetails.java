package encapsulation;

public class OrderDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Categories;
		int CostOfItems;
		
		Shoppers shop= new Shoppers();
		shop.setCustomerName("ANIL");
		shop.setCategories("Clothing");
		shop.setCostOfItems(3000);
		
		String CustomerName = shop.getCustomerName();
		Categories = shop.getCategories();
		CostOfItems = shop.getCostOfItems();
		
System.out.println("Customer Name " +CustomerName+ " Product " +Categories+ "Amount to be Payed " +CostOfItems);
		
		
	}

}
