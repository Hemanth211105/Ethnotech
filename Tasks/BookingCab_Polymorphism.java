//UBER Problem
class Person{
	public void bookcab(){
		System.out.println("Booking Cab..");
	} 
}
class Auto extends Person{
	@Override
	public void bookcab(){
		double amount=150;
		System.out.println("For 2km Auto Charged "+amount+" rs.");
	}
}
class Cab extends Person{
	@Override
	public void bookcab(){
		double amount=250;
		System.out.println("For 3km Cab Charged "+amount+" rs.");
	}
}
class Bike extends Person{
	@Override
	public void bookcab(){
		double amount=100;
		System.out.println("For 1km Bike Charged "+amount+" rs.");
	}
}
class BookingCab_Polymorphism{
	public static void main(String args[]){
		Auto a=new Auto();
		Cab c=new Cab();
		Bike b=new Bike();
		a.bookcab();
		b.bookcab();
		c.bookcab();
	}
}
