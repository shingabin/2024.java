package kr.ac.kopo.day07;

public class StringMain01 {

	public static void main(String[] args) {
		
		char[] chars = {'A','B','C','D','E','F','G','H'};
		
		String s = new String();
		String s2 = new String(chars);
		String s3 = new String(chars,3,4);
		String s4 = new String("Hello");
		String s5 = new String("hi");
		String s6 = new String("yes");
		
		//System.out.println("s : ["+s.toString()+ "]");
		System.out.println("s : ["+ s + "]");
		System.out.println("s2 :["+ s2 +"]");
		System.out.println("s3 :["+ s3 +"]");
		System.out.println("s4 :["+ s4 +"]");
		System.out.println("s5 :["+ s5 +"]");
		System.out.println("s6 :["+ s6 +"]");

	}

}
