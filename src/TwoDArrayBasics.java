import java.util.Random;

public class TwoDArrayBasics {

	public static void main(String[] args) {
		// Create a 3 x 5 array of ints
		int [][] nums = new int [3][5];
		int [] totalsArray = new int[3];
		// Fill the array with random numbers using fillRandom
		fillRandom(nums, 1, 100);
		
		// test each method you create below.
		print(nums);
		System.out.println(sum(nums, 2));
		System.out.println(sumArray(nums));
		totalsArray = sumArray(nums);
		System.out.println(uniqueTotals(totalsArray));
		System.out.println(targetArray(totalsArray, 4));
		System.out.println(minArray(nums));
		System.out.println(maxArray(nums));

	}
	/*
	 * given the lower and upper bounds of the random numbers
	 * fill an array of random numbers 
	 */
	public static void fillRandom(int[][] nums, int low, int high) {
		Random random = new Random();
		for (int row = 0; row < nums.length; row++) {
			for (int col = 0; col < nums[0].length; col++) {
				nums[row][col] = random.nextInt(high) + low;
			}
		}
	}
	/*
	 * create a method that prints a 2D array
	 */
	public static void print(int[][] nums) {
		for (int row = 0; row < nums.length; row++) {
			System.out.print("{\t");
			for (int col = 0; col < nums[0].length; col++) {
				System.out.print(nums[row][col] + "\t");
			}
			System.out.println("}");
		}
	}
	
	/*
	 * return the sum of a row (r) in a 2D array (nums)
	 */
	public static int sum(int[][] nums, int row) {
		int total = 0;
		for (int col = 0; col < nums[row].length; col++) {
			total += nums[row][col];
		}
		
		return total;
	}

	
	/*
	 * return an array of row sums of a 2D array (nums)
	 */
	public static int[] sumArray(int[][] nums) {
		int[] totalsArray = new int[nums.length];
		int total = 0;
		for (int row = 0; row < nums.length; row++) {
			total = 0;
			for (int col = 0; col < nums[0].length; col++) {
				total += nums[row][col];
			}
			totalsArray[row] = total;
		}
		return totalsArray;
	}

	
	
	/*
	 * check an 1D array for repeats, return true if all 
	 * elements of the array are unique
	 */
	public static boolean uniqueTotals(int[] nums) {
		boolean flag = false;
		int count = 0;
		for (int num: nums) {
			
			if (count != 1) {
				flag = true;
			}
			count = 0;
		}
		return flag;
	}

	
	
	/*
	 * given an array
	 * return the index of the target value, 
	 * return -1 if it is not found
	 */
	public static int targetArray(int [] nums, int val) {
		for (int i = 0; i < nums.length; i++) {
			int num = nums[i];
			if (num == val) {
				return i;
			}
		}
		return -1;
	}

	
	
	/*
	 * return the min value in a 2D array
	 */
	public static int minArray(int[][] nums) {
		int min = nums[0][0];
		for (int row = 0; row < nums.length; row++) {
			for (int col = 0; col < nums[0].length; col++) {
				min = Math.min(min, nums[row][col]);
			}
		}
		return min;
	}

	
	
	
	/*
	 * return the max value in a 2D array
	 */
	public static int maxArray(int[][] nums) {
		int max = nums[0][0];
		for (int row = 0; row < nums.length; row++) {
			for (int col = 0; col < nums[0].length; col++) {
				max = Math.max(max, nums[row][col]);
			}
		}
		return max;
	}

	
	
	
}
