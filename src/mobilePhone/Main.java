package mobilePhone;

public class Main {
    public static void main(String[] args) {
    	//Create a new MobilePhone object
    	MobilePhone myPhone = new MobilePhone("iPhone", "13 Pro Max", "843-371-7753", 128);
        
    	//Calls makeCall method
    	myPhone.makeCall("803-543-2897");
        
        //Calls installApp method
    	myPhone.installApp("TikTok");
        
        //Calls displayInfo method
    	myPhone.displayInfo();

    }
}
