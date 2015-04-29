package mycommons.db;

public class FieldName {

	private String name;
	
	//constructors
	public FieldName(FieldName in_name){
		
		this.constructorCommon(in_name);
	}
	public FieldName(String in_name){
		
		this.constructorCommon(in_name);
	}
	public FieldName(){
		this.constructorCommon(mycommons.constants.Generic.CS_SPACE);
	}
	
	//constructor common
	private void constructorCommon(FieldName in_name){
		this.name=this.getName();
	}
	private void constructorCommon(String in_name){
		this.name=in_name;
	}
	//methods public
	public void setName(FieldName in_name){
		this.name=in_name.getName();
	}
	public String getName(){
		return this.name;
	}
	
}
