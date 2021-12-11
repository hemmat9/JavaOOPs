package com.syntax.class17;

public class Car {

	private String name;
	private String make;
	private String model;
	private String color;
	private int year;
	private int engineCC;
	private String VIN;
	private int mileage;
	private int maxSpeed;
	private boolean sunroof;

	 //public Car() {// Zero parameter constructor help us to skip one constructor and print the next
					// one

	//}

	public Car(String carName) {
		name = carName;
	}
	public Car(String carName, String carmodel) {
		name=carName;
		model=carmodel;
	}

	public Car(String carName, String carMake, String carModel, String carColor, int carYear, int carEngineCC,
			String carVin, int carMileage, int carMaxSpeed, boolean carSunroof) {

		name = carName;
		make = carMake;
		model = carModel;
		color = carColor;
		year = carYear;
		engineCC = carEngineCC;
		VIN = carVin;
		mileage = carMileage;
		maxSpeed = carMaxSpeed;
		sunroof = carSunroof;

	}
	void printNameandModel() {
		System.out.println(name+ model);
	}
	void printName () {
		System.out.println(name);
	}

	public void printAllInfo() {
		System.out.println(name+" "+ make+" "+model+" "+color+" "+ year+" "+ engineCC+" "+ VIN+" "+ mileage+" "+ maxSpeed+" "+ sunroof);
	}
}
