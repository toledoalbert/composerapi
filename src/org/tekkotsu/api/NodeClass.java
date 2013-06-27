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
	private ArrayList<ConstructorCall> parents;	//Constructors of parents
	private ConstructorCall constructor;		//Constructor
	private String color;						//Color of the node
	

	//Full argument constructor
	public NodeClass(String name, SetupMachine setup, ConstructorCall constructor, String color, String definition, ArrayList<ConstructorCall> parents){
		
		this.name = name;
		this.setup = setup;
		this.constructor = constructor;
		this.color = color;
		this.definition = definition;
		this.parents = parents;
	}
	
	//3 Argument Constructor. Sets default values for the rest of the fields.
	public NodeClass(String name, ArrayList<ConstructorCall> parents, ConstructorCall constructor){
		this.name = name;
		this.setup = null;									//No setup machine by default.
		this.constructor = constructor;
		this.color = "white";								//TODO
		this.definition = "New Node Class: " + name;		//TODO
		this.parents = parents;
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
	
	public ArrayList<ConstructorCall> getParents(){
		return parents;
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
	
	public void setParents(ArrayList<ConstructorCall> parents){
		this.parents = parents;
	}
	


	//Mutator methods that adds/ removes single element to/from the list attributes.
	public void addParameter(Parameter parameter){
		this.constructor.addParameter(parameter);
	}
	
	public void removeParameter(Parameter parameter){
		this.constructor.removeParameter(parameter);
	}
	
	public void addParent(ConstructorCall parent){
		this.parents.add(parent);
	}
	
	public void removeParent(ConstructorCall parent){
		this.parents.remove(parent);
	}
	
	public void removeParent(int index){	//Remove with index because order matters.
		this.parents.remove(index);
	}
	
	//TODO return instance from a nodeclass object (just for convenience)
	/*
	 * 
	 * public NodeInstance makeInstance(){
	 * 	NodeInstance instance = new NodeInstance(this);
	 * 	return instance;
	 * 	
	 */
	
	
}
