package ds.utils;

import java.util.Random;

public class ArrayUtils {
	
	public static void main(String[] args) {
		
	}
	
	public void print(int[] nums) {
		for (int i : nums) {
			System.out.println(i);
		}
	}
	
	public static int[] generateRandomArray(int len) {
		int[] a = new int[len];
		for (int j = 0; j < len; j++) {
			a[j] = new Random().nextInt(20);
		}
		return a;
	}
	
}
