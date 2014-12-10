
/* To run just execute:
 * ~$ groovyc MorseCode.groovy
 * ~$ groovy MorseCode
 *
 * @author http://github.com/brunoocasali - twitter: @brunoocasali
 *         http://brunocasali.wordpress.com
 */ 
 
class MorseCode {
    String plainText
    public String morseCode
    
    MorseCode(String text){
      this.plainText = text
    }
    
    String convert() {
      
      if(this.plainText == null) {
        this.plainText = 'hello world'
      } else {
        this.plainText = plainText.toLowerCase()
      }
      
      def keys = [ a: '.-', b: '-...', c: '-.-.', d: '-..', e: '.', f: '..-.', 
			   g: '--.', h: '....', i: '..', j: '.---',	k: '-.-', l: '.-..', m: '--',
			   n: '-.', o: '---', p: '.--.',	q: '--.-', r: '.-.', s: '...', t: '-',
			   u: '..-', v: '...-',	w: '.--', x: '-..-', y: '-.--', z: '--..'
			]
  		 
  		 for (entry in keys) {
         this.plainText = this.plainText.replace(entry.key, "${entry.value} ")
       }
       this.morseCode = this.plainText        
    }
}

def word = System.console().readLine 'What did you want to transform to morse code? '
println "YOUR WORD IN PLAIN TEXT: \t $word"

//code to convert
def code = new MorseCode(word)
code.convert()

println "YOUR WORD IN MORSE CODE: \t ${code.morseCode}"
