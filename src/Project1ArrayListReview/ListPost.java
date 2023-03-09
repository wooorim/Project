package Project1ArrayListReview;

import java.util.List;

public class ListPost implements Action {
	public void action(List<BoardBody> list) {
		System.out.println('\n' + "--게시글 전체조회--");
		if (list.isEmpty()) {
			System.out.println("게시글이 없습니다.");

		} else {
			for (BoardBody post : list) {
				System.out.println("번호 : " + post.getNum() + " " + "제목: " + post.getTitle() + " " + "작성자: "
						+ post.getName() + " " + "작성일: " + post.getDate() + " ");
			}
		}
	}
}
