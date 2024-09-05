package data;
//import java.util.Scanner;
public class Linear {
	public static int line(int arr[],int target) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target)
				return i;
		}
		return -1;
	}
	public static int  line(String data,char target) {
		for(int i=0;i<data.length();i++) {
			if(data.charAt(i)==target) {
				return i;
			}
		}
		return -1;
	}
	public static int[] line(int[][] arr,int target) {
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				if(arr[row][col]==target) {
					return new int[] {row,col};
				}
			}
		}
		return new int[] {-1,-1};
	}
	public static int min(int arr[]) {
		int min=9999;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return min;
	}
	public static int max(int arr[]) {
		int max=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
	public static int count(String inp, char tar) {
		int count=0;
		for(int i=0;i<inp.length();i++) {
			if(inp.charAt(i)==tar) {
				count++;
			}
		}
		if(count==0) {
			return -1;
		}
		return count;
		
	}
}
