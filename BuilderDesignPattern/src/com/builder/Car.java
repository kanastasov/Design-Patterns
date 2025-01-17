package com.builder;


public class Car {

	private String model;
	private int numberOfWheels;
	private int hoursePower;
	private int fuelConsuption;
	
	
	public Car(String model, int numberOfWheels, int hoursePower, int fuelConsuption) {
		super();
		this.model = model;
		this.numberOfWheels = numberOfWheels;
		this.hoursePower = hoursePower;
		this.fuelConsuption = fuelConsuption;
	}
	public Car() {
		// TODO Auto-generated constructor stub
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getNumberOfWheels() {
		return numberOfWheels;
	}
	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}
	public int getHoursePower() {
		return hoursePower;
	}
	public void setHoursePower(int hoursePower) {
		this.hoursePower = hoursePower;
	}
	public int getFuelConsuption() {
		return fuelConsuption;
	}
	public void setFuelConsuption(int fuelConsuption) {
		this.fuelConsuption = fuelConsuption;
	}
	@Override
	public String toString() {
		return "Car [model=" + model + ", numberOfWheels=" + numberOfWheels + ", hoursePower=" + hoursePower
				+ ", fuelConsuption=" + fuelConsuption + "]";
	}
	
	
	
	
	
	
	
}
