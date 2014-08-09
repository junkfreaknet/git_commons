package mycommons.db;
// This class is a  of database.
public class DBConnection {

	//paramaters for db connection
	private String host;//"host name" or "ip address"
	//private String hostAddress;
	private String dbName;
	private String userName;
	private String passWord;
	private String forName;
	private String port;
	
	//database connection
	private java.sql.Connection connection;
	
	//constructor
	public DBConnection(String inForName,String inHost,String inPort,String inDBName,String inUserName,String inUserPassWord){
		
		this.host=inHost;
		//this.hostAddress=HostAddress;
		this.dbName=inDBName;
		this.userName=inUserName;
		this.passWord=inUserPassWord;
		this.forName=inForName;
		this.port=inPort;
		
	}
	public DBConnection(mycommons.db.ParaConnection inPara){
		
	}
	//common constructor
	//private method
	//public method
	public java.sql.Connection create(){
	
		java.sql.Connection rv;
		
		rv=this.connection;
		
		return rv;
	}
}
