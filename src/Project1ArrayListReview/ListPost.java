package Project1ArrayListReview;

import java.util.List;

public class ListPost implements Action {
	public void action(List<BoardBody> list) {
		System.out.println('\n' + "--�Խñ� ��ü��ȸ--");
		if (list.isEmpty()) {
			System.out.println("�Խñ��� �����ϴ�.");

		} else {
			for (BoardBody post : list) {
				System.out.println("��ȣ : " + post.getNum() + " " + "����: " + post.getTitle() + " " + "�ۼ���: "
						+ post.getName() + " " + "�ۼ���: " + post.getDate() + " ");
			}
		}
	}
}
