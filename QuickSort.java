package data;
import java.util.Scanner;
public class QuickSort {
	public static void quick(int[] arr,int low,int high) {
		if(low>=high) {
			return;
		}
		int start=low;
		int end=high;
		int mid=(start+end)/2;
		int pivot=arr[mid];
		while(start<=end) {
			while(arr[start]<pivot) {
				start++;
			}
			while(arr[end]>pivot) {
				end--;
			}
			if(start<=end) {
				int temp=arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
				start++;
				end--;
			}
		}
		quick(arr,low,end);
		quick(arr,start,high);
	}
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size:");
		int size=scan.nextInt();
		System.out.println("Enter the elements:");
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=scan.nextInt();
		}
		quick(arr,0,arr.length-1);
		System.out.println("After sorting");
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]);
		}
		scan.close();
	}
}
