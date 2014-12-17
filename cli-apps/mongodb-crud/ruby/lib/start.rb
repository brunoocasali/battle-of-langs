require File.expand_path 'crud'
require File.expand_path 'product'
require File.expand_path 'connection'
require File.expand_path 'product_dao'

option = 1

until option == 0 || option > 4
  puts %Q{\n CHOOSE ONE OPTION:
    INSERT = 1
    REMOVE = 2
    SELECT = 3
    UPDATE = 4
    
    EXIT   = 0
  }
  option = gets.chomp!.to_i
    
  if option == 1
    product = Product.new
    
    puts 'Name of product: '
    product.name = gets.chomp!
  
    puts 'Value of product: '
    product.value = gets.chomp!

    CRUD::ProductDAO.add(product.to_hash)
      
  elsif option == 2
    puts 'ID of product'
    CRUD::ProductDAO.remove(gets.chomp!)
         
  elsif option == 3 
    CRUD::ProductDAO.select
    
  elsif option == 4
    old_product = {date: Time.new}
    new_product = {date: Time.new}
    
    puts 'Old name of product: '
    old_product['name'] = gets.chomp!
  
    puts 'Old value of product: '
    old_product['value'] = gets.chomp!
    
    puts 'New name of product: '
    new_product["name"] = gets.chomp!
  
    puts 'New value of product: '
    new_product["value"] = gets.chomp!
    
    CRUD::ProductDAO.update(old_product, new_product)
  end
end

puts '----------- THX -----------'
