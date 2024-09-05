package data;
import java.util.Scanner;
public class Stackdemo {
	private int top=-1;
	private int capacity;
	int arr[];
	public Stackdemo(int capacity) {
		this.capacity=capacity;
		arr=new int[capacity];
	}
	public boolean isFull() {
		if(top==capacity-1)
			return true;
		else
			return false;
	}
	public  boolean isEmpty() {
		if(top==-1)
			return true;
		else
			return false;
	}
	public void push(int x) {
		if(isFull()) {
			System.out.println("Full");
			//return -1;
		}
		else {
			arr[++top]=x;
		}
	}
	public int pop() {
		if(isEmpty()) {
			System.out.println("Empty");
			return -1;
		}
		else {
			return arr[top--];
		}
	}
	public int peek() {
		if(isEmpty()) {
			System.out.println("Empty");
			return -1;
		}
		else {
			return arr[top];
		}
	}
	public void display(char expc[]) {
		for(int i=0;i<=top;i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	public static void main(String args[]) {	
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter capacity:");
		int capacity=scan.nextInt();
		Stackdemo obj=new Stackdemo(capacity);
		System.out.println("Enter the post fix expression");
		String exp=scan.next();
		char[] expc=exp.toCharArray();
		int n=expc.length;
		for(int i=0;i<n;i++) {
			if(isnumeric(expc[i])) {
				obj.push(expc[i]-'0');	//expc[i] is a char..So t change that into a num we subtract it with '0' coz the ascii value of nums(0-9) is (48-57) ...So here in 1st iteration the i  is taken as 48(ascii) and '0' ascii is 48..So 48-48=0...expc[0]; 
			}
			else
			{
				int a=obj.pop();
				int b=obj.pop();
				switch(expc[i])
				{
					case '+':
					{
							obj.push(a+b);
							break;
							
					}
					case '-':
					{
						obj.push(a-b);
						break;
					}
					case '*':
					{
						obj.push(a*b);
						break;
					}
					case '/':
					{
						obj.push(a/b);
						break;
					}
				}
			}
			
		}
		obj.display(expc);
	}
	private static boolean isnumeric(char c) {
		// TODO Auto-generated method stub
		return c>= '0' && c<='9';
	}
}
