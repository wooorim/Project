package Project1ArrayList;

import java.util.List;
import java.util.Scanner;

public class DeletePost implements Action {
	public void action(List<BoardBody> list) {
		Scanner sc = new Scanner(System.in);
		System.out.println('\n' + "������ �Խù� ��ȣ�� �Է��ϼ���: ");
		int choice = sc.nextInt();
		sc.nextLine();

		if (list.isEmpty()) { //list�� �ƹ��͵� ����Ǿ� ���� ���� ��
			System.out.println("������ �Խñ��� �����ϴ�.");
		} else {
			for (int i = 0; i < list.size(); i++) { //i�� �ε��� ��ȣ, list�ε����� ���� for��
				if (choice == list.get(i).getNum()) { //�Է��� ��ȣ�� �ش�Ǵ� �Խñ� ����(�ε���)�� ������ִ� �Խñ� ��ȣ �� ��ġ�ϸ�
					list.remove(i); //�� �ε����� ����
				}
			}

			System.out.println(choice + "�� �Խñ��� ���� �Ǿ����ϴ�.");
		}
	}
}
