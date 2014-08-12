package mycommons.net.tcp;

public class Port {

	private String value;
	
	//constructors
	public Port(){
		this.constructorCommon(mycommons.constants.Generic.CS_SPACE);
	}
	public Port(mycommons.net.tcp.Port source){
		this.constructorCommon(source);
	}
	public Port(String source){
		this.constructorCommon(source);
	}
	//constructor common
	private void constructorCommon(String source){
		this.value=source;
	}
	private void constructorCommon(Port source){
		this.value=source.toStringValue();
	}
	//public method
	public String toStringValue(){
		return this.value;
	}
	public Port get(){
		return this;
	}

	public void setValue(String source){
		this.value=source;
	}
	
	public void setValue(Port source){
		this.value=source.toStringValue();
	}
	//private method
	
}
