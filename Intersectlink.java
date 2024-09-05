package data;
import java.util.Scanner;
public class Intersectlink {
	Node head;
	class Node{
		Node next;
		int data;
		Node(){
			data=0;
		}
		Node(int val){
			data=val;
		}
	}
	public void insertAtEnd(int val) {
		Node newnode=new Node(val);
		Node temp=head;
		if(head==null) {
			head=newnode;
		}
		else {
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newnode;
		}
	}
	public void intersection(Node list1, Node list2) {
		Node temp1=list1;
		Node temp2=list2;
		int count1=1;
		int count2=1;
		while(temp1.next!=null) {
			temp1=temp1.next;
			count1++;
		}
		while(temp2.next!=null) {
			temp2=temp2.next;
			count2++;
		}
		int n=0;
		if(count1>count2) {
			int diff=count1-count2;
			while(n<diff) {
				temp1=temp1.next;
				n++;
			}
		}
		else {
			int diff=count2-count1;
			while(n<diff) {
				temp2=temp2.next;
				n++;
			}
		}
		while(temp1.next!=null) {
			if(temp1==temp2) {
				System.out.println("Intersection at:"+temp1.data);
				return;
			}
		}
		System.out.println("No intersection");
	}
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		Intersectlink obj1=new Intersectlink();
		Intersectlink obj2=new Intersectlink();
		obj1.insertAtEnd(1);
		obj1.insertAtEnd(2);
	}
}
