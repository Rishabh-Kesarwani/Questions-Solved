package LinkedList;

public class reverseLinkedList {

	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	
	public static void Print(Node head) {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	
	public static Node ReverseIteratively(Node head) {
		Node prev=null;
		Node curr=head;
		Node next=null;
		while(curr!=null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		return prev;	
	}
	
	public static Node ReverseRecursively(Node head) {
		if(head.next==null) {
			return head;
		}
		Node smallAns=ReverseRecursively(head.next);
		Node temp=smallAns;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=head;
		head.next=null;
		return smallAns;
		
	}
		
	public static void main(String[] args) {
		Node head=new Node(10);
		Node n1=new Node(20);
		Node n2=new Node(30);
		Node n3=new Node(40);
		Node n4=new Node(50);
		head.next=n1;
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		Print(head);
		//Node head1=ReverseRecursively(head);
		Node head1=ReverseIteratively(head);
		Print(head1);
		//Print(head2);
	}
}
