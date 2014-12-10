import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
 
public class MorseCode {

	private static String plainText;
	
  public static void main(String[] args) {
 
    Scanner scan = new Scanner(System.in);
    
	  System.out.println("What did you want to transform to morse code? ");
    plainText = scan.nextLine();
 
    scan.close();
    
    System.out.println(plainText);
  }
  
  public static String convert(){
  	HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("a", ".-");
		map.put("b", "-...");
		map.put("c", "-.-.");
		map.put("d", "-..");
		map.put("e", ".");
		map.put("f", "..-.");
		map.put("g", "--.");
		map.put("h", "....");
		map.put("i", "..");
		map.put("j", ".---");
		map.put("k", "-.-");
		map.put("l", ".-..");
		map.put("m", "--");
		map.put("n", "-.");
		map.put("o", "---");
		map.put("p", ".--.");
		map.put("q", "--.-");
		map.put("r", ".-.");
		map.put("s", "...");
		map.put("t", "-");
		map.put("u", "..-");
		map.put("v", "...-");
		map.put("w", ".--");
		map.put("x", "-..-");
		map.put("y", "-.--");
		map.put("z", "--..");
						
  	return "";
  }
}
