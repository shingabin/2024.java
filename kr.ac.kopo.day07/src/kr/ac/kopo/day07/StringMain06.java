package kr.ac.kopo.day07;

public class StringMain06 {

	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		String str = "";
		for(int i = 1; i<300000;i++) {
			str += i;
		}
		long end = System.currentTimeMillis();
		
		System.out.println("�ҿ�ð� : "+(end-start)/1000. + "��");
		
		start = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer();
		for(int i = 1; i< 300000; i++) {
			sb.append(i);
		}
		end = System.currentTimeMillis();
		System.out.println("�ҿ�ð� : "+(end-start)/1000. + "��");

	}

}
