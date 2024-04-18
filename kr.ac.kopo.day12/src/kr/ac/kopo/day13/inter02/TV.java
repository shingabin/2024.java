package kr.ac.kopo.day13.inter02;

public interface TV {

	int MAX_VOLUME_SIZE = 50;
	int MIN_VOLUME_SIZE = 0;
	
	void powerOn();
	void powerOff();
	void soundUp();
	void soundDown();
	void channelUp();
	void channelDown();
	void mute();
	
	default void copyRight() {
		System.out.println("모든 권한은 TV협회에 있어요");
	}
}	