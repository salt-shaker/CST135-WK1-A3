package com.racecar;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Make Tires array
		List<Tire> blueStreakSet = new ArrayList<>();

		// create 4 tires
		for (int i = 0; i < 4; i++) {
			Tire tire = new Tire("Goodyear Blue Streak E70-15", new float[] { 206f, 15f, 0.70f, 35f, 0f });
			blueStreakSet.add(tire);
		}

		// create engine block
		Engine block = new Engine("289cid 4V V-8 271hp high performance", 271, 15, 0);

		// Create car
		Car shelbyGT = new Car("1965 Shelby GT 350", block, blueStreakSet, new float[] { 2.36f, 1.62f, 1.20f, 1.00f }, 3.89f);
		
		//drive car for 5 minutes
		int counter = 0;
		boolean driving = true;
		
		while(driving) {
			if (counter == 0) {
				System.out.println("**************************************");
				System.out.println("***** Start of 5 minute test run *****");
				System.out.println("**************************************");
				System.out.println("************* Time: 0:00 *************");
				shelbyGT.carSpeed();
				shelbyGT.start();
				shelbyGT.carSpeed();
				}
			if (counter == 30) {
				System.out.println("************* Time: 0:30 *************");
				shelbyGT.shiftUp();
				shelbyGT.revUp(200);
				shelbyGT.carSpeed();
			}
			if (counter == 60) {
				System.out.println("************* Time: 1:00 *************");
				shelbyGT.shiftUp();
				shelbyGT.revUp(200);
				shelbyGT.carSpeed();
			}
			if (counter == 90) {
				System.out.println("************* Time: 1:30 *************");
				shelbyGT.shiftUp();
				shelbyGT.revUp(200);
				shelbyGT.carSpeed();
			}
			if (counter == 120) {
				System.out.println("************* Time: 2:00 *************");
				shelbyGT.revUp(200);
				shelbyGT.carSpeed();
			}
			if (counter == 180) {
				System.out.println("************* Time: 3:00 *************");
				shelbyGT.revDown(400);
				shelbyGT.shiftDown();
				shelbyGT.revDown(200);
				shelbyGT.shiftDown();
				shelbyGT.revDown(200);
				shelbyGT.shiftDown();
				shelbyGT.stop();
				shelbyGT.carSpeed();
			}
			if (counter == 200) {
				System.out.println("************* Time: 3:20 *************");
				shelbyGT.start();
				shelbyGT.revUp(500);
				shelbyGT.carSpeed();
			}
			if (counter == 220) {
				System.out.println("************* Time: 3:40 *************");
				shelbyGT.shiftUp();
				shelbyGT.revUp(500);
				shelbyGT.carSpeed();
			}
			if (counter == 250) {
				System.out.println("************* Time: 4:10 *************");
				shelbyGT.shiftUp();
				shelbyGT.revUp(1000);
				shelbyGT.carSpeed();
			}
			if (counter == 280) {
				System.out.println("************* Time: 4:40 *************");
				shelbyGT.shiftUp();
				shelbyGT.revUp(2000);
				shelbyGT.carSpeed();
			}
			if (counter == 300) {
				System.out.println("************* Time: 5:00 *************");
				shelbyGT.revDown(3000);
				shelbyGT.shiftDown();
				shelbyGT.revDown(500);
				shelbyGT.shiftDown();
				shelbyGT.revDown(500);
				shelbyGT.shiftDown();
				shelbyGT.carSpeed();
				shelbyGT.stop();

				System.out.println("**************************************");
				System.out.println("****** End of 5 minute test run ******");
				System.out.println("**************************************");
				break;
			}
			
			counter++;
		}
	}

}
