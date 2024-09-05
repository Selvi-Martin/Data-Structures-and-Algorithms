package data;
import java.util.Scanner;
public class Sanrev {
	Node head=null;
	 class Node {
		 int data;
		 Node next;
		 Node(int val){
			 data=val;
			 next=null;
		 }
	}
	public void insertatbeg(int val) {
		Node newnode=new Node(val);
		if(head==null)
			head=newnode;
		else {
			newnode.next=head;
			head=newnode;
		}
	}
	public void reverse(int k) {
		Node temp=head;
		int length=0;
		while(temp!=null) {
			length++;
			temp=temp.next;
		}
		System.out.println("Length:"+length);
		int breakpoint=length-k;
		System.out.println("Breakpoint:"+breakpoint);
		Node current=head;
		Node prev=null;
		for(int i=0;i<breakpoint;i++) {
			prev=current;
			current=current.next;	
		}
		for(int i=length;i>breakpoint;i--)
		{
			prev.next=current.next;
			current.next=head;
			head=current;
			current=prev.next;
		}
	}
	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data+" ");
			temp=temp.next;
		}
	}
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		Sanrev obj=new Sanrev();
		while(true) {
			System.out.println("Press 1 to insert at begining:\nPress 2 to perform operation:\nPress 3 to diplay\nPress 4 to exit:\nEnter your choice:");
			int choice=scan.nextInt();
			switch(choice) {
				case 1:{
					System.out.println("Enter the node to be inserted:");
					int val=scan.nextInt();
					obj.insertatbeg(val);
					break;
				}
				case 2:{
					System.out.println("Enter the value of k:");
					int k=scan.nextInt();
					obj.reverse(k);
					break;
				}
				case 3:{
					obj.display();
					break;
				}
				case 4:{
					scan.close();
					System.exit(0);
				}
			}
		}
	}
}
