package week1.Day2;

public class PrimeNumber {
	public static void main(String[] args) {
		
		int input= 13;
		int a;
	    int count=0;
		
		
		
		for(int i= 1; i<= input;  i++) {
			
			
			a = input%i;
		
			if (a==0) {
				
				count++;
				//System.out.println(count);
				
			} 
			}

			if(count == 2) {				
				
				
				System.out.println(input + " " +"The given number is  a prime number");
				
					}
			else {
				System.out.println(input + " " +"The given number is not a prime number");
				
				
			}
				
		}
	}
		


