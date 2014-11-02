package mycommons.applications.commons;

public class CommonsApplication {

	String ApplicationName;
	
	public void CommonApplication(String pgName){
		this.ApplicationName=pgName;
	}

	//when aplication starts
	public void start(){
		
	}
	//when end
	public void end(){
		
	}
	//on execute pg
	public void run(){
		
	}
	//get application name
	public String getNameApplication(){
		return this.ApplicationName;
	}
}
