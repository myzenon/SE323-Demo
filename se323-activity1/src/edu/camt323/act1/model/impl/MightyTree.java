package edu.camt323.act1.model.impl;

import edu.camt323.act1.model.Growable;
import edu.camt323.act1.model.Tree;


public class MightyTree implements Growable,Tree {
	
	private String name = "";

	@Override
	public void grow() {
		System.out.println("Tree grow.");
		
	}

	@Override
	public void setName(String name) {
		this.name = name;
		
	}
	


}
