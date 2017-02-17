package edu.camt323.act1.model.impl;

import edu.camt323.act1.model.Character;

public class Monster implements Character {
	private String name = "";
	private int attackPoints = 0;
	private int speedPoints = 0;
	private int healthPoints = 0;
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	@Override
	public void adjustAttackPoints(int attackPoints) {
		// TODO Auto-generated method stub
		this.attackPoints += attackPoints;
	}

	@Override
	public void adjustSpeedPoints(int speedPoints) {
		// TODO Auto-generated method stub
		this.speedPoints += speedPoints;
	}

	@Override
	public void adjustHealthPoints(int healthPoints) {
		// TODO Auto-generated method stub
		this.healthPoints += healthPoints;

	}

}
