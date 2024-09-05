package data;
import java.util.Scanner;
class Circledemo{
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		CircularList<Integer> obj=new CircularList<Integer>();
		while(true) {
			System.out.println("********************************************************");
			System.out.println("Press 1 to insert at begining:");
			System.out.println("Press 2 to insert at end:");
			System.out.println("Press 3 to delete at begining:");
			System.out.println("Press 4 to delete at end:");
			System.out.println("Press 5 to insert after:");
			System.out.println("Press 6 to delete the value");
			System.out.println("Press 7 to display size:");
			System.out.println("Press 9 to display");
			System.out.println("Press 10 to exit:");
			System.out.println("********************************************************");
			System.out.println("Enter your choice:");
			int choice=scan.nextInt();
			switch(choice) {
				case 1:{
					System.out.println("enter the value to be inserted:");
					int val=scan.nextInt();
					obj.insertatbegining(val);
					break;
				}
				case 2:{
					System.out.println("enter the value to be inserted:");
					int val=scan.nextInt();
					obj.insertatend(val);
					break;
				}
				case 3:{
					obj.deleteatbegining();
					break;
				}
				case 4:{
					obj.deleteatend();
					break;
				}
				case 5:{
					System.out.println("enter the value to be inserted:");
					int val=scan.nextInt();
					System.out.println("Enter the element after which it should be inserted:");
					int elem=scan.nextInt();
					obj.insertafter(val,elem);
					break;
				}
				case 6:{
					System.out.println("Enter the value to be deleted:");
					int val=scan.nextInt();
					obj.deleteval(val);
					break;
					
				}
				case 7:{
					obj.size();
					break;
				}
				case 9:{
					obj.display();
					break;
				}
				case 10:{
					System.out.println("Exited...");
					scan.close();
					System.exit(0);
					
				}
			}
		}
	}
}