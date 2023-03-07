package com.sls.interview;
// Step 1. create interface or abstract class for strategy 
interface SortStrategy{
	public int[] sort(int[] values); 
}
//2. Create concrete class implementing the strategy interface
class BubbleSort implements SortStrategy{
	public int[] sort(int[] values) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

class InsertionSort implements SortStrategy{
	public int[] sort(int[] values) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

//3. Create strategy context class

class SortContext{
	private SortStrategy sortStrategy;
	
	public void setSortStrategy(SortStrategy sortStrategy) {
		this.sortStrategy=sortStrategy; 
	}
	
	public int[] sortNumber(int[] numbers) {
		return sortStrategy.sort(numbers);
	}
}

public class StratedyDesignPatternDemo{
	public static void main(String[] args) {
		SortContext ss1=new SortContext();
		ss1.setSortStrategy(new BubbleSort());
		ss1.sortNumber(new int[] {3,6,2,7,9,3});
		
		SortContext ss2=new SortContext();
		ss2.setSortStrategy(new BubbleSort());
		ss2.sortNumber(new int[] {3,6,2,7,9,3});
	}
}