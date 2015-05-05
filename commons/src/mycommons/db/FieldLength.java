package mycommons.db;

public class FieldLength {

	private int length;
	
	//constructors
	public FieldLength(){
		this.constructorCommon();
	}
	public FieldLength(int in_length){
		this.constructorCommon(in_length);
	}
	public FieldLength(FieldLength inObj){
		this.constructorCommon(inObj.getLength());
	}
	//constructor common
	private void constructorCommon(){
		this.length=mycommons.constants.Generic.CS_ZERO_AS_INT;
	}
	private void constructorCommon(int in_length){
		this.length=in_length;
	}
	
	//getter
	public int getLength(){
		return this.length;
	}
	//setter
	public void setLength(FieldLength inObj){
		this.length=inObj.getLength();
	}
}
