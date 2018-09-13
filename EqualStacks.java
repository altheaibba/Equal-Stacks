import java.util.*;

public class EqualStacks {
	
	public static void main (String [] args)
	{
		Scanner scan = new Scanner(System.in);
		
		//Inputs how many cylinders there are in stacks 1, 2 and 3
		int [] numC = new int [3];
		fillArray(numC);
		
		//Creates stacks 1, 2 and 3
		Stack stack1 = new Stack(numC[0]);
		Stack stack2 = new Stack(numC[1]);
		Stack stack3 = new Stack(numC[2]);
		
		//Inputting heights of cylinders in stack 1
		int [] s1 = new int [numC[0]];
		fillArray(s1);
		for(int i = s1.length-1; i>=0; i--) //First element is top of stack
		{
			stack1.push(s1[i]);
		}
		
		//Inputting heights of cylinders in stack 2
		int [] s2 = new int [numC[1]];
		fillArray(s2);
		for(int i = s2.length-1; i>=0; i--)
		{
			stack2.push(s2[i]);
		}
		
		//Inputting heights of cylinders in stack 3
		int [] s3 = new int [numC[2]];
		fillArray(s3);
		for(int i = s3.length-1; i>=0; i--)
		{
			stack3.push(s3[i]);
		}
		
		//Initial height of stacks
		int h1 = calcHeight(s1);
		int h2 = calcHeight(s2);
		int h3 = calcHeight(s3);
		
		isEqual(h1, h2, h3, stack1, stack2, stack3); //Find max height that stacks can be equal
		
	}
	
	public static void isEqual(int h1, int h2, int h3, Stack stack1, Stack stack2, Stack stack3)
	{
		while(h1!=h2 || h2!=h3) //While all stacks are not equal
		{
			if(h1>h2 || h1>h3) //If stack 1 is bigger than others
			{
				h1 = h1 - stack1.pop(); //Pop top element and update h1
			}
			if(h2>h1 || h2>h3)
			{
				h2 = h2 - stack2.pop();
			}
			if(h3>h1 || h3>h2)
			{
				h3 = h3 - stack3.pop();
			}
			
			if(h1==h2 && h2==h3) //If the stacks are all finally equal
			{
				System.out.println(h1); //Print out their height
				
				//To verify that they are all same height
				/* System.out.println(h2);
				System.out.println(h3); */
			}
		}
	}
	
	public static void fillArray(int [] array) //Reads in input as line of integers through array
	{
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i<array.length; i++)
		{
			array[i] = scan.nextInt();
		}
	}
	
	public static int calcHeight(int [] array) //Calculate initial height of stacks
	{	
		int height = 0;
		for(int i = 0; i<array.length; i++)
		{
			height = height + array[i];
		}
		return height;
	}

}
