package data;
import java.util.Scanner;
public class Selectionsort {
	public int[] sort(int n,int[] arr) {
		for(int i=0;i<n;i++) {
			int min=arr[i];
			int minarr=i;
			for(int j=i;j<n;j++) {
				if(arr[j]<min) {
					min=arr[j];
					minarr=j;
				}
			}
			int temp=arr[i];
			arr[i]=min;
			arr[minarr]=temp;
			//min=temp;
		}
		return arr;
	}
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		Selectionsort obj=new Selectionsort(); 
		System.out.println("Enter the size of an array:");
		int n=scan.nextInt();
		System.out.println("Enter the elements:");
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		int res[]=obj.sort(n,arr);
		System.out.println("After sorting:");
		for(int i=0;i<n;i++) {
			System.out.println(res[i]);
		}
		scan.close();
	}
}
