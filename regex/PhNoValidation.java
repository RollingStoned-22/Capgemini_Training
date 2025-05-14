package regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class PhoneNumberValidation {
	public static void main(String[] args) {
		String regex="[789]\\d{9}";
		String number="9905881554,7605881554";
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(number);
		while(matcher.find()) {
			System.out.println(matcher.group()+" "+matcher.start());
			}
		
	}
}
