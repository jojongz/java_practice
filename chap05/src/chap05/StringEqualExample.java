package chap05;

public class StringEqualExample {

	public static void main(String[] args) {
		String strVar1 = "����õ";
		String strVar2 = "����õ";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1�� strVar2�� ������ ����");
	}	else {
		System.out.println("strVar1�� strVar2�� ������ �ٸ�");
	}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1�� strVar2�� ���ڿ��� ����");
		}
		
		String strVar3 = new String("����õ");
		String strVar4 = new String("����õ");
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3�� strVar4�� ������ ����");
	}	else {
		
	}		System.out.println("strVar3�� strVar4�� ������ �ٸ�");
	
	
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3�� strVar4�� ���ڿ��� ����");
		}
		
		

	}

}
