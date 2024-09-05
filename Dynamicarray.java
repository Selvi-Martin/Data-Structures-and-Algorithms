/*delete at end

 * delete from begining
 *insert at begining
 *get(index)
 *update(index)
 *search(val)->return index
 *clear
 */



package data;
import java.util.Scanner;
public class Dynamicarray {
	static final int initialcapacity=8;
	private int size;
	private int capacity;
	private int arr[];
	Dynamicarray(){
		size=0;
		capacity=initialcapacity;
		arr=new int[capacity];
	}
	public void add(int val) {
		if(size==capacity)
			expandarray();
		arr[size++]=val;
	}
	private void expandarray() {
		capacity=capacity*2;
		arr=java.util.Arrays.copyOf(arr, capacity);
	}
	public void display() {
		System.out.println("The elements are:");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public void addpos(int pos, int val) {
		if(size==capacity)
			expandarray();
		for(int i=size;i>pos-1;i--) {
			arr[i]=arr[i-1];
		}
		arr[pos-1]=val;
		size++;
	}
	public void delpos(int pos) {
		if(capacity>initialcapacity && capacity> size*3)
			shrinkarray();
		for(int i=pos-1;i<size;i++) {
			arr[i]=arr[i+1];
		}
		size--;
	}
	private void shrinkarray() {
		capacity=capacity/2;
		arr=java.util.Arrays.copyOf(arr, capacity);
	}
	public void delbeg() {
		if(capacity>initialcapacity && capacity>size*3)
			shrinkarray();
		for(int i=0;i<size;i++) {
			arr[i]=arr[i+1];
		}
		size--;
	}
	public void insertatbeg(int val) {
		if(size==capacity)
			expandarray();
		for(int i=size;i>0;i--)
			arr[i]=arr[i-1];
		arr[0]=val;
		size++;
	}
	public void getindex(int val) {
		for(int i=0;i<size;i++) {
			if(arr[i]==val) {
				System.out.println("Index of "+val+" is: "+i);
				break;
			}
		}
		System.out.println("Element not found");
	}
	public void updateindex(int index,int val) {
		if(index>size-1) {
			System.out.println("Index not found:");
		}
		for(int i=0;i<size;i++) {
			if(i==index) {
				arr[i]=val;
			}
		}
	}
	public void search(int val) {
		for(int i=0;i<size;i++) {
			if(arr[i]==val) {
				System.out.println("The element is found at the index: "+i);
				break;
			}
			//System.out.println("Element not found");
		}
		System.out.println("Element not found");
	}
	public void clear() {
		size=0;
		System.out.println("The array is empty");
	}
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		Dynamicarray obj=new Dynamicarray();
		int val,pos;
		while(true) {
			System.out.println("Press 1 to insert an element:");
			System.out.println("Press 2 to display:");
			System.out.println("Press 3 to insert at particular position:");
			System.out.println("Press 4 to delete at particular position:");
			System.out.println("Press 5 to delete at beginning:");
			System.out.println("Press 6 to insert at beginning:");
			System.out.println("Press 7 to get index of an element:");
			System.out.println("Press 8 to update index:");
			System.out.println("Press 9 to search element:");
			System.out.println("Enter 10 to clear");
			System.out.println("Press 11 to exit:");
			System.out.println("Enter your choice:");
			int choice=scan.nextInt();
			switch(choice) {
				case 1:
				{
					System.out.println("Enter the element to be inserted:");
					val=scan.nextInt();
					obj.add(val);
					break;
				}
				case 2:
				{
					obj.display();
					break;
				}
				case 3:
				{
					System.out.println("Enter the position to be inserted:(starts fron 0):");
					pos=scan.nextInt();
					if(pos<0) {
						System.out.println("Invalid position");
						break;
					}
					System.out.println("Enter the element to be inserted:");
					val=scan.nextInt();
					obj.addpos(pos,val);
					break;
				}
				case 4:{
					System.out.println("Enter the position to be deleted:(starts fron 0):");
					pos=scan.nextInt();
					if(pos<0) {
						System.out.println("Invalid position");
						break;
					}
					obj.delpos(pos);
					break;
				}
				case 5:{
					obj.delbeg();
					break;
				}
				case 6:{
					System.out.println("Enter the element to be added:");
					val=scan.nextInt();
					obj.insertatbeg(val);
					break;
				}
				case 7:{
					System.out.println("Enter the element:");
					val=scan.nextInt();
					obj.getindex(val);
					break;
				}
				case 8:{
					System.out.println("Enter the index:");
					int index=scan.nextInt();
					System.out.println("Enter the value to be updated:");
					val=scan.nextInt();
					obj.updateindex(index,val);
					break;
				}
				case 9:{
					System.out.println("Enter the element to be searched:");
					val=scan.nextInt();
					obj.search(val);
					break;
				}
				case 10:{
					obj.clear();
					break;
				}
				case 11:
				{
					scan.close();
					System.exit(0);
				}
			}
		}
	}
}
