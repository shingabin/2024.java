package kr.ac.kopo.day07;

class Handphone {
	String name;
	String phone;
	String company;
}
public class HandphoneMain {

	public static void main(String[] args) {
		Handphone hp = new Handphone();
		hp.name = "신가빈";
		hp.phone = "010-4134-8146";
		hp.company = "삼성";
		
		Handphone hp2 = new Handphone();
		hp2.name = "신가빈2";
		hp2.phone = "010-1111-2222";
		hp2.company = "애플";
		
		Handphone hp3 = new Handphone();
		hp3.name = "신가빈3";
		hp3.phone = "010-2222-3333";
		hp3.company = "구글";
		
		Handphone[] hpArr = {hp,hp2,hp3};
		
		for(Handphone p :hpArr) {
			System.out.println("소유주명 :"+p.name);
			System.out.println("핸드폰번호 :" +p.phone);
			System.out.println("제조사 : "+p.company);
		}
		
		
		System.out.println("---------------------");
		for(int i = 0;i<hpArr.length;i++) {
			System.out.println("소유주명 : "+hpArr[i].name);
			System.out.println("핸드폰번호 :" + hpArr[i].phone);
			System.out.println("제조사 : "+ hpArr[i].company);
		}

	}

}