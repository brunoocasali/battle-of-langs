require 'product.rb'
require 'crud.rb'
require 'connection.rb'

puts 'Iserindo um objeto do tipo Product no banco!'
code = CRUD::Product.new()

puts "YOUR WORD IN PLAIN TEXT: \t #{code.plain_text}"
code.convert
puts "YOUR WORD IN MORSE CODE: \t #{code.morse_code}"
