package mycommons.net.tcp;

public class Port {

	private String port;
	
	//constructors
	public Port(){
		
	}
	//constructor common
	private void constructorCommon(String source){
		this.port=source;
	}
	private void constructorCommon(Port source){
		this.port=source.toString();
	}
	//public method
	public String toString(){
		return this.port;
	}
	public Port getPort(){
		return this;
	}

	public void setPort(String source){
		this.port=source;
	}
	
	public void setPort(Port source){
		this.port=source.toString();
	}
	//private method
	
}
