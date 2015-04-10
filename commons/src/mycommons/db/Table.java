package mycommons.db;

public class Table {

	private String name;
	
	//public constructors
	public Table(){

		this.constructorCommon(mycommons.constants.Generic.CS_SPACE);
		
	}
	public Table(String in_name){

		this.constructorCommon(in_name);
		
	}
	//private constructor
	
	//table name only.
	private void constructorCommon(String in_name){
		
		this.name=in_name;
		
	}
}
