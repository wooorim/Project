package Project1ArrayListReview;

import java.util.List;
import java.util.Scanner;

public class DetailPost implements Action {
	public void action(List<BoardBody> list) {
		Scanner sc = new Scanner(System.in);
		System.out.println('\n' + "�Խñ� ��ȣ�� �Է��ϼ���: ");
		int choice = sc.nextInt();
		sc.nextLine();

		for (BoardBody post : list) {
			if (post.getNum() == (choice)) {
				System.out.println("��ȣ: " + post.getNum());
				System.out.println("����: " + post.getTitle() + " ����: " + post.getBody() + " �ۼ���: " + post.getName()
						+ " �ۼ���: " + post.getDate());
			}
		}
	}

}
