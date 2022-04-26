package lab_3;

public class Main {

	public static void main(String[] args) {
		var text = TextData.GetText();
		var sentences = TextHandler.GetSentencesCount(text);
		System.out.println("Text contains "+ sentences + " sentences");
		
		var words = TextHandler.GetWords(text);
		var wordsCount = TextHandler.CountTextWords(words);
		System.out.println("Text contains " + wordsCount + " words");
		var letters = TextHandler.CountTextLetters(text);
		System.out.println("Text contains " + letters + " letters");
		var vowels = TextHandler.CountVowels(text);
		System.out.println("Text contains " + vowels + " vowels");
		var consonants = TextHandler.CountConsonants(text);
		System.out.println("Text contains " + consonants + " consonants");
		
		TextHandler.ShowDuplicates(words);
	}

}
