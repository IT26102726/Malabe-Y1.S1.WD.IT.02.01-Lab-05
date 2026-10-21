import java.util.Scanner;
public class IT26102726Lab5Q1{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		int smallest,largest;
		
			System.out.println("Enter the first integer:");
					int noOne=input.nextInt();
			System.out.println("Enter the second integer:");
			        int noTwo=input.nextInt();
			System.out.println("Enter the third integer:");
			        int noThree=input.nextInt();
			smallest=noOne;
			largest=noOne;
			if(noTwo>noOne){
				largest=noTwo;	
			}
			if(noTwo<noOne){
				smallest=noTwo;
				
			}
			if(noThree>noOne){
				largest=noThree;
			}
			
			if(noThree<noOne){
			    smallest=noThree;
			}
			System.out.println("User entered numbers are :"+noOne+noTwo+noThree);
			System.out.println("The Smallest number is :"+smallest);
			
			System.out.println("The Largest number is:"+largest);
	}       
}		