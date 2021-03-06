import java.util.*;
class Node100
{
	private int data;
	private Node100 next;
	public Node100 insert(Node100 head,int data1)
	{
		Node100 temp = new Node100();
		temp.data=data1;
		temp.next=null;
		if(head==null)
		{
			head=temp;
		}
		else
		{
			Node100 ptr=head;
			while(ptr.next!=null)
			{
				ptr=ptr.next;
			}
			ptr.next=temp;
		}
		return head;
	}
	public void display(Node100 head)
	{
		Node100 ptr=head;
		while(ptr.next!=null)
		{
			System.out.print(ptr.data+" ");
			ptr=ptr.next;
		}
		System.out.println(ptr.data);
	}
	public Node100 Reverse(Node100 head)
	{
		Node100 current =head;
		Node100 ptr;
		Node100 pre=null;
		while(current!=null)
		{
			ptr=current.next;
			current.next=pre;
			pre=current;
			current=ptr;
		}
		head=pre;
		return head;
	}
}
public class ReverseList {

	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int size=scan.nextInt();
    Node100 head=null;
    Node100 l1=new Node100();
    for(int i=0;i<size;i++)
    {
    	int num=scan.nextInt();
    	head=l1.insert(head, num);
    }
    l1.display(head);
    head=l1.Reverse(head);
    l1.display(head);
	}

}
