package com.test.codeAll;

import java.awt.AWTException;
import java.awt.Robot;

public class codeAll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Bismillah");
		
		int counter = 0;
		int number = 500;
		
		while(counter < 3500) {
			System.out.println("Counter : " + counter);
			moveMouse();
			counter = counter + 1;
			Thread.sleep(4000);
		}

	}
	
	public static void  moveMouse() throws InterruptedException {
		try {
			int xCoord = 500;
			int yCoord = 500;
			
			Robot robot = new Robot();
			robot.mouseMove(xCoord, yCoord);
			
			Thread.sleep(2000);
			robot.mouseMove(1400, 10);
		} catch (AWTException e) {
			System.out.println(e);
		}
	}

}
