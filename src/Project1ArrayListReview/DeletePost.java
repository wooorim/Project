package Project1ArrayListReview;

import java.util.List;
import java.util.Scanner;

public class DeletePost implements Action {
	public void action(List<BoardBody> list) {
		Scanner sc = new Scanner(System.in);
		System.out.println('\n' + "������ �Խù� ��ȣ�� �Է��ϼ���: ");
		int choice = sc.nextInt();
		sc.nextLine();

		if (list.isEmpty()) {
			System.out.println("������ �Խñ��� �����ϴ�.");
		} else {
			for (int i = 0; i < list.size(); i++) {
				if (choice == list.get(i).getNum()) {
					list.remove(i);
				}
			}

			System.out.println(choice + "�� �Խñ��� ���� �Ǿ����ϴ�.");
		}
	}
}
