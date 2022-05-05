class Q2
{
	Node head;
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	void add(int d)
	{
	Node new_node=new Node(d);
	new_node.next=head;
	head=new_node;
	
	}
	
	void display()
	{
		Node n = head;
		Node M=head;
		int arr[]= new arr[10];
		int i=0;
		boolean flag = false;
		while(n!=null)
		{
			int arr[i]=n.data;
			i++;
			for(i=0;i<10;i++)
			{
				if(n.data==arr[i]
			}
			System.out.println(n.data);
			n=n.next;
		}
		
	
	}
	
	public static void main(String args[])
	{
		
	Q2 l1 = new Q2();
	l1.add(1);
	l1.add(5);
	l1.add(1);
	l1.add(2);
	l1.add(3);
	l1.add(4);
	l1.add(5);
	l1.display();
		
	}
}