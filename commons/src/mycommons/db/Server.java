package mycommons.db;

public class Server {
	private String name;

//constructors
public void HostNanme(){
	this.constructorCommon(mycommons.constants.Generic.CS_SPACE);
}
public Server(String source){
	this.constructorCommon(source);
}
public Server(Server source){
	this.constructorCommon(source);
}

//public methods
//get,set etc and toString()
public Server getHostName(){
	return this;
}
public void setHostName(String source){
	this.name=source;
}
public void setHostName(Server source){
	this.name=source.toString();
}
public String toString(){
	return this.name;
}

//private methods
private void constructorCommon(String source){
	this.name=source;
}
private void constructorCommon(Server source){
	this.constructorCommon(source.toString());
}
}
