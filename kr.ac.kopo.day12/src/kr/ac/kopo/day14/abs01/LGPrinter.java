package kr.ac.kopo.day14.abs01;

public class LGPrinter extends Printer{
	
	private String model;
	
	public LGPrinter() {
		model = "LG������";
	}
	
	public void LGPrint() {
		System.out.println("LG�����Ϳ��� ��µ�...");
	}	
	@Override
	public void print() {
		LGPrint();
	
	}
}
