package ds.arrays;

import java.util.Random;

public class MergeSort {

	public static void main(String[] args) {
		int[] nums = generateRandomArray(10) ;
		print(nums);
		sort(nums);
		print(nums);
	}

	private static void sort(int[] nums) {
		
		int len = nums.length;
		
		if (len < 2 ) {
			return;
		}
		
		int mid = len/2;
		
		int[] l = new int[mid];
		int[] r = new int[len-mid];
		
		for (int i = 0; i < mid; i++) {
			l[i] = nums[i];
		}
		
		for (int i = mid; i < len; i++) {
			r[i-mid] = nums[i];
		}
		
		sort(l);
		sort(r);
		
		merge(l, r, nums);
		
//		print(l);
//		print(r);
		
	}

	private static void merge(int[] l, int[] r, int[] nums) {

		int i = 0;
		int j = 0;
		int k = 0;
		
		int nL = l.length;
		int nR = r.length;
		
		while (i < nL && j < nR) {
			
			if(l[i] < r[j]) {
				
				nums[k] = l[i];
				k++; i++;
			} else {
				nums[k] = r[j];
				k++; j++;
			}
		}
		
		for (int m = i; m < nL; m++) {
			nums[k] = l[m];
			k++;
		}

		for (int m = j; m < nR; m++) {
			nums[k] = r[m];
			k++;
		}
		
	}

	private static int[] generateRandomArray(int len) {
		int[] a = new int[len];
		for (int j = 0; j < len; j++) {
			a[j] = new Random().nextInt(100);
		}
		return a;
	}

	
	private static void print(int[] nums) {
		for (int i : nums) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
