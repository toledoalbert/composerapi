package org.tekkotsu.api;

import java.util.ArrayList;

public class ConstructorCall {
	
	//Attributes
	private String name;
	private ArrayList<Parameter> parameters;
	
	//Constructor
	public ConstructorCall(String name, ArrayList<Parameter> parameters){
		this.name = name;
		this.parameters = parameters;
	}
	
	//Mutator methods
	public void setName(String name){
		this.name = name;
	}
	
	public void setParameters(ArrayList<Parameter> parameters){
		this.parameters = parameters;
	}
	
	//Single value adding/removing mutators
	public void addParameter(Parameter parameter){
		this.parameters.add(parameter);
	}
	
	public void removeParameter(Parameter parameter){
		this.parameters.remove(parameter);
	}
	//
	
	//Accessor methods
	public String getName(){
		return name;
	}
	
	public ArrayList<Parameter> getParameters(){
		return parameters;
	}

}