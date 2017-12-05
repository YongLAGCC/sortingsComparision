package quickSort;
import java.*;
import java.util.Random;
import java.util.Scanner;
 
/** Class QuickSort **/
public class QuickSort 
{
    public static void sort(int[] arr)
    {
        quickSort(arr, 0, arr.length - 1);
    }
    
    public static void quickSort(int arr[], int low, int high) 
    {
        int i = low, j = high;
        int temp;
        int pivot = arr[(low + high) / 2];
 
        /** partition **/
        while (i <= j) 
        {
            while (arr[i] < pivot)
                i++;
            while (arr[j] > pivot)
                j--;
            if (i <= j) 
            {
             
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
 
                i++;
                j--;
            }
        }
        /** recursively sort lower half **/
        if (low < j)
            quickSort(arr, low, j);
        /** recursively sort upper half **/
        if (i < high)
            quickSort(arr, i, high);
    }
   
    public static void main(String[] args) 
    {
    	
	 Random rand = new Random();
	 int arr[];
	 
		for (int k=1; k< 9;k++)
		{

		   arr=new int[k*10000];
		   rand = new Random();
		   rand.setSeed(k);
		   
		 for (int j=0;j<k; j++)
		{	
			int number= rand.nextInt(k)+1;
			arr[j]=number;
			
		}
		   long startedTime= System.currentTimeMillis();
		   sort(arr);
			long endedTime= System.currentTimeMillis();
			long QuickTime = endedTime - startedTime; 
			System.out.println("Time is: "+QuickTime/1000.0);
    			}
  
        System.out.print("\nElements after sorting ");        
           
    }     
    
    
    
    
}
