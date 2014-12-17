class Product
  attr_accessor :name, :value, :date, :_id
  
  def initialize(date = Time.new)
    @date = date
  end
      
  def to_hash
    hash = {}
    instance_variables.each do |var| 
      hash[var.to_s.delete("@")] = instance_variable_get(var)
    end
      
    hash
  end
  
end
