package LinkedList;

import java.util.HashMap;
import java.util.HashSet;

public class GivenSuminSortedLinkedList {

	static class Node{
		int data;
		Node prev,next;
		public Node(int data) {
			this.data=data;
		}
	}
	
	public static Node MakeDoublyLL() {
		Node n1=new Node(1);
		Node n2=new Node(2);
		Node n3=new Node(4);
		Node n4=new Node(6);
		Node n5=new Node(8);
		Node n6=new Node(9);
		Node n7=new Node(10);
		Node n8=new Node(12);
		Node head=n1;
		
		n1.next=n2; n2.prev=n1;
		n2.next=n3; n3.prev=n2;
		n3.next=n4; n4.prev=n3;
		n4.next=n5; n5.prev=n4;
		n5.next=n6; n6.prev=n5;
		n6.next=n7; n7.prev=n6;
		n7.next=n8; n8.prev=n7;
		
		n8.next=null;
		return head;
	}
	
	static void findSum(Node head, int sum) {
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		
		Node first=head;
		Node last=temp;
		
		while(first!=last && last.next!=first) {
			int val=first.data+last.data;
			if(val<sum) {
				first=first.next;
			}
			else if(val>sum) {
				last=last.prev;
			}
			else {
				System.out.print(first.data+" "+last.data);
				System.out.println();
				first=first.next;
				last=last.prev;
			}
		}
	}
	
	// Method1 Find sum of triplets T.C.- O(n^3)
	static void TripletSum(Node head, int sum) {
		Node ptr1;
		Node ptr2;
		Node ptr3;
		
		for(ptr1=head;ptr1.next.next!=null;ptr1=ptr1.next){
			for(ptr2=ptr1.next;ptr2.next!=null; ptr2=ptr2.next){
				for(ptr3=ptr2.next;ptr3!=null;ptr3=ptr3.next) {
					
					if((ptr1.data+ptr2.data+ptr3.data)==sum) {
						System.out.print(ptr1.data+" "+ptr2.data+" "+ptr3.data);
						System.out.println();
					}
				}
			}
		}
	}
	
	// Method 2 Using 2 pointer Technique
	static void findSum(Node first , Node last,int currentData,int sum) {
		
		
		while(first!=null && last!=null&& first!=last && last.next!=first) {
			int val=first.data+last.data;
			
			if(val==sum){
				System.out.print(currentData+" " +first.data+" "+last.data);
				System.out.println();
				first=first.next;
				last=last.prev;
			}
			else if(val<sum) {
				first=first.next;
			}
			else{
				last=last.prev;
			}
		}
	}
	
	static void TripletSumBetter(Node head, int sum) {
		if(head==null) {
			return;
		}
		
		Node first, current, last;
		last=head;
		
		while(last.next!=null) {
			last=last.next;
		}
		
		for(current=head;current!=null ;current=current.next) {
			first =current.next;
			findSum(first, last, current.data, sum-current.data);
		}
	}
	
	// Method 3 Using Hashmap
	
	public static void TripletSumHashmap(Node head, int sum) {
		Node temp=head;
		int count=0;
		HashMap<Integer, Node> hm=new HashMap<>();
		while(temp!=null) {
			hm.put(temp.data, temp);
			temp=temp.next;
		}
		Node ptr1,ptr2;
		for(ptr1=head;ptr1!=null;ptr1=ptr1.next) {
			for(ptr2=ptr1.next;ptr2!=null;ptr2=ptr2.next) {
				
				int val=ptr1.data+ptr2.data;
				int diff=sum-val;
				if(hm.containsKey(diff) && hm.get(diff)!= ptr1 && hm.get(diff)!=ptr2 ) {
					count++;
					System.out.print(diff+" "+ptr1.data+" "+ptr2.data);
					System.out.println();
				}
			}
		}
		System.out.println(count);
	}
	
	
	public static void main(String[] args) {
		Node head=MakeDoublyLL();
		TripletSum(head, 17);
	}
}
