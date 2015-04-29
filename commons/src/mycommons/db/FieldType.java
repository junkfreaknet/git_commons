package mycommons.db;

public class FieldType {

	private int type;

	//constructors
	public FieldType(FieldType in_type){
		this.constructorCommon(in_type);
	}
	public FieldType(int in_type){
		this.constructorCommon(in_type);
	}
	
	public FieldType(){
		this.constructorCommon(mycommons.constants.Generic.CS_ZERO_AS_INT);
	}
	
	//constructor common
	private void constructorCommon(mycommons.db.FieldType in_type){
		this.type=in_type.getType();
	}
	private void constructorCommon(int in_type){
		this.type=in_type;
	}
	
	//public methods
	public int getType(){
		return this.type;
	}
	public void setType(FieldType in_type){
		this.type=this.getType();
	}
	public void setType_i(int in_type){
		this.type=in_type;
	}
}
