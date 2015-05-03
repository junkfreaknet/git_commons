package mycommons.db;

public class Field {

	private mycommons.db.FieldName name;
	private mycommons.db.FieldType type;
	//private mycommons.db.FieldTypeSQL typeSQL;

	
	//constructors
	public Field(){
		
		this.constructorCommon(new mycommons.db.FieldName(),new mycommons.db.FieldType());
	}
	public Field(mycommons.db.FieldName in_fieldname,mycommons.db.FieldType in_fieldtype){
		this.constructorCommon(in_fieldname, in_fieldtype);
	}

	//constructor common
	private void constructorCommon(mycommons.db.FieldName in_fieldname,mycommons.db.FieldType in_fieldtype){
		
		this.name=in_fieldname;
		this.type=in_fieldtype;
		//this.typeSQL=in_typesql;
		
	}
	
	//method public
	public void setName(mycommons.db.FieldName in_name){
		this.name=in_name;
	}
	public void setType(mycommons.db.FieldType in_type){
		this.type=in_type;
	}
	/***
	public void setTypeSQL(mycommons.db.FieldTypeSQL in_typesql){
		this.typeSQL=in_typesql;
	}
	public void setTypeSQL(mycommons.db.FieldType in_type){
		
	}
	***/
	//getter
	public mycommons.db.FieldName getName(){
		return this.name;
	}
	public mycommons.db.FieldType getType(){
		return this.type;
	}
	public mycommons.db.FieldTypeSQL getTypeSql(){
	
	}
	/***
	public mycommons.db.FieldTypeSQL getTypeSQL(){
		return this.typeSQL;
	}
	***/
}
