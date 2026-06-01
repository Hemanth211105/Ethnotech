import java.util.*;
class PlayList_ArrayList{
	public static void main(String args[]){
		List<String> li=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		String fs=sc.nextLine();
		String ss=sc.nextLine();
		String ts=sc.nextLine();
		String fos=sc.nextLine();
		String fis=sc.nextLine();
		li.add(fs);
		li.add(ss);
		li.add(ts);
		li.add(fos);
		li.add(fis);
		System.out.println("PlayList : "+li);
		li.remove(2);
		System.out.println("Containing Element : "+li.contains("Achari"));
		System.out.println("After removing Element : "+li);
		System.out.println("Get element : "+li.get(1));
		System.out.println("Printing List Using For each : ");
		for(String s:li){
			System.out.print(s+" ");
		}
		System.out.println();
		System.out.println("Size of the List : "+li.size());
	}
}