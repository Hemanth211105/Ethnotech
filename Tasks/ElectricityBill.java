class ElectricityBill{
	public static void main(String[] args){
		int units = 1000;
		System.out.println("Electricty bill : " + eleBill(units));
	}
	static int eleBill(int units){
		return ((units > 250) & true) ? units - 250 : 0;
	}
}