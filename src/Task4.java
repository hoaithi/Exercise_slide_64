import java.util.Scanner;

public class Task4 {
	public static void readTwo(int firstDigit, int secondDigit) {
		String digits[] = {"","mot","hai","ba","bon","nam","sau","bay","tam","chin"};
		switch (firstDigit) {
		case 1:
			String readSecondDigit = digits[secondDigit];
			if(secondDigit == 5)
		    	readSecondDigit = "lamw";
			System.out.println("muoi " + readSecondDigit);
			break;
		case 2,3,4,5,6,7,8,9:
			readSecondDigit = digits[secondDigit];
		    if(secondDigit == 1)
		    	readSecondDigit = "moots";
		    if(secondDigit == 4)
		    	readSecondDigit = "tuw";
		    if(secondDigit == 5)
		    	readSecondDigit = "lamw";
			System.out.println(digits[firstDigit] + " muoi " + readSecondDigit);
			break;
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a 2-digit integer n: ");
		int n = Integer.parseInt(scan.nextLine());
		if(n < 10 || n > 99) {
			System.out.println("Please enter a valid value!");
		}else {
			int firstDigit = n / 10;
			int secondDigit = n % 10;
			readTwo(firstDigit, secondDigit);
 	}
}
}
