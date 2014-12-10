class MorseCode:

  alphabet = { 'a': '.-', 'b': '-...', 'c': '-.-.', 'd': '-..', 'e': '.',
               'f': '..-.', 'g': '--.', 'h': '....', 'i': '..', 'j': '.---',
               'k': '-.-', 'l': '.-..', 'm': '--', 'n': '-.', 'o': '---',
               'p': '.--.', 'q': '--.-', 'r': '.-.', 's': '...', 't': '-',
               'u': '..-', 'v': '...-', 'w': '.--', 'x': '-..-', 'y': '-.--',
               'z': '--..'
  }
  
  def __init__(self, plain_text):
    self.morse_code = self.plain_text = plain_text.lower()
     
  
  def convert:
    

name = raw_input("What is your name? ");
print "Hello World: " + name

morse = MorseCode(name)
print morse.alphabet
