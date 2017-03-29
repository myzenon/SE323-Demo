package model.impl;

import java.util.ArrayList;
import java.util.List;

public class GardenBed {

    private List plants = new ArrayList<Plant>();

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
