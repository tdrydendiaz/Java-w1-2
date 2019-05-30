
public class Questions {

	public static void main(String[] args) {

		System.out.println(checkword("Hello New World"));
		System.out.println(notString("Lemons"));
		System.out.println(stringE("Whats up"));
		System.out.println(stringTimes("Hi", 3));

	}

	// A method that takes a word. When the word is of an even length, display the
	// first part. When the word is an odd length, display the middle letter.

	public static String checkword(String word) {
		if (word.length() % 2 == 0) {
			return (word.substring(0, word.length() / 2));
		} else
			return (word.substring(word.length() / 2, word.length() / 2 + 1));
	}

	// Given a string, return a new string where "not " has been added to the front.
	// However, if the string already begins with "not", return the string
	// unchanged.

	public static String notString(String word) {
		if (word.length() >= 3 && word.substring(0, 3).equals("not")) {
			return word;
		}
		return "not " + word;
	}

	// Return true if the given string contains between 1 and 3 'e' chars.
	public static boolean stringE(String word) {
		int count = 0;

		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == 'e')
				count++;
		}

		return (count >= 1 && count <= 3);
	}

	// Given a string and a non-negative int n, return a larger string that is n
	// copies of the original string.

	public static String stringTimes(String str, int n) {
		String result = "";
		for (int i = 0; i < n; i++) {
			result += str;
		}
		return result;
	}

	public static String replace() {
		String s1 = "javatpoint is a very good website";
		String replaceString = s1.replace('a', 'e');// replaces all occurrences of a to e
		return replaceString;
	}
	// String myString = "1234";
	// int foo = Integer.parseInt(myString);

	// //Define a string of textual numbers
	// String[] jcdStrings =
	// {"100","110","120","130","140","150","160","170","180","190","200"};
	//
	// //Create an empty ArrayList to hold String
	// ArrayList<String> jcdStringArrayList = new ArrayList<String>();
	//
	// System.out.println("Printing ArrayList of Strings:");
	//
	// //Store our textnumbers in the ArrayList
	// for(String str : jcdStrings)
	// {
	// jcdStringArrayList.add(str);
	// }
	//
	// //Print out the ArrayList of strings
	// for(String str : jcdStringArrayList)
	// {
	// System.out.println(str);
	// }
	//
	// //Create an empty ArrayList to hold Integers
	// ArrayList<Integer> jcdIntegerArrayList = new ArrayList<Integer>();
	//
	// //Loop through the ArrayList of strings and populate ArrayList of integers
	// for(String str : jcdStringArrayList)
	// {
	// jcdIntegerArrayList.add(Integer.parseInt(str));
	// }
	//
	// System.out.println("\nPrinting ArrayList of Integers:");
	//
	// //Print out the ArrayList of integers
	// for(Integer integer : jcdIntegerArrayList)
	// {
	// System.out.println(integer);
	// }

}