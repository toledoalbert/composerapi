package org.tekkotsu.api;

import java.util.ArrayList;

public class BehaviorWriter {
	
	//Attributes
	private NodeClass nodeClass;
	private String registerCall;
	private String include;
	private String comment;
	
	//Constructor
	public BehaviorWriter(NodeClass nodeClass){
		this.nodeClass = nodeClass;
		
		this.registerCall = "\n\t}\n}\n\nREGISTER_BEHAVIOR(" + this.nodeClass.getName() + ");";
		this.include = "#include \"Behaviors/StateMachine.h\" \n\n";
		this.comment = "//" + nodeClass.getName() + "Behavior\n";
	}
	
	//Method to get the fsm content as string.
	public String getFSM(){
		
		//String for class header.
		String classHeader = "$nodeclass " + nodeClass.getName() + " : " + "StateNode {\n";
		String setupHeader = "\t$setupmachine {\n";
		
		String meat = getMeat();
		
		String fsm = include + comment + classHeader + setupHeader + meat + registerCall;
		
		System.out.println(fsm);
		
		return fsm;
	}
	
	//Method to set optional comment.
	public void setComment(String comment){
		this.comment = comment;
	}
	
	//Method to get meat.
	public String getMeat(){
		
		String meat = "";
		
		SetupMachine mySetup = nodeClass.getSetupMachine();
		
		ArrayList<TransitionInstance> trans = mySetup.getTransitions();
		ArrayList<NodeInstance> nodes = mySetup.getNodes();
		
		//For every node in the setupmachine
		for(int i = 0; i < nodes.size(); i++){
			NodeInstance current = nodes.get(i);
			meat += "\t\t" + current.getLabel() + ": " + current.getType().getConstructor().getName();
			
			//if any parameters
			if(current.getNumOfParameters() > 0){
				meat += "(";
				
				//for every parameter in the constructor
				for(int j = 0; j < current.getNumOfParameters(); j++){
					meat +=  current.getParameters().get(j).getValue() + ", ";
				}
				
				meat += ")\n";
				
			}
		}
		
		meat += "\n";
		
		//for everynode again after initialized
		for(int i = 0; i < nodes.size(); i++){
			NodeInstance current = nodes.get(i);
			
			//for every outgoing transition
			for(int j = 0; j < current.getNumOfOutTrans(); j++){
			ConstructorCall currentTransitionConstructor = current.getOutTrans().get(j).getType().getConstructor();
			meat += "\t\t" + current.getLabel() + " =" + currentTransitionConstructor.getName();
			
			//if current transition constructor has any parameters
			if(currentTransitionConstructor.getParameters().size() > 0){
				meat += "(";
				
				//for every parameter of transition.
				for(int h = 0; h < currentTransitionConstructor.getParameters().size(); h++){
					meat +=  currentTransitionConstructor.getParameters().get(h).getValue() + ", ";
				}
				meat += ")";
			}
			
			meat += "=>\n";
			
			}
			
			//for every incoming transition
			for(int j = 0; j < current.getNumOfInTrans(); j++){
			ConstructorCall currentTransitionConstructor = current.getInTrans().get(j).getType().getConstructor();
			
			
			meat += "\t\t" + " =" + currentTransitionConstructor.getName();
			
			//if current transition constructor has any parameters
			if(currentTransitionConstructor.getParameters().size() > 0){
				meat += "(";
				
				//for every parameter of transition.
				for(int h = 0; h < currentTransitionConstructor.getParameters().size(); h++){
					meat +=  currentTransitionConstructor.getParameters().get(h).getValue() + ", ";
				}
				meat += ")";
			}

			meat += "=> " + current.getLabel() + "\n";
			
			}
			
		}
		
		
		
		return meat;
		
	}
	
}
