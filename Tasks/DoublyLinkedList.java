//Social Media Feed Navigation
import java.util.*;
class Node{
	String data;
	Node prev,next;
	void Node(String data){
		this.data=data;
		this.prev=null;
		this.next=null;
	}
}
class DoublyLinkedList{	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		LinkedList <String> li=new LinkedList<>();
		li.add("Post 1 : Good Morning");
		li.add("Post 2 : Greetings");
		li.add("Post 3 : Learn Java");
		System.out.println(li);
		System.out.print("Enter current post no. for next post: ");
		int ne=sc.nextInt();
		System.out.println(li.get(ne));
		System.out.print("Enter current post no. for previous post: ");
		int pre=sc.nextInt();
		System.out.println(li.get(pre-2));
		System.out.print("Enter Position to Insert a post: ");
		int ins=sc.nextInt();
		System.out.print("Enter Information of a post: ");
		li.add(ins-1,"[Sponsered Post] Click here for premium");
		System.out.println("After Inserting Post : "+li);
		System.out.print("Enter post number to delete: ");
        int del=sc.nextInt();
        li.remove(del-1);
		System.out.println("After Deleting Post : "+li);
	}
}