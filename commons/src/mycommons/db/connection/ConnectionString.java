package mycommons.db.connection;

public class ConnectionString {

	private String connectionStringValue;
	
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
		this.connectionStringValue=in;
	}
	
	//
	public String getConnectionString(){
		return this.connectionStringValue;
	}
	
	//
	public void SetString(String in){
		this.connectionStringValue=in;
	}
	public void SetString(mycommons.db.connection.ConnectionString in){
		this.connectionStringValue=in.getConnectionString();
	}
}
