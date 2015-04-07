package mycommons.db.connection;


public class Connection {

	private mycommons.db.connection.ParaConnection para;
	
	
	//database connection
	private java.sql.Connection connection;
	
	//constructor
	//
	/***
	public Connection(String inForName,String inHost,String inPort,String inDBName,String inUserName,String inUserPassWord){

		this.para.setForName(inForName);
		this.para.setHost(inHost);
		this.para.setPort(inPort);
		this.para.setDataBase(inDBName);
		this.para.setUser(inUserName);
		this.para.setPassWord(inUserPassWord);

		this.constructorCommon(para);
		
	}
	public Connection(){
	
	}
	***/
	public Connection(mycommons.db.connection.ParaConnection source){
		this.constructorCommon(source);
	}
	//common constructor
	private void constructorCommon(mycommons.db.connection.ParaConnection source){

		String connectionString;
		
		try{
			//create a db connections			
			Class.forName(source.getForName().toStringValue());
			connectionString=this.createConnectionString(source);
			this.connection=java.sql.DriverManager.getConnection(connectionString);

		}catch(Exception e){
			//System.out.println("failed in create connection.");
		}

	}
	//private methods
	private String createConnectionString(mycommons.db.connection.ParaConnection source){
		
		String rv;
		
		rv=mycommons.constants.DB.CONNECTION_PREFIX+mycommons.constants.DB.CONNECTION_SEPARATOR_COLON+source.getServer().toStringName()+mycommons.constants.DB.CONNECTION_SEPARATOR_COLON;
		rv=rv+mycommons.constants.DB.CONNECTION_DOUBLE_SLASH;
		rv=rv+source.getHost().toStringName()+mycommons.constants.DB.CONNECTION_DOUBLE_BACK_SLASH;
		rv=rv+source.getInstance().toStringName()+mycommons.constants.DB.CONNECTION_SEPARATOR_COLON;
		rv=rv+source.getPort().toStringValue()+mycommons.constants.DB.CONNECTION_SEPARATOR_SEMI_COLON;
		rv=rv+mycommons.constants.DB.CONNECTION_DATABASE+source.getDataBase().toStringName()+mycommons.constants.DB.CONNECTION_SEPARATOR_SEMI_COLON;
		rv=rv+mycommons.constants.DB.CONNECTION_USER+source.getUser().toStringName()+mycommons.constants.DB.CONNECTION_SEPARATOR_SEMI_COLON;
		rv=rv+mycommons.constants.DB.CONNECTION_PASSWORD+source.getPassWord().toStringValue();
		
		return rv;
		
	}
	//public methods
	public java.sql.Connection getConnection(){
			
		java.sql.Connection rv;	
		rv=this.connection;
		
		return rv;
	}
	
}
