package org.tekkotsu.api;
import java.util.ArrayList;

//Node class for the Tekkotsu State Machine Composer
//Author: Albert Berk Toledo
//Start date: 06/17/2013


//Class Header
public class NodeClass {
	
	//Attributes
	private String name;						//Name of the node
	private String definition;					//Definition of the node
	private SetupMachine setup;					//List of the nodes contained
	private ConstructorCall constructor;		//Constructor
	private String color;						//Color of the node
	

	//Full argument constructor
	public NodeClass(String name, SetupMachine setup, ConstructorCall constructor, String color, String definition){
		
		//set arguments from parameters
		this.name = name;
		this.setup = setup;
		this.constructor = constructor;
		this.color = color;
		this.definition = definition;
	}
	


	//Accessor methods
	public String getName(){
		return name;
	}
	
	public String getDefinition(){
		return definition;
	}
	
	public SetupMachine getSetupMachine(){
		return setup;
	}
	
	public ArrayList<Parameter> getParameters(){
		return constructor.getParameters();
	}
	
	
	public String getColor(){
		return color;
	}
	
	public int getNumOfParameters(){
		return this.constructor.getParameters().size();
	}
	





	//Mutator methods
	public void setName(String name){
		this.name = name;
	}
	
	public void setDefinition(String definition){
		this.definition = definition;
	}
	
	public void setSetupMachine(SetupMachine setup){
		this.setup = setup;
	}
	
	public void setParameters(ArrayList<Parameter> parameters){
		this.constructor.setParameters(parameters);
	}
	
	public void setConstructor(ConstructorCall constructor){
		this.constructor = constructor;
	}
	
	public void setColor(String color){
		this.color = color;
	}
	



	//Single element mutator methods
	public void addParameter(Parameter parameter){
		this.constructor.addParameter(parameter);
	}
	
	public void removeParameter(Parameter parameter){
		this.constructor.removeParameter(parameter);
	}
	
	
	
	
}
