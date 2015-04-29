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
