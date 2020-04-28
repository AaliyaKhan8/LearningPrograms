import java.util.*;
class Sharing
{
	HashMap hmap;
	Sharing(HashMap<String,int> hmap)
	{
		this.hmap=hmap;
	}
	public static void main(String[] args)
	{
		hmap=new HashMap<>();
		Sharing sharing = new Sharing(hmap);
		Scanner s=new Scanner(System.in);
		int numberOfLines=s.nextInt();
		String term;
		s.nextLine();
		for(int i=0;i<numberOfLines;i++)
		{
			term=s.nextLine();
			sharing.calculate(term);
		}
		sharing.display();
	}
	public void calculate(String term)
	{
		int money;
		String[] arr=term.split(" ");
		money=Integer.parseInt(arr[0])/(arr.length-1);
		if(!(hmap.containsKey(arr[1])))
		{
			hmap.put(arr[1],money*(arr.length-2));
		}
		else
		{
			int value=hmap.get(arr[1]);
			value=value+(money*(arr.length-2));
			hmap.replace(arr[1],value);
		}
		if(arr.length>2)
		{
			for(int i=2;i<arr.length;i++)
			{
				if(!(hmap.containsKey(arr[i])))
				{
					int value=0;
					hmap.put(arr[i],value-money);
				}
				else
				{
					int value=hmap.get(arr[i]);
					value=value-money;
					hmap.replace(arr[i],value);
				}
			}
		}
	}
	public void display()
	{
		hmap.forEach((k, v) -> {
			if(v>0)
				System.out.println(k+" gets "+Math.abs(v));
			else
				System.out.println(k+" gives "+Math.abs(v));
		});
		
	}
}
