package data;
import java.util.*;
public class Search {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int n=scan.nextInt();
		System.out.println("Enter the elements of an array:");
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		while(true) {
			System.out.println("Press 1 for linear search:");
			System.out.println("Press 2 for Binary search:");
			System.out.println("Enter your choice:");
			int choice=scan.nextInt();
			switch(choice) {
				case 1:{
					String choice1="z";
					while(choice1!="d") {
						System.out.println("Press a for integer searching:");
						System.out.println("Press b for String searching:");
						System.out.println("Press c for Two dimensional searching:");
						System.out.println("Press d to find minimun element in an array:");
						System.out.println("Press e to find max elem in an array:");
						System.out.println("Press f to find the number of occurence of a character in a String:");
						System.out.println("Press z to go back to main menu:");
						System.out.println("Enter your choice:");
						choice1=scan.next();
						if(choice1.equals("z")) {
							break;
						}
						//System.out.println("Enter the target:");
						switch(choice1) {
							case "a":{
								System.out.println("Enter the target:");
								int target=scan.nextInt();
								int res=Linear.line(arr,target);
								if(res==-1) {
									System.out.println("Element not found");
								}
								else {
									System.out.println("Element found at index:"+res);
								}
								break;
							}
							case "b":{
								System.out.println("Enter the string:");
								String str=scan.next();
								System.out.println("Enter the target:");
								char target=scan.next().charAt(0);
								int res=Linear.line(str, target);
								if(res==-1) {
									System.out.println("Element not found");
								}
								else {
									System.out.println("Element found at index:"+res);
								}
								break;
							}
							case "c":{
								//System.out.println("Enter the two dimensional array:");
								System.out.println("Enter the number of rows:");
								int row=scan.nextInt();
								System.out.println("Enter the number of col:");
								int col=scan.nextInt();
								int arr1[][]=new int[row][col];
								System.out.println("Enter the elements:");
								for(int i=0;i<row;i++) {
									for(int j=0;j<col;j++) {
										arr1[i][j]=scan.nextInt();
									}
								}
								System.out.println("Enter the target:");
								int target=scan.nextInt();
								int res[]=Linear.line(arr1,target);
								System.out.println("The element is found at index:"+Arrays.toString(res));
								break;
							}
							case "d":{
								int res=Linear.min(arr);
								System.out.println("The minimun element is :"+res);
								break;
							}
							case "e":{
								int res=Linear.max(arr);
								System.out.println("The maximum element is:"+res);
								break;
							}
							case "f":{
								System.out.println("Enter the String:");
								String input=scan.next();
								System.out.println("Enter the character to count:");
								char tar=scan.next().charAt(0);
								int res=Linear.count(input,tar);
								System.out.println("The number of occurence of the character is:"+res);
								break;
							}
						}
					}
					break;
				}
				case 2:{
					System.out.println("Enetr the target:");
					int target=scan.nextInt();
					int res=Binary.bin(arr,target);
					System.out.println("The element is found at :"+res);
					break;
				}
				case 3:{
					System.out.println("Exiting..");
					scan.close();
					System.exit(0);
				}
			}
		}
	}
}
