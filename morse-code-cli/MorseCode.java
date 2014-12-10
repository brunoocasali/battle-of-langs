import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

/* To run just execute:
 * ~$ javac MorseCode.java
 * ~$ java MorseCode
 *
 * @author http://github.com/brunoocasali - twitter: @brunoocasali
 *         http://brunocasali.wordpress.com
 */ 

public class MorseCode {

	private static String plainText;

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

	  System.out.println("What did you want to transform to morse code? ");
    plainText = scan.nextLine();
    scan.close();
    
    System.out.println("YOUR WORD IN PLAIN TEXT: \t" + plainText);
    convert();
    System.out.println("YOUR WORD IN MORSE CODE: \t" + plainText);
  }

  public static void convert(){
  	HashMap<String, String> keys = new HashMap<String, String>();

		keys.put("a", ".-");
		keys.put("b", "-...");
		keys.put("c", "-.-.");
		keys.put("d", "-..");
		keys.put("e", ".");
		keys.put("f", "..-.");
		keys.put("g", "--.");
		keys.put("h", "....");
		keys.put("i", "..");
		keys.put("j", ".---");
		keys.put("k", "-.-");
		keys.put("l", ".-..");
		keys.put("m", "--");
		keys.put("n", "-.");
		keys.put("o", "---");
		keys.put("p", ".--.");
		keys.put("q", "--.-");
		keys.put("r", ".-.");
		keys.put("s", "...");
		keys.put("t", "-");
		keys.put("u", "..-");
		keys.put("v", "...-");
		keys.put("w", ".--");
		keys.put("x", "-..-");
		keys.put("y", "-.--");
		keys.put("z", "--..");

		if(plainText == null){
		  plainText = "hello world";
		} else {
		  plainText = plainText.toLowerCase();
    }
    
    for (Map.Entry<String, String> entry : keys.entrySet())
    {
      plainText = plainText.replace(entry.getKey(), entry.getValue() + " ");
    }
  }
}
