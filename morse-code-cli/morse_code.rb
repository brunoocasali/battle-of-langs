# To run just execute:
# ~$ ruby morse_code.rb
# author: http://github.com/brunoocasali - twitter: @brunoocasali
#         http://brunocasali.wordpress.com

class MorseCode
	attr_reader :plan_text, :morse_code

	def initialize(plan_text = 'Hello World')
	  @morse_code = @plan_text = plan_text.downcase!
	end

	def convert
		
		alphabet = { a: '.-', b: '-...', c: '-.-.', d: '-..', e: '.', f: '..-.', 
			   g: '--.', h: '....', i: '..', j: '.---',	k: '-.-', l: '.-..', m: '--',
			   n: '-.', o: '---', p: '.--.',	q: '--.-', r: '.-.', s: '...', t: '-',
			   u: '..-', v: '...-',	w: '.--', x: '-..-', y: '-.--', z: '--..'
		}
		
		alphabet.each do |k, v| 
		  @morse_code.gsub!(k.to_s, "#{v} ")
		end
	end
end

puts 'What did you want to transform to morse code? '
c = MorseCode.new gets.chomp

puts "YOUR WORD IN PLAIN TEXT: \t #{c.plan_text}"
c.convert
puts "YOUR WORD IN MORSE CODE: \t #{c.morse_code}"
