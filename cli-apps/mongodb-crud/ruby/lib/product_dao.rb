module CRUD
  class ProductDAO
    include Mongo
    
    def self.add(product_hash)
      connection = CRUD::Connection.new
      connection.collection.insert(product_hash)
    end
    
    def self.remove(id)
      connection = CRUD::Connection.new
      connection.collection.remove({name: id})
    end
    
    def self.select
      connection = CRUD::Connection.new
      connection.collection.find.each do |element|
       print "\t\t ID: \t #{element['_id']}
                 Name: \t #{element['name']}
                 Value:  #{element['value']}
                 Date: \t #{element['date']}
              ------------------------------------- \n"
      end
    end
    
    def self.update(old_hash, new_hash)
      connection = CRUD::Connection.new
      connection.collection.update(old_hash, new_hash)
    end
  end
end
