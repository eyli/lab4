package Sorting;
public class BubbleSort {
	/**
	 * bubbleSort				sorts an array of integers using bubble sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] bubbleSort(int[] unsortedArray) {
		int j;
		 boolean flag = true;   // set flag to true to begin first pass
		 int temp;   //holding variable

	     while ( flag )
	     {
			flag= false;    //set flag to false awaiting a possible swap
			for( j=0;  j < unsortedArray.length -1;  j++ )
			{
			       if ( unsortedArray[ j ] < unsortedArray[j+1] )   // change to > for ascending sort
			   {
			           temp = unsortedArray[ j ];                //swap elements
			   unsortedArray[ j ] = unsortedArray[ j+1 ];
			   unsortedArray[ j+1 ] = temp;
			  flag = true;              //shows a swap occurred  
			              } 
			        } 
			  }
	     return unsortedArray;

	}
}
