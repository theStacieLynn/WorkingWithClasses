package com.ruiz.workingwithClasses;


public class Television {
	//The purpose of this class is to model a television
	//Coded by: Stacie Ruiz
	//Date: 12/04/2022
	
	//Declare constant and remaining fields
	final String MANUFACTURER; //will set a constant for manufacturer
	final int SCREEN_SIZE; // set constant for screen size
	private boolean powerOn; //Power of tv
	private int channel; //represent channel tv is on 
	private int volume; //represents volume of tv
	

	//create constructor that accepts two parameters that will bring in information
	//initialize other fields
	public Television(String mANUFACTURER, int sCREEN_SIZE) {
	
		this.SCREEN_SIZE = sCREEN_SIZE;
		this.MANUFACTURER = mANUFACTURER;
		this.powerOn = false;
		this.channel = 2;
		this.volume = 20;
	}
	//mutator method to change power from off to on or vise versa
	public void power() {
		if(powerOn==true) {
			powerOn = !powerOn;
		}
	}
	/**
	 * Increase volume by 1
	 */
	public void increaseVolume() {
		volume+=1;
	}
	/*
	 * Decrease volume by 1
	 */
	public void decreaseVolume() {
		volume-=1;
	}
	public boolean isPowerOn() {
		return powerOn;
	}
	public void setPowerOn(boolean powerOn) {
		this.powerOn = powerOn;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public String getMANUFACTURER() {
		return MANUFACTURER;
	}
	public int getSCREEN_SIZE() {
		return SCREEN_SIZE;
	}
	
}
