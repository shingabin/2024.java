package kr.ac.kopo.day13.inter02;

public class LGTV implements TV {
	
	private boolean power;
	private int channelNo;
	private int volumeSize;
	private int currentVolumeSize;
	private boolean mute;

	public LGTV() {
		System.out.println("LGTV�� �����߽��ϴ�");
		power = false;
		channelNo = 3;
		volumeSize = 7;
	}
	
	public void info() {
		System.out.println("���� ä�� : " + channelNo 
							+ ", ���� : " + volumeSize);
	}

	@Override
	public void powerOn() {
		System.out.println("TV ������ �մϴ�");
		power = true;
		info();
	}

	@Override
	public void powerOff() {
		System.out.println("TV ������ ���ϴ�");
		power = false;
	}

	@Override
	public void soundUp() {
		System.out.println("������ ���Դϴ�");
		if(volumeSize < TV.MAX_VOLUME_SIZE)
			volumeSize++;
		info();
	}

	@Override
	public void soundDown() {
		System.out.println("������ ����ϴ�");
		if(volumeSize > TV.MIN_VOLUME_SIZE)
			volumeSize--;
		info();
	}

	@Override
	public void channelUp() {
		System.out.println("ä�ι�ȣ�� �ø��ϴ�");
		channelNo++;
		info();
	}

	@Override
	public void channelDown() {
		System.out.println("ä�ι�ȣ�� �����ϴ�");
		channelNo--;
		info();
	}

	@Override
	public void mute() {
		if(!mute) {
			System.out.println("���Ұ���...");
			currentVolumeSize = volumeSize;
			volumeSize = TV.MIN_VOLUME_SIZE;
		} else {
			System.out.println("���Ұ� ����...");
			volumeSize = currentVolumeSize;
		}
		mute = !mute;
		info();
	}
	
}