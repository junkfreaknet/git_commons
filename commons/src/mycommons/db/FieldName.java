package mycommons.db;

public class FieldName {

	private String name;
	
	public FieldName(FieldName in_fieldname){
		
		this.name=in_fieldname.name;
	}
	public FieldName(String in_fieldname){
		this.name=in_fieldname;
	}
	
	public void setName(FieldName in_fieldname){
		
	}
	public String getName(){
		return this.name;
	}
	
}
