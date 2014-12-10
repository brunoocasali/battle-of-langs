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
  	HashMap<String, String> alphabet = new HashMap<String, String>();

		alphabet.put("a", ".-");
		alphabet.put("b", "-...");
		alphabet.put("c", "-.-.");
		alphabet.put("d", "-..");
		alphabet.put("e", ".");
		alphabet.put("f", "..-.");
		alphabet.put("g", "--.");
		alphabet.put("h", "....");
		alphabet.put("i", "..");
		alphabet.put("j", ".---");
		alphabet.put("k", "-.-");
		alphabet.put("l", ".-..");
		alphabet.put("m", "--");
		alphabet.put("n", "-.");
		alphabet.put("o", "---");
		alphabet.put("p", ".--.");
		alphabet.put("q", "--.-");
		alphabet.put("r", ".-.");
		alphabet.put("s", "...");
		alphabet.put("t", "-");
		alphabet.put("u", "..-");
		alphabet.put("v", "...-");
		alphabet.put("w", ".--");
		alphabet.put("x", "-..-");
		alphabet.put("y", "-.--");
		alphabet.put("z", "--..");

		if(plainText == null){
		  plainText = "hello world";
		} else {
		  plainText = plainText.toLowerCase();
    }
    
    for (Map.Entry<String, String> entry : alphabet.entrySet())
    {
      plainText = plainText.replace(entry.getKey(), entry.getValue() + " ");
    }
  }
}
