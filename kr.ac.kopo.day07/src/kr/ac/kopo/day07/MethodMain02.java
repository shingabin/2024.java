package kr.ac.kopo.day07;

public class MethodMain02 {
	
	// ȣ���� : main(), ��ȣ���� : getSum()
	static int getSum(int a, int b) {
		int sum = 0;
		while(a<=b) {
			sum = sum + a++;
		}
		return sum;
	}
	public static void main(String[] args) {
		int a = 1 ,  b = 5;
		int total = getSum(a , b);
		System.out.printf("%d ~ %d������ ���� :%d\n",a,b,total);
	}

}
