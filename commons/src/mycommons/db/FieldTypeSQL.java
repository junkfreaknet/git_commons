package mycommons.db;

public class FieldTypeSQL {

	private String Type;
	
	//constructors
	public FieldTypeSQL(){
		this.constructorCommon(mycommons.constants.Generic.CS_SPACE);
	}
	public FieldTypeSQL(String in_typesql){
		this.constructorCommon(in_typesql);
	}
	public FieldTypeSQL(FieldTypeSQL in_typesql){
		this.constructorCommon(in_typesql);
	}
	public FieldTypeSQL(mycommons.db.FieldType in_type){
		this.constructorCommon(in_type);
	}
	//constructor common
	private void constructorCommon(String in_typesql){
		this.Type=in_typesql;
	}
	private void constructorCommon(FieldTypeSQL in_typesql){
		this.Type=in_typesql.getTypeSQL();
	}
	private void constructorCommon(mycommons.db.FieldType in_type){
		
	}
	
	//method private
	private String getTypeSQLString(mycommons.db.FieldType in_type){
		
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
		default:
			rv=mycommons.constants.db.sql.ddl.FieldTypes.UNKNOWN;
			break;
			
		}

		CHAR
		CLOB
		DATALINK
		DATE
		DECIMAL
		DISTINCT
		FLOAT
		INTEGER
		JAVA_OBJECT
		LONGNVARCHAR
		LONGVARBINARY
		LONGVARCHAR
		NCHAR
		NCLOB
		NULL
		NUMERIC
		NVARCHAR
		OTHER
		REAL
		REF
		ROWID
		SMALLINT
		SQLXML
		STRUCT
		TIME
		TIMESTAMP
		TINYINT
		VARBINARY
		VARCHAR		
		return rv;

		
	}
	//method public
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
}
