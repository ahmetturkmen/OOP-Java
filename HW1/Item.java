package HW2;

public class Item {
	
	private String name;
	private int price=0;
	
	public Item(){
		
	}
	
	public Item(String name, int price){
		this.name=name;
		if(price<0)
			this.price=0;
		this.price =price;
	}
	public void setName(String  name){
		this.name = name;
		
	}
	public String getName(){
		return this.name;
	} 

	public void setPrice(int price){
		this.price=price;

	}
	public int getPrice(){
		if(price<0)
			this.price=0;
		return price;
	}
	
	
	
}
