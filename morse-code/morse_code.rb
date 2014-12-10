#utf-8

# To run just execute:
# ruby morse_code.rb

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

puts "YOUR WORD IN PLAIN TEXT:      #{word}"
c = MorseCode.new word
c.convert
puts "YOUR WORD IN MORSE CODE:      #{c.plan_text}"












