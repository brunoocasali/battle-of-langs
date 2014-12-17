module CRUD
  class Connection
    include Mongo
    
    attr_accessor :db, :collection, :connection
    
    def initialize(db_name = 'rb_mongodb_crud', collection_name = 'products')
      @connection = MongoClient.new # defaults to localhost:27017
      
      @db = @connection[db_name]
      @collection = @db[collection_name]
    end
    
  end
end  
