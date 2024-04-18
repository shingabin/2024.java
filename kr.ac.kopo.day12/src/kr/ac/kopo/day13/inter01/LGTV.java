package kr.ac.kopo.day13.inter01;

public class LGTV {
	
	private boolean power;
	private int channelNo;
	private int volumeSize;
	
	public LGTV() {
		power =  false;
		channelNo = 3;
		volumeSize = 7;
		System.out.println("LGTV 구매완료");
	}
	
	void powerOn() {
		System.out.println("powerOn...");
	}
	
	void powerOff() {
		System.out.println("powerOff...");
	}
	
	public void channelup() {
		System.out.println("channelUp...");
	}
	
	public void channelDown() {
		System.out.println("channelDown...");
		
	}
	
	public void volumeUp() {
		System.out.println("volumeUp...");
	}
	
	public void volumeDown() {
		System.out.println("volumeDown...");
	}

}
