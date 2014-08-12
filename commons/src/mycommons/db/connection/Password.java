package mycommons.db.connection;

public class Password {


	private String value;
	
	//constructors
	public Password(){
		this.constructorCommon(mycommons.constants.Generic.CS_SPACE);
	}
	public Password(String source){
		this.constructorCommon(source);
	}
	public Password(Password source){
		this.constructorCommon(source);
	}

	//public methods
	public Password get(){
		return this;
	}

	public void setName(String source){
		this.value=source;
	}
	
	public void setName(Password source){
		this.value=source.toStringValue();
	}
	
	public String toStringValue(){
		return this.value;
	}

	//private methods
	private void constructorCommon(String source){
		this.value=source;
	}
	private void constructorCommon(Password source){
		this.constructorCommon(source.toStringValue());
	}
}
