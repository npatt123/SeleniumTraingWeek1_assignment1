package week1.Day2;

import java.util.*;

public class MissingElements {
	
	public static void main(String[] args) {
		
		
	  int [] arr = {1,2,3,4,7,6,8};
	  Arrays.sort(arr);
	  
	  for(int i=arr[0]; i<= arr.length; i++)
	  { 

		  if(i!=arr[i-1]) {
			  int missingElement = i;
			  System.out.println(missingElement);		
	  
			  break;			  
		  }
	
	  

		
		
		
		
		
	}
	}
}
	



