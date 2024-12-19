package dec19.ques09;

public class Ques09 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };

		int sumArr = 0, countArr = 0;
		for (int ele : arr) {
			sumArr += ele;
			countArr++;
		}

		float avgArr = sumArr / (float) countArr;
		System.out.printf("Average of array: %.2f", avgArr);
	}

}
