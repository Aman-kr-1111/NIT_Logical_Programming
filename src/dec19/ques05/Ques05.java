package dec19.ques05;

import java.util.Iterator;
import java.util.Scanner;

public class Ques05 {
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

	public static void midElement(int[] arr) {
		int len = arr.length;
		int halfLen = len / 2;
		System.out.println(len % 2 == 0 ? arr[halfLen - 1] + " " + arr[halfLen] : arr[halfLen]);
	}

	public static void main(String[] args) {
		midElement(createArray());
	}

}
