package dec19.ques03;

import java.util.Random;
import java.util.Scanner;

public class Ques03 {
	public static int[] createArray() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of array : ");
		int arrSize = sc.nextInt();

		int[] arr = new int[arrSize];
		Random random = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(100) + 1;
		}
		sc.close();
		return arr;
	}

	public static void main(String[] args) {
		arrDisplay(createArray());
	}

	public static void arrDisplay(int[] arr) {
		System.out.print("Array elements : ");
		for (int ele : arr) {
			System.out.print(ele + " ");
		}
		System.out.println();
	}

}
