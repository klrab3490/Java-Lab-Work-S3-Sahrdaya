import java.util.Scanner;
class DoublyLinkedList
{
	class node
	{
		int item;
		node previous;
		node next;
	node(int item)
	{
		this.item=item;
	}
	}
	node head,tail=null;
	public void addNode(int item)
	{
		node newNode=new node(item);
		if(head==null)
		{
			head=tail=newNode;
			head.previous=null;
			tail.next=null;
		}
		else
		{
			tail.next=newNode;
			newNode.previous=tail;
			tail=newNode;
			tail.next=null;
		}
	}
	public void deleteNode(int data)
	{
		node temp=head;
		node prev=null;
		if(head==null)
		{
			System.out.println("list is empty");
		}
		else
		{
			while(temp.item!=data)
			{
				prev=temp;
				temp=temp.next;
			}
			prev.next=temp.next;
		}
	}
	public void Display()
	{
		node Current=head;
		if(head==null)
		{
			System.out.println("list is empty");
		}
		else
		{
			System.out.println("Elements of list are");
			while(Current!=null)
			{
				System.out.println(Current.item+"");
				Current=Current.next;
			}
		}
	}
}
public class DLL
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		DoublyLinkedList dL=new DoublyLinkedList();
		dL.addNode(10);
		dL.addNode(20);
		dL.addNode(30);
		dL.addNode(40);
		dL.addNode(50);
		dL.Display();
		System.out.print("Element To Delete : ");
		int data = sc.nextInt();
		dL.deleteNode(data);
		dL.Display();
	}
}