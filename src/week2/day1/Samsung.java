package week2.day1;

public class Samsung  extends Mobile{
	
	
	@Override
	public void simSlot() {
		System.out.println("Has Dual SIM slot");
		
	}
	@Override
	public void color() {
		System.out.println("Has white color");
	}
	
	protected void call() {
		System.out.println("GSM Call");
	}
	
	public String call(String whatsAPPcall) {
		
		whatsAPPcall ="Can make WhatsApp Call";
		System.out.println("WhatsApp Call");
		return whatsAPPcall;
	}
	
	

}
