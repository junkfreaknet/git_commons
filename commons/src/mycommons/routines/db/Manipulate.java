package mycommons.routines.db;

import mycommons.db.SQLString;

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
				
				  if(para_in_Table.getName().equals(rs.getString(3))){

					  return true;
				  }
				  
			}
			
		}catch(Exception e){
			mycommons.logging.Logging.severe(e.toString());
			mycommons.logging.Logging.severe("Testing exist a table is failed.stop this program");
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
	public static void insertRecord(java.sql.Statement para_to_Statement,mycommons.db.Table para_to_Table,java.util.ArrayList<mycommons.db.Field> para_fields,java.sql.ResultSet para_resultset_From){
		

		try{
			mycommons.db.SQLString sql=mycommons.routines.db.Manipulate.createSQLInsertRecord(para_to_Table, para_fields, para_resultset_From);			
			//a test
			System.out.println(sql.toString());
			//para_to_Statement.execute(sql.toString());
		}catch(Exception e){
			mycommons.logging.Logging.severe(e.toString());
			mycommons.logging.Logging.severe("Inserting  record is failed.stop this program");
			System.exit(mycommons.constants.System.CS_EXIT_ERROR);
		}
	}
	
	private static mycommons.db.SQLString createSQLInsertRecord(mycommons.db.Table para_Table,java.util.ArrayList<mycommons.db.Field> para_Fields,java.sql.ResultSet para_ResultSet_From){
		
		String rv=mycommons.constants.Generic.CS_SPACE;
		
		//insert command
		rv=rv+mycommons.constants.db.sql.ddl.Commands.COMMAND_INSERT_INTO;
		rv=rv+mycommons.constants.Generic.CS_ONE_BLANK+para_Table.getName()+mycommons.constants.Generic.CS_ONE_BLANK;
		
		//fields***
		//fields start
		rv=rv+mycommons.constants.db.sql.ddl.Commands.FIELDS_START;
		//fields set
		rv=rv+mycommons.routines.db.Manipulate.createSQLInsertRecordFields(para_Fields);
		//fields end
		rv=rv+mycommons.constants.db.sql.ddl.Commands.FIELDS_END;
		
		//values***
		//values start
		rv=rv+mycommons.constants.db.sql.ddl.Commands.VALUES+mycommons.constants.db.sql.ddl.Commands.FIELDS_START;
		//values set
		rv=rv+mycommons.routines.db.Manipulate.createSQLInsertRecordValues(para_ResultSet_From);
		//values end
		rv=rv+mycommons.constants.db.sql.ddl.Commands.FIELDS_END;
		
		//return
		return new mycommons.db.SQLString(rv);
	}
	private static String createSQLInsertRecordFields(java.util.ArrayList<mycommons.db.Field> para_Fields){
		
		String rv=mycommons.constants.Generic.CS_SPACE;
		
		for(int i=0;i<para_Fields.size();i++){
			rv=rv+para_Fields.get(i).getName().getName();
			if(i==para_Fields.size()-1){
				
			}else{
				rv=rv+mycommons.constants.db.sql.ddl.Commands.FIELD_SEPARATOR;
			}
		}
		return rv;
		
	}
	private static String createSQLInsertRecordValues(java.sql.ResultSet para_ResultSet_From){
		
		String rv=mycommons.constants.Generic.CS_SPACE;
		
		return rv;
	}
}
