package controlStatement;

import java.util.ArrayList;

public class ifStatement {
	public static void main(String[] args) {
		
		// if�� �⺻ ����
		boolean money1 = true;
		if (money1) {
			System.out.println("�ýø� Ÿ�� ����!");
		} else {
			System.out.println("�ɾ��!");
		}
		
		// �� ������
		int money2 = 2000;
		if (money2 >= 3000) {
			System.out.println("�ýø� Ÿ�� ����!");
		} else {
			System.out.println("�ɾ��!");
		}
		
		// and(&&), or(||), not(!)
		int money3 = 2000;
		boolean hasCard3 = true;
		if (money3 >= 3000 || hasCard3) {
			System.out.println("�ýø� Ÿ�� ����!");
		} else {
			System.out.println("�ɾ��!");
		}
		
		// contains
		ArrayList<String> pocket4 = new ArrayList<String>();
		pocket4.add("paper");
		pocket4.add("handphone");
		pocket4.add("money3");
		if (pocket4.contains("money3")) {
			System.out.println("�ýø� Ÿ�� ����!");
		} else {
			System.out.println("�ɾ��!");
		}
		
		// else if (���� ���� �Ǵ�)
		boolean hasCard5 = true;
		ArrayList<String> pocket5 = new ArrayList<String>();
		pocket5.add("paper");
		pocket5.add("handphone");
		if (pocket5.contains("money5")) {
			System.out.println("�ýø� Ÿ�� ����!");
		} else if (hasCard5) {
			System.out.println("�ýø� Ÿ�� ����!");			
		} else {
			System.out.println("�ɾ��!");
		}
	}
}
