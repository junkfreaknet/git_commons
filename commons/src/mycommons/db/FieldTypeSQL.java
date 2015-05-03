package mycommons.db;

public class FieldTypeSQL {

	private String Type;
	
	//constructors
	/***
	public FieldTypeSQL(){
		this.constructorCommon(mycommons.constants.Generic.CS_SPACE);
	}
	public FieldTypeSQL(String in_typesql){
		this.constructorCommon(in_typesql);
	}
	public FieldTypeSQL(FieldTypeSQL in_typesql){
		this.constructorCommon(in_typesql);
	}
	***/
	public FieldTypeSQL(mycommons.db.FieldType in_type){
		this.constructorCommon(in_type);
	}
	//constructor common
	/***
	private void constructorCommon(String in_typesql){
		this.Type=in_typesql;
	}
	private void constructorCommon(FieldTypeSQL in_typesql){
		this.Type=in_typesql.getTypeSQL();
	}
	***/
	private void constructorCommon(mycommons.db.FieldType in_type){
		
	}
	
	//method private
	
	public String getTypeSQLString(mycommons.db.FieldType in_type){
		
		int type_i=in_type.getType();
		String rv=mycommons.constants.Generic.CS_SPACE;
		
		switch(type_i){

		case java.sql.Types.ARRAY:
			rv=mycommons.constants.db.sql.ddl.FieldTypes.ARRAY;
			break;
		case java.sql.Types.BIGINT:
			rv=mycommons.constants.db.sql.ddl.FieldTypes.BIGINT;
			break;
		case java.sql.Types.BINARY:
			rv=mycommons.constants.db.sql.ddl.FieldTypes.BINARY;
			break;
		case java.sql.Types.BIT:
			rv=mycommons.constants.db.sql.ddl.FieldTypes.BIT;
			break;
		case java.sql.Types.BLOB:
			rv=mycommons.constants.db.sql.ddl.FieldTypes.BLOB;
			break;
		case java.sql.Types.BOOLEAN:
			rv=mycommons.constants.db.sql.ddl.FieldTypes.BOOLEAN;
			break;
		case java.sql.Types.CHAR:
			rv=mycommons.constants.db.sql.ddl.FieldTypes.CHAR;
			break;
		case java.sql.Types.CLOB:
			rv=mycommons.constants.db.sql.ddl.FieldTypes.CLOB;
			break;
		case java.sql.Types.DATALINK:
			rv=mycommons.constants.db.sql.ddl.FieldTypes.DATALINK;
			break;
		case java.sql.Types.DATE:
			rv=mycommons.constants.db.sql.ddl.FieldTypes.DATE;
			break;
		case java.sql.Types.DECIMAL:
			rv=mycommons.constants.db.sql.ddl.FieldTypes.DECIMAL;
			break;
		case java.sql.Types.DISTINCT:
			rv=mycommons.constants.db.sql.ddl.FieldTypes.DISTINCT;
			break;
		case java.sql.Types.FLOAT:
			rv=mycommons.constants.db.sql.ddl.FieldTypes.FLOAT;
			break;
		case java.sql.Types.INTEGER:
			rv=mycommons.constants.db.sql.ddl.FieldTypes.INTEGER;
			break;
		case java.sql.Types.JAVA_OBJECT:
			rv=mycommons.constants.db.sql.ddl.FieldTypes.JAVA_OBJECT;
			break;
		case java.sql.Types.LONGNVARCHAR:
			rv=mycommons.constants.db.sql.ddl.FieldTypes.LONGNVARCHAR;
			break;
		case java.sql.Types.LONGVARBINARY:
			rv=mycommons.constants.db.sql.ddl.FieldTypes.LONGVARBINARY;
			break;
		case java.sql.Types.LONGVARCHAR:
			rv=mycommons.constants.db.sql.ddl.FieldTypes.LONGVARCHAR;
			break;
		case java.sql.Types.NCHAR:
			rv=mycommons.constants.db.sql.ddl.FieldTypes.NCHAR;
			break;
		case java.sql.Types.NCLOB:
			rv=mycommons.constants.db.sql.ddl.FieldTypes.NCLOB;
		case java.sql.Types.NULL:
			rv=mycommons.constants.db.sql.ddl.FieldTypes.NULL;
			break;
		case java.sql.Types.NUMERIC:
			rv=mycommons.constants.db.sql.ddl.FieldTypes.NUMERIC;
			break;
		case java.sql.Types.NVARCHAR:
			rv=mycommons.constants.db.sql.ddl.FieldTypes.NVARCHAR;
			break;
		case java.sql.Types.OTHER:
			rv=mycommons.constants.db.sql.ddl.FieldTypes.OTHER;
			break;
		case java.sql.Types.REAL:
			rv=mycommons.constants.db.sql.ddl.FieldTypes.REAL;
			break;
		case java.sql.Types.REF:
			rv=mycommons.constants.db.sql.ddl.FieldTypes.REF;
			break;
		case java.sql.Types.ROWID:
			rv=mycommons.constants.db.sql.ddl.FieldTypes.ROWID;
			break;
		case java.sql.Types.SMALLINT:
			rv=mycommons.constants.db.sql.ddl.FieldTypes.SMALLINT;
			break;
		case java.sql.Types.SQLXML:
			rv=mycommons.constants.db.sql.ddl.FieldTypes.SQLXML;
			break;
		case java.sql.Types.STRUCT:
			rv=mycommons.constants.db.sql.ddl.FieldTypes.STRUCT;
			break;
		case java.sql.Types.TIME:
			rv=mycommons.constants.db.sql.ddl.FieldTypes.TIME;
			break;
		case java.sql.Types.TIME_WITH_TIMEZONE:
			rv=mycommons.constants.db.sql.ddl.FieldTypes.TIME_WITH_TIMEZONE;
			break;
		case java.sql.Types.TIMESTAMP:
			rv=mycommons.constants.db.sql.ddl.FieldTypes.TIMESTAMP;
			break;
		case java.sql.Types.TIMESTAMP_WITH_TIMEZONE:
			rv=mycommons.constants.db.sql.ddl.FieldTypes.TIMESTAMP_WITH_TIMEZONE;
			break;
		case java.sql.Types.TINYINT:
			rv=mycommons.constants.db.sql.ddl.FieldTypes.TINYINT;
			break;
		case java.sql.Types.VARBINARY:
			rv=mycommons.constants.db.sql.ddl.FieldTypes.VARBINARY;
			break;
		case java.sql.Types.VARCHAR:
			rv=mycommons.constants.db.sql.ddl.FieldTypes.VARCHAR;
			break;
			//
		default:
			rv=mycommons.constants.db.sql.ddl.FieldTypes.UNKNOWN;
			break;
			
		}
		
		return rv;
	}
	
	//method public
	/***
	public String getTypeSQL(){
		return this.Type;
	}
	public void setTypeSQL(FieldTypeSQL in_typesql){
		this.Type=in_typesql.getTypeSQL();
	}
	public void setTypeSQL(mycommons.db.FieldType in_type){
		
	}
	public void setTypeSQL(String in_typesql){
		this.Type=in_typesql;
	}
	***/
}
