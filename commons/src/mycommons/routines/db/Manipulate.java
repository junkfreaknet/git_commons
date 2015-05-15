package mycommons.routines.db;

public class Manipulate {

	//*****************************************************************
	// delete table
	//*****************************************************************
	public static void DeleteTable(mycommons.db.connection.Connection para_in_Connection,mycommons.db.Table para_in_Table){

		if(isTableExist(para_in_Connection,para_in_Table)){
			try{
				java.sql.Statement stmnt=para_in_Connection.getConnection().createStatement();
				stmnt.executeUpdate("drop table "+para_in_Table.getName());
			}catch(Exception e){
				mycommons.logging.Logging.severe("deleting table "+para_in_Table.getName()+" failed.stop this program.");
				System.exit(mycommons.constants.System.CS_EXIT_ERROR);
			}
		}

	}
	public static boolean isTableExist(mycommons.db.connection.Connection para_in_Connection,mycommons.db.Table para_in_Table){
		
		try{
			
			java.sql.DatabaseMetaData metaData=para_in_Connection.getConnection().getMetaData();
			java.sql.ResultSet rs = metaData.getTables(null, null, "%", null);
			
			while (rs.next()) {
				
				  if(para_in_Table.getName().equalsIgnoreCase(rs.getString(3))){
					  return true;
				  }
				  
			}
			
		}catch(Exception e){
			mycommons.logging.Logging.severe(e.toString());
			mycommons.logging.Logging.severe("test exist table is failed.stop this program");
			System.exit(mycommons.constants.System.CS_EXIT_ERROR);
		}
		return false;
	}
	//*****************************************************************
	// insert record
	//*****************************************************************
	
	// para_to_statement ---> target db statement
	// para_to_Table ---> target table
	// para_fields ---> fields definitions
	// para_resultset_From ---> source data.
	public static void insertRecord(java.sql.Statement para_to_statement,mycommons.db.Table para_to_Table,java.util.ArrayList<mycommons.db.Field> para_fields,java.sql.ResultSet para_resultset_From){
		
		
	}
}
