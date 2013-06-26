package org.tekkotsu.api;

public class Parameter {
	//attributes
	private String type;
	private String value;
	private String helpText;
	
	//Constructor
	public Parameter(String type, String value, String helpText){
		this.type = type;
		this.value = value;
		this.helpText = helpText;
	}
	



	
	//Accessor methods
	public String getType(){
		return type;
	}
	
	public String getValue(){
		return value;
	}

	public String getHelpText(){
		return helpText;
	}
	




	//Mutator methods
	public void setType(String type){
		this.type = type;
	}
	
	public void setValue(String value){
		this.value = value;
	}

	public void setHelpText(String helpText){
		this.helpText = helpText;
	}

}
