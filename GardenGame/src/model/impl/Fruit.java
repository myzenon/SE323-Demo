package model.impl;

import model.Item;

public class Fruit implements Item{
	private String name;
	private String[] size_type = {"Small","Medium","Large","XLarge"};
	private int size;
	
	public Fruit(String name, int size){
	this.name = name;
	this.size = size;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}	


}
