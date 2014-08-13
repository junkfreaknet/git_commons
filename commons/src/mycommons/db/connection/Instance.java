package mycommons.db.connection;

public class Instance {


	private String name;
	
	//constructors
	public Instance(){
		this.constructorCommon(mycommons.constants.Generic.CS_SPACE);
	}
	public Instance(String source){
		this.constructorCommon(source);
	}
	public Instance(Instance source){
		this.constructorCommon(source);
	}

	//public methods
	public Instance get(){
		return this;
	}

	public void setName(String source){
		this.name=source;
	}
	
	public void setName(Instance source){
		this.name=source.toStringName();
	}
	
	public String toStringName(){
		return this.name;
	}

	//private methods
	private void constructorCommon(String Host){
		this.name=Host;
	}
	private void constructorCommon(Instance source){
		this.constructorCommon(source.toStringName());
	}
}
