package assignment6_3;                      //package declaration 

import java.util.*;                              //importing scanner

public class BinarySearch {                       //class definition 

	public static void main(String[] args) {              //main starts here 
		
		int i,first,last,middle;                    //variable declaration 
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the length of array:-");       
		
		int n=sc.nextInt();               //taking length of array 
		
		int[] arr= new int[n];             //array declaration 
		
		System.out.println("Enter the array elements");
		
		for(i=0;i<n;i++)                  //taking array elements from user 
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the number you want to search");
		int search=sc.nextInt();                                    //taking search element to be searched
		
		first=0;                                                   //initializing variables 
		last=n-1;
		middle=(first+last)/2;
		
		while(first<=last)                                    //binary search logic starts here
		{
			if(arr[middle]<search)
			first=middle+1; 
			else if(arr[middle]==search)
				{
				System.out.println("The element " +search+ " found at "+middle+ " position." );
			     break;
				}
			else 
				last=middle-1;
			middle=(first+last)/2;
			
			
			
		}
		if(first>last)                        //if all above condition fails this is executed
			System.out.println("Element " +search+ " is not present in array");
		

	}

}//class ends
