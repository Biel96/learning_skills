package application_2;
import entities_2.Agenda;
import java.util.Scanner;
public class Program {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		Agenda blu;
		
		System.out.print("Enter the contact name: ");
		String name = read.nextLine();
	
		
		System.out.print("Enter the contact number: ");
		String number = read.nextLine();
	
		
		System.out.print("Enter the contact e-mail: ");
		String email = read.nextLine();
	
		
		blu = new Agenda(name, number, email);

		System.out.println();
		System.out.println("ADDED NEW CONTACT");
		System.out.println(blu);
		
		System.out.println();	
		System.out.print("Would you like to change something in the added contact (y/n)?");
		char answer = read.next().charAt(0);
		
		if(answer == 'y') {
			System.out.print("Name: ");
			name = read.next();
			
			System.out.print("Number: ");
			read.nextLine();
			number = read.next();
			
			System.out.print("Email: ");
			email = read.next();
			
			System.out.println();
			System.out.println("MODIFIED CONTACT");
			blu.setName(name);
			blu.setNumber(number);
			blu.setEmail(email);
			System.out.println(blu);
			System.out.println();
			System.out.println("Thank you, bye!");
		
		}else {
			System.out.println();
			System.out.println("Thank you, bye!");
		}
			
		

		read.close();
	}

}
