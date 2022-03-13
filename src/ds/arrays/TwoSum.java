package ds.arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 , 4} ;
		int target = 3;
		
		int[] found2Sum = find2Sum(a, target);
		printArray(found2Sum);
	}

	private static void printArray(int[] found2Sum) {

			if (found2Sum.length == 0) {
				System.out.println("No pair");
			}
			
			for (int i = 0; i < found2Sum.length; i++) {
				System.out.print(found2Sum[i] + " ");
			}
		
	}

	private static int[] find2Sum(int[] nums, int target) {
		
		Map<Integer, Integer> map = new HashMap<>();
		int[] empty = {};
		for (int i = 0; i < nums.length; i++) {
			
			int delta = target - nums[i];
			
			if (map.containsKey(delta)) {
				Integer j = map.get(delta);
				
				int[] result =  { i, j};
				return result;
			}
			
			map.put(nums[i], i);
		}
		
		return empty;
	}
}
