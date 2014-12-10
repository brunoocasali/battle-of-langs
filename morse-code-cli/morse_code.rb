#utf-8

# To run just execute:
# ruby morse_code.rb
# author: http://github.com/brunoocasali - @brunoocasali - http://brunocasali.wordpress.com

class MorseCode
	attr_reader :plan_text

	def initialize(plan_text = 'Hello World')
	  @plan_text = plan_text.downcase!
	end
	
	def convert
		
		keys = { 'a' => '.-', 'b' => '-...', 'c' => '-.-.', 'd' => '-..', 'e' => '.', 'f' => '..-.', 
						 'g' => '--.', 'h' => '....', 'i' => '..', 'j' => '.---',	'k' => '-.-', 'l' => '.-..', 
						 'm' => '--', 'n' => '-.', 'o' => '---', 'p' => '.--.',	'q' => '--.-', 'r' => '.-.',
						 's' => '...', 't' => '-', 'u' => '..-', 'v' => '...-',	'w' => '.--', 'x' => '-..-',
						 'y' => '-.--', 'z' => '--..'
		}
		
		keys.each do |k, v|
			@plan_text.gsub!(k, "#{v} ")
	  end
	  
		@plan_text
	end
end

puts "What did you want to transform to morse code? "
word = gets.chomp

puts "YOUR WORD IN PLAIN TEXT: \t #{word}"
c = MorseCode.new word
c.convert
puts "YOUR WORD IN MORSE CODE: \t #{c.plan_text}"











