package LinkedList;

public class FirstElementOfLoop {

	
	public static Node<Integer> FirstElemOfLoop(Node<Integer> head){
		Node<Integer> slow=head;
		Node<Integer> fast=head;
		
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast) {
				break;
			}
		}
		
		if(slow==fast) {
			fast=head;
			while(slow.next!=fast.next) {
				slow=slow.next;
				fast=fast.next;
			}
			return fast.next;
		}
		else {
			return null;
		}
	}
	
	public static void main(String[] args) {
		Node<Integer> n1=new Node<>(10);
		Node<Integer> n2=new Node<>(20);
		Node<Integer> n3=new Node<>(30);
		Node<Integer> n4=new Node<>(40);
		Node<Integer> n5=new Node<>(50);
		Node<Integer> n6=new Node<>(60);
		Node<Integer> n7=new Node<>(70);
		Node<Integer> n8=new Node<>(80);
		Node<Integer> n9=new Node<>(90);
		Node<Integer> n10=new Node<>(100);
		n10.next=n5;
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n6;
		n6.next=n7;
		n7.next=n8;
		n8.next=n9;
		n9.next=n10;
		Node<Integer> fNode=FirstElemOfLoop(n1);
		System.out.println(fNode.data);

	}

}
