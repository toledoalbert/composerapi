package org.tekkotsu.api;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.thoughtworks.xstream.*;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class xstreamTest {

	
	public static void main(String[] args) throws IOException {
		
		//Create conents of soundnode class
		Parameter musicFile = new Parameter("music file", "music.wav");
		ConstructorCall soundNodeConstructor = new ConstructorCall("soundNodeConstructor");
		soundNodeConstructor.addParameter(musicFile);
		System.out.println("Components of soundNode created.");
		
		NodeClass soundNode = new NodeClass("SoundNode", soundNodeConstructor);
		System.out.println("SoundNode object created.");
		
		
		XStream xstream = new XStream(new DomDriver());
		try {
			//Create file to write
			FileOutputStream file = new FileOutputStream("Nodes.xml");
			System.out.println("Nodes.xml created.");
			
			//Write xml of soundNode to file.
			xstream.toXML(soundNode, file);
			System.out.println("soundnode written to Nodes.xml");
			
			
			//Close file
			file.close();
			System.out.println("Node.xml closed.");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

}
