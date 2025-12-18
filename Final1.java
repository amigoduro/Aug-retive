class one
{
	int a1,a2;
	void add(int x,int y) 
	{
		
		a1=x;					// variable conversion 
		a2=y;					//
		
	}
		
	int sum()
	{
		return(a1+a2);										
	}
}

class two extends one				
{
	int b1,b2;
	void concat(int n,int v)
	{
		b1=n;
		b2=v;
	}
	int  consin()
	{
		return(sum()+b1+b2);
	}
}
		
		

class Final1
{
	public static void main(String args[])
	{
		
		two c = new two();						//	
		//ramen c = new ramen();				// calling statement At first create a object and then call for function/method 
		c.add(12,12);		
		c.concat(12,12);
		
					// print statements 
		System.out.println("The initial class");
		System.out.println("The first input number is "+a1);
		System.out.println("The second input number is "+a2);
		System.out.println("Answer of  Ist Paremeters : "+c.sum());
		System.out.println("Answer of  IInd Parameters :"+c.consin());
		
	}
}
