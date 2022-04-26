package lab_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextHandler {
	public static int GetSentencesCount(String text) {
		Pattern p = Pattern.compile("(?<=)(\\s[a-z]{2,}\\.)");
		Matcher m = p.matcher(text);
		var listMatches = new ArrayList<String>();
		
		while (m.find( )) {
			listMatches.add(m.group());
		}
		
		return listMatches.size();
	}
	
	public static void ShowDuplicates(List<String> words) {
		Map<String, Integer> results =  new LinkedHashMap<>();
		var longestWord = "";
		var lenght = 0;
		
		for(String word : words) {
			
		    if(!results.containsKey(word)) {
		    	results.put(word, 1);
		    }
		    else {
		    	var count = results.get(word);
		    	results.put(word, ++count);
		    }
		    
		    if (word.length() > longestWord.length()) {
		    	longestWord = word;
		    	lenght = word.length();
		    }
		}
		
		var sortedResults = SortMapResults(results);
		var count = 0;
		
		for (Map.Entry<String, Integer> l : sortedResults) {
			System.out.println("Word ->"
                    + " " + l.getKey()
                    + ": Appearances ->"
                    + l.getValue());
			
			if(count++ > 3) {
				break;
			}
		 }
		
		System.out.println("The longest word is " + longestWord +" with lenght " + lenght);
	}
	
	private static List<Map.Entry<String, Integer>> SortMapResults(Map<String, Integer> map) {
		List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());
		Collections.sort(
	            list,
	            new Comparator<Map.Entry<String, Integer> >() {
	               public int compare(
	                    Map.Entry<String, Integer> entry1,
	                    Map.Entry<String, Integer> entry2)
	                {
	 
	                    return entry2.getValue()
	                        - entry1.getValue();
	                }
	            });
		
		return list;
	}
	
	public static List<String> GetWords(String text){
		Pattern p = Pattern.compile("\\s?[A-Za-z0-9'-]+[\\s,;.!?:]");
		Matcher m = p.matcher(text);
		var listMatches = new ArrayList<String>();
		
		while (m.find( )) {
			listMatches.add(m.group());
		}
		
		return listMatches;
	}
	
	public static int CountTextWords(List<String> words) {
		return words.size();
	}
	
	public static long CountTextLetters(String text) {
		Pattern p = Pattern.compile("[A-Za-z]");
		Matcher m = p.matcher(text);
		return m.results().count();
	}
	
	public static long CountVowels(String text) {
		Pattern p = Pattern.compile("[a,e,i,o,u,y]");
		Matcher m = p.matcher(text);
		return m.results().count();
	}
	
	public static long CountConsonants(String text) {
		Pattern p = Pattern.compile("[b,c,d,f,g,h,j,k,l,m,n,p,q,r,s,t,v,w,x,z]");
		Matcher m = p.matcher(text);
		return m.results().count();
	}
}
