package ds.arrays;

public class FindProfitOfShare {
	
	public static void main(String[] args) {
		int[] nums = {7,6,5,4,3,2,1 } ;
		int profit = findProfit(nums);
		
		System.out.println(profit);
	}

	private static int findProfit(int[] nums) {
		
		int lowest = Integer.MAX_VALUE;
		int profit = 0;
		
		for (int i = 0; i < nums.length; i++) {
			
			if (nums[i] < lowest) {
				lowest = nums[i];
			}
			
			if ((nums[i] - lowest) > profit) {
				profit = nums[i] - lowest;
			}
			
		}
		
		return profit;
	}

}
