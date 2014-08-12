package mycommons.db.connection;

public class ForName {


	private String value;
	
	//constructors
	public ForName(){
		this.constructorCommon(mycommons.constants.Generic.CS_SPACE);
	}
	public ForName(String source){
		this.constructorCommon(source);
	}
	public ForName(ForName source){
		this.constructorCommon(source);
	}

	//public methods
	public ForName get(){
		return this;
	}

	public void setValue(String source){
		this.value=source;
	}
	
	public void setValue(ForName source){
		this.value=source.toStringValue();
	}
	
	public String toStringValue(){
		return this.value;
	}

	//private methods
	private void constructorCommon(String source){
		this.value=source;
	}
	private void constructorCommon(ForName source){
		this.constructorCommon(source.toStringValue());
	}
}
