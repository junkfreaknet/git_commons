package mycommons.db.connection;

public class Host {


	private String name;
	
	//constructors
	public Host(){
		this.constructorCommon(mycommons.constants.Generic.CS_SPACE);
	}
	public Host(String source){
		this.constructorCommon(source);
	}
	public Host(Host source){
		this.constructorCommon(source);
	}

	//public methods
	public Host get(){
		return this;
	}

	public void setName(String source){
		this.name=source;
	}
	
	public void setName(Host source){
		this.name=source.toStringName();
	}
	
	public String toStringName(){
		return this.name;
	}

	//private methods
	private void constructorCommon(String Host){
		this.name=Host;
	}
	private void constructorCommon(Host source){
		this.constructorCommon(source.toStringName());
	}
}
