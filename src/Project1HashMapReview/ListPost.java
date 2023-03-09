package Project1HashMapReview;

import java.util.HashMap;
import java.util.Map;

public class ListPost implements Action {
	public void action(HashMap<Integer, BoardBody> map) {
		System.out.println('\n' + "--게시글 전체조회--");
		if (map.isEmpty()) {
			System.out.println("게시글이 없습니다.");

		} else {
			for (Map.Entry<Integer, BoardBody> e : map.entrySet()) {
				System.out.println("번호 : " + e.getKey() + " " + "제목: " + e.getValue().getTitle() + " " + "작성자: "
						+ e.getValue().getName() + " " + "작성일: " + e.getValue().getDate() + " ");
			}
		}
	}
}
