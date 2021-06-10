package LinkedList;

import java.util.HashMap;
import java.util.Scanner;

public class RemoveDuplicatesUnsortedLinkedList {

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
	
	public static Node<Integer> RemoveDuplicates(Node<Integer> head){
		Node<Integer> prev=null;
		Node<Integer> curr=head;
		HashMap<Integer, Node<Integer>> hm=new HashMap<>();
		while(curr!=null) {
			int currVal=curr.data;
			if(hm.containsKey(currVal)) {
				prev.next=curr.next;
			}
			else {
				hm.put(currVal, curr);
				prev=curr;
			}
			curr=curr.next;
		}
		return head;
	}
	public static void main(String[] args) {
		Node<Integer> head=takeInput();
		Node<Integer> head1=RemoveDuplicates(head);
		Print(head1);

	}

}
