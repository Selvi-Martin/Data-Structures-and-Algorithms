package Data;
import java.util.*;
public class SelectionSort {
	public int[] selec(int n,int arr[]) {
		for(int i=0;i<n;i++) {
			int min=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[min]) {
					min=j;
					//System.out.println(arr[j+1]);
				}
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
		return arr;
	}
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the capacity:");
		int capacity=obj.nextInt();
		System.out.println("Enter the number of elements:");
		int n=obj.nextInt();
		System.out.println("Enter the elements:");
		int arr[]=new int[capacity];
		for(int i=0;i<n;i++) {
			arr[i]=obj.nextInt();
		}
		SelectionSort ob=new SelectionSort();
		int[] res=ob.selec(n,arr);
		System.out.println("After sorting:");
		for(int i=0;i<n;i++) {
			System.out.println(res[i]);
		}	
		obj.close();
	}
}
