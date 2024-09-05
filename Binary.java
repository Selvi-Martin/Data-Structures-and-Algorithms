package data;
//import java.util.Arrays;
public class Binary {
	public static int bin(int arr[],int  target) {
		//Arrays.sort(arr);
		int start=0;
		int end=arr.length-1;
		boolean asc=false;
		if(arr[start]<arr[end]) {
			asc=true;
		}
		while(start<=end) {
			int mid=(end+start)/2;
			if(asc) {
				if(arr[mid]>target){
					end=mid-1;
				}
				else if(arr[mid]<target){
					start=mid+1;
				}
				else {
						return mid;
				}
			}
			else {
				if(arr[mid]>target) {
					start=mid+1;
				}
				else if(arr[mid]<target) {
					end=mid-1;
				}
				else{
					return mid;
				}
			}
		}
		return -1;
	}
}
