module CRUD
  class Product
    include Mongo

    attr_accessor :name, :value, :date

    # Validations.
    validates_presence_of :name, :value
    
    def initialize(name = 'Erva-Mate', value = 31.5, date = Date.new)
      @name = name
      @value = value
      @date = date
    end
        
    def add
      @connection = CRUD::Connection.new
      @connection.collection.insert(self)
    end
    
    def remove
      
    end
    
    def select
      
    end
    
    def update
      
    end
    
  end
end
