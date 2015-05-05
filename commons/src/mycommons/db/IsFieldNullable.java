package mycommons.db;

public class IsFieldNullable {

	private int isNullable;
	
	//constructors
	public IsFieldNullable(){
		this.constructorCommon();
	}
	public IsFieldNullable(int in_length){
		this.constructorCommon(in_length);
	}
	public IsFieldNullable(IsFieldNullable inObj){
		this.constructorCommon(inObj.getIsNullale());
	}
	//constructor common
	private void constructorCommon(){
		this.isNullable=mycommons.constants.Generic.CS_ZERO_AS_INT;
	}
	private void constructorCommon(int in_length){
		this.isNullable=in_length;
	}
	
	//getter
	public int getIsNullale(){
		return this.isNullable;
	}
	//setter
	public void setIsNullable(IsFieldNullable inObj){
		this.isNullable=inObj.getIsNullale();
	}
}
