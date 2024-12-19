package dec19.ques01;

public class Ques01 {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		arrDisplay(arr);
	}

	public static void arrDisplay(int[] arr) {
		System.out.print("Array elements : ");
		for (int ele : arr) {
			System.out.print(ele + " ");
		}
		System.out.println();
	}
}
