/*
 * Write a function that takes a string as input and returns the string reversed.
 * Example:
 * Given s = "hello", return "olleh".
 * 
 */
public class ReverseString {
	
	public static void reverseString(String s) {
        char[] listString = s.toCharArray();
        int count = listString.length-1;
        for (int i = 0; i <= count; i++) {
        	char temp = listString[i];
        	listString[i] = listString[count];
        	listString[count] = temp;
        	count--;
        }
        
        System.out.println(new String(listString));
    }
	
	public static void main(String[] args) {
		reverseString("hello");
	}
}
