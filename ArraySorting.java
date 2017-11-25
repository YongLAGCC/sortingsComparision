
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Random;
public class ArraySorting 
{
	int elem, tem=0;
	int [] arrOfSort;
	Random rand; 
	
	public ArraySorting(int size)
		{
			elem=size; 
			arrOfSort= new int[elem];
			randomEle(); 
		}
	
	public void randomEle()
		{
			 rand = new Random();
			
			 rand.setSeed(elem);
			//System.out.print(elem);
			
		for (int k=0;k<elem; k++)
			{	
				int number= rand.nextInt(50)+1;
				arrOfSort[k]=number;
				//System.out.print(arrOfSort[k]);
			}
		}
	
	long startTime= System.currentTimeMillis();
	public void bubbleSort()
		{
		for(int i=0; i<arrOfSort.length; i++)
			{
			for(int j=1;j<arrOfSort.length-i;j++)
				{
				if(arrOfSort[j-1]<arrOfSort[j])
					{    
						tem=arrOfSort[j-1];
						arrOfSort[j-1]=arrOfSort[j];
						arrOfSort[j]=tem;
					}
				}
			}
		
		long endTime= System.currentTimeMillis();
		long totalTime=endTime-startTime; 
			System.out.println("\nRunning time  of bubbor sort: "+totalTime/1000.0);		
		
			String FileName="bubborSorting.txt";
			PrintWriter output=null;
			
		try
			{
			   output=new PrintWriter(new FileOutputStream(FileName,true));
			  
			} 
		catch (FileNotFoundException e1)
			{
			   System.out.print("Wrong");
			}
			output.println(elem+" "+totalTime/1000.0);
			output.close();
			
	}
	
	long staTime= System.currentTimeMillis();
	public void insertSort()
		{		
		for(int j=1;j<arrOfSort.length;j++){
			int temp = arrOfSort[j];
			int i;
			for(i=j-1; i>=0 && temp< arrOfSort[i];i--)
				arrOfSort[i+1]=arrOfSort[i];
				arrOfSort[i+1]=temp;
		}
			
		long eTime= System.currentTimeMillis();
		long toTime=eTime-staTime; 
			
			System.out.println("\nRunning time of insert sort: "+toTime/1000.0);
			
			String FileName="InsertSorting.txt";
			PrintWriter output=null;
		try
			{
			   output=new PrintWriter(new FileOutputStream(FileName,true));
			  
			} 
		catch (FileNotFoundException e1)
			{
			   System.out.print("Wrong");
			}
			output.println(elem+" "+toTime/1000.0);
			output.close();
			
	}
	
	public void selectionSort()
	{
		int min;
		long beginTime= System.currentTimeMillis();
		for(int i = 0;i<arrOfSort.length-1;i++)
		    {
		        //Assume first element is min
		        min = i;//Selection sort algorithm says that find the minimum in the
		                // array, but first element is not minimum.What's point here?
		        for(int j = i + 1;j<arrOfSort.length;j++)
		        {
		        	if(arrOfSort[j]<arrOfSort[min])
		        		min=j;
		        	
		        }
		            int temp = arrOfSort[i];
		            arrOfSort[i] = arrOfSort[min];
		            arrOfSort[min] = temp;
	
		    }
	
	long finitime= System.currentTimeMillis();
	long totTime=finitime-beginTime; 
		System.out.println("\nRunning time of selection sort: "+totTime/1000.0);
		
		
		String FileName="selectsortin.txt"; 
		PrintWriter output=null;

	try
		{
		   output=new PrintWriter(new FileOutputStream(FileName,true));
		  
		} 
	catch (FileNotFoundException e1) 
		{
		   System.out.print("Wrong");
		}
	
	output.println(elem+" "+totTime/1000.0);
	output.close();
				
	}

	
		
	

}// end class sorting
