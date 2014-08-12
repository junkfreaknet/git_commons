package mycommons.db.connection;

public class User {


	private String name;
	
	//constructors
	public User(){
		this.constructorCommon(mycommons.constants.Generic.CS_SPACE);
	}
	public User(String source){
		this.constructorCommon(source);
	}
	public User(User source){
		this.constructorCommon(source);
	}

	//public methods
	public User get(){
		return this;
	}

	public void setName(String source){
		this.name=source;
	}
	
	public void setName(User source){
		this.name=source.toStringName();
	}
	
	public String toStringName(){
		return this.name;
	}

	//private methods
	private void constructorCommon(String source){
		this.name=source;
	}
	private void constructorCommon(User source){
		this.constructorCommon(source.toStringName());
	}
}
