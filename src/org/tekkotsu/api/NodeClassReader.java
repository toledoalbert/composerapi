package org.tekkotsu.api;

import java.util.ArrayList;

import org.jdom2.*;
import org.jdom2.input.SAXBuilder;
import com.thoughtworks.xstream.*;

import javax.xml.bind.*;

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
		
		SAXBuilder reader = new SAXBuilder();
		Document document = new Document();
		
		return nodeClasses;
	}
	
}
