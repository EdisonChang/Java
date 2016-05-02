/*
 * Given a positive integer n, break it into the sum of at least two positive integers and maximize the product of those integers. Return the maximum product you can get.
 * 
 * For example, given n = 2, return 1 (2 = 1 + 1); given n = 10, return 36 (10 = 3 + 3 + 4).
 * 
 * Note: you may assume that n is not less than 2.
 * 
 * Hint:
 * 
 * 1. There is a simple O(n) solution to this problem.
 * 2. You may check the breaking results of n ranging from 7 to 10 to discover the regularities.
 * 
 */
public class IntegerBreak {
	
	private static void integerBreak(int n) {
		if (n == 2) {
			System.out.println(1);
		} else if (n == 3) {
			System.out.println(2);
		} else {
			int mod = n%3;
			int max = 0;
			if (mod == 0) {
				max = (int) (Math.pow(3, n/3));
			} else if (mod == 1) {
				max = (int) (Math.pow(3, (n/3)-1) * Math.pow(2, mod+1));
			} else if (mod == 2) {
				max = (int) (Math.pow(3, n/3) * Math.pow(2, mod-1));
			}
			System.out.println(max);
		}
	}
	
	public static void main(String[] args) {
		integerBreak(2);
		integerBreak(3);
		integerBreak(4);
		integerBreak(5);
		integerBreak(6);
		integerBreak(7);
		integerBreak(8);
		integerBreak(9);
		integerBreak(10);
		integerBreak(11);
	}
}
