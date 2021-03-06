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
	//constructor no.1
	public Connection(mycommons.db.connection.ParaConnection source){
		this.constructorCommon(source);
		
	}
	//constructor no.2
	public Connection(mycommons.db.connection.Connection source){
		
		mycommons.db.connection.ParaConnection para;
		para=source.para;
		this.constructorCommon(para);
	}
	//constructor no.3
	public Connection(mycommons.db.connection.ConnectionString connectionString,mycommons.db.connection.ParaConnection para){
		
		this.constructorcommon(connectionString.getConnectionString(), para);
	}
	
	//common constructor
	private void constructorCommon(mycommons.db.connection.ParaConnection source){

		String connectionString;
		
		try{
			//create a db connections			
			Class.forName(source.getForName().toStringValue());
			connectionString=this.createConnectionString(source);
			//System.out.println(connectionString);
			this.connection=java.sql.DriverManager.getConnection(connectionString);
		}catch(Exception e){
			mycommons.logging.Logging.severe(e.toString());
			mycommons.logging.Logging.severe("aha failed in create connection.stop program.");
			System.exit(mycommons.constants.System.CS_EXIT_ERROR);
		}

	}
	
	//commons constructor no.2
	private void constructorcommon(String connectionString,mycommons.db.connection.ParaConnection para){
		
		try{
			Class.forName(para.getForName().toStringValue());
			this.connection=java.sql.DriverManager.getConnection(connectionString);
			//System.out.println(connectionString);
		}catch(Exception e){
			mycommons.logging.Logging.severe(e.toString());
			mycommons.logging.Logging.severe("failed in create connection 2.stop program.");
			System.exit(mycommons.constants.System.CS_EXIT_ERROR);			
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
