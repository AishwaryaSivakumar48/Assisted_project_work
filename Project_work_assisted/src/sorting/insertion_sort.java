package sorting;

import java.util.Arrays;

public class insertion_sort {

	void insertionSort(int array[]) {
		int size = array.length;

		for (int step = 1; step < size; step++) {
			int key = array[step];
			int j = step - 1;

			while (j >= 0 && key < array[j]) {
				array[j + 1] = array[j];
				--j;
			}

			array[j + 1] = key;
		}
	}

	public static void main(String args[]) {
		int[] data = { 9, 5, 1, 4, 3 };
		System.out.println("Unsorted Array");
		System.out.println(Arrays.toString(data));
		insertion_sort is = new insertion_sort();
		is.insertionSort(data);
		System.out.println("Sorted Array in Ascending Order: ");
		System.out.println(Arrays.toString(data));
	}
}
