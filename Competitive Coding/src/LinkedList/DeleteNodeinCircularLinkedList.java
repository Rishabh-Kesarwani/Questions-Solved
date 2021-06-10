package LinkedList;

public class DeleteNodeinCircularLinkedList {

	static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data=data;
			next=null;
		}
	}
	
	public static Node DeleteNode(Node head, int key){
		Node curr=head;
		Node prev=null;
		
		while(curr.data!=key) {
			if(curr.next==head) {
				return null;
			}
			prev=curr;
			curr=curr.next;
		}
		// single node is present there
		if(curr==head&& curr.next==head) {
			head=null;
			return head;
		}
		
		// we want to delete the head Node since prev wont go inside so we reach prev of head  
		if(curr==head) {
			prev=head;
			while(prev.next!=head) {
				prev=prev.next;
			}
			head=curr.next;
			prev.next=head;
		}
		else {
			prev.next=curr.next;
		}
		return head;
	}
	
	public static void printC(Node head) {
		Node temp=head;
		
		do {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		while(temp!=head);
		System.out.println();
	}
	
	public static void main(String[] args) {
		Node n1=new Node(10);
		Node n2=new Node(20);
		Node n3=new Node(30);
		Node n4=new Node(40);
		Node n5=new Node(50);
		Node n6=new Node(60);
		Node n7=new Node(70);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n6;
		n6.next=n7;
		n7.next=n1;
		printC(n3);
		Node ans=DeleteNode(n3, 20);
		printC(ans);
	}
}
