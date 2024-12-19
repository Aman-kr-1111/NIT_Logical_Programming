package dec19.ques10;

public class ReverseArr {

	public static void arrDisplay(int[] arr) {
		System.out.print("Array elements : ");
		for (int ele : arr) {
			System.out.print(ele + " ");
		}
		System.out.println();
	}

	public static void revArray(int[] arr) {
		System.out.print("Reverse array elements : ");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };
		arrDisplay(arr);
		revArray(arr);
	}
}
