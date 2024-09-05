package data;

public class Stacklink {
	Node top;
	class Node{
			int data;
			Node next;
			Node(int val){
				data=val;
				next=null;
			}
	}
	Stacklink(){
		top=null;
	}
		public void push(int val) {
			Node newnode=new Node(val);
			if(top==null)
				top=newnode;
			else {
				newnode.next=top;
				top=newnode;
			}
		}
		public void pop() {
			if(top==null) {
				throw new IndexOutOfBoundsException("Empty");
			}
			else {
				Node temp=top;
				top=top.next;
				temp=null;
			}
		}
		public void peek() {
			if(top==null) {
				throw new IndexOutOfBoundsException("Empty");
			}
			else {
				System.out.println("The peek element is :"+top.data);
			}
		}
		public void display() {
			Node temp=top;
			while(temp!=null) {
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
}
