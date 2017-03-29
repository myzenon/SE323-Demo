package model.impl;

import model.Growable;

public class Plant implements Growable {
private String name;	
private int health; // main health
private int max_water; // max - armor
private int water; // armor - watering maxes water
private Fruit fruit;

private enum Age {Seed, Seedling, Mature,HarvestReady,Dead}
private Age age;	

	public Plant(String name,int health, int max_water, int water){
		this.name = name;
		this.health =health;
		this.max_water = max_water;
		this.water = water;
		//this.fruit = fruit;
	}
	@Override
	public void grow() {
		// TODO Auto-generated method stub
	}
	public void produce(){
		
	}
	public String getName(){
		return name;
	}

}
