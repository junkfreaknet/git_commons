package mycommons.db.connection;

public class ConnectionString {

	private String connectionString;
	
	public ConnectionString(){
		this.commonConstructor(mycommons.constants.Generic.CS_SPACE);
	}
	public ConnectionString(String in){
		this.commonConstructor(in);
	}
	public ConnectionString(ConnectionString in){
		
		this.commonConstructor(in.getConnectionString());
	}
	//
	private void commonConstructor(String in){
		this.connectionString=in;
	}
	
	//
	public String getConnectionString(){
		return this.connectionString;
	}
	
	//
	public void SetString(String in){
		this.connectionString=in;
	}
	public void SetString(mycommons.db.connection.ConnectionString in){
		this.connectionString=in.getConnectionString();
	}
}
