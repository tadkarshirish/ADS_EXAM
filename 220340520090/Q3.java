class Q3 
{
	
	int arr[];
	int size;
	int top1,top2;
	Q3(int data)
	{
	size = data;
	top1=data/2+1;
	top2=data/2;
	arr=new int[data];
	}
	
	void push1(int data)
	{
	if(top1>0)
		{
		top1--;
		arr[top1]=data;
		}
	else
		{
		System.out.println("Stack is full");
		}
	}
	
	void push2(int data)
	{
		if(top2<size-1){
		top2++;
		arr[top2]=data;
		}
		
		else
		{
		System.out.println("Stack is full");
		}
		
	}
	
	void pop1()
	{
		if(top1<=size/2)
		{
			int value = arr[top1];
			top1++;
			System.out.println("Popped element from stack 1 is "+value);
		}
		
		else
		{
			System.out.println("Stack is empty");
		}
	}
	
	void pop2()
	{
		if(top2>=size/2+1)
		{
			int value = arr[top2];
			top2--;
		System.out.println("Popped element from stack 2 is "+value);
		}
		
		else
		{
			System.out.println("Stack is empty");
		}
	}
	
public static void main (String args[])
{
	Q3 c = new Q3(10);
	
	c.push1(5);
	c.push2(10);
	c.push1(11);
	c.push2(7);
	c.push2(40);
	c.pop1();
	c.pop2();
	
	}
}