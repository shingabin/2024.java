package kr.ac.kopo.day14.abs01;

public class SamsungPrinter extends Printer {
	
	String modelName;
	
	public void SamPrint() {
		System.out.println("�Ｚ�����Ϳ��� �����...");
	}
	
	@Override
	public void print() {
		SamPrint();
	}

}
