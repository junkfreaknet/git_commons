package mycommons.routines.db;

public class Definition {

	//****************************************************************
	//generate a "create table " SQL string
	//****************************************************************
	public static mycommons.db.SQLString createSqlStringCreateTable(mycommons.db.Table in_table,java.util.ArrayList<mycommons.db.Field> in_fields){

		String sql=mycommons.constants.Generic.CS_SPACE;
		
		//first
		sql=sql+mycommons.constants.db.sql.ddl.Commands.CREATE_TABLE+in_table.getName()+mycommons.constants.db.sql.ddl.Commands.FIELDS_START;
		//fields
		for(int i=0;i<in_fields.size();i++){
			sql=sql+createSqlStringCreateTable_a_Field(in_fields.get(i));
			if(i==in_fields.size()-1){
				
			}else{
				sql=sql+mycommons.constants.db.sql.ddl.Commands.FIELD_SEPARATOR;
			}
		}
		//end
		sql=sql+mycommons.constants.db.sql.ddl.Commands.FIELDS_END;
		//at last
		mycommons.db.SQLString rv=new mycommons.db.SQLString(sql);
		return rv;
	}
	//generate string for a field.
	private static String createSqlStringCreateTable_a_Field(mycommons.db.Field in_field){
		
		String rv=mycommons.constants.Generic.CS_SPACE;
		//name
		rv=rv+in_field.getName().getName()+mycommons.constants.db.sql.ddl.Commands.SPACE;
		//type
		rv=rv+in_field.getTypeSQL().getTypeSQLString(in_field.getType());
		
		return rv;
	}
}
