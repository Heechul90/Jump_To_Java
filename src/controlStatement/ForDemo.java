package controlStatement;

public class ForDemo {
	public static void main(String[] args) {
		// for��
		String[] numbers = {"one", "two", "three"};
		for (int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		// for�� ����
		int[] marks1 = {90, 25, 67, 45, 80};
		for (int i=0; i<marks1.length; i++) {
			if (marks1[i] >= 60) {
				System.out.println((i+1) + "�� �л��� �հ��Դϴ�!!!");
			} else {
				System.out.println((i+1) + "�� �л��� ���հ��Դϴ٤̤�");
			}
		}
		
		// for�� continue
		int[] marks2 = {90, 25, 67, 45, 80};
		for (int i=0; i<marks2.length; i++) {
			if (marks2[i] < 60) {
				continue;
			}
			System.out.println((i+1) + "�� �л� ���ϵ帳�ϴ�. �հ��Դϴ�!");
		}
		
		// for�� �̿��� ������
		for (int i=2; i<10; i++) {
			for (int j=1; j<10; j++) {
				System.out.print(i + " * " + j + " = " + i*j + "  ");
			}
			System.out.println("");
		}
	}
}