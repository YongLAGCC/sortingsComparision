
import java.util.Scanner;
import java.util.Random; 
public class SortComparision_Main {
	
public static void main(String[] args) 
	{

	for (int i=20000; i< 200000; i+=20000)
	{
		
		ArraySorting sor= null;
		sor= new ArraySorting(i);
		//sor.bubbleSort();
		//sor.selectionSort();
		sor.insertSort();
		
		}

	}
}