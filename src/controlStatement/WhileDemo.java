package controlStatement;

public class WhileDemo {
	public static void main(String[] args) {
		
		// while ��
		int treeHit = 0;
		while (treeHit < 10) {
			treeHit++;
			System.out.println("������ " + treeHit + "�� ������ϴ�!");
		    if (treeHit == 10) {
			    System.out.println("���� �Ѿ�ϴ�~!");
		    }
		}
		
		// ���ѷ���(Loop)
		while (true) {
			System.out.println("Ctrl-C�� ������ while���� ���� ���� �� �ֽ��ϴ�.");
			break;
		}
		
		// while�� ���� ������(break)
		int coffee = 10;
		int money = 300;
		
		while (money > 0) {
			System.out.println("���� �޾����� Ŀ�Ǹ� �ݴϴ�!");
			coffee--;
			System.out.println("���� Ŀ���� ���� " + coffee + "�Դϴ�.");
			if (coffee == 0) {
				System.out.println("Ŀ�ǰ� �� ���������ϴ�. �ǸŸ� �����մϴ�.");
				break;
			}
		}
		
		// while�� ���ǹ����� ���ư���(continue)
		int a = 0;
		while (a < 10) {
			a++;
			if (a % 2 == 0) {
				continue;
			}
			System.out.println(a);
		}
	}
}
