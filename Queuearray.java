package data;
import java.util.Scanner;
public class Queuearray {
	private int rear=-1;
	int arr[];
	Queuearray(int size){
		arr=new int[size];
	}
	public void enqueue(int val) {
		//int rear=0;
		if(rear<arr.length) {
			arr[++rear]=val;
		}
		else {
			throw new IndexOutOfBoundsException("Array is full.");
		}
	}
	public void dequeue() {
		if(rear==-1)
			throw new IndexOutOfBoundsException("Array is empty");
		else {
			for(int i=0;i<rear;i++) {
				arr[i]=arr[i+1];
			}
		}
		rear--;
	}
	public void display() {
		System.out.println("The elements are");
		if(rear==-1)
			throw new IndexOutOfBoundsException("Array is empty");
		for(int i=0;i<=rear;i++) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int n=scan.nextInt();
		Queuearray obj=new Queuearray(n);
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
