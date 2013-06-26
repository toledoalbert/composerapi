package org.tekkotsu.api;

import java.util.ArrayList;

//Node class for the Tekkotsu State Machine Composer
//Author: Albert Berk Toledo
//Start date: 06/17/2013


//Class Header
public class TransitionClass {

	//Attributes
	private String name;						//Name of the Transition
	private String definition;					//Definition
	private String color;						//COlor
	private ConstructorCall constructor; 		//Constructor
	
	//Constructor
	public TransitionClass(String name, String definition, String color, ConstructorCall constructor){
		
		this.name = name;
		this.definition = definition;
		this.color = color;
		this.constructor = constructor;
		
	}//end constructor
	




	//Accessor methods
	public String getName(){
		return name;
	}
	
	public String getColor(){
		return color;
	}
	
	public String definition(){
		return definition;
	}
	
	public ArrayList<Parameter> getParameters(){
		return constructor.getParameters();
	}
	
	public int getNumOfParameters(){
		return this.constructor.getParameters().size();
	}
	




	//Mutator methods
	public void setName(String name){
		this.name = name;
	}
	
	public void setColor(String color){
		this.color = color;
	}
	
	public void setParameters(ArrayList<Parameter> parameters){
		this.constructor.setParameters(parameters);
	}
	




	//Single element mutator methods.
	public void addParameter(Parameter parameter){
		this.constructor.addParameter(parameter);
	}
	
	public void removeParameter(Parameter parameter){
		this.constructor.removeParameter(parameter);
	}
}
