package Project1HashMapReview;

import java.util.HashMap;
import java.util.Map;

public class ListPost implements Action {
	public void action(HashMap<Integer, BoardBody> map) {
		System.out.println('\n' + "--�Խñ� ��ü��ȸ--");
		if (map.isEmpty()) {
			System.out.println("�Խñ��� �����ϴ�.");

		} else {
			for (Map.Entry<Integer, BoardBody> e : map.entrySet()) {
				System.out.println("��ȣ : " + e.getKey() + " " + "����: " + e.getValue().getTitle() + " " + "�ۼ���: "
						+ e.getValue().getName() + " " + "�ۼ���: " + e.getValue().getDate() + " ");
			}
		}
	}
}
