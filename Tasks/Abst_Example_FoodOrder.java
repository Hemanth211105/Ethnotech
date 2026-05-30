
abstract class FoodOrder{
	String CustomerName;
	String Itemname;
	int quantity;
	double price;
	FoodOrder(){
		System.out.println("Welcome to Food Ordering System...");
	}
	FoodOrder(String CustomerName,String Itemname,int quantity,double price){
		this.CustomerName=CustomerName;
		this.Itemname=Itemname;
		this.quantity=quantity;
		this.price=price;
	}
	abstract void orderfood();
	
	void generatebill(){
		double total=quantity*price;
		System.out.println("Customer Name: "+CustomerName);
		System.out.println("Item Name: "+Itemname);
		System.out.println("Quantity: "+quantity);
		System.out.println("Price per Item: "+price);
		System.out.println("Total Bill: "+total);
	}
	abstract void discount();
	abstract void totalbill();
}
class PizzaOrder extends FoodOrder{
	PizzaOrder(String CustomerName,String Itemname,int quantity,double price){
		super(CustomerName,Itemname,quantity,price);
	}	
	@Override
	void orderfood(){
		System.out.println("Ordering Food...");
	} 
	double total=price*quantity;
	@Override
	void discount(){
		System.out.println("Discount: "+(total*0.05));
	}
	@Override
	void totalbill(){
		System.out.println("Amount to pay: "+(total-(total*0.05)));
	}
}
class Abst_Example_FoodOrder{
	public static void main(String args[]){
		PizzaOrder fo=new PizzaOrder("Revanth","Biryani",2,150);
		PizzaOrder f1=new PizzaOrder("Bharath","Dosa",3,40);
		System.out.println("====Customer-1====");
		fo.orderfood();
		fo.generatebill();
		fo.discount();
		fo.totalbill();
		System.out.println("====Customer-2====");
		f1.orderfood();
		f1.generatebill();
		f1.discount();
		f1.totalbill();
	}
}
