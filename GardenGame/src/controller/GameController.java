package controller;

import model.Item;
import model.impl.*;
import view.ConsoleMenu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameController {
    private ConsoleMenu prompt;
    private GardenBed gardenBed;
    private Bag bag;


    public GameController() {
        prompt = new ConsoleMenu(this);
        gardenBed = new GardenBed(10);
        bag = new Bag();

        //test mock, no shop
        bag.addSeed(new Seed("Mango", new Plant("Mango Tree", 3, 3, 3, 2)));
        bag.addSeed(new Seed("Apple", new Plant("Apple Tree", 3, 3, 3, 2)));;
        bag.addSeed(new Seed("Orange", new Plant("Orange Tree", 3, 3, 3, 2)));
    }

    public List<Plant> getPlants() {
        return this.gardenBed.getPlants();
    }

    public List<Seed> getSeeds() {
        return this.bag.getSeeds();
    }

    public Bag getBag() {
        return bag;
    }

    public void startGame() {
        do {
            prompt.showAll();
        }
        while (true);
    }

    public boolean plantSeed(Seed seed) {
        if (gardenBed.getPlants().size() < gardenBed.getCapacity()) {
            gardenBed.addPlant(seed.getPlant());
        }
        return true;
    }

    public boolean waterPlant(Plant plant) {
        plant.setWater(plant.getMax_water());
        return true;
    }

    public List<Plant> viewPlantsWithFruit() {
        List<Plant> plants = new ArrayList<Plant>();
        for (int i = 0; i < gardenBed.getPlants().size(); i++) {
            if (gardenBed.getPlants().get(i).getFruits().size() != 0) {//fruits is available
                plants.add(gardenBed.getPlants().get(i));
            }
        }
        return plants;
    }

    public void harvestFruits(List<Plant> plants, int index) {
        if (index < plants.size()) {
            for (int i = 0; i < plants.get(index).getFruits().size(); i++) {
                bag.addFruit((plants.get(index).getFruits().get(i)));
            }
            plants.get(index).harvested();
        }

    }

    public void sleep() {

        for (int i = 0; i < gardenBed.getPlants().size(); i++) {
            gardenBed.getPlants().get(i).ageAday();
            if (gardenBed.getPlants().get(i).getWater() > 0) {//minus from water armor
                gardenBed.getPlants().get(i).setWater(
                        gardenBed.getPlants().get(i).getWater() - 1);
            } else {
                if (gardenBed.getPlants().get(i).getHealth() > 0) {//minus from health bar
                    gardenBed.getPlants().get(i).setHealth(
                            gardenBed.getPlants().get(i).getHealth() - 1);
                } else {//Die
                    gardenBed.removePlant(i);

                }
            }

        }
    }


}
