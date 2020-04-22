import java.util.*;
class Sharing
{
	static int A=0,B=0,C=0;
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int numberOfLines=s.nextInt();
		String value;
		s.nextLine();
		for(int i=0;i<numberOfLines;i++)
		{
			value=s.nextLine();
			calculate(value);
		}
		display();
	}
	public static void calculate(String value)
	{
		int money;
		String[] arr=value.split(" ");
		if(arr.length==3)
		{
			money=Integer.parseInt(arr[0])/2;
			if(arr[1].equals("A"))
				A+=money;
			else if(arr[1].equals("B"))
				B+=money;
			else if(arr[1].equals("C"))
				C+=money;
			if(arr[2].equals("A"))
				A-=money;
			else if(arr[2].equals("B"))
				B-=money;
			else if(arr[2].equals("C"))
				C-=money;
		}
		if(arr.length==4)
		{
			
			money=Integer.parseInt(arr[0])/3;
			if(arr[1].equals("A"))
				A+=money+money;
			else if(arr[1].equals("B"))
				B+=money+money;
			else if(arr[1].equals("C"))
				C+=money+money;
			if(arr[2].equals("A"))
				A-=money;
			else if(arr[2].equals("B"))
				B-=money;
			else if(arr[2].equals("C"))
				C-=money;
			if(arr[3].equals("A"))
				A-=money;
			else if(arr[3].equals("B"))
				B-=money;
			else if(arr[3].equals("C"))
				C-=money;
		}
		
	}
	public static void display()
	{
		if(A>0)
			System.out.println("A gets "+A);
		else
			System.out.println("A gives "+Math.abs(A));
		
		if(B>0)
			System.out.println("B gets "+B);
		else
			System.out.println("B gives "+Math.abs(B));
		
		if(C>0)
			System.out.println("C gets "+C);
		else
			System.out.println("C gives "+Math.abs(C));
		
	}
}