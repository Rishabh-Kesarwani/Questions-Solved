package LinkedList;

import java.util.Scanner;

public class MoveLastElementinFront {

	public static Node<Integer> takeInput() {
		Scanner s=new Scanner(System.in);
		int data=s.nextInt();
		Node<Integer> head=null;
		Node<Integer> tail=null;
		while(data!=-1) {
			Node<Integer> currNode=new Node<>(data);
			if(head==null) {
				head=currNode;
				tail=currNode;
			}
			else {
				tail.next=currNode;
				tail=currNode;
			}
			data=s.nextInt();
		}
		return head;
	}
	
	public static void Print(Node<Integer> head) {
		Node<Integer> temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	
	public static Node<Integer> MoveLast(Node<Integer> head){
		Node<Integer> curr=head;
		while(curr.next.next!=null) {
			curr=curr.next;
		}
		
		Node<Integer> temp=curr.next;
		curr.next=null;
		temp.next=head;
		head=temp;
		return head;
		
	}
 	
	
	public static void main(String[] args) {
		
		Node<Integer> head=takeInput();
		Node<Integer> head1=MoveLast(head);
		Print(head1);
	}

}
