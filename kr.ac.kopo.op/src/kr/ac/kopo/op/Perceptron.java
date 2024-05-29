package kr.ac.kopo.op;

public class Perceptron {

	public static void main(String[] args) {
		//�н� ������
		double[] x = { 3, 4, 5, 6, 7, 8, 9};
		double[] y = { 7, 9, 11, 13, 15, 17, 19 };
		//������
		double[] yHat = new double[7];

		//���� ������
		double w = 0.01;
		double b = 0.1;
		double Loss = 100;
		double lr = 0.001;

		//���� ������
		double prvW = 0;
		double prvB = 0;
		double prevLoss = 0;
		
		int epochs = 100;
		
		for(int epoch = 0; epoch < epochs; epoch++) 
		{	
			// yHat ������ ���
			double lossSum = 0;
			for (int i = 0; i < y.length; i++) {
				yHat[i] = w * x[i] + b;
				// loss�� ������ ���ϱ�
				lossSum += Math.pow(yHat[i] - y[i], 2);
		}
		//���� �ν�
		Loss = lossSum / x.length;
		
		// ���� = ���� �ν����� ���� �ν����� �� / ���� ����ġ�� ���� ����ġ�� ��
		double inclinationW = (Loss - prevLoss) / (w - prvW);
		double inclinationB = (Loss - prevLoss) / (b - prvB);
		prevLoss = Loss;
		
		prvW = w;
		prvB = b;

		if(inclinationW < 0) {
			w = w - (lr * inclinationW);
			b = b - (lr * inclinationB);
		} else {
			w = w + (lr * inclinationW);
			b = b + (lr * inclinationB);
		}
		
		System.out.println("epoch : " + epoch+" Loss : " + Loss+" W:"+w+" B:"+b);
	    }	
	}
}