
public class stackint {
	private int[] stack;
	private int top;
	private int size;
	
	
	public stackint()
	{
		size=50;
		stack=new int[size];
		top=-1;
	}

	public stackint(int size)
	{
		this.size=size;
		stack=new int[this.size];
		top=-1;
	}
	
	public boolean push(int num)
	{	if(top!=stack.length-1) 
		{
		stack[++top]=num;
		return true;
		}
	else {return false;}
	}
	
	public int pop()
	{
		if(top!=-1)
		return(stack[top--]);
		
		else {return -1; }
		
	}
	
}
