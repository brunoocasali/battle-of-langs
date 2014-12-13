# To run just execute:
# ~$ python morse_code.py
# author: http://github.com/brunoocasali - twitter: @brunoocasali
#         http://brunocasali.wordpress.com

class MorseCode:

  alphabet = { 'a': '.-', 'b': '-...', 'c': '-.-.', 'd': '-..', 'e': '.',
               'f': '..-.', 'g': '--.', 'h': '....', 'i': '..', 'j': '.---',
               'k': '-.-', 'l': '.-..', 'm': '--', 'n': '-.', 'o': '---',
               'p': '.--.', 'q': '--.-', 'r': '.-.', 's': '...', 't': '-',
               'u': '..-', 'v': '...-', 'w': '.--', 'x': '-..-', 'y': '-.--',
               'z': '--..'
  }
  
  def __init__(self, plain_text = 'Hello World'):
    self.morse_code = self.plain_text = plain_text.lower()
     
     
  def convert(self):
    for key, value in self.alphabet.items():
      self.morse_code = self.morse_code.replace(key, value + ' ')


code = MorseCode(raw_input("What did you want to transform to morse code?  "))
code.convert()

print "YOUR WORD IN PLAIN TEXT: \t " + code.plain_text
print "YOUR WORD IN MORSE CODE: \t " + code.morse_code
