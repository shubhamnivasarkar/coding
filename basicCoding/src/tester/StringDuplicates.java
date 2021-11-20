package tester;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringDuplicates {

	// hey java is java best language is java
	// java =3;
	// is = 2;
	// using HashMap

	public static void main(String[] args) {
		findDuplicateWords("hey java is java best language is java");
	}

	public static void findDuplicateWords(String inputString) {
		// split the string
		String words[] = inputString.split(" "); //will give you string array
		for(int i =0;i<words.length;i++) {
			System.out.print(words[i]);
			
		}
		System.out.println();
		// create HashMap
		Map<String, Integer> wordCount = new HashMap<String, Integer>();

		// to check each word in given array
		for (String word : words) {
			// if word is present
			if (wordCount.containsKey(word)) {
				wordCount.put(word.toLowerCase(), wordCount.get(word) + 1);
			} else {
				wordCount.put(word, 1);
			}
		}

		// extracting all the keys of the map
		Set<String> wordsInString = wordCount.keySet();

		// loop through all words in the word count

		for (String word : wordsInString) {
			if (wordCount.get(word) > 1) {
				System.out.println(word + " " + wordCount.get(word));
			}
		}
	}
}
