package unit05;

public class ArrayHelperTester
{

	public static void main(String[] args)
	{
		//Test Data for ArrayHelper
		
		int [] nbrs = {1,4,6,9,11,15,23,28,31};
		int [] nbrs1 = {31,28,23,15,11,9,6,4,1};
		String [] names = {"Timmy","Sally","Johnny","Susie","Jenny","Benjamin","Billy"};
		double [] nbr = {4.50,6.90,8.20,12.30,16.50};
		
		System.out.println(ArrayHelper.firstIndexOf(nbrs, 9));
		System.out.println(ArrayHelper.lastIndexOf(nbrs, 31));
		System.out.println(ArrayHelper.isSorted(nbr));
		System.out.println(ArrayHelper.isReverse(nbrs,nbrs1));
		System.out.println(ArrayHelper.whoIsBuying(names));
		System.out.println(ArrayHelper.longestString(names));
		
		
	}
	
}
