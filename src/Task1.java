import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		System.out.println("Enter number a: ");
		int a = Integer.parseInt(scan.nextLine());
		System.out.println("Enter number b: ");
		int b = Integer.parseInt(scan.nextLine());
		if(a>b) {
			System.out.println("Max = " + a);
		}else if(a<b) {
			System.out.println("Max = " + b);
		}else {
			System.out.println("a = b");
		}
	}
}
