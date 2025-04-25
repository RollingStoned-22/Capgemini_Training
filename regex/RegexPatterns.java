package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPatterns {
	public static void main(String[] args) {
		String str = "Hello 5799World, .,\n Sorrow. Morrow 69";
		String regex = "";
		Pattern pattern = Pattern.compile(regex);
	
		Matcher matcher = pattern.matcher(str);
		while(matcher.find()) {
			System.out.print(matcher.group());
		}
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}
