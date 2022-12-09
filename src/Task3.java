import java.util.Scanner;

public class Task3 {
	public static void dislay(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
	public static void sortAscending(int a[]) {
		int head = 1;
		int box;
		for (int i = 0; i < a.length-1; i++) {
			for (int j = head; j < a.length; j++) {
				if(a[j] < a[i]) {
					box = a[i];
					a[i] = a[j];
					a[j] = box;
				}
			}
			head++;
		}
		dislay(a);
	}
	public static void sortDescending(int a[]) {
		int head = 1;
		int box;
		for (int i = 0; i < a.length-1; i++) {
			for (int j = head; j < a.length; j++) {
				if(a[j] > a[i]) {
					box = a[i];
					a[i] = a[j];
					a[j] = box;
				}
			}
			head++;
		}
		dislay(a);
	}
	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		int a[] = new int[3];
		System.out.println("Enter number a: ");
		a[0] = Integer.parseInt(scan.nextLine());
		System.out.println("Enter number b: ");
		a[1] = Integer.parseInt(scan.nextLine());
		System.out.println("Enter number c: ");
		a[2] = Integer.parseInt(scan.nextLine());
		System.out.println("1. Sort ascending: ");
		System.out.println("2. Sort descending: ");
		System.out.println("Enter your selection: ");
		int select = Integer.parseInt(scan.nextLine());
		if(select == 1) {
			sortAscending(a);
		}else if(select == 2) {
			sortDescending(a);
		}else {
			System.out.println("Please enter a valid value!");
		}
	}
}
