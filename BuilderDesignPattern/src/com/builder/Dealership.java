package com.builder;

public class Dealership {

	public static void main(String[] args) {

		Car car = new CarBuilder().setFuelConsuption(12).getCar();
		System.out.println(car.toString());
	}

}
