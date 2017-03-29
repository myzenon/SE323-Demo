package model.impl;
import model.Item;

import java.util.ArrayList;
import java.util.List;

public class Bag {
    private List<Fruit> fruits;
    private List<Seed> seeds;
    public Bag(){
    	fruits = new ArrayList<Fruit>();
    	seeds = new ArrayList<Seed>();
    }
    public List<Seed> getSeeds() {
        return seeds;
    }
    public List<Fruit> getFruits() {
        return fruits;
    }
  
    public void addSeed(Seed seed){
    	seeds.add(seed);
    }
    
    public void addFruit(Fruit fruit){
    	fruits.add(fruit);
    }
}
