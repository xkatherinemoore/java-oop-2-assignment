package mobilePhone;

public class MobilePhone {
	// Please create 4 instance variables for our MobilePhone class:
	// 1.Brand
	// 2.Model
	// 3.Phone Number
	// 4.Storage Capacity
	// Think about what data types would work best with these fields :)
	
	private String brand;
	private String model;
	private String phoneNumber; //Used String to allow for characters
	private int storageCapacity;

	//Constructor
	public MobilePhone(String brand, String model, String phoneNumber, int storageCapacity) {
		this.brand = brand;
		this.model = model;
		this.phoneNumber = phoneNumber;
		this.storageCapacity = storageCapacity;
	}
	
	
	//GETTERS
	public String getBrand() {
		return brand;
	}
	public String getModel() {
		return model;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public int getStorageCapacity() {
		return storageCapacity;
	}
	//SETTERS
	public void setBrand(String newBrand) {
		brand = newBrand;
	}
	public void setModel(String newModel) {
		model = newModel;
	}
	public void setPhoneNumber(String newNumber) {
		phoneNumber = newNumber;
	}
	public void setStorageCapacity(int newCapacity) {
		storageCapacity = newCapacity;
	}

	// Lets make a couple custom phone-related methods:

	// 1. A makeCall method that takes a phone number as a parameter and then
	// prints:
	// 'We are calling {the input phone number} from our {brand} {model} phone!'
	public void makeCall(String inputPhoneNum) {
		System.out.printf("\nWe are calling %s from our %s %s phone!\n", inputPhoneNum, brand, model);
	}

	
	// 2. An installApp method that takes an app name String as input and then
	// prints:
	// 'Installing {input app name} on our {brand} {model} phone!'
	public void installApp(String newApp) {
		System.out.printf("\nInstalling %s on our %s %s phone!\n", newApp, brand, model);
	}

	
	// 3. Lastly, a displayInfo method that takes no parameters and prints all
	// information about
	// the phone:
	// Brand: {brand}
	// Model: {model}
	// Phone Number: {phone number}
	// Storage Capacity: {storage capacity}GB
	public void displayInfo() {
		System.out.printf("\nBrand: %s", brand);
		System.out.printf("\nModel: %s", model);
		System.out.printf("\nPhone Number: %s", phoneNumber);
		System.out.printf("\nStorage Capacity: %d GB", storageCapacity);
	}


}
