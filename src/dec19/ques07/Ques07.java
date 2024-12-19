package dec19.ques07;

public class Ques07 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

		System.out.print("Even elements are: ");
		for (int ele : arr) {
			System.out.print(ele % 2 == 0 ? ele : " ");
		}
		System.out.print("\nOdd elements are: ");
		for (int ele : arr) {
			System.out.print(ele % 2 != 0 ? ele : " ");
		}
	}

}
