package data;

public class CircularList<T> {
	Node last;
	class Node{
		T data;
		Node next;
		Node(T val){
			data=val;
			next=null;
		}
	}
	CircularList(){
		last=null;
	}
	public void insertatbegining(T val) {
		Node newnode=new Node(val);
		if(last==null) {
			last=newnode;
			newnode.next=newnode;
		}
		else {
			newnode.next=last.next;
			last.next=newnode;
		}
	}
	public void insertatend(T val) {
		Node newnode=new Node(val);
		if(last==null) {
			last=newnode;
			newnode.next=newnode;
		}
		else {
			newnode.next=last.next;
			last.next=newnode;
			last=newnode;
		}
	}
	public void deleteatbegining() {
		if(last==null)
			throw new IndexOutOfBoundsException("Empty List");
		if(last.next==last)
			last=null;
		else {
			last.next=last.next.next;
		}
	}
	public void deleteatend() {
		Node temp=last.next;
		if(last==null)
			throw new IndexOutOfBoundsException("Empty List");
		if(last.next==last)
			last=null;
		else {
			while(temp.next!=last)
				temp=temp.next;
			temp.next=last.next;
			last=temp;
		}
	}
	public void insertafter(T val, T elem) {
		Node newnode=new Node(val);
		Node temp=last.next;
		if(last==null)
			throw new IndexOutOfBoundsException("Empty List");
		else {
			do {
				if(temp.data==elem) {
					newnode.next=temp.next;
					temp.next=newnode;
					return;
				}
				temp=temp.next;
			}
			while(temp!=last.next);
			System.out.println("Element not found");
		}
	}
	public void deleteval(T val) {
		Node temp=last.next;
		Node prev=last;
		do {
			if(temp.data==val) {
				prev.next=temp.next;
				temp=null;
				return;
			}
			prev=temp;
			temp=temp.next;
				
		}while(temp!=last.next);
		System.out.println("Element not found");
	}
	public void size() {
		Node temp=last.next;
		int count=0;
		do {
			temp=temp.next;
			count++;
		}
		while(temp!=last.next);
		System.out.println("The size is :"+count);
	}
	public void display() {
		if(last==null)
			return;
		Node temp=last.next;
		System.out.println("********************************************************");
		do {
			System.out.print(" "+temp.data);
			temp=temp.next;
		}while(temp!=last.next);
		System.out.println();
		System.out.println("********************************************************");

	}
}

