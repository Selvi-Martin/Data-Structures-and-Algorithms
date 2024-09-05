package data;
import java.util.Scanner;
public class Queuelink {
	class Node{
		int data;
		Node next;
		Node(int val){
			data=val;
			next=null;
		}
	}
	Node front,rear;
	public void enqueue(int val) {
		Node newnode=new Node(val);
		if(front==null) {
			front=newnode;
		}
		else {
			rear.next=newnode;
		}
		rear=newnode;
	}
	public void dequeue() {
		if(front==null) {
			throw new IndexOutOfBoundsException("Array is empty");
		}
		front=front.next;
		if(front==null)
			rear=null;
	}
	public void display() {
		Node temp=front;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		Queuelink obj=new Queuelink();
		//int arr[]=new int[n];
		while(true) {
			System.out.println("Press 1 to enqueue\nPress 2 to dequeue\nPress 3 to display:\nPress 4 to exit:\nEnter your choice:");
			int choice=scan.nextInt();
			switch(choice) {
				case 1:{
					System.out.println("Enter an element to enqueue:");
					int val=scan.nextInt();
					obj.enqueue(val);
					break;
				}
				case 2:{
					obj.dequeue();
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
