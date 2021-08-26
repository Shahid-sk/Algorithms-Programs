import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static boolean checkAnagram(String str1, String str2) {
		// Get the length of both strings
		int len1 = str1.length();
		int len2 = str2.length();

		// If length of both strings is not same then they cannot be anagram
		if (len1 != len2)
			return false;

		char[] ch1 = new char[str1.length()];
		char[] ch2 = new char[str2.length()];
		// Sort both strings
		Arrays.sort(ch1);
		Arrays.sort(ch2);

		// Compare sorted strings
		for (int i = 0; i < len1; i++)
			if (ch1[i] != ch2[i])
				return false;

		return true;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// User input for strings.
		System.out.println("Enter 2 strings: ");
		String str1 = sc.next();
		String str2 = sc.next();

		if (checkAnagram(str1, str2))
			System.out.println("The two strings are anagram of each other");
		else
			System.out.println("The two strings are not anagram of each other");

		sc.close();

	}
}