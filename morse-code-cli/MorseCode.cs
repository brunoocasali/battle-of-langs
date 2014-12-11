using System;
using System.Collections.Generic;


/* To run just execute:
 * ~$ mcs MorseCode.cs
 * ~$ mono MorseCode.exe
 * author: http://github.com/brunoocasali - twitter: @brunoocasali
         http://brunocasali.wordpress.com
*/

public class MorseCode {
  public static String PlainText { get; set; }
  public static String MorseText { get; set; }
  
  static void Main() {
    Console.WriteLine("What did you want to transform to morse code? ");
    PlainText = Console.ReadLine();
    
    PlainText = (String.IsNullOrEmpty(PlainText) ? 
                 "Hello World" : PlainText).ToLower(); 
    
    MorseText = PlainText;
    convert();
    
    Console.WriteLine("YOUR WORD IN PLAIN TEXT \t " + PlainText);
    Console.WriteLine("YOUR WORD IN MORSE CODE \t " + MorseText);
  }
  
  static void convert(){
    var alphabet = new Dictionary<String, String>() { 
       { "a", ".-" }, { "b", "-..." }, { "c", "-.-." }, { "d", "-.." }, 
       { "e", "." }, { "f", "..-." }, { "g", "--." }, { "h", "...." },
       { "i", ".." }, { "j", ".---" }, { "k", "-.-" }, { "l", ".-.." },
       { "m", "--" }, { "n", "-." }, { "o", "---" }, { "p", ".--." },	
       { "q", "--.-" }, { "r", ".-." }, { "s", "..." }, { "t", "-" }, 
       { "u", "..-" }, { "v", "...-" },	{ "w", ".--" }, { "x", "-..-"},
       { "y", "-.--" }, { "z", "--.." }
    };
    
    foreach (var letter in alphabet){
       MorseText = MorseText.Replace(letter.Key, letter.Value + " ");
    }
  }
}

