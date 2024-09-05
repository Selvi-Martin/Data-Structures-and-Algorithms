package data;
import java.util.Scanner;
public class Insertionsort<T> {
	public int[] sort(int n,int[] arr) {
		for(int i=1;i<n;i++) {
			for(int j=i;j>0;j--) {
				if(arr[j-1]>arr[j]) {
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
				else {
					break;
				}
			}
		}
		return arr;
	}
	public char[] sort(int n,char[] arr) {
		for(int i=1;i<n;i++) {
			for(int j=i;j>0;j--) {
				if(arr[j-1]>arr[j]) {
					char temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
				else {
					break;
				}
			}
		}
		return arr;
	}
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		Insertionsort<Integer> obj=new Insertionsort<Integer>();
		Insertionsort<Character> obj2=new Insertionsort<Character>();
		System.out.println("Enter the size:");
		int n=scan.nextInt();
		System.out.println("Enter the elements:");
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		int[] res=obj.sort(n,arr);
		System.out.println("After sorting:");
		for(int i=0;i<n;i++) {
			System.out.println(res[i]);
		}
		System.out.println("Enter the characters:");
		char arr2[]=new char[n];
		for(int i=0;i<n;i++) {
			arr2[i]=scan.next().charAt(0);
		}
		char res2[]=obj2.sort(n, arr2);
		System.out.println("After sorting:");
		for(int i=0;i<n;i++) {
			System.out.println(res2[i]);
		}
		scan.close();
	}
}
