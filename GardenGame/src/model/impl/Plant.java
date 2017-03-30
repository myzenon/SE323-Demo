package model.impl;

import java.util.ArrayList;
import java.util.List;

import model.Growable;

public class Plant implements Growable {
private String name;	
private int health; // main health
private int max_water; // max - armor
private int water; // armor - watering maxes water
private int days_before_growing;
private int days_to_age = 0;
public int getDays_before_growing() {
	return days_before_growing;
}
public void setDays_before_growing(int days_before_growing) {
	this.days_before_growing = days_before_growing;
}
public int getDays_to_age() {
	return days_to_age;
}
public void setDays_to_age(int days_to_age) {
	this.days_to_age = days_to_age;
}
private String fruit_type;
private List<Fruit> fruits = new ArrayList<Fruit>();

private String[] age_types = {"Seed", "Seedling", "Mature",
		"Sprouting","HarvestReady"};
private int age = 0;	

	public Plant(String name,String fruit_type,int health, int max_water,int days_before_growing){
		this.name = name;
		this.health =health;
		this.max_water = max_water;
		this.water = max_water;
		this.days_before_growing = days_before_growing;
		this.fruit_type = fruit_type;
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

	public String getFruit_type() {
		return fruit_type;
	}
	public void setFruit_type(String fruit_type) {
		this.fruit_type = fruit_type;
	}
	public String getAge() {
		return "("+age+")"+age_types[age];
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
		if(age<age_types.length-1){
			if(days_to_age<days_before_growing-1){
				days_to_age++;
			}else{
				age++;
				days_to_age = 0;
			}
			if(age==4){
				produce();
			}
		}
	}
	public void harvested(){
		fruits.clear();
	}
	public void produce(){
		for(int i = 0 ; i < health;i++){
			fruits.add(new Fruit(fruit_type,0+water));
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

	public int getDaysUntilNextPhase(){
		return days_before_growing-days_to_age;
	}

}
