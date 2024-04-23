package naver;

import java.util.regex.Pattern;

public class NaverException {
	
	// �Ƶ� Ȯ��
	public void idFormat(String str)throws AuthenException{
		
		if(str.length()<5 || str.length()>15) {
			throw new AuthenException("5~15�� �̳��� ���̵� �����մϴ�");
			
		}
		
		int cnt1 = 0;
		int cnt2 = 0;
		
		for(int i = 0; i< str.length(); i++) {
			char ch = str.charAt(i);
			if((ch>='a' && ch <='z') || (ch>='A' && ch <= 'Z'))
				cnt1++;
			else if(ch>='0'&& ch<='9')
				cnt2++;
		}
		
		if(cnt1==0 || cnt2==0)
			throw new AuthenException("���̵�� �����ڿ� ���ڸ� ȥ���ؼ� ������ּ���");
	}
	
	//��� Ȯ��
	
	public void pwCheck(String pw1, String pw2)throws AuthenException{
		
		int cnt1 = 0;
		int cnt2 = 0;
		
		for(int i = 0; i<pw1.length(); i++) {
			char ch = pw1.charAt(i);
			if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
					cnt1++;
			else if(ch>='0' && ch<='9');
					cnt2++;
		}
		
		if(cnt1==0 ||cnt2==0)
			throw new AuthenException("��й�ȣ�� �����ڿ� ���ڸ� ȥ���ؼ� ������ּ���");
		if(!pw1.equals(pw2))
			throw new AuthenException("��й�ȣ�� �ٸ��ϴ�");
	}
	
	//����Ȯ��
	public void genCheck(String gender) throws AuthenException{
		if(!gender.equals("��")&& !gender.equals("��")){
			throw new AuthenException("������ ��ȣ�ϱ���!\n������ ��/���� �����ּ���)");
		}
		
	}
	
	//�̸�Ȯ��
	public void nameCheck(String name)throws AuthenException{
		boolean check = Pattern.matches("^[��-����-�R]*$", name);
		if(!check)
			throw new AuthenException("�̸��� �ѱ۷� �Է����ּ���");
	}
	
	//����Ȯ��
	public void phoneCheck(String phone) throws AuthenException{
		boolean check = Pattern.matches("(010|011|016|017|018?019)-(\\d{3,4})-(\\d{4})", phone);
		if(!check)
			throw new AuthenException("��ȭ��ȣ �Է¹���� [XXX-XXXX-XXXX]�Դϴ�");
	}
	
}	


