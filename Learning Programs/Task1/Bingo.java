import java.util.*;
class Bingo
{
	public static void main(String args[])
	{	
		
		Scanner s=new Scanner(System.in);
		
		List<Integer> list=new ArrayList<Integer>();
		System.out.println("Number of players");
		int n=s.nextInt();
		Integer[] arr1=new Integer[]{1,2,3};
		Integer[] arr2=new Integer[]{4,5,6};
		Integer[] arr3=new Integer[]{7,8,9};
		Player player1=new Player(arr1,arr2,arr3);
		player1.shuffleArr(arr1,arr2,arr3);
		
		Player player2=new Player(arr1,arr2,arr3);
		player2.shuffleArr(arr1,arr2,arr3);
		
		Player player3=new Player(arr1,arr2,arr3);
		player3.shuffleArr(arr1,arr2,arr3);
		
		
		int number;
		boolean isBingo=false;
		
		for(int i=0;i<10;i++)
		{
			if(isBingo)
			{
				System.out.println("Bingo");
			}
			else
			{
				number=s.nextInt();
				list.add(number);
				player1.checkBingo(list);
				player2.checkBingo(list);
				player3.checkBingo(list);
			}
		}
	}	
}
class Player
{
	Integer[] arr1,arr2,arr3;
	static List<Integer> row1,row2,row3,col1,col2,col3;
	Player(Integer[] arr1,Integer[] arr2,Integer[] arr3)
	{
		this.arr1=arr1;
		this.arr2=arr2;
		this.arr3=arr3;
	}
	public static void shuffleArr(Integer[] arr1,Integer[] arr2,Integer[] arr3)
	{
		row1=Arrays.asList(arr1);
		row2=Arrays.asList(arr2);
		row3=Arrays.asList(arr3);
		Collections.shuffle(row1);
		Collections.shuffle(row2);
		Collections.shuffle(row3);
		col1=new ArrayList();
		col2=new ArrayList();
		col3=new ArrayList();
		
		col1.add(row1.get(0));
		col1.add(row1.get(1));
		col1.add(row1.get(2));
		
		col2.add(row2.get(0));
		col2.add(row2.get(1));
		col2.add(row2.get(2));
		
		col3.add(row3.get(0));
		col3.add(row3.get(1));
		col3.add(row3.get(2));
	}
	public static boolean checkBingo(List list)
	{
		int bingocount=0;
		if(list.containsAll(row1))
			bingocount++;
		System.out.println("count"+bingocount);
		if(list.containsAll(row2))
			bingocount++;
		System.out.println("count"+bingocount);
		if(list.containsAll(row3))
			bingocount++;
		System.out.println("count"+bingocount);
		if(list.containsAll(col1))
			bingocount++;
		System.out.println("count"+bingocount);
		if(list.containsAll(col2))
			bingocount++;
		System.out.println("count"+bingocount);
		if(list.containsAll(col3))
			bingocount++;
		System.out.println("count"+bingocount);
		System.out.println();
		if(bingocount>=5)
		{
			return true;
		}
		return false;
	}

	
}