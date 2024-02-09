package test;

public class Test {

	public static void main(String[] args) {

		int arr[] = { 12, 3, 11, 45, 23 };

		int[] sortMethod = sortMethod(arr);
		int num = secondheighest(sortMethod);
		System.out.println("Second Heighest Number:" + num);

	}

	public static int secondheighest(int[] arr) {
		int n = arr[arr.length - 5];

		return n;
	}

	public static int[] sortMethod(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {

					int temp = arr[i];

					arr[i] = arr[j];
					arr[j] = temp;

				}

			}
		}
		return arr;

	}

}
