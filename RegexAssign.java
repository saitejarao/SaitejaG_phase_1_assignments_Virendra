package assignment;

import java.util.regex.Pattern;
public class RegexAssign {
	public static void main(String[] args) {
		System.out.println ("jkfnvdius@email.com : "+Pattern.matches("[a-z]+[@][a-z]+.com","jkfnvdius@email.com"));
		System.out.println ("5843928485 : "+Pattern.matches("\\d{10}","5843928485"));
		System.out.println ("jayanth065 : "+Pattern.matches("[MAN][a-z]+\\d{3}+[a-z0-9]+","jayanth065"));
	}
}