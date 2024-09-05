package data;
import java.util.Scanner;
public class Bubblesort {
	public int[] sort(int n,int[] arr) {
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j+1]<arr[j]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			System.out.println("During sorting:");
			for(int k=0;k<n;k++) {	
				System.out.print(arr[k]+" ");
			}
			System.out.println();
		}
		return arr;
	}
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		Bubblesort obj=new Bubblesort();
		System.out.println("Enter the size:");
		int n=scan.nextInt();
		System.out.println("Enter the elements:");
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		int[] res=obj.sort(n,arr);
		System.out.println("After sorting:");
		for(int i=0;i<n;i++){
			System.out.println(res[i]);
		}
		scan.close();
	}
}
