import java.util.Scanner;
class ElectricityBill{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number of units: ");
		int units=sc.nextInt();
		System.out.println("Electricty bill : " + eleBill(units));
	}
	static int eleBill(int units){
		return (units > 250) ? units - 250 : 0;
	}
}
