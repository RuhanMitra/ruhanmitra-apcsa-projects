package robot;

import kareltherobot.*;

public class Roomba implements Directions {

	public static void main(String[] args) {
		String worldName = "robot/basicRoom.wld";
		Roomba cleaner = new Roomba();
		int totalBeepers = cleaner.cleanRoom(worldName, 7, 6);
		System.out.println("Roomba cleaned up a total of " + totalBeepers + " beepers.");
	}

	private Robot roomba;

	public int cleanRoom(String worldName, int startX, int startY) {

		roomba = new Robot(startX, startY, East, 900);
		roomba.street();
		roomba.avenue();
		World.readWorld(worldName);
		World.setVisible(true);
		World.setDelay(0);
		int numBeep = 0;
		boolean moreToClean = true;
		int Biggest = 0;
		int current = 0;
		int Piles= 0;
		int Area = 0;
		int maxX=0;
		int maxY=0;

		while (moreToClean) {
			while (roomba.frontIsClear()) {
			current = 0;
			if (roomba.nextToABeeper()){
				Piles++;
			}
			while (roomba.nextToABeeper()) {
				roomba.pickBeeper();
				numBeep++;
				current++;
				if (current > Biggest) {
					Biggest = current;
					maxX=roomba.avenue();
					maxY=roomba.street();
				}
			}
    		roomba.move();
			Area++;
		}
			if (roomba.facingEast()) {
				roomba.turnLeft();
				if (roomba.frontIsClear()) {
					roomba.move();
					Area++;
					roomba.turnLeft();
				} else {
					moreToClean = false;
				}
			} 
			else {
				roomba.turnLeft();
				roomba.turnLeft();
				roomba.turnLeft();
				if (roomba.frontIsClear()) {
					roomba.move();
					Area++;
					roomba.turnLeft();
					roomba.turnLeft();
					roomba.turnLeft();
				} else {
					moreToClean = false;
				}
			}
		}
		Area=Area+1;
		System.out.println("Number of beepers = " + numBeep);
		System.out.println("The biggest pile was " + Biggest);
		System.out.println("Number of piles = " + Piles);
		System.out.println("Area = "+ Area);
		System.out.println("Percent dirty = "+ ((float)Piles/Area)*100);
		System.out.println("Average pile size = " + ((float)numBeep/Piles));
		System.out.println("Location of largest pile: (" + maxX + "," +maxY+")" );
		return numBeep;
	}
}