package data;
import java.util.*;
public class MergeSort {
	public static void mergeSort(int[] arr, int start,int end) {
		if((end-start)<=1)
			return;
		int mid=(start+end)/2;
		mergeSort(arr,start,mid);
		mergeSort(arr,mid,end);
		merge(arr,start,mid,end);
	}
	public static void merge(int[] arr,int s,int m,int e) {
		int[] joined=new int[e-s];
		int i=s,j=m,k=0;
		while(i<m && j<e) {
			if(arr[i]<arr[j]) {
				joined[k++]=arr[i++];
			}
			else {
				joined[k++]=arr[j++];
			}
		}
		while(i<m) {
			joined[k++]=arr[i++];
		}
		while(j<e) {
			joined[k++]=arr[j++];
		}
		for(int l=0;l<joined.length;l++) {
			arr[s+l]=joined[l];
		}
	}
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size=scan.nextInt();
		System.out.println("Enter the elements of an array:");
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=scan.nextInt();
		}
		mergeSort(arr,0,size);
		System.out.println("After sorting:");
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]);
		}
		scan.close();
	}
}	
