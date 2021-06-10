package LinkedList;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicatesinSortedLinkedList {

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
		Node<Integer> curr=head;
		while(curr!=null) {
			Node<Integer> temp=curr;
			while(temp!=null && temp.data==curr.data) {
				temp=temp.next;
			}
			curr.next=temp;
			curr=curr.next;
		}
		return head;
	}
	
	public static void RemoveDuplicatesHashSet(Node<Integer> head) {
		Node<Integer> temp=head;
		HashSet<Integer> hs=new HashSet<>();
		
		while(temp!=null) {
			if(!hs.contains(temp.data)) {
				System.out.print(temp.data+" ");
				hs.add(temp.data);
			}
			temp=temp.next;
		}
	}
	
	public static void main(String[] args) {
		Node<Integer> head=takeInput();
		RemoveDuplicatesHashSet(head);
		//Print(res);

	}

}
