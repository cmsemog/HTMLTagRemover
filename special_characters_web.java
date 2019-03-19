package base;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class special_characters_web {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String input = "20&#58;%";
	
		input = "9&quot;9";
		removeWebEncoding(input);
		input = "&nbsp;55";
		removeWebEncoding(input);
		input = "&quot;&#60;I&#62; am the &#60;greatest&#62;&quot;";
		removeWebEncoding(input);
		//process(input);
		
		String ok = "<p>ok&quot;ok</p>";
		
		removeHTMLTags(ok);
		removeWebEncoding(ok);
	}

	public static String removeHTMLTags(String input) {
		
		String regex = "^[<][^\\/<>]+[>]|[<][^<>]+[>]|[<][^:]+[:]|[;][/][^>]+[>]|[;][>]$";
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
	    String output = input.replaceAll(pattern.toString(), "");
		Matcher matcher = pattern.matcher(input);
		
		System.out.println(input);
		System.out.println(output);
				
		
		return output;
	}
	
	public static String removeWebEncoding(String input) {
	
			
			//	String[] replacement = SpecialCharacter(input, i);
				input = input
						.replace("&#60;", "<")
						.replace("&#62;", ">")
						.replace("&#34;","'" )//"\""
						.replace("&quot;","'" )
						.replace("&#39;","'" )
						.replace("&#58;",":" )
						.replace("&nbsp;"," " )
						.replace("&#96;", "`")
						.replace("&#92;", "\\")
						//3rd set of encoding
						.replace("’", "'")
						.replace("–", "-")
						.replace("“", "'")//"\""
						.replace("�?", "'")//"\""
						.replace("&lsquo;","'")
						.replace("&rsquo;", "'")
						.replace("&rdquo;", "'") 
						.replace("&ldquo;", "'")
						.replace("&#160;", "")
						.replace("&ndash;", "-")
						.replace("&mdash;","�") 
						.replace("&deg;", "�") 
						.replace("&middot;", "�")
						.replace("&not;","�")
						.replace("&amp;","&")
						.replace("&bull;","�")
						.replace("&gt;",">")
						.replace("&lt;", "<");
						
				System.out.println(input);
				return input;
			
	
	}


}
