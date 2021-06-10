package LinkedList;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class LinkedListUse {

	public static void Print(Node<Integer> head) {
		Node<Integer> temp=head;
		HashSet<Node<Integer>> hs=new HashSet<>();
		hs.contains(hs);
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	
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
//				Node<Integer> tail=head;
//				while(tail.next!=null) {
//					tail=tail.next;
//				}
//				tail.next=currNode;
				
				tail.next=currNode;
				tail=currNode;
			}
			data=s.nextInt();
		}
		return head;
	}
	
	public static Node<Integer> Insert(int pos, int elem, Node<Integer> head) {
		Node<Integer> currNode=new Node<>(elem);
		Node<Integer> prev=head;
		int count=0;
		if(pos==0) {
			currNode.next=head;
			head=currNode;
			return head;
		}
		else {
			while(count<pos-1) {
				count++;
				prev=prev.next;
			}
			currNode.next=prev.next;
			prev.next=currNode;
		}
		return head;
	}
	
	public static void delete(int pos, Node<Integer> head) {
		Node<Integer> prev=head;
		int count=0;
		if(pos==0) {
			head=head.next;
		}
		else {
			while(count<pos-1) {
				count++;
				prev=prev.next;
			}
			if(prev.next!=null) {
				prev.next=prev.next.next;
			}
		}
	}
	
	public static void update(int pos, int elem, Node<Integer> head) {
		Node<Integer> curr=head;
		int count=0;
		if(pos==0) {
			head.data=elem;
		}
		else {
			while(count!=pos) {
				count++;
				curr=curr.next;		
			}
			curr.data=elem;
		}
	}
	
	public static void PrintRecursively(Node<Integer> head) {
		if(head==null) {
			return;
		}
		System.out.print(head.data+" ");
		PrintRecursively(head.next);
	}
	
	public static void PrintRecursivelyRev(Node<Integer> head) {
		if(head==null) {
			return;
		}
		
		PrintRecursivelyRev(head.next);
		System.out.print(head.data+" ");
	}
	
	public static Node<Integer> InsertRecursively(int pos, int elem, Node<Integer> head){
		if(head==null && pos>0) {
			return head;
		}
		
		if(pos==0) {
			Node<Integer> currNode=new Node<>(elem);
			currNode.next=head;
			head=currNode;
			return head;
		}
		
		Node<Integer> smallHead=InsertRecursively(pos-1, elem, head.next);
		head.next=smallHead;
		return head;
	}
	
	public static Node<Integer> Reverse(Node<Integer> head){
		if(head==null|| head.next==null) {
			return head;
		}
		
		Node<Integer> smallAns=Reverse(head.next);
		Node<Integer> temp=smallAns;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=head;
		head.next=null;
		return smallAns;
	}
	
	public static Node<Integer> Merge(Node<Integer> head1, Node<Integer> head2){
		Node<Integer> head3=null;
		Node<Integer> tail=null;
		
		while(head1!=null && head2!=null) {
			if(head1.data>head2.data) {
				if(head3==null) {
					head3=head2;
					tail=head2;
					head2=head2.next;
				}
				else {
					tail.next=head2;
					tail=head2;
					head2=head2.next;
					
				}
			}
			else {
				if(head3==null) {
					head3=head1;
					tail=head1;
					head1=head1.next;
				}
				else {
					tail.next=head1;
					tail=head1;
					head1=head1.next;
				}
			}
		}
		
		while(head1!=null) {
			tail.next=head1;
			tail=head1;
			head1=head1.next;
			
		}
		
		while(head2!=null) {
			tail.next=head2;
			tail=head2;
			head2=head2.next;
		}
		return head3;
	}
	
	public static Node<Integer> findMid(Node<Integer> head){
		Node<Integer> slowp=head;
		Node<Integer> fastp=head;
		
		while(fastp.next!=null && fastp.next.next!=null) {
			slowp=slowp.next;
			fastp=fastp.next.next;
		}
		return slowp;
	}
	
	public static Node<Integer> MergeSort(Node<Integer> head){
		if(head.next==null) {
			return head;
		}
		
		Node<Integer> mid=findMid(head);
		
		Node<Integer> p1head=head;
		Node<Integer> p2head=mid.next;
		mid.next=null;
		
		Node<Integer> head1=MergeSort(p1head);
		Node<Integer> head2=MergeSort(p2head);
		
		Node<Integer> head3= Merge(head1, head2);
		
		return head3;
	}
	
	public static boolean DetectLoop(Node<Integer> head) {
		HashSet<Node<Integer>> hs= new HashSet<>();
		while(head!=null) {
			if(hs.contains(head)) {
				return true;
			}
			else {
				hs.add(head);
			}
			head=head.next;
		}
		return false;
	}
	
	
	public static void main(String[] args) {
//		Node<Integer> n1=new Node<>(10);
//		Node<Integer> n2=new Node<>(20);
//		Node<Integer> n3=new Node<>(30);
//		Node<Integer> n4=new Node<>(40);
//		n1.next=n2;
//		n2.next=n3;
//		n3.next=n4;
		Node<Integer> head1=takeInput();
		//Node<Integer> head2=takeInput();
		//Node<Integer> head1=InsertRecursively(3,50,head);
		Node<Integer> head2=MergeSort(head1);
		//System.out.println(head3.data);
		PrintRecursively(head2);
		//update(1,60,head1);
		//Print(head1);
	}

}
