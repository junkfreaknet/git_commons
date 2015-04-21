package mycommons.db.connection;

public class Product {


	private String name;
	
	//constructors
	public Product(){
		this.constructorCommon(mycommons.constants.Generic.CS_SPACE);
	}
	public Product(String source){
		this.constructorCommon(source);
	}
	public Product(Product source){
		this.constructorCommon(source);
	}

	//public methods
	public Product get(){
		return this;
	}

	public void setName(String source){
		this.name=source;
	}
	
	public void setName(Product source){
		this.name=source.toStringName();
	}
	
	public String toStringName(){
		return this.name;
	}

	//private methods
	private void constructorCommon(String Host){
		this.name=Host;
	}
	private void constructorCommon(Product source){
		this.constructorCommon(source.toStringName());
	}
}
