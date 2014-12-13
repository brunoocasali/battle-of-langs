/* To run just execute:
 * ~$ groovyc MorseCode.groovy
 * ~$ groovy MorseCode
 *
 * @author http://github.com/brunoocasali - twitter: @brunoocasali
 *         http://brunocasali.wordpress.com
 */ 
 
class MorseCode {
    String plainText, morseCode
   
    MorseCode(String text){
      if(text == null) {
        this.plainText = 'hello world'
      } else {
        this.plainText = text.toLowerCase()
      }
      
      this.morseCode = this.plainText
    }
    
    String convert() {
      
      def alphabet = [ a: '.-', b: '-...', c: '-.-.', d: '-..', e: '.', f: '..-.', 
			   g: '--.', h: '....', i: '..', j: '.---',	k: '-.-', l: '.-..', m: '--',
			   n: '-.', o: '---', p: '.--.',	q: '--.-', r: '.-.', s: '...', t: '-',
			   u: '..-', v: '...-',	w: '.--', x: '-..-', y: '-.--', z: '--..'
			]
  		 
  		 for (entry in alphabet) {
         this.morseCode = this.morseCode.replace(entry.key, "${entry.value} ")
       }       
    }
}

def word = System.console().readLine 'What did you want to transform to morse code? '
//code to convert
def code = new MorseCode(word)
code.convert()
println "YOUR WORD IN PLAIN TEXT: \t ${code.plainText}"
println "YOUR WORD IN MORSE CODE: \t ${code.morseCode}"
