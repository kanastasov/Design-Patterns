package com.builder;

public class CarBuilder {

	
	private String model;
	private int numberOfWheels;
	private int hoursePower;
	private int fuelConsuption;
	
	
	
	public CarBuilder setModel(String model) {
		this.model = model;
		return this;
	}
	public CarBuilder setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
		return this;
	}
	public CarBuilder setHoursePower(int hoursePower) {
		this.hoursePower = hoursePower;
		return this;
	}
	public CarBuilder setFuelConsuption(int fuelConsuption) {
		this.fuelConsuption = fuelConsuption;
		return this;
	}
	
	public Car getCar() {
		return new Car(model,numberOfWheels,hoursePower, fuelConsuption);
	}
	
	
	
	
	
	
	
}
