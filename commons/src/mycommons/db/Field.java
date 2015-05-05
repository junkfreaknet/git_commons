package mycommons.db;

public class Field {

	private mycommons.db.FieldName name;
	private mycommons.db.FieldType type;
	private mycommons.db.FieldLength length;
	private mycommons.db.IsFieldNullable isNullalbe;
	
	
	//private mycommons.db.FieldTypeSQL typeSQL;

	
	//constructors
	public Field(){
		
		this.constructorCommon(new mycommons.db.FieldName(),new mycommons.db.FieldType(),new mycommons.db.FieldLength(),new mycommons.db.IsFieldNullable());
	}
	public Field(mycommons.db.FieldName in_fieldname,mycommons.db.FieldType in_fieldtype){
		this.constructorCommon(in_fieldname, in_fieldtype,new mycommons.db.FieldLength(),new mycommons.db.IsFieldNullable());
	}
	public Field(mycommons.db.FieldName in_fieldname,mycommons.db.FieldType in_fieldtype,mycommons.db.FieldLength in_length){
		this.constructorCommon(in_fieldname, in_fieldtype,in_length,new mycommons.db.IsFieldNullable());
	}
	public Field(mycommons.db.FieldName in_fieldname,mycommons.db.FieldType in_fieldtype,mycommons.db.FieldLength in_length,mycommons.db.IsFieldNullable in_isnullable){
		this.constructorCommon(in_fieldname, in_fieldtype,in_length,in_isnullable);
	}
	//constructor common
	private void constructorCommon(mycommons.db.FieldName in_fieldname,mycommons.db.FieldType in_fieldtype,mycommons.db.FieldLength in_length,mycommons.db.IsFieldNullable in_isnullable){
		
		this.name=in_fieldname;
		this.type=in_fieldtype;
		this.length=in_length;
		this.isNullalbe=in_isnullable;
		//this.typeSQL=in_typesql;
		
	}
	
	//method public
	public void setName(mycommons.db.FieldName in_name){
		this.name=in_name;
	}
	public void setType(mycommons.db.FieldType in_type){
		this.type=in_type;
	}
	public void setLength(mycommons.db.FieldLength in_length){
		this.length=in_length;
	}
	public void setIsNullable(mycommons.db.IsFieldNullable in_isnullable){
		this.isNullalbe=in_isnullable;
	}
	
	/***
	public void setTypeSQL(mycommons.db.FieldTypeSQL in_typesql){
		this.typeSQL=in_typesql;
	}
	public void setTypeSQL(mycommons.db.FieldType in_type){
		
	}
	***/
	//getters
	public mycommons.db.FieldName getName(){
		return this.name;
	}
	public mycommons.db.FieldType getType(){
		return this.type;
	}
	public mycommons.db.FieldLength getLength(){
		return this.length;
	}
	public mycommons.db.IsFieldNullable getIsNullable(){
		return this.isNullalbe;
	}
	//this method requires after  setting some value to "type". 
	public mycommons.db.FieldTypeSQL getTypeSQL(){
		
		mycommons.db.FieldTypeSQL fldTypeSQL=new mycommons.db.FieldTypeSQL(this.type);
		return fldTypeSQL;
	}

}
