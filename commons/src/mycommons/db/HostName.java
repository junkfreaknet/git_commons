package mycommons.db;

public class HostName {
	private String hostname;

//constructors
public void HostNanme(){
	this.constructorCommon(mycommons.constants.Generic.CS_SPACE);
}
public void HostName(String source){
	this.constructorCommon(source);
}
public void HostName(HostName source){
	this.constructorCommon(source);
}

//public methods
//get,set etc and toString()

public String toString(){
	return this.hostname;
}

//private methods
private void constructorCommon(String source){
	this.hostname=source;
}
private void constructorCommon(HostName source){
	this.constructorCommon(source.toString());
}
}
