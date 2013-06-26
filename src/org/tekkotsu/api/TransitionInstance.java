package org.tekkotsu.api;

import java.util.ArrayList;

public class TransitionInstance {
	
	//Attributes
	private TransitionClass type;
	private ArrayList<Parameter> parameters;
	private ArrayList<NodeInstance> sources;
	private ArrayList<NodeInstance> targets;
	private String color;
	

	//Full argument Constructor
	public TransitionInstance(TransitionClass type, ArrayList<Parameter> parameters, ArrayList<NodeInstance> sources, ArrayList<NodeInstance> targets){

		this.type = type;
		this.parameters = parameters;
		this.sources = sources;
		this.targets = targets;
		this.color = type.getColor();
	}
	
	//Instance from type (transitionclass) constructor
	public TransitionInstance(TransitionClass type){
		
		this.type = type;
		this.parameters = type.getParameters();
		this.sources = new ArrayList<NodeInstance>();
		this.targets = new ArrayList<NodeInstance>();
		this.color = type.getColor();
		
	}





	//Accessor methods
	public TransitionClass getType(){
		return type;
	}

	public ArrayList<Parameter> getParameters(){
		return parameters;
	}

	public ArrayList<NodeInstance> getSources(){
		return sources;
	}

	public ArrayList<NodeInstance> geTargets(){
		return targets;
	}
	
	public String getColor(){
		return color;
	}




	//Mutator methods
	public void setType(TransitionClass type){
		this.type = type;
	}
	
	public void setParameters(ArrayList<Parameter> parameters){
		this.parameters = parameters;
	}
	
	public void setSources(ArrayList<NodeInstance> sources){
		this.sources = sources;
	}

	public void setInTrans(ArrayList<NodeInstance> targets){
		this.targets = targets;
	}
	
	public void setColor(String color){
		this.color = color;
	}

}
