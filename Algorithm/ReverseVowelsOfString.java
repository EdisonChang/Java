/*
 * Write a function that takes a string as input and reverse only the vowels of a string.
 * 
 * Example 1:
 * Given s = "hello", return "holle".
 * 
 * Example 2:
 * Given s = "leetcode", return "leotcede".
 * 
 */
public class ReverseVowelsOfString {

	public static void reverseVowels(String s) {
		char[] listString = s.toCharArray();
		//count of records from back to first letter
		int count = 1;
		for (int i = 0; i < listString.length; i++) {
			//judge has vowel letter from first
			if (checkIsVowel(listString[i])) {
				System.out.println("vowels" + i + " : " + listString[i] + ", index : " + i);
				//if it has the vowel then judge has vowel letter from back
				for (int j = listString.length - count; j > i; j--) {
					count++;
					if (checkIsVowel(listString[j])) {
						System.out.println("vowels" + j + " : " + listString[j] + ", index : " + j);
						//if it has the vowel from back then exchange them
						char temp = listString[i];
						listString[i] = listString[j];
						listString[j] = temp;
						System.out.println("vowels" + i + " | vowels" + j + " exchange.");
						break;
					}
				}
			}
		}
		System.out.println(new String(listString));
	}
	
	private static boolean checkIsVowel(char s) {
		String[] vowels = new String[]{"a", "e", "i", "o", "u"};
		for (int j = 0; j < vowels.length; j++) {
			if (Character.toLowerCase(s) == vowels[j].charAt(0))
				return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		reverseVowels("a.");
		reverseVowels("ao");
		reverseVowels(".ao");
		reverseVowels("hello");
		reverseVowels("leetcode");
		reverseVowels("Academy");
		reverseVowels("Panama!\"");
	}
}
