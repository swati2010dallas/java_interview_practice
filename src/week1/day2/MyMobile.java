package week1.day2;

public class MyMobile {

	public static void main(String[] args) {
		Mobile mob = new Mobile();
		System.out.println(mob.getMobileBrand());
		System.out.println(mob.getLocationService());
		mob.getNetworkDetails();
		mob.call(9866);
		mob.call("Swati");
		
	}

}
