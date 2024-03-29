package com.mazer.gaming.utils;

public interface GameConstants {

	String Title = configReader.getValue("game.title");
	int GWIDTH = Integer.parseInt(configReader.getValue("game.width"));
	int GHEIGHT = Integer.parseInt(configReader.getValue("game.height"));
	int FLOOR = Integer.parseInt(configReader.getValue("game.height"))-150;
	int WALK = 1;
	int KICK = 2;
	int PUNCH = 3;
	int MPUNCH = 4;
	int REST = 0;
	int JUMP = 6;
	int DAMAGE = 10;
	int GRAVITY = 75;
	int DEATH=-11;
	int speed = 20;
	static int MAX_HEALTH=500;
}