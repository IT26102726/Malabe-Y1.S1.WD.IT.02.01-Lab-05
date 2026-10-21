import java.util.Scanner;
public class IT26102726Lab5Q2{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter the number of new members:");
		int members=input.nextInt();
		
		if(members<0){
		    System.out.print("Input number must be greater than 0:");
		}else{
			switch(members){
				case 0:
			    System.out.print("No Prize");
				break;
                
                case 1:
                System.out.print("Pen");
				break;
                case 2:
                System.out.print("Umbrella");
				break;
                case 3:
                System.out.print("Bag");
				break;
                case 4:
				System.out.print("Travelling chair");
				break;
                default:
				System.out.print("Head phone");
                  				
			}
		}
	}
}
		
		
		