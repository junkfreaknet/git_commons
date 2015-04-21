package mycommons.routines.db;

public class Manipulate {

	public static void DeleteTable(mycommons.db.connection.Connection in_Connection,mycommons.db.Table in_Table){
		
		if(isTableExist(in_Connection,in_Table)){
			try{
				java.sql.Statement stmnt=in_Connection.getConnection().createStatement();
				stmnt.executeUpdate("drop table "+in_Table.getName());
			}catch(Exception e){
				mycommons.logging.Logging.severe("deleting table "+in_Table.getName()+" failed.stop this program.");
				System.exit(mycommons.constants.System.CS_EXIT_ERROR);
			}
		}
	}
	public static boolean isTableExist(mycommons.db.connection.Connection in_Connection,mycommons.db.Table in_Table){
		
		boolean rv;
		rv=false;
		
		try{
			java.sql.DatabaseMetaData metaData=in_Connection.getConnection().getMetaData();
			java.sql.ResultSet rs = metaData.getTables(null, null, "%", null);
			while (rs.next()) {
				  if(in_Table.getName()==rs.getString(3)){
					  rv=true;
					  return true;
				  }
				}
		}catch(Exception e){
			mycommons.logging.Logging.severe(e.toString());
			mycommons.logging.Logging.severe("test exist table is failed.stop this program");
			System.exit(mycommons.constants.System.CS_EXIT_ERROR);
		}
		return rv;
	}
}
