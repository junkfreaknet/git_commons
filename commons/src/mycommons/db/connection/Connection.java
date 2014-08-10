package mycommons.db.connection;


public class Connection {

	private mycommons.db.connection.ParaConnection para;
	
	
	//database connection
	private java.sql.Connection connection;
	
	//constructor
	//
	public Connection(String inForName,String inHost,String inPort,String inDBName,String inUserName,String inUserPassWord){
		/***
		this.host=inHost;
		//this.hostAddress=HostAddress;
		this.dbName=inDBName;
		this.userName=inUserName;
		this.passWord=inUserPassWord;
		this.forName=inForName;
		this.port=inPort;
	***/
		
		
	}
	public Connection(mycommons.db.connection.ParaConnection inPara){
		
	}
	//common constructor
	private void constructorCommon(mycommons.db.connection.ParaConnection inPara){
		
	}
	//private methods
	//public methods
	public java.sql.Connection getConnection(){
	
		
		java.sql.Connection rv;	
		rv=this.connection;
		
		return rv;
	}
	
}
