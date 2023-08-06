package SatTask.Project;
import java.util.Scanner;
public class User {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		AtmImp aim=new AtmImp();
		System.out.println("Welcome to Stark Banking System");
		boolean b=true;
		char c='y';
		while(b||c=='y'||c=='Y') {
			System.out.println("Enter atm pin for validation :");
			int pin=s.nextInt();
			if(pin==AtmImp.account.getPin()) {
				System.out.println("1. for deposit amount \n2. for withdrawl amount \n3. for check balance \n4. for transaction details \n5. for Account details ");
				System.out.println("Enter the choice :");
				int choice=s.nextInt();
				switch(choice) {
				case 1:{
					System.out.println("Enter deposit amount :");
					aim.deposit(s.nextDouble());
				}
				break;
				case 2:{
					System.out.println("Enter withdrawl amount :");
					aim.withdrawl(s.nextDouble());
				}
				break;
				case 3:aim.checkBalance();
				break;
				case 4:aim.TranDetails();
				break;
				case 5:aim.accDetails();
				break;
				default :System.out.println("Invalid choice try again ");
				}
				b=false;
				System.out.println("Do you want to continue any operation?");
				System.out.println("If yes enter y or enter no");
				c=s.next().charAt(0);
			}
			else
				throw new InvalidPin();
		}
		System.out.println("Thank you for using Stark Banking system");
	}

}
