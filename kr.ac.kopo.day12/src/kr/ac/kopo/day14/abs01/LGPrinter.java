package kr.ac.kopo.day14.abs01;

public class LGPrinter extends Printer{
	
	private String model;
	
	public LGPrinter() {
		model = "LG프린터";
	}
	
	public void LGPrint() {
		System.out.println("LG프린터에서 출력됨...");
	}	
	@Override
	public void print() {
		LGPrint();
	
	}
}
