package dataType;

public class Boolean {
	public static void main(String[] args) {
		// �ο� ����
		boolean isSuccess = true;
		boolean isTest = false;
		System.out.println(isSuccess);
		System.out.println(isTest);
		System.out.println(2>1);
		System.out.println(1==2);
		System.out.println(3%2==1);
		System.out.println("3".contentEquals("2"));
		
		// ���ǹ�
		int base = 180;
		int height = 185;
		boolean isTall = height > base;
		
		if (isTall) {
			System.out.println("Ű�� Ů�ϴ�!");
		
		int i = 3;
		boolean isOdd = i%2 ==1;
		System.out.println(isOdd);
		}		
	}
}
