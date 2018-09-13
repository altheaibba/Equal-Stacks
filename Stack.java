public class Stack 
{
	int maxSize;
	int top;
	int [] numArray;
	
	public Stack(int maxSize)
	{
		numArray = new int [maxSize];
		top = 0;
	}
	
	public void push(int num)
	{
		numArray[top] = num;
		top++;
	}
	
	public int pop()
	{
		int temp = numArray[top-1];
		numArray[top-1] = 0;
		top--;
		return temp;
	}
	
	public int peek()
	{
		return numArray[top-1];
	}
	
	public boolean isEmpty()
	{
		if(top==0)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
}
