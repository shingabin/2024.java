package kr.ac.kopo.day04;

public class ExamMain07 {

	public static void main(String[] args) {
		int col = 5;
		for(int i=1; i<=9;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(j<col?' ':'*');
			}
			System.out.println();
			if(i<5) {
				col--;
			}else {
				col++;
			}
		}

	}

}
