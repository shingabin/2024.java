package kr.ac.kopo.day13.inter02;

public class SamsungTV implements TV {

	public SamsungTV() {
		System.out.println("�ＺTV ���ſϷ�...");
	}
	
	@Override
	public void powerOn() {
		System.out.println("���� ON");
	}

	@Override
	public void powerOff() {
		System.out.println("���� OFF");
	}

	@Override
	public void soundUp() {
		 System.out.println("���� UP");
	}

	@Override
	public void soundDown() {
		System.out.println("���� DOWN");
	}

	@Override
	public void channelUp() {
		System.out.println("ä�� UP");
	}

	@Override
	public void channelDown() {
		System.out.println("ä�� DOWN");
	}

	@Override
	public void mute() {
		System.out.println("���Ұ�");
	}

}
