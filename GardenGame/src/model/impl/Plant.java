package model.impl;

import java.util.ArrayList;
import java.util.List;

import model.Growable;

public class Plant implements Growable {
private String name;	
private int health; // main health
private int max_water; // max - armor
private int water; // armor - watering maxes water
private Fruit fruit;
private List<Fruit> fruits = new ArrayList<Fruit>();

private String[] age_types = {"Seed", "Seedling", "Mature",
		"HarvestReady","Dead"};
private int age = 0;	

	public Plant(String name,int health, int max_water, int water){
		this.name = name;
		this.health =health;
		this.max_water = max_water;
		this.water = water;
		
		//this.fruit = fruit;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getMax_water() {
		return max_water;
	}
	public void setMax_water(int max_water) {
		this.max_water = max_water;
	}
	public int getWater() {
		return water;
	}
	public void setWater(int water) {
		this.water = water;
	}
	public Fruit getFruit() {
		return fruit;
	}
	public void setFruit(Fruit fruit) {
		this.fruit = fruit;
	}
	public String getAge() {
		return age_types[age];
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName(){
		return name;
	}
	@Override
	public void grow() {
		// TODO Auto-generated method stub
		age++;
	}
	public void harvested(){
		fruits.clear();
	}
	public void produce(){
		for(int i = 0 ; i < health;i++){
			fruits.add(new Fruit(name,0+water));
		}
	}
	public List<Fruit> getFruits() {
		return fruits;
	}
	public void setFruits(List<Fruit> fruits) {
		this.fruits = fruits;
	}
	public String[] getAge_types() {
		return age_types;
	}
	public void setAge_types(String[] age_types) {
		this.age_types = age_types;
	}


}
