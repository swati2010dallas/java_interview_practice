package week1.day2;

public class Mobile {
	
	String mobileBrand = "iPhone";
	boolean locationEnabled = true;
	String network = "5G";
	
	public String getMobileBrand() {
		return mobileBrand;
	}
	
	public boolean getLocationService() {
		return locationEnabled;
	}
	
	public void getNetworkDetails() {
		System.out.println(network);
	}
	
	public String call(String name) {
		System.out.println("Call by Name : " + name);
		return name;
	}
	
	public int call(int mobileNumber) {
		System.out.println("Call by MobileNumber : " + mobileNumber);
		return mobileNumber;
	}
	

}
