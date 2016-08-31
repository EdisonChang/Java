import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Given an integer (signed 32 bits), write a function to check whether it is a power of 4.
 * 
 * Example:
 * Given num = 16, return true. Given num = 5, return false.
 * 
 * Follow up: Could you solve it without loops/recursion?
 * 
 */

public class PowerOfFour {

	public static boolean isPowerOfFour(int num) {
		//High performance approach use bit operation.//
		if(num < 1) return false;
		int root = (int) Math.sqrt(num);
		System.out.println(num + " : " + Math.sqrt(num) + " " + (num-1) + " " + (num & (num-1)));
		return (num & (num-1)) == 0 && num - root * root == 0;
		
		//Returns the number of zero bits following the lowest-order ("rightmost") one-bit in the two's complement binary representation of the specified int value.//
		//return num > 0 && (num & (num-1)) == 0 && Integer.numberOfTrailingZeros(num) % 2 == 0;
		
		//Change to binary string and use regular expression in one line.// 
		//System.out.println(num + " : " + Integer.toBinaryString(num) + " " + Integer.toBinaryString(num).matches("1([0]{2})*"));
		//return Integer.toBinaryString(num).matches("1([0]{2})*");
		
		//Use regular expression.
		//if (num == 1) return true;
		//int remain = num % 4;
		//if (remain == 0) {
		//	Pattern pattern = Pattern.compile("[1]([0]{2})+");
		//	Matcher isCorrect = pattern.matcher(Integer.toBinaryString(num));
		//	System.out.println(num + " : " + Integer.toBinaryString(num) + " " + isCorrect.matches());
		//	return isCorrect.matches();
		//}
		//return false;
	}
	
	public static void main(String[] args) {
		isPowerOfFour(1);
		isPowerOfFour(4);
		isPowerOfFour(8);
		isPowerOfFour(12);
		isPowerOfFour(16);
		isPowerOfFour(20);
		isPowerOfFour(24);
		isPowerOfFour(28);
		isPowerOfFour(32);
		isPowerOfFour(36);
		isPowerOfFour(40);
		isPowerOfFour(44);
		isPowerOfFour(48);
		isPowerOfFour(52);
		isPowerOfFour(56);
		isPowerOfFour(60);
		isPowerOfFour(64);
		isPowerOfFour(68);
		isPowerOfFour(72);
		isPowerOfFour(76);
		isPowerOfFour(80);
		isPowerOfFour(84);
		isPowerOfFour(88);
		isPowerOfFour(92);
		isPowerOfFour(96);
		isPowerOfFour(256);
	}
}
