package mycommons.db.connection;

public class Server {


	private String name;
	
	//constructors
	public Server(){
		this.constructorCommon(mycommons.constants.Generic.CS_SPACE);
	}
	public Server(String source){
		this.constructorCommon(source);
	}
	public Server(Server source){
		this.constructorCommon(source);
	}

	//public methods
	public Server get(){
		return this;
	}

	public void setName(String source){
		this.name=source;
	}
	
	public void setName(Server source){
		this.name=source.toStringName();
	}
	
	public String toStringName(){
		return this.name;
	}

	//private methods
	private void constructorCommon(String Host){
		this.name=Host;
	}
	private void constructorCommon(Server source){
		this.constructorCommon(source.toStringName());
	}
}
