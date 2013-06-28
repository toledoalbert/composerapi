package org.tekkotsu.api;

import java.util.ArrayList;

public class GenerateDefaulTransitions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Create ArrayList for all default transitions.
		ArrayList<TransitionClass> defaultTransitions = new ArrayList<TransitionClass>();
		
		//Create components of Button transition
		ConstructorCall soundNodeConstructor = new ConstructorCall("SoundNodeConstructor");
		soundNodeConstructor.addParameter(musicFile);
		System.out.println("Components of soundNode created.");
		//Create SoundNode
		NodeClass soundNode = new NodeClass("SoundNode", soundNodeConstructor);
		soundNode.setColor("#0AAF53");
		soundNode.setDefinition("Plays a sound then signals completion.");
		System.out.println("SoundNode object created.");
		defaultNodes.add(soundNode);		

	}

}
