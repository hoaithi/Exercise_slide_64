import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("mày là ai trong nhà này: ");
		String reply = scan.nextLine();
		switch (reply) {
		case "B":
			System.out.println("Morning Dad");
			break;
		case "H":
			System.out.println("Morning Mom");
			break;
		case "A":
			System.out.println("Morning brother");
			break;
		case "E":
			System.out.println("Morning sister");
			break;
		default:
			System.out.println("Please enter a valid value!");
			break;
		}
	}
}
