package dec19.ques02;

import java.util.Scanner;

public class Ques02 {
	public static int[] createArray() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of array : ");
		int arrSize = sc.nextInt();

		int[] arr = new int[arrSize];
		System.out.println("Enter " + arrSize + " elements in array!!!");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
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
