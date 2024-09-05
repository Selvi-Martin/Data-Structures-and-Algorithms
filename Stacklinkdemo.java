package data;
import java.util.Scanner;
public class Stacklinkdemo {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		Stacklink obj=new Stacklink();
		while(true) {
			System.out.println("Press 1 to push:\nPress 2 to pop:\nPress 3 to return peek:\nPress 4 to display:\nPress 5 to exit:");
			System.out.println("Enter your choice:");
			int choice=scan.nextInt();
			switch(choice) {
				case 1:{
					System.out.println("Enter the element:");
					int val=scan.nextInt();
					obj.push(val);
					break;
				}
				case 2:{
					obj.pop();
					break;
				}
				case 3:{
					obj.peek();
					break;
				}
				case 4:{
					obj.display();
					break;
				}
				case 5:{
					scan.close();
					System.exit(0);
				}
			}
		}
	}
}
