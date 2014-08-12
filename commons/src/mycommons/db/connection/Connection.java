package mycommons.db.connection;


public class Connection {

	private mycommons.db.connection.ParaConnection para;
	
	
	//database connection
	private java.sql.Connection connection;
	
	//constructor
	//
	public Connection(String inForName,String inHost,String inPort,String inDBName,String inUserName,String inUserPassWord){

		this.para.setForName(inForName);
		this.para.setHost(inHost);
		this.para.setPort(inPort);
		this.para.setDataBase(inDBName);
		this.para.setUser(inUserName);
		this.para.setPassWord(inUserPassWord);

		this.constructorCommon(para);
		
	}
	public Connection(mycommons.db.connection.ParaConnection source){
		this.constructorCommon(source);
	}
	//common constructor
	private void constructorCommon(mycommons.db.connection.ParaConnection source){
		//create a db connections
	}
	//private methods
	//public methods
	public java.sql.Connection getConnection(){
			
		java.sql.Connection rv;	
		rv=this.connection;
		
		return rv;
	}
	
}
