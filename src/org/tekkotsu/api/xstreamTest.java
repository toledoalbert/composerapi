package org.tekkotsu.api;
import com.thoughtworks.xstream.*;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class xstreamTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		NodeClass soundNode = new NodeClass();
		XStream xstream = new XStream(new DomDriver());
		xstream.toXML(
	}

}
