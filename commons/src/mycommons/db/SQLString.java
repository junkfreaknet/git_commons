package mycommons.db;

public class SQLString {

	private String sqlstring;
	
	//constructors
	public SQLString(){
		
		this.sqlstring=mycommons.constants.Generic.CS_SPACE;
		
	}
	public SQLString(String in){
		
		this.sqlstring=in;
		
	}

	//public methods
	public SQLString getSQLString(){
		
		return this;
		
	}
	public String toString(){
		
		return this.sqlstring;
		
	}
	//private methods
	private void constructorCommon(String in){
		this.sqlstring=in;
	}
}
