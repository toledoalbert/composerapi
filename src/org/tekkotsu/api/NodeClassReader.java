package org.tekkotsu.api;

import java.util.ArrayList;

import org.jdom2.*;

public class NodeClassReader {

	//Attributes
	private String filename;
	private ArrayList<NodeClass> nodeClasses;
	
	//Constructor
	public NodeClassReader(String filename){
		this.filename = filename;
		this.nodeClasses = new ArrayList<NodeClass>();
	}
	
	//Method to get nodeclass information from xml file, create objects for them and
	//store in an arraylist | returns the arraylist of the nodeclasses
	public ArrayList<NodeClass> getNodeClasses(){
		
		
		
		return nodeClasses;
	}
	
}
