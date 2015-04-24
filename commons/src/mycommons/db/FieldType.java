package mycommons.db;

public class FieldType {

	private String type;
	private int type_i;
	
	public FieldType(FieldType in_type){
		this.constructorCommon(in_type);
	}
	public FieldType(String in_type,int in_type_i){
		this.type=in_type;
		this.type_i=in_type_i;
		this.constructorCommon(new mycommons.db.FieldType(in_type,in_type_i));
		
	}
	
	//constructor commons
	private void constructorCommon(mycommons.db.FieldType in_type){
		
	}
	
	//public methods
	public String getType(){
		return this.type;
	}
	public int getType_i(){
		return this.type_i;
	}
	//
	public void setType(String in_type){
		this.type=in_type;
	}
	public void setType_i(int in_type_i){
		this.type_i=in_type_i;
	}
}
