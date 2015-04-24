package mycommons.db;

public class Field {

	private mycommons.db.FieldName name;
	private mycommons.db.FieldType type;
	
	//
	public Field(){
		
		this.constructorCommon(new mycommons.db.FieldName(mycommons.constants.Generic.CS_SPACE),new mycommons.db.FieldType(mycommons.constants.Generic.CS_SPACE));
	}
	public Field(mycommons.db.FieldName in_fieldname,mycommons.db.FieldType in_fieldtype){
		this.constructorCommon(in_fieldname, in_fieldtype);
	}

	//
	private void constructorCommon(mycommons.db.FieldName in_fieldname,mycommons.db.FieldType in_fieldtype){
		
		this.name=in_fieldname;
		this.type=in_fieldtype;
		
	}
}
