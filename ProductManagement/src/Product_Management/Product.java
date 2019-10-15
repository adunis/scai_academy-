package Product_Management;

public class Product {
int counter = 0; 
private int id; 
Double price; 
Double weight; 

	public Product (Double primo_input, Double secondo_input){
		counter++;  
		this.id = this.counter; 
		this.price = primo_input; 
		this.weight = secondo_input; 
	}
	
	
    public void setId(int pippo){
    	this.id = pippo; 
    
   }
    
    public int getId(){
    	return this.id; 
   }
  
    
   
    
}

