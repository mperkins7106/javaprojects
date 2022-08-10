package unit05;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class ArrayHelper
{

	public static int firstIndexOf(int[]ints, int findMe)		//COMPLETED
	{
		if(ints == null) return -1;
		int indexFoundAt = -1;
		for (int i = 0; i<ints.length; i++)
		{
			if(findMe == ints[i])
				{
				return i;
				}
		}
		return indexFoundAt;
	
	}
	public static int lastIndexOf(int[]ints, int findMe)		//COMPLETED
	{
		if (ints == null) return -1;
		int indexFoundAt = -1;
		for (int i = ints.length-1; i>=0; i--)
		{
			if(findMe == ints[i])
				{
				return i;
				}
		}
		return indexFoundAt;
		}
	public static boolean isSorted(double[]array)			
	
	{
		if(array == null)
				{
				return false;
				}
		if(array.length == 1)
				{
				return true;	
				}
		for(int i = 0; i < array.length-1; i++)
		{
			for (int q = i+1; q < array.length; q++)
			{
				if(array [q] < array[i])									
				{
					return false;
				}
			}
		}
		return true;			
	}

	public static boolean isReverse(int[]int1, int[]int2)     
	
	{
		if (int1 == null || int2 == null)
		{
			return false;
		}
		if(int1.length != int2.length)
		{
			return false;
		}
		for(int i = 0; i < int1.length; i++)					//NEEDS WORK WITH VARIABLE NAME
		{
			if (int1[i] != int2[int2.length-1 -i])
			{
				return false;
			}
		}
		return true;
			
	}
	public static String whoIsBuying(String[]names)		        //COMPLETED
	
	{
		if(names == null)
		{
			return null;
		}
		Random rand = new Random();
		return names [rand.nextInt(names.length)];
		
	}
	
	public static String longestString(String[]names)			//NEEDS WORK RETURNING INDEX FOUND AT
	
	{
		if(names == null)
		{
			return null;
		}
		int index = 0;
		String longest = "";
		for(int i = 0; i < names.length; i++)
		{
			if(names[i].length()> longest.length())
			longest = names[i];
		}
		return longest;
	}

}
