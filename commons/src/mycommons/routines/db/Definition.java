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
		//length
		rv=rv+createSqlStringCreateTable_a_Field_Length(in_field);
		// "null" or "not null"
		rv=rv+mycommons.constants.Generic.CS_ONE_BLANK+createSqlStringCreateTable_Not_Null(in_field);
		
		return rv;
	}
	//generate "null" or "not null"
	private static String createSqlStringCreateTable_Not_Null(mycommons.db.Field in_field){
		
		String rv=mycommons.constants.Generic.CS_SPACE;
		mycommons.db.IsFieldNullable isn=in_field.getIsNullable();
		//System.out.println(isn.getIsNullale());
		if(in_field.getIsNullable().getIsNullale()==java.sql.ResultSetMetaData.columnNoNulls){
			rv=mycommons.constants.db.sql.ddl.Commands.NOT_NULL;
		}
		return rv;
	}
	//generate length
	private static String createSqlStringCreateTable_a_Field_Length(mycommons.db.Field in_field){
		
		String rv=mycommons.constants.Generic.CS_SPACE;
		
		if (isLengthRequired(in_field)){
			rv=rv+mycommons.constants.db.sql.ddl.Commands.LENGTH_LEFT+in_field.getLength().getLength()+mycommons.constants.db.sql.ddl.Commands.LENGTH_RIGHT;
		}
		return rv;
		
	}
	private static boolean isLengthRequired(mycommons.db.Field in_field){
		
		boolean rv=false;

		String type=in_field.getTypeSQL().getTypeSQLString(in_field.getType());
		
		if(type==mycommons.constants.db.sql.ddl.FieldTypes.NUMERIC){
			rv=true;
		}
		if(type==mycommons.constants.db.sql.ddl.FieldTypes.DECIMAL){
			rv=true;
		}
		if(type==mycommons.constants.db.sql.ddl.FieldTypes.CHAR){
			rv=true;
		}
		if(type==mycommons.constants.db.sql.ddl.FieldTypes.NCHAR){
			rv=true;
		}
		if(type==mycommons.constants.db.sql.ddl.FieldTypes.VARCHAR){
			rv=true;
		}
		if(type==mycommons.constants.db.sql.ddl.FieldTypes.NVARCHAR){
			rv=true;
		}
		return rv;
		
	}
}
