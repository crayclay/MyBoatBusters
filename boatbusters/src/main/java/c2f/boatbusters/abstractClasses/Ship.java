package c2f.boatbusters.abstractClasses;

import c2f.boatbusters.interfaces.ShipInterface;

public abstract class Ship implements ShipInterface {

	private int shortShipLength = 2;
	private int middleShipLength = 3;
	private int bigShipLength = 4;

	public int getShortShipLength() { return shortShipLength;}

	public int getMiddleShipLength() { return middleShipLength; }

	public int getBigShipLength() { return bigShipLength; }
}
