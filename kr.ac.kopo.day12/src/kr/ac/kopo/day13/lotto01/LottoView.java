package kr.ac.kopo.day13.lotto01;

import java.util.Arrays;

public class LottoView {

	public void process() {
		
		LottoUtil util = new LottoUtil();
		for(int game = 1; game <= 6; game++) {
			System.out.println(game + "°ÔÀÓ : " 
						+ Arrays.toString(util.getLotto()) );
		}
		
	}
}
