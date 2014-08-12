package mycommons.db.connection;

public class DataBase {


	private String name;
	
	//constructors
	public DataBase(){
		this.constructorCommon(mycommons.constants.Generic.CS_SPACE);
	}
	public DataBase(String source){
		this.constructorCommon(source);
	}
	public DataBase(DataBase source){
		this.constructorCommon(source);
	}

	//public methods
	public DataBase get(){
		return this;
	}

	public void setName(String source){
		this.name=source;
	}
	
	public void setName(DataBase source){
		this.name=source.toStringName();
	}
	
	public String toStringName(){
		return this.name;
	}

	//private methods
	private void constructorCommon(String Host){
		this.name=Host;
	}
	private void constructorCommon(DataBase source){
		this.constructorCommon(source.toStringName());
	}
}
