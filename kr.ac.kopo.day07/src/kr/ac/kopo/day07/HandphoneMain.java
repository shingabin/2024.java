package kr.ac.kopo.day07;

class Handphone {
	String name;
	String phone;
	String company;
}
public class HandphoneMain {

	public static void main(String[] args) {
		Handphone hp = new Handphone();
		hp.name = "�Ű���";
		hp.phone = "010-4134-8146";
		hp.company = "�Ｚ";
		
		Handphone hp2 = new Handphone();
		hp2.name = "�Ű���2";
		hp2.phone = "010-1111-2222";
		hp2.company = "����";
		
		Handphone hp3 = new Handphone();
		hp3.name = "�Ű���3";
		hp3.phone = "010-2222-3333";
		hp3.company = "����";
		
		Handphone[] hpArr = {hp,hp2,hp3};
		
		for(Handphone p :hpArr) {
			System.out.println("�����ָ� :"+p.name);
			System.out.println("�ڵ�����ȣ :" +p.phone);
			System.out.println("������ : "+p.company);
		}
		
		
		System.out.println("---------------------");
		for(int i = 0;i<hpArr.length;i++) {
			System.out.println("�����ָ� : "+hpArr[i].name);
			System.out.println("�ڵ�����ȣ :" + hpArr[i].phone);
			System.out.println("������ : "+ hpArr[i].company);
		}

	}

}