package com.ruiz.workingwithClasses;

import java.util.Scanner;

public class TelevisionDemo {

	public static void main(String[] args) {
		//Coded by Stacie Ruiz
		//12-4-22
		
		//create scanner object to accept user input
		Scanner scan = new Scanner(System.in);
		//declare variables
		int station;
		//declare a television object
		Television myTv = new Television("Toshiba",55);
		myTv.power();
		System.out.println("A "+ myTv.getSCREEN_SIZE()+ " inch "+myTv.getMANUFACTURER()+" has turned on");
		
		//Prompt user for input and store into station
		System.out.println("What station do you want?");
		station = scan.nextInt();
		//Change the channel on the tv
		myTv.setChannel(station);
		myTv.increaseVolume();
		//display current channel and volume of tv
		System.out.println("Channel: "+myTv.getChannel()+" Volume: "+myTv.getVolume());
		System.out.println("Too loud lower the volume");
		//decrease volume of tv and display
		myTv.decreaseVolume();
		myTv.decreaseVolume();
		myTv.decreaseVolume();
		myTv.decreaseVolume();
		myTv.decreaseVolume();
		myTv.decreaseVolume();
		System.out.println("Channel: "+myTv.getChannel()+" Volume: "+myTv.getVolume());
		System.out.println();
		
		//TASK 5
		
//		Declare another Television object called portable.
//		Instantiate portable to be a Sharp 19 inch television.
		Television portable = new Television("Sharp",19);
//		Use a call to the power method to turn the power on.
		portable.power();
//		Use calls to the accessor methods to print what television was turned on.
		System.out.println("A "+ portable.getSCREEN_SIZE()+ " inch "+portable.getMANUFACTURER()+" has turned on");
//		Use calls to the mutator methods to change the channel to the user’s preference and decrease the volume by two.
		System.out.println("What station do you want?");
		station = scan.nextInt();
		portable.setChannel(station);
		portable.decreaseVolume();
		portable.decreaseVolume();
//      Use calls to the accessor methods to print the changed state of the portable.
		System.out.println("Channel: "+portable.getChannel()+" Volume: "+portable.getVolume());
		
	}

}
