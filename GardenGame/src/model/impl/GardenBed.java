package model.impl;

import java.util.ArrayList;
import java.util.List;

public class GardenBed {

    private List plants = new ArrayList<Plant>();
    private int capacity;
    public GardenBed(int capacity){
    	this.capacity = capacity;
    }
    public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public void setPlants(List plants) {
		this.plants = plants;
	}
	public List<Plant> getPlants() {
        return plants;
    }

    public void addPlant(Plant plant) {
    	plants.add(plant);
    }

    public void removePlant(int position) {
    	plants.remove(position);
    }

}
